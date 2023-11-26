package org.eric.dto;

public class Teacher {
    private String firstName;
    private String lastName;
    private Department department;
    private String id;

    public static int nextId = 1;

    public Teacher(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = String.format("T%03d", nextId++);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + firstName + " " + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", id='" + id + '\'' +
                '}';
    }
}
