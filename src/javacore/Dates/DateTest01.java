package javacore.Dates;

import javacore.Dates.Domain.InfoPerson;

import java.time.LocalDateTime;
import java.util.Scanner;

public class DateTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime dateRegistration = LocalDateTime.now();
        InfoPerson person = new InfoPerson();
        System.out.println("======REGISTER=====");


        System.out.print("Enter your name: ");
        person.setName(scanner.nextLine());


        System.out.print("Enter your age: ");
        person.setAge(scanner.nextInt());

        person.setDateOfRegistration((dateRegistration));

        System.out.println("====Successfully registered=====");

        person.showData();


    }
}
