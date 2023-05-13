package creational.singleton_pattern;

// object can be initialized only once.
public class singleton_wo_threadsafe {
    
    public static singleton_wo_threadsafe instance = null;

    // private prevents initialization of class from there class
    private singleton_wo_threadsafe(){

    }

    public static singleton_wo_threadsafe getInstance(){
        if(instance == null) {
            instance = new singleton_wo_threadsafe();
        }
        return instance;
    }

}
