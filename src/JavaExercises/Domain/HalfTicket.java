package JavaExercises.Domain;

public class HalfTicket extends Ticket{
    public HalfTicket(double value, String movieName, boolean dubbed) {
        super(value, movieName, dubbed);
    }

    @Override
    public double calculatePrice(){
         return getValue() / 2;
    }


}
