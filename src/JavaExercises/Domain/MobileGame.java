package JavaExercises.Domain;

public class MobileGame extends Game{
    private String name;
    private double price;

    public MobileGame(String name, double price){
        super(name,price);
    }
    @Override
    public double calculateFinalPrice(){
        double percent = (getPrice() / 100) * 5;
        return getPrice() + percent;
    }
}
