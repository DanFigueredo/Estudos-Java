package JavaExercises.Domain;

public class Food extends Products{
    public Food(String name, double price) {
        super(name, price);
    }

    public double calculateTax() {
        return getPrice() * 0.08;
    }

    @Override
    public void showData(){
        super.showData();

    }
}
