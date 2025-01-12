package ru.netology.geo;

import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class GeoServiceMock extends GeoServiceImpl {
private String value;

public String get(){
    return value;
}
public void set(String value){
    this.value = value;
}
}
