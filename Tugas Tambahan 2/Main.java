/*Nama file : Main.java
 Nama/NIM   : Yesi Dwi Ningtias/24060122120027
 Tanggal    : 2 Maret 2024
 Tugas Tambahan PBO 2
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Lecture
        Lecture agus = new Lecture("Agus", 35, "Tembalang", "177013");
        Lecture bambang = new Lecture("Bambang", 35, "Banyumanik", "412873");

        // Membuat objek Student
        Student cahyo = new Student("Cahyo", 20, "456 Elm St", "723751");
        Student dani = new Student("Dani", 20, "123 Oak St", "734621");
        Student edi = new Student("Edi", 20, "789 Pine St", "733451");

        // Membuat objek Course
        Course cs101 = new Course("CS101", "Intro to Computer Science", agus);
        Course cs102 = new Course("CS102", "Data Structures", agus);
        Course cs103 = new Course("CS103", "Algorithms", bambang);

        // Mengajar Courses
        agus.teachCourse(cs101);
        agus.teachCourse(cs102);
        bambang.teachCourse(cs103);

        // Mendaftar Students ke Courses
        cs101.addStudent(cahyo);
        cs101.addStudent(dani);
        cs101.addStudent(edi);
        cs102.addStudent(cahyo);
        cs102.addStudent(dani);
        cs103.addStudent(cahyo);

        System.out.println("===== Student Information =====");
        cahyo.viewEnrolledCourses();
        
        System.out.println("===== Lecturer Information =====");
        agus.viewTaughtCourses();

        System.out.println("===== Course Information =====");
        cs101.viewEnrolledStudents();
    }
}
