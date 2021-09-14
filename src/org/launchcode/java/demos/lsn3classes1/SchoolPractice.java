package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student student1= new Student("Kaviya",001,1,4.0);
        System.out.println("Student Name: "+student1.getName());
        System.out.println("Student Id: "+student1.getStudentId());
        System.out.println("Student Credits: "+student1.getNumberOfCredits());
        System.out.println("Student GPA: "+student1.getGpa());

    }
}
