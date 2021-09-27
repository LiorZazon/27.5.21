package com.example.demo;

public class UserDTO {

    public Integer id;
    public String name;
    public String user_name;
    public String email;
    public  AddressDTO address;


    public UserDTO() {
    }


    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user_name='" + user_name + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
