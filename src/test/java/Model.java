import entity.Person;
import entity.Ranking;
import entity.Skill;
import org.testng.annotations.Test;

public class Model {
    @Test
    public void testModelCreation(){
        Person subject1 = new Person();
        subject1.setName("G.I.Joe");

        Person observer1 = new Person();
        observer1.setName("Sergey Kharitonov");

        Skill skill1= new Skill();
        skill1.setName("Java");

        Ranking ranking1 = new Ranking();
        ranking1.setSubject(subject1);
        ranking1.setObserver(observer1);
        ranking1.setSkill(skill1);
        ranking1.setRanking(8);
    }
}
