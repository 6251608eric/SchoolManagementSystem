package org.eric.dto;

public class Teacher {
    private String firstName;       // unfinished
    private String lastName;       // unfinished
    private Department department;
    private String id;

    public static int nextId = 1;

    public Teacher(String name, Department department) {        // unfinished
        this.id = String.format("%02d", nextId++);
    }

    @Override
    public String toString() {      // unfinished

    }
}
