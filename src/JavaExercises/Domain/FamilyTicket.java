package JavaExercises.Domain;

public class FamilyTicket extends Ticket{

    private int people;

    public FamilyTicket(double value, String movieName, boolean dubbed, int people) {

        super(value, movieName, dubbed);
        this.people = people;
    }

    @Override
    public double calculatePrice(){
        double price;
        if (people > 3){
            price = getValue() * people;
            price = price - (price / 100) * 5;
            return price;
        }else{
            return getValue() * people;
        }
    }



    @Override
    public void showData(){
        System.out.println("Movie name: "+ getMovieName());
        System.out.println("Ticket Price: " + calculatePrice());
        if (getDubbed()){
            System.out.println("Dubbed: Yes");
        }else{
            System.out.println("Dubbed: No");
        }
        System.out.println("People: " + people);

    }
}
