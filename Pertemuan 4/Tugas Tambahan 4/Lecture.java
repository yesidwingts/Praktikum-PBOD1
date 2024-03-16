/*Nama file : Lecture.java
 * Nama/NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 16 Maret 2024
 */
import java.util.ArrayList;
import java.util.List;

public class Lecture extends Person {
    private String employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, String employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }
    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Employee ID: " + employeeID);
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
    }

    public void viewTaughtCourses() {
        System.out.println("Courses taught by " + getName() + ":");
        for (Course course : coursesTaught) {
            course.getDetails();
            System.out.println();
        }
    }
}
