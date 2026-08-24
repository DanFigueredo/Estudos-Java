package javacore.exceptions.errors;

public class StackOverflowTest {
    public static void main(String[] args) {
        recursion();
    }

    public static void recursion(){
        recursion();
    }

}





