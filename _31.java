
// 11. ATM Withdrawal System
// Create a class ATMWithdrawal. Accept account balance and

// withdrawal amount from the user. If withdrawal amount is
// greater than balance, throw an exception manually using throw.
// Otherwise deduct amount and display updated balance.
// Output: If sufficient balance: &#39;Withdrawal successful.
// Remaining balance: &lt;balance&gt;&#39; Else: &#39;Insufficient Balance&#39;


import java.util.Scanner;

public class _11Eleventh{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();

        try {
            if (withdraw > balance) {
                throw new Exception("Insufficient Balance");
            } else {
                balance = balance - withdraw;
                System.out.println("Withdrawal successful.");
                System.out.println("Remaining balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}