package pl.smandzich.javatask.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;
import pl.smandzich.javatask.dao.Model.*;
import pl.smandzich.javatask.manager.StudentManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
//
//         List<Marks> marksy = new ArrayList<>();
//         marksy.add(new Marks(1L, "-4", new Subject(1L,"Polski")));
//         marksy.add(new Marks(2L, "3", new Subject(2L,"Niemiecki")));
//
//        Student student = new Student(1L,"Jan","Kowalski", LocalDate.of(1996, 12, 12),
//                true, new Address(1L, "1 Maja", "44-370", "Warszawa", "12/3b"), new Clas(1L, 5L, "b"),
//                marksy);
//        students.save(student);
//    }




}
