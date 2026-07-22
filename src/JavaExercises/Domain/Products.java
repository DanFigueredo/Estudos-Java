package JavaExercises.Domain;

public class Products {
    private String name;
    private double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateTax(){
        return 0;
    }

    public void showData(){

        System.out.println("Name: " + getName());

        System.out.println("Price: " + getPrice());

        System.out.println("Tax: " + calculateTax());

        System.out.println("Final Price: " + (getPrice()+calculateTax()));
    }
}
