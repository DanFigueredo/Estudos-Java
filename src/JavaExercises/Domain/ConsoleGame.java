package JavaExercises.Domain;

public class ConsoleGame extends Game{
   public ConsoleGame(String name, double price){
       super(name, price);
   }
    @Override
    public double calculateFinalPrice(){
        double percent = (getPrice() / 100) * 25;
        return getPrice() + percent;
    }
}
