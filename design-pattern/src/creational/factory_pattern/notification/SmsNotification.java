package creational.factory_pattern.notification;

public class SmsNotification implements Notification {
  @Override
  public void notifyUser() {
    System.out.println("sms notification...");
  }
}
