
package Assignment_1;

// 20. A company wants to clearly assign constructor parameters to object variables.

// Question:
// Create a class Employee with variables name and salary.
// Use this keyword inside the constructor to initialize object variables.
// Display employee details.

class Employee {
    String name;
    double salary;

    // Constructor using 'this' keyword
    Employee(String name, double salary) {
        this.name = name;       // refers to instance variable
        this.salary = salary;   // refers to instance variable
    }

    // Method to display employee details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
        System.out.println("----------------------");
    }


}
public class _20Twenty {
    public static void main(String[] args) {

        // Creating objects
        Employee e1 = new Employee("Ali", 50000);
        Employee e2 = new Employee("Rahman", 60000);

        // Display details
        e1.display();
        e2.display();
    }
}