package creational.factory_pattern.notification;

/**
 * 
 * factory method initialize the respective class depends on condition given by client.
 * 
 * 
 */

public class NotificationFactory {

  public Notification createNotification(String channel){
      switch(channel) {
        case "email":
          return new EmailNotification();
        case "sms":
          return new SmsNotification();
        case "call":
          return new CallNotification();
        default:
          throw new IllegalArgumentException("Unknown channel : "+channel);

      }
  }

}
