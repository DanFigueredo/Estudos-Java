package javacore.introductionmethods.test;

import javacore.introductionmethods.domain.Printer;
import javacore.introductionmethods.domain.Student;

import java.util.Scanner;

public class StudentTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.print("What is your name? ");
        student2.name = scanner.nextLine();
        System.out.print("What is your sex? ");
        student2.sex = scanner.next().charAt(0);

        System.out.print("How old are you? ");
        student2.age = scanner.nextInt();
        Printer print = new Printer();
        student1.name = "Daniel";
        student1.sex = 'M';
        student1.age = 19;
        print.printer(student1.name, student1.sex,student1.age);
        print.printer(student2.name, student2.sex,student2.age);
        scanner.close();
    }
}
