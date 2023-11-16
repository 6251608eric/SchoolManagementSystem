package org.eric.dto;

public class Teacher {
    private String name;
    private String fname;
    private String lname;
    private Department department;
    private String id;

    public static int nextId = 1;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department +
                ", id='" + id + '\'' +
                '}';
    }
}
