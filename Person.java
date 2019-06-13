package com.company;

public class Person {
    public int height = 180;
    public int size = 10;
    public  int weight;
    public String name = "Serg";

    public void say(String name) {
        System.out.println("Hello " + name);
    }

    public Person() {
    }

    public Person(int h, int w, String n) {
        height = h;
        weight = w;
        name = n;
    }
}
