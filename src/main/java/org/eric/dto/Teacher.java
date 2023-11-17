package org.eric.dto;

public class Teacher {
    private String name;        // unfinished
    private String fname;       // unfinished
    private String lname;       // unfinished
    private Department department;
    private String id;

    public static int nextId = 1;

    public Teacher(String name, Department department) {        // unfinished

    }

    @Override
    public String toString() {      // unfinished
        return "Teacher{" +
                "name='" + name + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department +
                ", id='" + id + '\'' +
                '}';
    }
}
