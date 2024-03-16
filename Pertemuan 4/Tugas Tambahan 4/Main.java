/*Nama file : Main.java
 * Nama/NIM : Yesi Dwi Ningtias/24060122120027
 * Tanggal : 16 Maret 2024
 */
public class Main {
    public static void main(String[] args) {
        // Untuk objek lecture
        Lecture agus = new Lecture("Agus", 35, "Tembalang", "177013");
        Lecture bambang = new Lecture("Bambang", 35, "Banyumanik", "412873");

        // Untuk objek student
        Student cahyo = new Student("Cahyo", 20, "456 Elm St", "723751");
        Student dani = new Student("Dani", 20, "123 Oak St", "734621");
        Student edi = new Student("Edi", 20, "789 Pine St", "733451");

        // Untuk objek course
        Course cs101 = new Course("CS101", "Intro to Computer Science", agus);
        Course cs102 = new Course("CS102", "Data Structures", agus);
        Course cs103 = new Course("CS103", "Algorithms", bambang);

        //Untuk objek person
        Person person = new Person("Bayu", 19, "Tembalang");

        agus.teachCourse(cs101);
        agus.teachCourse(cs102);
        bambang.teachCourse(cs103);

        cs101.addStudent(cahyo);
        cs101.addStudent(dani);
        cs101.addStudent(edi);
        cs102.addStudent(cahyo);
        cs102.addStudent(dani);
        cs103.addStudent(cahyo);

        // student information
        System.out.println("===== Student Information =====");
        cahyo.viewEnrolledCourses();

        // lecturer information
        System.out.println("===== Lecturer Information =====");
        agus.viewTaughtCourses();

        // course information
        System.out.println("===== Course Information =====");
        cs101.viewEnrolledStudents();

        // person information
        System.out.println("===== Person Information =====");
        person.getDetails();

    }
}
