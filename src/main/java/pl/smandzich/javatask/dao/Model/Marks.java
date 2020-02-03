package pl.smandzich.javatask.dao.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Marks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mark;
    @OneToOne(cascade = CascadeType.ALL)
    private Subject subject;



    public Marks() {
    }

    public Marks(Long id, String mark, Subject subject){
        this.id = id;
        this.mark = mark;
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long mark) {
        this.id = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
