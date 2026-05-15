package javacore.builders.domain;

public class Product {
    private String name;
    private double price;
    public Product(){
        this.name = name;
        this.price = price;
    }

    public void showData(){
        System.out.println("Name: "+ this.name);
        System.out.println("Price: "+ this.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double isPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
