package pl.smandzich.javatask.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.smandzich.javatask.dao.Model.Student;
import pl.smandzich.javatask.manager.StudentManager;

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




}
