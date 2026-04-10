
// package Assignment_1;

// 6. Write a program to print the area of two rectangles having sides (4,5) and (5,8)
// respectively by creating a class named ‘Rectangle’ with a method named ‘Area’
// which returns the area and length and breadth passed as parameters to its
// constructor.

class Rectangle {
    int length, breadth;

    // Constructor to initialize length and breadth
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int Area() {
        return length * breadth;
    }


}

public class _6Sixth {
    public static void main(String[] args) {
        // Creating two rectangle objects
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);

        // Printing areas
        System.out.println("Area of Rectangle 1: " + r1.Area());
        System.out.println("Area of Rectangle 2: " + r2.Area());
    }
}