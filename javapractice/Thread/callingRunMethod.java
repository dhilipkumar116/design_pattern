package javapractice.Thread;

class CallRun extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(getName() + ":" + i);
        }
    }
}

public class callingRunMethod {

    public static void main(String[] args) {

        CallRun call1 = new CallRun();
        CallRun call2 = new CallRun();
        call1.setName("thread1");
        call2.setName("thread2");
        call1.run();
        call2.run();

        // start() - create own call stack and context switching happen
        // run() - pushed thread to main call stack hence it executing in order(no
        // context switching), thead1 and thread2 are treated as normal object not as a
        // thread.

        // there is no context switching between 2thread,
        // bcoz thread are assigned to main call stack instead of creating its own
        // callstack.

    }

}
