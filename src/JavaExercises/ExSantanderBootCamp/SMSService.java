package JavaExercises.ExSantanderBootCamp;

import JavaExercises.ExSantanderBootCamp.Domain.MarketingService;

public class SMSService implements MarketingService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent via SMS: " + message);
    }
}
