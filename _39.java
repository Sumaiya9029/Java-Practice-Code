
// 19. Online Shopping System
// Create a class OnlineShoppingSystem. Create threads for
// payment and order processing.
// Output: &#39;Processing payment...&#39; and &#39;Order confirmed...&#39;

public class _19Nineteen {

    // Payment Thread
    static class PaymentThread extends Thread {
        public void run() {
            System.out.println("Processing payment...");
        }
    }

    // Order Thread
    static class OrderThread extends Thread {
        public void run() {
            System.out.println("Order confirmed...");
        }
    }

    public static void main(String[] args) {

        PaymentThread payment = new PaymentThread();
        OrderThread order = new OrderThread();

        // Start threads
        payment.start();
        order.start();
    }
}