package JavaExercises;

import javacore.introductionclasses.Domain.Person;

public class Exercise11 {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();

        person.setName("Daniel");
        person.setAge(19);

        person2.setName("Patricia");
        person2.setAge(18);

        System.out.println("Person 1: ");
        System.out.println(person.getName());
        System.out.println(person.getAge());

        System.out.println("--------------------------");

        System.out.println("Person 2: ");
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        
    }
}
