package com.example.demo;

public class AddressDTO {

    public AddressDTO() {
    }

    public String address;
    public String suite;
    public String city;
    public String zipcode;
    public GeoDTO geo;

    @Override
    public String  toString() {
        return "AddressDTO{" +
                "address='" + address + '\'' +
                ", suite='" + suite + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", geo=" + geo +
                '}';
    }
}
