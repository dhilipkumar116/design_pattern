package creational.singleton_pattern;

public class singleton_w_threadsafe {
    public static volatile singleton_w_threadsafe instance = null;

    private singleton_w_threadsafe() {
        // private constructor can be accessed via reflection.
        // to prevent that we are adding another check
        if(instance != null) {
            throw new RuntimeException("u cannot access me using reflection!");
        }
    }


    public static singleton_w_threadsafe getInstance() {
        if(instance == null) {
            // no two threads can access at the same time
            synchronized(singleton_w_threadsafe.class) {
                if(instance == null) {
                    instance = new singleton_w_threadsafe();
                }
            }
        }
        return instance;
    }

}
