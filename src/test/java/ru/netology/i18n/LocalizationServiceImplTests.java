package ru.netology.i18n;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.entity.Country;

public class LocalizationServiceImplTests {
@Test
    public void localeTest(){
    //arrange
LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
String expected = "Добро пожаловать";

    //act

String actual  = localizationService.locale(Country.RUSSIA);
    //assert

    Assert.assertEquals(expected,actual);
}
}
