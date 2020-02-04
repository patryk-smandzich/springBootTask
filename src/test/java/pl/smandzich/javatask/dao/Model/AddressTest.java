package pl.smandzich.javatask.dao.Model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    @Test
    public void idCityTest() {
        // given
        Address address = new Address();
        // when
        address.setId(1L);
        // then
        Assert.assertEquals(address.getId().toString(), "1");
    }

    @Test
    public void streetCityTest() {
        // given
        Address address = new Address();
        // when
        address.setStreet("Ozimska");
        // then
        Assert.assertEquals(address.getStreet(), "Ozimska");
    }

    @Test
    public void zipCodeCityTest() {
        // given
        Address address = new Address();
        // when
        address.setZipCode("00-000");
        // then
        Assert.assertEquals(address.getZipCode(), "00-000");
    }

    @Test
    public void addressCityTest() {
        // given
        Address address = new Address();
        // when
        address.setCity("ss");
        // then
        Assert.assertEquals(address.getCity(), "ss");
    }

    @Test
    public void houseNumberCityTest() {
        // given
        Address address = new Address();
        // when
        address.setHouseNumber("99");
        // then
        Assert.assertEquals(address.getHouseNumber(), "99");
    }


}