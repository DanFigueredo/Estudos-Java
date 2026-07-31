package JavaExercises.ExSantanderBootCamp.Domain;

public class Pix implements PaymentMethod {
    @Override
    public void pay(double value) {
        System.out.println("Payment via pix");
        System.out.println("Amount: R$" + value);
    }
}
