
// 20. Thread Priority System
// Create a class ThreadPrioritySystem. Create multiple threads
// and assign different priorities and observe execution order.
// Output: Thread execution messages.

public class _20Twenty extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + 
                           " is running with priority " + 
                           Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        _20Twenty t1 = new _20Twenty();
        _20Twenty t2 = new _20Twenty();
        _20Twenty t3 = new _20Twenty();

        // Set thread names
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}