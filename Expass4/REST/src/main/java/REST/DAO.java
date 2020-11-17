package REST;

import basicexample.Todo;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DAO {

    private EntityManager entityManager;

    public DAO() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("todos");
         entityManager = factory.createEntityManager();
    }

    public List<Todo> read() {
        Query q = entityManager.createQuery("Select t from Todo t");
        return q.getResultList();
    }

    public Todo read(long id) {
        return entityManager.find(Todo.class, id);
    }

    public void create(Todo todo) { entityManager.getTransaction().begin();
     entityManager.persist(todo);
     entityManager.getTransaction().commit();
    }

    public void delete(long id) {
        Todo todo = entityManager.find(Todo.class, id);
        entityManager.getTransaction().begin();
        entityManager.remove(todo);
        entityManager.getTransaction().commit();
    }

    public void update(Todo todo) { entityManager.getTransaction().begin();
     entityManager.merge(todo);
     entityManager.getTransaction().commit();
    }
}