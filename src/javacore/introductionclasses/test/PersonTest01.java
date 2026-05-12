package javacore.introductionclasses.test;

import javacore.introductionclasses.Domain.Person2;

public class PersonTest01 {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.setName("Daniel Figueredo");
        person2.setAge(19);
        person2.printer();
    }
}
