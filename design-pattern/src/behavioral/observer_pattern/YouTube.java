package behavioral.observer_pattern;

public class YouTube {
    
    public static void main(String[] args) {

        // Observer Pattern is one of the behavioral design pattern. 
        // Observer design pattern is useful when you are interested in the 
        // state of an object and want to get notified whenever there is any change. 
        // In observer pattern, the object that watch on the state of another object 
        // are called Observer and the object that is being watched is called Subject.

        Channel channel = new Channel();

        Observer s1 = new Subscriber("dhilip");
        Observer s2 = new Subscriber("vignesh");
        Observer s3 = new Subscriber("kavya");
        Observer s4 = new Subscriber("bharat");
        Observer s5 = new Subscriber("kavin");   
        
        channel.register(s1);
        channel.register(s2);
        channel.register(s3);
        channel.register(s4);
        channel.register(s5);

        channel.uploadVideo("start carrer with react.js");

    }
}
