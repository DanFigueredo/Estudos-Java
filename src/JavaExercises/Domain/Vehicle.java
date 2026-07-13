package JavaExercises.Domain;

public class Vehicle  implements JavaExercises.Vehicle {
    private  String name;
    private double year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    @Override
    public void start() {
        System.out.println("O Veiculo: " + getName() + " Esta funcionando");
    }

    @Override
    public void stop() {
        System.out.println("O Veiculo: " + getName() + " Esta parado");
    }
}
