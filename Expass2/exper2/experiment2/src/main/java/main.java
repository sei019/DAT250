import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CreditCard");
        EntityManager em = emf.createEntityManager();
        //read entries that are there, write to console, then close
    }

}
