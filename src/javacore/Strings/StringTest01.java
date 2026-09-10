package javacore.Strings;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Daniel";
        String nameConcat = name;
        System.out.println(name.equals(nameConcat));
        nameConcat = name.concat(" Figueredo");
        System.out.println(name);
        System.out.println(nameConcat);
        System.out.println(name.equals(nameConcat));


    }
}
