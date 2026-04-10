
// 10. Create a class PasswordMaskingSystem.
//  Accept password from the user.
//  Replace all characters except last two using replace()
// method.
//  Display masked password.

import java.util.Scanner;

// Class: PasswordMaskingSystem
public class _10TenthA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept password from user
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Mask all characters except last two
        String masked = "";

        if (password.length() > 2) {
            // Replace all characters except last two with '*'
            String stars = password.substring(0, password.length() - 2)
                    .replaceAll(".", "*");
            String lastTwo = password.substring(password.length() - 2);
            masked = stars + lastTwo;
        } else {
            // If password is 2 or less, show as it is
            masked = password;
        }

        // Display masked password
        System.out.println("Masked Password: " + masked);

        sc.close();
    }
}