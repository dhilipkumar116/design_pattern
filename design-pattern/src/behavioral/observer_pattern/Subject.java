package behavioral.observer_pattern;

public interface Subject {
    public void register(Observer observer);
    public void unRegister(Observer observer);
    public void notifySubscribers();
    public void uploadVideo(String title);
}
