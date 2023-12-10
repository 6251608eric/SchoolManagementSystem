package org.eric;

import org.eric.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem("Vanier");

        schoolManagementSystem.addDepartment("Computer Science");
        schoolManagementSystem.addDepartment("Social Science");
        schoolManagementSystem.addDepartment("Computer Technology");
        schoolManagementSystem.addDepartment("Music");

        schoolManagementSystem.addStudent("Eric", "Toy", "D001");
        schoolManagementSystem.addTeacher("Spongebob", "Square-Pants", "D001");
        schoolManagementSystem.addCourse("Introduction to Programming", 3, "D001");

        schoolManagementSystem.registerCourse("S001", "C001");
        schoolManagementSystem.modifyCourseTeacher("C001", "T001");
//        schoolManagementSystem.printTeachers();
//        schoolManagementSystem.printStudents();
//        schoolManagementSystem.printDepartments();
//        schoolManagementSystem.printCourses();
    }
}
