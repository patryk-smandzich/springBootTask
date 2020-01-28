package pl.smandzich.javatask.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.smandzich.javatask.dao.Model.Student;
import pl.smandzich.javatask.dao.Repository.StudentRepo;

import java.time.LocalDate;

@Service
public class StudentManager {

    private StudentRepo studentRepo;

    @Autowired
    public StudentManager(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    public Student save(Student student){
        return studentRepo.save(student);
    }

    public Iterable<Student> findAll(){
        return studentRepo.findAll();
    }




}
