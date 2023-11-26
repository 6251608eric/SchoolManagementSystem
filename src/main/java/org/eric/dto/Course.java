package org.eric.dto;

import lombok.ToString;

@ToString
public class Course {
    private static final int MAX_COURSE_REGISTRATIONS_PER_STUDENTS = 5;
    private static final int MAX_STUDENTS_REGISTERED_IN_A_COURSE = 5;

    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    public static int nextID = 1;

    public Course(String courseName, double credit, Department department) {
        this.id = String.format("C%03d", nextID);
        this.credit = credit;
        this.department = department;
        this.students = new Student[MAX_COURSE_REGISTRATIONS_PER_STUDENTS];
        this.studentNum = studentNum;
        this.teacher = new Teacher(null, null, null);
        this.courseName = courseName;
    }
}
