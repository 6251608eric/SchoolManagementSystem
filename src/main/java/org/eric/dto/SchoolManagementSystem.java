package org.eric.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
     * @param departmentId id of the department
     */
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (department != null && department.getId().equals(departmentId)) {
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
            if (course != null && course.getId().equals(courseId)) {
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
            if (student != null && student.getId().equals(studentId)) {
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
            if (teacher != null && teacher.getId().equals(teacherId)) {
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
     * @param departmentName department's name
     */
    public void addDepartment(String departmentName) {
        int departmentCounter = 0;

        if (departmentCounter < MAX_DEPARTMENT) {
            for (int i = 0; i < departments.length; i++) {
                if (departments[i] == null) {
                    departments[i] = new Department(departmentName);
                    departmentCounter++;
                    System.out.println("Added department successfully: " + departments[i]);
                    break;
                }
            }
        } else {
            System.out.println("Max department reached, add a new department failed. ");
        }
    }

    /**
     * add a course
     * @param courseName course's name
     * @param credit course's credit
     * @param departmentId course's departmentId
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        courseCounter = 0;

        if (courseCounter < MAX_COURSES) {
            for (int i = 0; i < courses.length; i++) {
                if (courses[i] == null) {
                    courses[i] = new Course(courseName, credit, findDepartment(departmentId));
                    courseCounter++;
                    System.out.println("Added course successfully: " + courses[i]);
                    break;
                }
            }
        } else {
            System.out.println("Max teacher reached, add a new teacher failed.");
        }
    }

    /**
     * add a teacher
     * @param firstName teacher's first name
     * @param lastName teacher's last name
     * @param departmentId teacher's departmentId
     */
    public void addTeacher(String firstName, String lastName, String departmentId) {
        teacherCounter = 0;

        if (teacherCounter < MAX_TEACHERS) {
            for (int i = 0; i < teachers.length; i++) {
                if (teachers[i] == null) {
                    teachers[i] = new Teacher(firstName, lastName, findDepartment(departmentId));
                    teacherCounter++;
                    System.out.println("Added teacher successfully: " + teachers[i]);
                    break;
                }
            }
        } else {
            System.out.println("Max teacher reached, add a new teacher failed. ");
        }
    }

    /**
     * add a student
     * @param firstName student's name
     * @param lastName student's last name
     * @param departmentId student's departmentId
     */
    public void addStudent(String firstName, String lastName, String departmentId) {
        studentCounter = 0;

        if (studentCounter < MAX_STUDENTS) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = new Student(firstName, lastName, findDepartment(departmentId));
                    studentCounter++;
                    System.out.println("Added student successfully: " + students[i]);
                    break;
                }
            }
        } else {
            System.out.println("Too many students");
        }
    }

    /**
     * Modify the course that the teacher is teaching
     * @param courseID course's name
     * @param teacherId teacher's id
     */
    public void modifyCourseTeacher(String courseID, String teacherId) {
        Course course = findCourse(courseID);
        Teacher teacher = findTeachers(teacherId);

        if (course != null && teacher != null) {
            course.setTeacher(teacher);
            System.out.println("Teacher has been added");
        } else {
            System.out.println("Unknown course or teacher");
        }
    }

    /**
     * Register into a course as a student
     * @param studentId student's id
     * @param courseId course's id
     */
    public void registerCourse(String studentId, String courseId) {
        Student student = findStudents(studentId);
        Course course = findCourse(courseId);

        if (findStudents(studentId) != null && findCourse(courseId) != null) {
            if (student.getCourseNum() >= Student.MAX_STUDENTS_REGISTERED_IN_A_COURSE) {
                System.out.println("The student has registered max courses");

            } else if (course.getStudentNum() >= Student.MAX_STUDENTS_REGISTERED_IN_A_COURSE) {
                System.out.println("The course has been registered by max students");

            } else {
                for (int i = 0; i < course.getStudents().length; i++) {
                    if (student.getCourses()[i] != null && student.getCourses()[i].equals(course)) {
                        System.out.println("The course has  been registered by the student already");
                        return;
                    }

                    if (course.getStudents()[i] == null) {
                        course.getStudents()[i] = student;
                        course.setStudentNum(course.getStudentNum() + 1);
                        break;
                    }
                }

                for (int i = 0; i < student.getCourses().length; i++) {
                    if (student.getCourses()[i] == null) {
                        student.getCourses()[i] = course;
                        student.setCourseNum(student.getCourseNum() + 1);
                        break;
                    }
                }

                for (int i = 0; i < course.getStudents().length; i++) {
                    if (course.getStudents()[i] == null) {
                        course.getStudents()[i] = student;
                        course.setStudentNum(course.getStudentNum() + 1);
                        break;
                    }
                }

                System.out.println("Student registered successfully. ");
                return;
            }
        }

        System.out.println("Invalid student or course ID");
    }
}
