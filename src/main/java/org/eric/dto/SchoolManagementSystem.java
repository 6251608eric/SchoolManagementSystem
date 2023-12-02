package org.eric.dto;

import java.util.Objects;

public class SchoolManagementSystem {

    private String schoolName;
    private Department[] departments;
    private Student[] students;
    private int studentCounter;
    private Teacher[] teachers;
    private int teacherCounter;
    private Course[] courses;
    private int courseCounter;

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
     * @param departmentId id of the Department
     */
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department != null && department.equals(departmentId)) {
                return department;
            }
        }
        return null;
    }

    /**
     * Finds the Course based on its id
     * @param courseId id of the Course
     */
    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (course != null && course.equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    /**
     * Finds the Students based on their id
     * @param studentId student's id
     */
    public Student findStudents(String studentId) {
        for (Student student : students) {
            if (student != null && student.equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    /**
     * finds the teacher based on their id
     * @param teacherId teacher's id
     */
    public Teacher findTeachers(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher != null && teacher.equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    /**
     * prints the teachers
     */
    public void printTeachers() {
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher);
            }
        }
    }

    /**
     * prints the students
     */
    public void printStudents() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    /**
     * prints the courses
     */
    public void printCourses() {
        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);
            }
        }
    }

    /**
     * prints the departments
     */
    public void printDepartments() {
        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
    }

    /**
     * Add a department
     * @param department department's name
     */
    public void addDepartment(String department) {
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] == null) {
                departments[i] = new Department(department);
                break;
            }
        }
    }

    /**
     * add a course
     * @param courseName course's name
     * @param credit course's credit
     * @param departmentId course's department
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        courseCounter = 0;

        if (departments != null && courseCounter < MAX_COURSES) {
            Department department = findDepartment(departmentId);

            for (int i = 0; i < courses.length; i++) {
                if (courses[i] == null) {
                    courses[i] = new Course(courseName, credit, department);
                    break;
                }
            }
        }
    }

    /**
     * add a teacher
     * @param firstName teacher's first name
     * @param lastName teacher's last name
     * @param departmentId teacher's department
     */
    public void addTeacher(String firstName, String lastName, String departmentId) {
        teacherCounter = 0;

        if (departments != null && teacherCounter < MAX_TEACHERS) {
            Department department = findDepartment(departmentId);

            for (int i = 0; i < teachers.length; i++) {
                if (teachers[i] == null) {
                    teachers[i] = new Teacher(firstName, lastName, department);
                    break;
                }
            }
        }
    }

    /**
     * add a student
     * @param firstName student's name
     * @param lastName student's last name
     * @param departmentId student's department
     */
    public void addStudent(String firstName, String lastName, String departmentId) {
        studentCounter = 0;

        if (departments != null && studentCounter < MAX_STUDENTS) {
            Department department = findDepartment(departmentId);

            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = new Student(firstName, lastName, department);
                    break;
                }
            }
        }
    }

    /**
     * Modify the course that the teacher is teaching
     * @param courseName course's name
     * @param teacherId teacher's id
     */
    public void modifyCourseTeacher(String courseName, String teacherId) {
//        Course course = findCourse(courseName);
//        Teacher teacher = findTeachers(teacherId);
//
//        if (course != null && teacher != null) {
//            int idx = -1;
//            for (int i = 0; i < courses.length; i++) {
//                if (courses[i] != null && courses[i].equals(course)) {
//                    idx = 1;
//                    break;
//                }
//            }
//
//            if (idx != -1) {
//                courses[idx] = new Course(courseName, c, de );
//                System.out.println("Course's teacher modified successfully. ");
//            } else {
//                System.out.println("Please correct the course ID. ");
//            }
//            System.out.println("Teacher or course not found with provided id. ");
//        }
    }

    /**
     * Register into a course as a student
     * @param studentId student's id
     * @param courseId course's id
     */
    public void registerCourse(String studentId, String courseId) {
//        Student student = findStudents(studentId);
//        Course course = findCourse(courseId);
//
//        if (student != null && course != null) {
//            Student[] courseStudents = course.getStudents();
//            boolean isAlreadyRegistered = false;
//
//            for (int i = 0; i < course.getStudentNum(); i++) {
//                if (courseStudents[i] != null && courseStudents[i].equals(student)) {
//                    isAlreadyRegistered = true;
//                    break;
//                }
//            }
//
//            if (student.getCourseNum() < Student.MAX_STUDENTS_REGISTERED_IN_A_COURSE && course.getStudentNum() < Course.MAX_COURSE_REGISTRATIONS_PER_STUDENTS && !isAlreadyRegistered) {
//                int studentIndex = course.getStudentNum();
//                courseStudents[studentIndex] = student;
//                courseStudents/
//            }
//        }
    }
}
