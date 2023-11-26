package org.eric.dto;

import java.util.Arrays;

public class Student {
    private int courseNum;
    private String firstName;
    private String lastName;
    private Course[] courses;
    private String id;
    private Department department;

    public static int nextId = 1;

    public Student(String firstName, String lastName, Department department) {
        this.id = String.format("S%03d", nextId++);
        this.department = department;
        this.courseNum = courseNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = new Course[1];
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName=" + firstName + " " + lastName +
                ",courseNum=" + courseNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", id='" + id + '\'' +
                ", department=" + department +
                '}';
    }
}
