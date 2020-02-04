package pl.smandzich.javatask.manager;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import pl.smandzich.javatask.dao.Model.*;
import pl.smandzich.javatask.dao.Repository.StudentRepo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class StudentManagerTest {

    @Mock
    StudentRepo studentRepo;

    @InjectMocks
    StudentManager studentManager;

    @Before
    public void init(){
        given(studentRepo.findAll()).willReturn(prepareDataFindAll());
    }

    @Test
    public void findAll() {
        List<Student> students = studentManager.findAll();
        //then
        Assert.assertThat(students, Matchers.hasSize(2));
    }

    @Test
     public void save() {
        studentManager.save(prepareDataSave());
        //then
        Assert.assertEquals(prepareDataSave().getFirstName(), "Iwan");
    }



    public List<Student> prepareDataFindAll(){
        List<Marks> marksy = new ArrayList<>();
        marksy.add(new Marks(1L, "-4", new Subject(1L,"Polski")));
        marksy.add(new Marks(2L, "3", new Subject(2L,"Niemiecki")));
        List<Student> students = new ArrayList<>();
        Student student = new Student(1L,"Jan","Kowalski", LocalDate.of(1996, 12, 12),
                true, new Address(1L, "1 Maja", "44-370", "Warszawa", "12/3b"), new Clas(1L, 5L, "b"),
                marksy);
        students.add(student);
        students.add(student);
        return students;
    }

    public Student prepareDataSave(){
        List<Marks> marksy = new ArrayList<>();
        marksy.add(new Marks(1L, "-4", new Subject(1L,"Polski")));
        Student student = new Student(1L,"Iwan","Kowalski", LocalDate.of(1996, 12, 12),
                true, new Address(1L, "1 Maja", "44-370", "Warszawa", "12/3b"), new Clas(1L, 5L, "b"),
                marksy);
        return student;
    }

}