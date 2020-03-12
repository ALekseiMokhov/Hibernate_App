
import entity.Person;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PersonTest {
    SessionFactory factory;
    @BeforeClass
    public void setup(){
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        factory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
    }
    @Test
    public void testSavePerson(){
         try(Session session = factory.openSession()){
             Transaction tx = session.beginTransaction();
             Person person = new Person();
             person.setName("J.C.Smell");
             session.save(person);
             tx.commit();
         }
    }

}
