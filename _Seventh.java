
// package Assignment_1;

// 7. Create an abstract class Shape with an abstract method calculate_area() and a
// concrete method display_info(). Create concrete subclasses
// like Circle and Rectangle that must implement their own specific logic
// for calculate_area(). Try to instantiate an object of the Shape class directly and
// observe the compilation error. Use the subclass objects to call both abstract and
// concrete methods.

abstract class Shape {

    // Abstract method
    abstract double calculate_area();

    // Concrete method
    void display_info() {
        System.out.println("This is a shape.");
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    // Implement abstract method
    double calculate_area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Implement abstract method
    double calculate_area() {
        return length * breadth;
    }
}

// Main class
public class _7Seventh {
    public static void main(String[] args) {

        // Uncommenting below line will cause compilation error
        // Shape s = new Shape();  // ERROR: Shape is abstract; cannot be instantiated

        // Using Circle object
        Shape c = new Circle(7);
        c.display_info();
        System.out.println("Area of Circle: " + c.calculate_area());

        // Using Rectangle object
        Shape r = new Rectangle(5, 4);
        r.display_info();
        System.out.println("Area of Rectangle: " + r.calculate_area());
    }
}