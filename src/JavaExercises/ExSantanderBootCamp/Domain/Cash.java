package JavaExercises.ExSantanderBootCamp.Domain;

public class Cash implements PaymentMethod{
    @Override
    public void pay(double value) {
        System.out.println("Payment via Cash");
        System.out.println("Amount: R$" + value);
    }
}
