package behavioral.observer_pattern;

public class Subscriber implements Observer{
    private String name;
    private Subject channel; // subscriber has only one channel

    public Subscriber(String name) {
        this.name = name;
    }
    public void update(){
        System.out.println("hey "+name+", video uploaded!");
    }

    public void subscribedChannel(Subject sub){
        this.channel = sub;
    }

}
