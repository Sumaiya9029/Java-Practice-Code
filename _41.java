// 21. Producer Consumer System

// Create a class Restaurant. Chef prepares food and waiter serves
// it using wait() and notify().
// Output: &#39;Chef prepared food&#39; and &#39;Waiter served food&#39;


public class _21  {

    boolean foodReady = false;

    // Method for Chef (Producer)
    synchronized void prepareFood() {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify(); // notify waiter
    }

    // Method for Waiter (Consumer)
    synchronized void serveFood() {
        if (!foodReady) {
            try {
                wait(); // wait until food is ready
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {

        _21 obj = new _21();

        // Chef thread
        Thread chef = new Thread(() -> obj.prepareFood());

        // Waiter thread
        Thread waiter = new Thread(() -> obj.serveFood());

        waiter.start();
        chef.start();
    }
}