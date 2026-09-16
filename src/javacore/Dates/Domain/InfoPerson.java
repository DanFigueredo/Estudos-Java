package javacore.Dates.Domain;

import java.time.LocalDateTime;

public class InfoPerson {
    private String name;
    private int age;
    private LocalDateTime dateOfRegistration;



    public InfoPerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    public InfoPerson() {

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDateTime dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public void showData(){
        System.out.println("========Your infos=======");

        System.out.println("Name: "+ getName());
        System.out.println("Age: " + getAge());
        System.out.println("Date of registration: " + getDateOfRegistration());
    }
}
