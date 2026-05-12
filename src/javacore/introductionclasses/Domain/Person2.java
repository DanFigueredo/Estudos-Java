package javacore.introductionclasses.Domain;

public class Person2 {
    private String name;
    private int age;

    public void printer(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
     public void setName(String name){
         this.name = name;
     }

     public void setAge(int age){
         this.age = age;
     }
}
