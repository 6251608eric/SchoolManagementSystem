package org.eric.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Setter
@Getter
public class Student {
    private int courseNum;
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
        this.courseNum = 0;
    }

    @Override
    public String toString() {
        String courseString = "[";

        for (Course course : courses) {
            if (course != null) {
            courseString += course.getCourseName() + ", ";
            }
        }

        return "Student{" +
                "courseNum=" + courseNum +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", courses=" + courseString +
                ", id='" + id + '\'' +
                ", department=" + department +
                '}';
    }
}
