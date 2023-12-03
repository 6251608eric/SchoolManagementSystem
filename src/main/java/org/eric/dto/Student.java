package org.eric.dto;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class Student {
    private int courseNum = 0;
    private String firstName;
    private String lastName;
    private Course[] courses;
    private String id;
    private Department department;

    public static int nextId = 1;
    public static final int MAX_STUDENTS_REGISTERED_IN_A_COURSE = 5;

    public Student(String firstName, String lastName, Department department) {
        this.id = String.format("S%03d", nextId++);
        this.department = department;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = new Course[MAX_STUDENTS_REGISTERED_IN_A_COURSE];
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName=" + firstName + " " + lastName +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", id='" + id + '\'' +
                ", department=" + department +
                '}';
    }
}
