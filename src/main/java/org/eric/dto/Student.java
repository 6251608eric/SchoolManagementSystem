package org.eric.dto;

public class Student {
    private int courseNum;
    public static int nextId = 1;

    private String fname;
    private String lname;
    private Course courses;
    private String id;
    private Department department;

    @Override
    public String toString() {
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
