package JavaExercises.ExSantanderBootCamp;

import JavaExercises.ExSantanderBootCamp.Domain.MarketingService;

public class Main {
    public static void main(String[] args){


        MarketingService email = message -> {
            System.out.println("Email message: " + message);
        };

        email.sendMessage("Black Friday!");


        MarketingService smsMessage = message -> {
            System.out.println("SMS message: " + message);
        };

        smsMessage.sendMessage("Hi everyone");
    }


}
