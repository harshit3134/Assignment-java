
//Develop a Program that illustrate method overloading concept.
//21CE001-Harshit Ajakiya
import java.util.Scanner;

class Prac5 {
    void record(String t) {
        System.out.println(t);
    }

    void record(String studentName, char grade) {
        System.out.println("Student name is " + studentName);
        System.out.println("Student grade is " + grade);
    }

    void record(int id, String studentName, char grade) {
        System.out.println("Student ID is " + id);
        System.out.println("Student name is " + studentName);
        System.out.println("Student grade is " + grade);
    }

    public static void main(String[] args) {
        Prac5 O = new Prac5();
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the record of Students:");
        String name = ob.next();
        String a = ob.next();
        int ID = ob.nextInt();
        char gd = ob.next().charAt(0);
        System.out.println("string is:");
        O.record(a);
        System.out.println("Enter a Student name and grade:");
        O.record(name, gd);
        System.out.println("Enter a id and name and grade:");
        O.record(ID, name, gd);
    }
}
