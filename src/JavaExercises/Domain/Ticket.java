package JavaExercises.Domain;

public class Ticket {
    private double value;
    private String movieName;
    private boolean dubbed;

    public Ticket(double value, String movieName, boolean dubbed) {
        this.value = value;
        this.movieName = movieName;
        this.dubbed = dubbed;
    }

    public double calculatePrice(){
        return value;
    }

    public void showData(){
        System.out.println("Movie name: "+ getMovieName());
        System.out.println("Ticket Price: " + calculatePrice());
        if (getDubbed()){
            System.out.println("Dubbed: Yes");
        }else{
            System.out.println("Dubbed: No");
        }

    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean getDubbed() {
        return dubbed;
    }

    public void setDubbed(boolean dubbed) {
        this.dubbed = dubbed;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
