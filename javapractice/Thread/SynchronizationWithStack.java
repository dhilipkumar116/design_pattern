package javapractice.Thread;

class Stack {
    Integer[] arr;
    int size;
    int topStack = -1;
    Object lock;
    Stack(int size) {
        this.size = size;
        arr = new Integer[size];
        lock = new Object(); // we can use any object eg: new Integer(), new String()...
    }

    public Integer push(int value) {
        synchronized(lock) {
            if(isFull()) {
                System.out.println("stack is already full");
                return Integer.MAX_VALUE;
            }
            ++topStack;
            try { Thread.sleep(1000); }catch(Exception e) {}
            arr[topStack] = value;
            return arr[topStack];
        }
    }
    public Integer pop() {
        synchronized(lock) {
            if(isEmpty()) {
                System.out.println("stack is empty");
                return Integer.MAX_VALUE;
            }
            Integer value = arr[topStack];
            arr[topStack] = null;
            topStack--;
            try { 
                Thread.sleep(1000); 
                // sleep increases the chance of race condition
            }catch(Exception e) {}
            return value;
        }
    }

    public boolean isEmpty() {
        return topStack < 0;
    }
    public boolean isFull() {
        return arr.length-1 == topStack;
    }
}

public class SynchronizationWithStack {
    
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("pushed: "+stack.push(10));
            }
        },"pusher").start();

        new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("poped: "+stack.pop());
            }
        }, "poper").start();

        /*
            the above code get into race condition.
            two theads are randomly accessing the pop and push method
            which leads to inconsistency in shared variable (topStack).
            it produce exception.

            to handle: we should make these thread synchronize.
            two ways:
                1) synchronize block
                2) synchronize method 
                        1) static method
                        2) non static method
            
            -------------------------------------------------
            synchronize block:
                synchronize(lock) {
                    // our logic
                }
            --------------------------------------------------
            synchronize method : static

            public synchronized static boolean pop(){
                // our logic
            }
                        |
                        |   the above code will be interally converted to 
                        |    synchronize block by the compiler
                        |
                        |
                       \ /
            public boolean pop(){
                synchronized (Stack.class){
                    // our logic
                }
            }
            
            --------------------------------------------------
            synchronize method : non static

            public synchronized boolean pop(){
                // our logic
            }
                        |
                        |   the above code will be interally converted to 
                        |    synchronize block by the compiler
                        |
                        |
                       \ /
            public boolean pop(){
                synchronized (this){
                    // our logic
                }
            }

         */  
    }

}
