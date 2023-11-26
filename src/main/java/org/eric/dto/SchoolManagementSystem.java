package org.eric.dto;

public class SchoolManagementSystem {

    private String schoolName;
    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;

    private static final int MAX_DEPARTMENT = 5;
    private static final int MAX_STUDENTS = 200;
    private static final int MAX_TEACHERS = 20;
    private static final int MAX_COURSES = 30;

    public SchoolManagementSystem(String schoolName) {
        this.schoolName = schoolName;
        this.departments = new Department[MAX_DEPARTMENT];
        this.students = new Student[MAX_STUDENTS];
        this.teachers = new Teacher[MAX_TEACHERS];
        this.courses = new Course[MAX_COURSES];
    }

    public Department findDepartment(String id) {
        return null;
    }

    public void printTeachers() {

    }

    public void modifyCourseTeacher(String a, String b) {

    }

    public void addDepartment(String a) {

    }

    public void printStudents() {

    }

    public Student findStudents(String a) {
        return null;
    }

    public void addCourse(String a, double b, String c) {

    }

    public void printCourses() {

    }

    public void registerCourse(String a, String b) {

    }

    public void addTeacher(String a, String b, String c) {

    }

    public Course findCourse(String a) {
        return null;
    }

    public void printDepartments() {

    }

    public void addStudent(String a, String b, String c) {

    }

    public Teacher findTeacher(String a) {
        return null;
    }
}
