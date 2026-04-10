
// 9. Define a class Student with attributes id and name.

//  Override toString() method.
//  Create object of class.
//  Display object details using toString().

// Class: Student
public class _9Ninth {
    int id;
    String name;

    // Constructor
    _9Ninth(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }

    // Main method
    public static void main(String[] args) {

        // Create object of Student class
        _9Ninth s1 = new _9Ninth(101, "Ali");

        // Display object details using toString()
        System.out.println(s1.toString());

        // OR (automatically calls toString())
        System.out.println(s1);
    }
}