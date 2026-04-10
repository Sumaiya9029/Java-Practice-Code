
// 4. Create a class MessageFormatter.
//  Accept first name and last name.
//  Concatenate both names with space.
//  Display full name in proper format.

import java.util.Scanner;

public class _4Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept first name and last name
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine().trim();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine().trim();

        // Convert to proper format (First letter uppercase, rest lowercase)
        firstName = formatName(firstName);
        lastName = formatName(lastName);

        // Concatenate full name
        String fullName = firstName + " " + lastName;

        // Display result
        System.out.println("Full Name: " + fullName);

        sc.close();
    }

    // Method to format name properly
    public static String formatName(String name) {
        if (name.length() == 0)
            return name;

        return name.substring(0, 1).toUpperCase() +
                name.substring(1).toLowerCase();
    }
}