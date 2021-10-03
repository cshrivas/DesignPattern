package com.cs.dp;

import java.util.HashMap;
import java.util.Map;

public final class EmployeeImmutable {

    private final String name;
    private final int age;
    private final Map<String,Address> addressMap;

    public EmployeeImmutable(String name, int age, Map<String, Address> addressMap) {
        this.name = name;
        this.age = age;

        Map<String,Address> temp = new HashMap<>();
        for(Map.Entry<String,Address> entry : addressMap.entrySet()){
            temp.put(entry.getKey(),entry.getValue());
        }
        this.addressMap = temp;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Map<String, Address> getAddressMap() {
        Map<String,Address> tempMap = new HashMap<>();
        for (Map.Entry<String, Address> entry : addressMap.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addressMap=" + addressMap +
                '}';
    }
}
