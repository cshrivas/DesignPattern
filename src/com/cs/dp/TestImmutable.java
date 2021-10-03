package com.cs.dp;

import java.util.HashMap;
import java.util.Map;

public class TestImmutable {
    public static void main(String[] args) {
        Address addressHome = new Address("Swiss County");
        Address addressOffice = new Address("Eon Kharadi");

        Map<String,Address> mapAdd= new HashMap<>();
        mapAdd.put("Home",addressHome);
        mapAdd.put("Office",addressOffice);

        EmployeeImmutable employee= new EmployeeImmutable("Chandra",34,mapAdd);
        System.out.println(employee);
        mapAdd.put("Wrong",addressHome);
        System.out.println(employee);

        employee.getAddressMap().put("Wrong",addressHome);
        System.out.println(employee);
    }
}
