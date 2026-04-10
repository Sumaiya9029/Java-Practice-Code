
// package Assignment_1;

// 10.Create an interface Bank with method getInterestRate(). Create classes SBI,
// HDFC, and ICICI that implement the interface and return different interest rates.
// Write a Java program to display the interest rate of each bank.
interface Bank {
    double getInterestRate();
}

// SBI class
class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

// HDFC class
class HDFC implements Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

// ICICI class
class ICICI implements Bank {
    public double getInterestRate() {
        return 6.8;
    }
}

// Main class
public class _10Tenth {
    public static void main(String[] args) {

        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + b3.getInterestRate() + "%");
    }
}