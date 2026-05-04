package javacore.introductionmethods.domain;

public class Calculator {
    public void add(int n1, int n2){
        System.out.println(n1 + n2);
    }

    public void subtract(int n1, int n2){
        System.out.println(n1 - n2);
    }

    public void multiply(int n1, int n2){
        System.out.println(n1 * n2);
    }

    public void divide(int n1, int n2){
        if (n2 == 0){
            System.out.println("Invalid Number");
        }
        System.out.println(n1/n2);
    }
}
