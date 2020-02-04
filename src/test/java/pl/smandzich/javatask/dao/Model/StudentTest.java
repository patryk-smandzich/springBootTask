package pl.smandzich.javatask.dao.Model;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void idStudentTest() {
        // given
        Student student = new Student();
        // when
        student.setId(1L);
        // then
        Assert.assertEquals(student.getId().toString(), "1");
    }

    @Test
    public void firstNameStudentTest() {
        // given
        Student student = new Student();
        // when
        student.setFirstName("Oleq");
        // then
        Assert.assertEquals(student.getFirstName(), "Oleq");
    }

    @Test
    public void sureNameStudentTest() {
        // given
        Student student = new Student();
        // when
        student.setSureName("Kowalski");
        // then
        Assert.assertEquals(student.getSureName(), "Kowalski");
    }

    @Test
    public void birthDateStudentTest() {
        // given
        Student student = new Student();
        // when
        student.setBirthDate(LocalDate.of(2019, 01, 01));
        // then
        Assert.assertEquals(student.getBirthDate().toString(), "2019-01-01");
    }

    @Test
    public void dyslexiaStudentTest() {
        // given
        Student student = new Student();
        // when
        student.setDyslexia(true);
        // then
        Assert.assertEquals(student.getDyslexia().toString(), "true");
    }

    @Test
    public void addressStudentTest() {
        // given
        Student student = new Student();
        // when
        student.setAddress(new Address(1L, "1 Maja", "44-370", "Warszawa", "12/3b"));
        // then
        Assert.assertEquals(student.getAddress().getStreet(), "1 Maja");
    }

    @Test
    public void clasStudentTest() {
        // given
        Student student = new Student();
        // when
        student.setClas(new Clas(1L, 5L, "b"));
        // then
        Assert.assertEquals(student.getClas().getName(), "b");
    }

    @Test
    public void marksStudentTest() {
        // given
        Student student = new Student();
        List<Marks> marksy = new ArrayList<>();
        marksy.add(new Marks(1L, "-4", new Subject(1L, "Polski")));
        // when
        student.setMarks(marksy);
        // then
        Assert.assertEquals(student.getMarks().get(0).getId().toString(), "1");
    }

}