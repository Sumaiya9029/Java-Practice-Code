
// 15. Bank Application
// Create a class BankApplication. Define method that throws
// exception using throws. Call method in main and handle
// exception.
// Output: &#39;Transaction processed&#39; or &#39;Exception handled in main&#39;

public class _15Fifteen {

    // Method that throws exception
    static void processTransaction() throws Exception {
        int balance = 500;
        int withdraw = 1000;

        if (withdraw > balance) {
            throw new Exception("Insufficient Balance");
        } else {
            System.out.println("Transaction processed");
        }
    }

    public static void main(String[] args) {
        try {
            processTransaction();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}