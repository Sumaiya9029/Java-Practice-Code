
// package Assignment_1;

// 3. Define a class CARRENTAL with the following details:
//  Class Members are: CarId of int type, CarType of string type and Rent of
// float type.
//  Define GetCar() method which accepts CarId and CarType.
//  GetRent() method which return rent of the car on the basis of car type, i.e.
// Small Car = 1000, Van = 800, SUV = 2500
//  ShowCar() method which allow user to view the contents of cars i.e. id, type
// and rent.

import java.util.Scanner;


class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;


    void GetCar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car ID: ");
        CarId = sc.nextInt();

        System.out.print("Enter Car Type (Small Car / Van / SUV): ");
        sc.nextLine(); 
        CarType = sc.nextLine();

        Rent = GetRent(); 
        sc.close();
    }


    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car")) {
            return 1000;
        } 
        else if (CarType.equalsIgnoreCase("Van")) {
            return 800;
        } 
        else if (CarType.equalsIgnoreCase("SUV")) {
            return 2500;
        } 
        else {
            System.out.println("Invalid Car Type!!!");
            return 0;
        }
    }


    void ShowCar() {
        System.out.println("\nCar Details");
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }


}
public class _3Third {
         public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();

        c.GetCar();
        c.ShowCar();
    }
}