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


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "SUBJECT_MARK",
            joinColumns = @JoinColumn(
                    name = "SUBJECT_ID",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "MARK_ID",
                    referencedColumnName = "id"
            )
    )

    private List<Subject> subjects = new ArrayList<>();



    public Marks() {
    }

    public Marks(Long id, String mark, Subject subject){
        this.id = id;
        this.mark = mark;
        this.subjects = (List<Subject>) subject;
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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
