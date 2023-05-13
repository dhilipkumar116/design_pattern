package behavioral.observer_pattern;
import java.util.*;

public class Channel implements Subject{

    private List<Observer> subscribers;
    private String title;

    public Channel(){
        subscribers = new ArrayList<Observer>();
    }

    public void register(Observer observer){
        this.subscribers.add(observer);
    }

    public void unRegister(Observer observer){
        this.subscribers.remove(observer);
    }

    public void notifySubscribers(){
        for(Observer sub : subscribers) {
            sub.update();
        }
    }
    
    public void uploadVideo(String title){
        this.title = title;
        notifySubscribers();
    }
}
