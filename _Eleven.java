
// package Assignment_1;

// 11. A drawing application is being developed where different shapes can be created.
// All shapes share some common properties, so a base class Shape is created with a
// method display() to show general shape information.
// Two specific shapes, Circle and Rectangle, inherit from the Shape class. Each shape
// has its own method to calculate and display its area.
// This demonstrates hierarchical inheritance, where multiple subclasses inherit from a
// single base class.

// Base class
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

// Derived class Circle
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class _11Eleventh {
    public static void main(String[] args) {

        // Circle object
        Circle c = new Circle(7);
        c.display();          // inherited method
        c.calculateArea();   // own method

        System.out.println();

        // Rectangle object
        Rectangle r = new Rectangle(5, 4);
        r.display();         // inherited method
        r.calculateArea();   // own method
    }
}