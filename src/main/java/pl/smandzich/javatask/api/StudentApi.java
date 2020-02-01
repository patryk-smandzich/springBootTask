package pl.smandzich.javatask.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;
import pl.smandzich.javatask.dao.Model.*;
import pl.smandzich.javatask.manager.StudentManager;

import java.time.LocalDate;

@RestController
@RequestMapping("/student")
public class StudentApi {

    private StudentManager students;

    @Autowired
    public StudentApi(StudentManager students){
        this.students = students;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return students.save(student);
    }

    @GetMapping("/all")
    public Iterable<Student> getAll(){
        return students.findAll();
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void fillDB(){
//        Student student = new Student(6L,"imie","nazwisko", LocalDate.of(1996, 12, 12),
//                true, new Address(6L, "ulica", "kod", "miasto", "numer"), new Clas(6L, 5L, "name"),
//                new Marks(6L, "-5", new Subject(6L, "subject")));
//        students.save(student);
//    }




}
