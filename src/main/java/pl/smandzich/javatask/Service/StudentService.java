package pl.smandzich.javatask.Service;

import org.springframework.web.bind.annotation.RestController;
import pl.smandzich.javatask.Model.Student;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentService {

    private List<Student> students;


    public StudentService(){
        students = new ArrayList<>();
        students.add(new Student(1l, "Jan", "Kowalski", LocalDate.of(1950,01,01), true));
    }

}
