
// 22. Banking System
// Create a class BankingSystem. Multiple threads access shared
// account balance using synchronized block.
// Output: Balance deduction messages.


public class _22 {

    int balance = 1000;

    void withdraw(String user, int amount) {

        // synchronized block
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(user + " is withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(user + ": Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {

        _22 obj = new _22();

        // Create threads
        Thread t1 = new Thread(() -> obj.withdraw("User 1", 700));
        Thread t2 = new Thread(() -> obj.withdraw("User 2", 500));

        // Start threads
        t1.start();
        t2.start();
    }
}