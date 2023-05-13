package creational.singleton_pattern;

public class Demo {

    public static void main(String[] args) {
        singleton_wo_threadsafe singletonObj1 = singleton_wo_threadsafe.getInstance();
        System.out.println(singletonObj1);

        singleton_wo_threadsafe singletonObj2 = singleton_wo_threadsafe.getInstance();
        System.out.println(singletonObj2);

        // cons for without threadsafe:
        // two threads can initialize object at the same time, which leads to
        // inconsistency.

        singleton_w_threadsafe singletonObj3 = singleton_w_threadsafe.getInstance();
        System.out.println(singletonObj3);

        singleton_w_threadsafe singletonObj4 = singleton_w_threadsafe.getInstance();
        System.out.println(singletonObj4);


    }

}
