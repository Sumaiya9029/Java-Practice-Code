// package Assignment_1;

// 9. In a Calculator class, create multiple methods named add() with different
// parameter lists (e.g., one taking two integers, another taking three integers, and a
// third taking two doubles).
// Call the add() method with various arguments in your main program, demonstrating
// that the correct method is selected at compile time based on the arguments provided.

class Calculator {

    // Method with 2 integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double parameters
    double add(double a, double b) {
        return a + b;
    }


}
public class _9Ninth {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling different overloaded methods
        System.out.println("Sum of 2 integers: " + calc.add(10, 20));
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.7));
    }
}