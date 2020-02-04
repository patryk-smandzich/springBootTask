package pl.smandzich.javatask.dao.Model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubjectTest {

    @Test
    public void idSubjectTest() {
        // given
        Subject subject = new Subject();
        // when
        subject.setId(1L);
        // then
        Assert.assertEquals(subject.getId().toString(), "1");
    }

    @Test
    public void nameSubjectTest() {
        // given
        Subject subject = new Subject();
        // when
        subject.setName("NIEM");
        // then
        Assert.assertEquals(subject.getName(), "NIEM");
    }

}