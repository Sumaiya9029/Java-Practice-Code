
// package Assignment_1;

// 18. A bank has a fixed interest rate that should not be changed once it is defined.
// Question:
// Create a class Bank with a final variable interestRate.
// Create a method calculateInterest(double amount) that calculates the interest using
// the fixed rate.
// Write a program to calculate interest for different customers.

class Bank {

    // Final variable (constant interest rate)
    final double interestRate = 5.0; // 5%

    // Method to calculate interest
    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }

}
public class _18Eighteen {
     public static void main(String[] args) {

        Bank bank = new Bank();

        // Different customers' amounts
        double amount1 = 10000;
        double amount2 = 20000;
        double amount3 = 50000;

        // Calculating interest
        System.out.println("Interest for Customer 1: ₹" + bank.calculateInterest(amount1));
        System.out.println("Interest for Customer 2: ₹" + bank.calculateInterest(amount2));
        System.out.println("Interest for Customer 3: ₹" + bank.calculateInterest(amount3));
    }
}