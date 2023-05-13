package creational.factory_pattern.notification;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser(){
      System.out.println("email notification...");
    }
}
