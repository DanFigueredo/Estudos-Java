package JavaExercises.Domain;

public class Product {
    private String name;
    private double price;
    private int stock;

    public void addStock(int value){
        if (value <=0 ){
            System.out.println("You can't add this value in the stock");
        }
        stock += value;
    }


    public void delStock(int value){
        if (value > stock){
            System.out.println("Insufficient stock!");
            return;
        }

        stock -= value;

    }

    public void showData(){
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + price);
        System.out.println("Product stock: " + stock);
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
