package JavaExercises.Domain;

public class Eletronic extends Products{
    public Eletronic(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.20;
    }

    @Override
    public void showData(){
        super.showData();

    }
}
