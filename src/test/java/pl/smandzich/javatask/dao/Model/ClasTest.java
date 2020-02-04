package pl.smandzich.javatask.dao.Model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClasTest {

    @Test
    public void idClasTest() {
        // given
        Clas clas = new Clas();
        // when
        clas.setId(1L);
        // then
        Assert.assertEquals(clas.getId().toString(), "1");
    }

    @Test
    public void levelClasTest() {
        // given
        Clas clas = new Clas();
        // when
        clas.setLevel(3L);
        // then
        Assert.assertEquals(clas.getLevel().toString(), "3");
    }

    @Test
    public void nameClasTest() {
        // given
        Clas clas = new Clas();
        // when
        clas.setName("Jan");
        // then
        Assert.assertEquals(clas.getName(), "Jan");
    }

}