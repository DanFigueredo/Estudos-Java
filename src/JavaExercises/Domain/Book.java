package JavaExercises.Domain;

public class Book extends Products{

    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax(){
        return getPrice() * 0.05;
    }

    @Override
    public void showData(){
        super.showData();

    }

}
