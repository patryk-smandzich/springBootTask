package pl.smandzich.javatask.dao.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Marks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mark;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "SUBJECT_MARK",
            joinColumns = @JoinColumn(
                    name = "SUBJECT_ID",
                    referencedColumnName = "id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "MARK_ID",
                    referencedColumnName = "mark"
            )
    )

    private List<Subject> subjects = new ArrayList<>();



    public Marks() {
    }

    public Marks(Long mark, Subject subject){
        this.mark = mark;
    }

    public Long getMark() {
        return mark;
    }

    public void setMark(Long mark) {
        this.mark = mark;
    }


}
