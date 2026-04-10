
// 23. Chat Application
// Create a class ChatApplication. Create threads for sending and
// receiving messages. Demonstrate thread lifecycle.
// Output: Sending and receiving messages.

public class _23 {

    // Thread for sending messages
    static class Sender extends Thread {
        public void run() {
            System.out.println("Sending message...");
        }
    }

    // Thread for receiving messages
    static class Receiver extends Thread {
        public void run() {
            System.out.println("Receiving message...");
        }
    }

    public static void main(String[] args) {

        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        // New state
        System.out.println("Threads created");

        // Runnable state
        sender.start();
        receiver.start();
    }
}