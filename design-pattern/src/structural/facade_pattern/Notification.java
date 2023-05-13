package structural.facade_pattern;

public class Notification {
    public void sendEmail(User user){
        System.out.println("Hi "+user.getName()+", your ticket has been booked!");
    }
}
