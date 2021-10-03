package com.cs.dp;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonClass instance= SingletonClass.getInstance();
        instance.name="Singleton";

        SingletonClass instance1= SingletonClass.getInstance();
        System.out.println(instance1.name);

        instance1.name="changed";
        System.out.println(instance.name);
    }
}
