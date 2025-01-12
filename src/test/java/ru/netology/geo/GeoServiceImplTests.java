package ru.netology.geo;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class GeoServiceImplTests {

    @Test
    public void byIpTest() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        //arrange
        Location expected = new Location(null, null,null,0);
        String ip = "127.0.0.1";
        //act
        Location actual = geoService.byIp(ip);
        Assertions.assertEquals(expected.getCountry(),actual.getCountry());
        /*Assert.assertEquals(expected.getCity(),actual.getCity());
        Assert.assertEquals(expected.getStreet(),actual.getStreet());
        Assert.assertEquals(expected.getBuiling(),actual.getBuiling());*/
    }

}
