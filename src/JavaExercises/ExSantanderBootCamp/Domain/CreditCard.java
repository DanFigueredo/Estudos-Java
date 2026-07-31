package JavaExercises.ExSantanderBootCamp.Domain;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(double value) {
        System.out.println("Payment via Credit Card");
        System.out.println("Amount: R$" + value);
    }
}
