package javacore.introductionmethods.test;

import javacore.introductionmethods.domain.Calculator;

import java.util.Scanner;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        System.out.print("Number 1: ");
        n1 = scanner.nextInt();

        System.out.print("Number 2: ");
        n2 = scanner.nextInt();

        calculator.add(n1,n2);
        calculator.subtract(n1,n2);
        calculator.multiply(n1,n2);
        calculator.divide(n1,n2);
    }
}
