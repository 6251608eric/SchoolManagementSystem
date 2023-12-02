package org.eric;

import org.eric.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem("Vanier");

        schoolManagementSystem.addDepartment("Computer Science");
        schoolManagementSystem.addDepartment("Social Science");
        schoolManagementSystem.addDepartment("Computer Technology");
        schoolManagementSystem.addDepartment("Math");
        schoolManagementSystem.addDepartment("Music");

        schoolManagementSystem.addTeacher("Spongebob", "Square-Pants", "Computer Science");
        schoolManagementSystem.addStudent("Eric", "Toy", "Computer Science");
        schoolManagementSystem.addCourse("Calculus 1", 3, "Computer Science");

        schoolManagementSystem.printDepartments();
        schoolManagementSystem.printTeachers();
        schoolManagementSystem.printStudents();
        schoolManagementSystem.printCourses();
    }
}
