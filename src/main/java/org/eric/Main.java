package org.eric;

import org.eric.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem("Vanier");

        schoolManagementSystem.addDepartment("Computer Science");
        schoolManagementSystem.addTeacher("Spongebob", "Square-Pants", "Computer Science");
        schoolManagementSystem.addStudent("Eric", "Toy", "D001");
        schoolManagementSystem.addCourse("Introduction to Programming", 3, "D001");

        schoolManagementSystem.printDepartments();
        schoolManagementSystem.printTeachers();
        schoolManagementSystem.printStudents();
        schoolManagementSystem.printCourses();

        System.out.println(schoolManagementSystem.findStudents("S001"));
        System.out.println(schoolManagementSystem.findTeachers("T001"));
        System.out.println(schoolManagementSystem.findCourse("C001"));
        System.out.println(schoolManagementSystem.findDepartment("D001"));
    }
}
