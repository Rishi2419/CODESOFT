//Student Grade Calculator
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number of Students");
            int numberOfStudents = sc.nextInt();

            for (int i = 1; i <= numberOfStudents; i++) {
                Student student = new Student(sc); 
                System.out.println("Name: " + student.Name);
                System.out.println("Total Marks: " + student.Add());
                System.out.println("Percentage: " + student.Percent());
                System.out.println("Grade: " + student.Grades());
            }
        }
    }
}

class Student {
    String Name;
    int marks1;
    int marks2;
    int marks3;
    int marks4;
    int marks5;
    float Sum;
    float Percentage;
    String Grade;

    Student(Scanner sc) { 
        System.out.println("Enter Name:");
        this.Name = sc.next();
        System.out.println("Enter marks for 5 subjects:");
        this.marks1 = sc.nextInt();
        this.marks2 = sc.nextInt();
        this.marks3 = sc.nextInt();
        this.marks4 = sc.nextInt();
        this.marks5 = sc.nextInt();
    }

    public float Add() {
        Sum = marks1 + marks2 + marks3 + marks4 + marks5;
        return Sum;
    }

    public float Percent() {
        Percentage = (Sum / 500) * 100;
        return Percentage;
    }

    public String Grades() {
        if (Percentage >= 90.0) {
            return "A+";
        } else if (Percentage >= 80.0) {
            return "A";
        } else if (Percentage >= 70.0) {
            return "B+";
        } else if (Percentage >= 60.0) {
            return "B";
        } else {
            return "C";
        }
    }
}
