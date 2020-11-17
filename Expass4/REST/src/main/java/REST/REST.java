package REST;

import basicexample.Todo;
import com.google.gson.Gson;

import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.get;
import static spark.Spark.delete;
import static spark.route.HttpMethod.put;


/**
 * Use the Spark/Java framework to implement a REST API for Todo-items that enables CRUD operations and uses JSON for the representation of todo-resources.
 *
 * The REST API should make it possible to Create (POST) Todo-items, Read (GET) TODO-items, Update (PUT), and Delete (DELETE) Todo-items.
 * See slide 36 from the lectures on web services for design principles on how you should organise the resources in a hierarchical information
 * space of todo-items.
 *
 * You may use the Spark/Java counter service project from experiment 1 as a starting point for the implementation.
 */

public class REST {

    public static void main () {
        Gson gson = new Gson();
        DAO dao = new DAO();
        port(8080);
        //post new todo
        post("/todo", (request, response) -> {
            response.type("application/json");
        });

        //get specific todo
        get("/todo/:id", (request, response) -> {
            Todo todo = dao.read(Long.parseLong(request.params(":id")));
            return gson.toJson(todo);
        });

        //update specific todo
        put("/todo", (request, result) -> {
            Todo todo = gson.fromJson(request.body());
            dao.update(todo);
            return "Success";
        });

        //delete todo
        delete("/todo/:id", (request, response) -> {
            dao.delete(Long.parseLong(request.params(":id")));
            return true;
        });
    }

}