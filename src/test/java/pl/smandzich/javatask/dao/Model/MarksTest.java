package pl.smandzich.javatask.dao.Model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarksTest {

    @Test
    public void idMarksTest() {
        // given
        Marks marks = new Marks();
        // when
        marks.setId(1L);
        // then
        Assert.assertEquals(marks.getId().toString(), "1");
    }

    @Test
    public void markMarksest() {
        // given
        Marks marks = new Marks();
        // when
        marks.setMark("+5");
        // then
        Assert.assertEquals(marks.getMark(), "+5");
    }

    @Test
    public void subjectMarksest() {
        // given
        Marks marks = new Marks();
        // when
        marks.setSubject(new Subject(1l, "POL"));
        // then
        Assert.assertEquals(marks.getSubject().getName(), "POL");
    }

}