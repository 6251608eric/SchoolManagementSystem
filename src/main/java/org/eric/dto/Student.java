package org.eric.dto;

public class Student {
    private int courseNum;
    public static int nextId = 1;

    private String fname;       // unfinished
    private String lname;       // unfinished
    private Course courses;
    private String id;
    private Department department;

    public Student(String name, Department department) {        // unfinished

    }

    @Override
    public String toString() {          // unfinished
        return "Student{" +
                "courseNum=" + courseNum +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", courses=" + courses +
                ", id='" + id + '\'' +
                ", department=" + department +
                '}';
    }
}
