package creational.factory_pattern.notification;

public class NotificationService {

  public static void main(String[] args) {
    NotificationFactory nf = new NotificationFactory();
    Notification notification = nf.createNotification("sms");
    notification.notifyUser();
  }
  
}
