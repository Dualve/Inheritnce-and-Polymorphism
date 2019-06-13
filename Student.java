package com.company;

public class Student extends Person {
    private int MAX_COURSE = 5;
    int course = 1;

    public Student(int h, int w, String n, int course) {
        super(h, w, n);
        this.course = course;
    }

    public Student() {
    }

    void goNextCourse() {
        say("kirill");
        if (course < MAX_COURSE) {
            System.out.println(super.name + "\' previous course is - " + course);
            System.out.println("You are upgraded to the next course.");
            course++;
            System.out.println(super.name + "\' course now - " + course);
        } else {
            System.out.println("You finished courses.");
        }
    }
}
