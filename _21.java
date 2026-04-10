
// package Assignment_2;

// 1. Create a class called UsernameValidator.
//  Accept a username from the user.
//  Remove leading and trailing spaces.
//  Convert the username to lowercase.
//  Display the cleaned username.

import java.util.Scanner;

public class _1First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept username
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Remove leading and trailing spaces
        username = username.trim();

        // Convert to lowercase
        username = username.toLowerCase();

        // Display cleaned username
        System.out.println("Cleaned Username: " + username);

        sc.close();
    }
}