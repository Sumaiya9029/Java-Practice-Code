
// package Assignment_1;

// 13. A company wants to evaluate employee performance.
// Create an abstract class Employee with:
//  attributes: name, id
//  abstract method calculateBonus()
// Create subclasses:

//  Manager → bonus is 20% of salary
//  Developer → bonus is 10% of salary plus project incentive
// Demonstrate runtime polymorphism by storing different employee objects in an
// Employee reference and calling calculateBonus().

// Abstract class
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract double calculateBonus();
}

// Manager class
class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    double calculateBonus() {
        return 0.20 * salary; // 20% bonus
    }
}

// Developer class
class Developer extends Employee {
    double salary;
    double projectIncentive;

    Developer(String name, int id, double salary, double incentive) {
        super(name, id);
        this.salary = salary;
        this.projectIncentive = incentive;
    }

    double calculateBonus() {
        return 0.10 * salary + projectIncentive; // 10% + incentive
    }
}

// Main class
public class _13Thirteen {
    public static void main(String[] args) {

        // Runtime polymorphism
        Employee e1 = new Manager("Ali", 101, 50000);
        Employee e2 = new Developer("Rahman", 102, 40000, 5000);

        System.out.println("Manager Bonus: " + e1.calculateBonus());
        System.out.println("Developer Bonus: " + e2.calculateBonus());
    }
}