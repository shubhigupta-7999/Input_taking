package Array;

class person {
    String name;
    int age;
}

class student extends person {
    String school;
    int EnrollmentNumber;
    int marks;

    // Constructor
    student(String name, int age, String school, int EnrollmentNumber, int marks) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.EnrollmentNumber = EnrollmentNumber;
        this.marks = marks;
    }

    // Method inside class
    public void dis() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School: " + school);
        System.out.println("Enrollment Number: " + EnrollmentNumber);
        System.out.println("Marks: " + marks);
    }
}

public class inheritance {
    public static void main(String[] args) {
        student s1 = new student("John", 20, "ABC School", 12345, 85);
        s1.dis(); // correct call
    }
}