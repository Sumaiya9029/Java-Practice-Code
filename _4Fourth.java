
// package Assignment_1;

import java.util.Scanner;

// 4. Define a class Resort with the following description:
//  Members are: RNo to store Room Number, Name store customer name,
// Charges to store per day charges, Days to store number of days of stay.
//  Member functions:
//  Compute() to calculate and return Amount as Days * Charges and if the
// values of Days*Charges is more than 11000 then as 1.02*Days*Charges
//  Getinfo() A function to enter the content Rno, Name, Charges and Days.
//  DispInfo() A function to enter the content Rno, Name, Charges, Days and
// Amount by calling function Compute().

class Resort{
    int RNo;
    String name;
    float charges;
    int days;
    float Compute(){
        float amount=days*charges;
        if(amount>=11000){
            amount=amount*1.02f;
        }
        return amount;
    }

    void GetInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Room Number : ");
        RNo = sc.nextInt();

        System.out.print("Enter Customer Name : ");
        name = sc.next();

        System.out.print("Enter Charges per Day : ");
        charges = sc.nextFloat();

        System.out.print("Enter Number of Days : ");
        days = sc.nextInt();
        sc.close();
    }

    void DispInfo(){
        float amount = Compute();

        System.out.println("\nRoom Number: " + RNo);
        System.out.println("Customer Name: " + name);
        System.out.println("Charges per Day: " + charges);
        System.out.println("Number of Days: " + days);
        System.out.println("Total Amount: " + amount);
    }
}

public class _4Fourth {
    public static void main(String[] args) {
        Resort r = new Resort();
        r.GetInfo();
        r.DispInfo();
    }
}