package org.eric.dto;

public class Department {
    private String id;
    private String departmentName;

    public static int nextId = 1;

    public Department(String DepartmentName) {      // unfinished
        this.id = String.format("%02d", nextId++);
    }

    @Override
    public String toString() {          // unfinished

    }
}
