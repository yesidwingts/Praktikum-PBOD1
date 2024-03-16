/*Nama file : Student.java
 * Nama/NIM : 24060122120027/Yesi Dwi Ningtias
 * Tanggal : 16 Maret 2024
 */
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, String studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getStudentID() {
        return studentID;
    }

    @Override 
    public void getDetails() {
        super.getDetails();
        System.out.println("Student ID: " + studentID);
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void viewEnrolledCourses() {
        System.out.println("Courses taken by " + getName() + ":");
        for (Course course : coursesEnrolled) {
            course.getDetails();
            System.out.println();
        }
    }
}
