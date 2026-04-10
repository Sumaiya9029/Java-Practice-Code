

// 2. Design a program EmailChecker.
//  Accept an email address from the user.
//  Check whether the email contains &quot;@gmail.com&quot;.
//  Display &quot;Valid Gmail Address&quot; or &quot;Invalid Email&quot;.

import java.util.Scanner;

class EmailChecker {
    String email;

    // Constructor
    EmailChecker(String email) {
        this.email = email.trim(); // remove leading/trailing spaces
    }

    // Method to check email
    void checkEmail() {
        if (email.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }
    }


}

public class _2Second {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String inputEmail = sc.nextLine();

        EmailChecker obj = new EmailChecker(inputEmail);
        obj.checkEmail();

        sc.close();
    }
}