package LowLevelDesignPrinciples.OpenClosePrinciple.Example1.BetterCode;

public class WhatsappNotificaton implements Notification {
    @Override
    public void send(){
        System.out.println("Sending Whatsapp Notifaction");
    }
}
