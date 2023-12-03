package org.eric.dto;

import lombok.Getter;

import java.util.Arrays;

@Getter
public class Course {
    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    public static int nextID = 1;
    public static final int MAX_COURSE_REGISTRATIONS_PER_STUDENTS = 5;

    public Course(String courseName, double credit, Department department) {
        this.id = String.format("C%03d", nextID);
        this.credit = credit;
        this.department = department;
        this.students = new Student[MAX_COURSE_REGISTRATIONS_PER_STUDENTS];
        this.teacher = new Teacher(null, null, department);
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "credit=" + credit +
                ", id='" + id + '\'' +
                ", students=" + Arrays.toString(students) +
                ", department=" + department +
                ", studentNum=" + studentNum +
                ", teacher=" + teacher +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
