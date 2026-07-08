package JavaExercises.Domain;

public class PCGame extends Game{
    public PCGame(String name, double price) {
        super(name,price);
    }
    @Override
    public double calculateFinalPrice(){
        double percent = (getPrice() / 100) * 15;
        return getPrice() + percent;
    }

}
