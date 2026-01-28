package OOP_G2_2026.activity2;

public class Course {
    String courseCode;
    String courseTitle;
    Student[] enrolledStudents;
    int enrollmentCount = 0;
    static String schoolName = "My University";

    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.enrolledStudents = new Student[50];
    }

    public void enrollStudent(Student student) {
        enrolledStudents[enrollmentCount] = student;
        enrollmentCount += 1;
    }

    public void displayCourseInfo() {
        System.out.println("School Name  : " + schoolName);
        System.out.println("Course Code  : " + courseCode);
        System.out.println("Course Title : " + courseTitle);
        System.out.println();
        System.out.println("Students");
        for (int x = 0; x < this.enrollmentCount; x++) {
            System.out.println(enrolledStudents[x].getFormalName());
        }
    }

    public static String getSchoolName() {
        return schoolName;
    }
}
