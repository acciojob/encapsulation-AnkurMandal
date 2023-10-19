package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
//        obj.name="Ankur";
//        System.out.println(obj.name);
//        :6:12 java: name has private access in com.driver.RWOnly
//        :7:31 java: name has private access in com.driver.RWOnly
        obj.setName("Ankur");
        System.out.println(obj.getName());
    }
}