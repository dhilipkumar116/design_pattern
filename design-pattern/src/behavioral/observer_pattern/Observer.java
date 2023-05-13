package behavioral.observer_pattern;

public interface Observer {
    public void update();
    public void subscribedChannel(Subject subject);
}
