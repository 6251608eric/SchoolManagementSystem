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

    public Student(String fullName, String id, Department department) {
        fullName = firstName + lastName;
        this.id = String.format("S%02d", nextId++);
        this.department = department;
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
