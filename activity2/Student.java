package OOP_G2_2026.activity2;

public class Student {
    int studentId;
    String firstName;
    String middleName;
    String lastName;
    String gender;
    String email;

    static int totalStudents = 0;

    public Student(int studentId, String firstName, String middleName, String lastName, String gender, String email) {
        Student.totalStudents += 1;
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }

    public void displayStudentInfo() {
        System.out.println("============" + getFormalName());
        System.out.println("Student ID  : " + studentId);
        System.out.println("First name  : " + firstName);
        System.out.println("Middle name : " + middleName);
        System.out.println("Last name   : " + lastName);
        System.out.println("Gender      : " + gender);
        System.out.println("Email       : " + email);
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public String getFormalName() {
        return this.lastName + ", " + this.firstName + " " + this.middleName;
    }
}
