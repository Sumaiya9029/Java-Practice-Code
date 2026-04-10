
// package Assignment_1;

// 14. Create a base class Person with method role().
// Create subclasses:
//  Employee
//  Manager (extends Employee)
// Override role() in each class and demonstrate multilevel inheritance with runtime
// polymorphism.

// Base class
class Person {
    void role() {
        System.out.println("I am a person.");
    }
}

// Employee class (inherits Person)
class Employee extends Person {
    void role() {
        System.out.println("I am an employee.");
    }
}

// Manager class (inherits Employee)
class Manager extends Employee {
    void role() {
        System.out.println("I am a manager.");
    }
}

// Main class
public class _14Fourteen {
    public static void main(String[] args) {

        // Runtime polymorphism
        Person p1 = new Person();
        Person p2 = new Employee();  // upcasting
        Person p3 = new Manager();   // upcasting

        p1.role();
        p2.role();
        p3.role();
    }
}