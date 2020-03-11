package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rankings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Persons observer;
    private Persons subject;
    private Skills skill;
    private Integer ranking;
    public Rankings() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persons getObserver() {
        return observer;
    }

    public void setObserver(Persons observer) {
        this.observer = observer;
    }

    public Persons getSubject() {
        return subject;
    }

    public void setSubject(Persons subject) {
        this.subject = subject;
    }

    public Skills getSkill() {
        return skill;
    }

    public void setSkill(Skills skill) {
        this.skill = skill;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
}
