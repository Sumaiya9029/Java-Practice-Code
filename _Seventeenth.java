
// package Assignment_1;

// 17. A company wants to track how many employees have been created in the
// system.
// Question:
// Create a class Employee with attributes name and id.
// Use a static variable employeeCount that increases every time a new object is
// created.
// Write a program that:
//  Creates multiple employee objects
//  Displays the total number of employees using a static method

class Employee {
    String name;
    int id;

    // Static variable
    static int employeeCount = 0;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // increment count whenever object is created
    }

    // Static method to display count
    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }


}
public class _17Seventeen {
    public static void main(String[] args) {

        // Creating employee objects
        Employee e1 = new Employee("Ali", 101);
        Employee e2 = new Employee("Rahman", 102);
        Employee e3 = new Employee("Ahmed", 103);

        // Display employee details
        e1.display();
        e2.display();
        e3.display();

        // Display total count using static method
        Employee.displayCount();
    }
}