package entity;

import javax.persistence.*;
import java.util.List;
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    private List<Person> personsList;
    private String name;

    public Skill() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Person> getPersonsList() {
        return personsList;
    }

    public void setPersonsList(List<Person> personsList) {
        this.personsList = personsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
