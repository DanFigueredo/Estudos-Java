package javacore.introductionclasses.test;

import javacore.introductionclasses.Domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 19;
        student.name = "Daniel";
        student.sex = 'M';
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
