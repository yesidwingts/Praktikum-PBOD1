/*Nama file : Lecture.java
 Nama/NIM   : Yesi Dwi Ningtias/24060122120027
 Tanggal    : 2 Maret 2024
 Tugas Tambahan PBO 2
 */

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private String employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, String employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
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

    public String getEmployeeID() {
        return employeeID;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    // Methods
    public void getDetails() {
        System.out.println("Lecture Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Employee ID: " + employeeID);
    }

    public void teachCourse(Course course) {
    coursesTaught.add(course);
}

    void viewTaughtCourses() {
    System.out.println("Courses taught by " + getName() + ":");
    for (Course course : coursesTaught) {
        course.getDetails();
        System.out.println();
    }
}

}
