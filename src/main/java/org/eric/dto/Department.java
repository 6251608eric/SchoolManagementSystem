package org.eric.dto;

public class Department {
    private String id;
    private String departmentName;

    public static int nextId = 1;

    public Department(String DepartmentName) {      // unfinished

    }

    @Override
    public String toString() {          // unfinished
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
