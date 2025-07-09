package com.encapsulation;
import  com.encapsulation.utiles.User;
public  class Main {
    public static void main(String[] args) {

        User u = new User(); 
        u.setUser("nando");
        u.setPassword("@IZjaxoj32423");
        u.setUuid("j3h17h13-j8ij381-k93k1k");
        
        System.out.println("This is the User Data");
        System.out.println(u.getUser());
        System.out.println(u.getPassword());
        System.out.println(u.getUuid());
    }
}