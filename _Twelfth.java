
// package Assignment_1;

// 12. Design a payment processing system.
// Create an abstract class Payment with an abstract method pay(double amount).
// Create subclasses:
//  CreditCardPayment
//  UPIPayment
//  NetBankingPayment
// Each subclass should implement the pay() method differently.

// Abstract class
abstract class Payment {
    abstract void pay(double amount);
}

// Credit Card Payment
class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

// UPI Payment
class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

// Net Banking Payment
class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking.");
    }
}

// Main class
public class _12Twelve {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new NetBankingPayment();

        p1.pay(1500);
        p2.pay(750);
        p3.pay(2000);
    }
}