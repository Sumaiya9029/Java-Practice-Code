
// package Assignment_1;

// 16. A hospital manages different types of staff.
// Question:
// Create a base class Staff with method work().
// Create subclasses:

//  Doctor
//  Nurse
//  Receptionist
// Override work() to display different responsibilities.

// Base class
class Staff {
    void work() {
        System.out.println("Staff performs general duties.");
    }
}

// Doctor class
class Doctor extends Staff {
    void work() {
        System.out.println("Doctor diagnoses patients and prescribes treatment.");
    }
}

// Nurse class
class Nurse extends Staff {
    void work() {
        System.out.println("Nurse takes care of patients and assists doctors.");
    }
}

// Receptionist class
class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist manages appointments and patient records.");
    }
}

// Main class
public class _16Sixteen {
    public static void main(String[] args) {

        // Runtime polymorphism
        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        Staff s3 = new Receptionist();

        s1.work();
        s2.work();
        s3.work();
    }
}