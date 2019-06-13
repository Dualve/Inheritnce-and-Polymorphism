package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String NAME = "Jon", name = "alex", nameGeorge = "George";
        int height = 130, weight = 90, course = 2;

        Person alex = new Person(height, weight, name);
        Person serg = new Person();
        System.out.println(serg.name + " default name");
        System.out.println(serg.height + " serg height");
        System.out.println(serg.weight + " serg weight");
        System.out.println(serg.size + " serg size");
        System.out.println(alex.name + " alex name");
        System.out.println(alex.height + " alex height");
        System.out.println(alex.weight + " alex weight");
        System.out.println(alex.size + " alex size");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height for Alex: ");
        alex.height = input.nextInt();
        System.out.println(alex.height + " new height");
        alex.say(NAME);

        System.out.println(" ");
        Student georg = new Student(height, weight, nameGeorge, course);
        System.out.println(georg.name + " g name");
        System.out.println(georg.weight + " g weight");
        System.out.println(georg.height + " g height");
        System.out.println(georg.course + " g course");
        georg.goNextCourse();

        System.out.println(" ");
        Student karl = new Student();
        System.out.println(karl.name + " k name");
        System.out.println(karl.weight + " k weight");
        System.out.println(karl.height + " k height");
        System.out.println(karl.course + " k course");
        georg.goNextCourse();

        System.out.println(" ");
        Shape[] arr = new Shape[]{new Circle(), new Square(), new Triangle()};
        for (int i = 0; i< arr.length; i++){
            arr[i].draw();
        }
    }

}

