package ru.netology.sender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.geo.GeoServiceMock;
import ru.netology.i18n.LocalizationServiceImpl;
import java.util.HashMap;
import java.util.Map;

public class MessageSenderImplTests {

    @Test
    public void testMessageRU() {
        //arrange
        String expected = "Добро пожаловать";
        GeoServiceImpl geoServiceMock = new GeoServiceMock();
        LocalizationServiceImpl localizationServiceMock = new LocalizationServiceMock();
        Map<String, String> headers = new HashMap<String, String>();
        MessageSenderImpl messageSender = new MessageSenderImpl(geoServiceMock, localizationServiceMock);
        //act
        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, "172.123.12.19");
        String actual = messageSender.send(headers);
        //assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMessageENG() {
        //arrange
        String expected = "Welcome";
        GeoServiceImpl geoServiceMock = new GeoServiceMock();
        LocalizationServiceImpl localizationServiceMock = new LocalizationServiceMock();
        Map<String, String> headers = new HashMap<String, String>();
        MessageSenderImpl messageSender = new MessageSenderImpl(geoServiceMock, localizationServiceMock);
        //act
        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, "172.123.12.19");
        String actual = messageSender.send(headers);
        //assert
        Assertions.assertEquals(expected, actual);
    }

}
