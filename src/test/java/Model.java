import entity.Persons;
import entity.Rankings;
import entity.Skills;
import org.testng.annotations.Test;

public class Model {
    @Test
    public void testModelCreation(){
        Persons subject1 = new Persons();
        subject1.setName("G.I.Joe");

        Persons observer1 = new Persons();
        observer1.setName("Sergey Kharitonov");

        Skills skill1= new Skills();
        skill1.setName("Java");

        Rankings ranking1 = new Rankings();
        ranking1.setSubject(subject1);
        ranking1.setObserver(observer1);
        ranking1.setSkill(skill1);
        ranking1.setRanking(8);
    }
}
