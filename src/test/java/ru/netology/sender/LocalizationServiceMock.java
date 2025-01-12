package ru.netology.sender;

import ru.netology.entity.Country;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceMock extends LocalizationServiceImpl  {
Country value;
public Country get(){
    return value;
}

public void set(Country value) {
    this.value = value;
}



}
