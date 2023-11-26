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

    /**
     * Finds the department based on its id
     * @param DepartmentId id of the Department
     */
    public Department findDepartment(String DepartmentId) {
        return null;
    }
    /**
     * Finds the Course based on its id
     * @param courseId id of the Course
     */
    public Course findCourse(String courseId) {
        return null;
    }

    /**
     * Finds the Students based on their id
     * @param studentId student's id
     */
    public Student findStudents(String studentId) {
        return null;
    }

    /**
     * finds the teacher based on their id
     * @param teacherId teacher's id
     */
    public Teacher findTeachers(String teacherId) {
        return null;
    }

    /**
     * prints the teachers
     */
    public void printTeachers() {

    }

    /**
     * prints the students
     */
    public void printStudents() {

    }

    /**
     * prints the courses
     */
    public void printCourses() {

    }

    /**
     * prints the departments
     */
    public void printDepartments() {

    }

    /**
     * Add a department
     * @param Department department's name
     */
    public void addDepartment(String Department) {

    }

    /**
     * add a course
     * @param courseName course's name
     * @param credit course's credit
     * @param departmentId course's department
     */
    public void addCourse(String courseName, double credit, String departmentId) {

    }

    /**
     * add a teacher
     * @param firstName teacher's first name
     * @param lastName teacher's last name
     * @param departmentId teacher's department
     */
    public void addTeacher(String firstName, String lastName, String departmentId) {

    }

    /**
     * add a student
     * @param firstName student's name
     * @param lastName student's last name
     * @param departmentId student's department
     */
    public void addStudent(String firstName, String lastName, String departmentId) {

    }

    /**
     * Modify the course that the teacher is teaching
     * @param courseName course's name
     * @param teacherName teacher's name
     */
    public void modifyCourseTeacher(String courseName, String teacherName) {

    }

    /**
     * Register into a course as a student
     * @param studentId student's id
     * @param courseId course's id
     */
    public void registerCourse(String studentId, String courseId) {

    }
}
