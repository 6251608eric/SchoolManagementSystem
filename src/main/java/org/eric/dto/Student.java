package org.eric.dto;

public class Student {
    private int courseNum;
    private String firstName;       // unfinished
    private String lastName;       // unfinished
    private Course courses;
    private String id;
    private Department department;

    public static int nextId = 1;

    public Student(String name, Department department) {        // unfinished
        this.id = String.format("S%02d", nextId++);
    }

    @Override
    public String toString(String name) {          // unfinished

    }
}
