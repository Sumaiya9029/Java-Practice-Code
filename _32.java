
// 12. Online Division Calculator
// Create a class DivisionCalculator. Accept two integers from
// user. Perform division operation. Handle division by zero using
// try-catch.
// Output: If valid: &#39;Result: &lt;value&gt;&#39; Else: &#39;Cannot divide by zero&#39;

import java.util.Scanner;

public class _12Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}