package org.eric.dto;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Department {
    private String id;
    private String departmentName;

    public static int nextId = 1;

    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }
}
