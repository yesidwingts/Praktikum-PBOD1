/*Nama file : Student.java
 Nama/NIM   : Yesi Dwi Ningtias/24060122120027
 Tanggal    : 2 Maret 2024
 Tugas Tambahan PBO 2
 */

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String address;
    private String studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, String studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    // Enkapsulasi
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getStudentID() {
        return studentID;
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    // Methods
    public void getDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Student ID: " + studentID);
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
        course.addStudent(this);
    }

    public void viewEnrolledCourses() {
        System.out.println("Courses taken by " + getName() + ":");
        for (Course course : coursesEnrolled) {
            System.out.println("- Course Code: " + course.getCourseCode());
            System.out.println("  Course Name: " + course.getCourseName());
            Lecture lecturer = course.getLecture();
            System.out.println("  Lecturer: " + (lecturer != null ? lecturer.getName() : "No lecturer assigned"));
            System.out.println();
        }
        System.out.println();
    }
}

