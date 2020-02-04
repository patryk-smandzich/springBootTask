package pl.smandzich.javatask.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.smandzich.javatask.dao.Model.Student;
import pl.smandzich.javatask.dao.Repository.StudentRepo;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentManager {

    private StudentRepo studentRepo;

    @Autowired
    public StudentManager(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student save(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> findAll() {

        List<Student> list = new ArrayList<>();
        studentRepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }


}
