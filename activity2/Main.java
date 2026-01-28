package OOP_G2_2026.activity2;

public class Main {
    public static void main(String[] args) {
        System.out.println("total students at start : " + Student.getTotalStudents());
        System.out.println("Generating Students");
        Student s1 = new Student(
                2525, "Zedrick", "Muyano", "Ganaden", "Male", "zedrick.ganaden@iorma.edu"),
                s2 = new Student(2526, "Charrise", "Palabay", "Morales", "Female", "charisse.morales@iorma.edu"),
                s3 = new Student(2527, "Carlo", "Morales", "Palabay", "Male", "carlo.palabay@iorma.edu");
        System.out.println("total students now      : " + Student.getTotalStudents());
        System.out.println();
        System.out.println("School name without course init : " + Course.getSchoolName());
        Course CS101 = new Course("CS101", "Introduction to Programming");
        CS101.enrollStudent(s1);
        CS101.enrollStudent(s2);
        CS101.displayCourseInfo();
    }
}
