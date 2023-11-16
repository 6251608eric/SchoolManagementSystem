package org.eric.dto;

public class Department {
    private String id;
    private String departmentName;

    public static int nextId = 1;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}