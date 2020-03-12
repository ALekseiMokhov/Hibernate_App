package entity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.*;
import javax.persistence.*;
import java.util.List;
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    private List<Skill> skillList;
    @Column
    private String name;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                '}';
    }


}
