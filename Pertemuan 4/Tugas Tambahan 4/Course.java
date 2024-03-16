/*Nama file : Course.java
 * Nama/NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 16 Maret 2024
 */

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    // Encapsulation
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    // Methods
    public void addStudent(Student student) {
        studentsEnrolled.add(student);
    }

    public void removeStudent(Student student) {
        studentsEnrolled.remove(student);
    }

    public void viewEnrolledStudents() {
        System.out.println("Students enrolled in " + getCourseName() + ":");
        for (Student student : studentsEnrolled) {
            student.getDetails();
        }
        System.out.println();
    }

    public void getDetails() {
        System.out.println("Course Details:");
        System.out.println("Course Code: " + getCourseCode());
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Lecture: " + lecture.getName());
    }
}
