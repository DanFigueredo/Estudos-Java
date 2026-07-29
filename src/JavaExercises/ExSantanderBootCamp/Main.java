package JavaExercises.ExSantanderBootCamp;

import JavaExercises.ExSantanderBootCamp.Domain.MarketingService;

public class Main {
    public static void main(String[] args){
        MarketingService message = new SMSService();
        message.sendMessage("Hello everyone");

        MarketingService emailMessage = new EmailService();
        emailMessage.sendMessage("This message is via email");
    }

}
