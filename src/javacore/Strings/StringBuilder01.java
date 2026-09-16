package javacore.Strings;

public class StringBuilder01 {
    public void main(String[] args) {
        StringBuilder name = new StringBuilder("Daniel");
        System.out.println(name);
        name.append(" Figueredo");
        System.out.println(name);
        name.reverse();
        System.out.println(name);
    }
}
