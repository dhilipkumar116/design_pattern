package creational.factory_pattern.notification;

public class CallNotification implements Notification{
  @Override
  public void notifyUser(){
    System.out.println("call notification...");
  }
  
}
