
// 7. Define a class TextEditorBuffer.
//  Create a string using StringBuffer.
//  Append text to the string.
//  Insert text at a specific position.
//  Reverse the final string and display it.


import java.util.Scanner;

public class _7Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create StringBuffer
        StringBuffer sb = new StringBuffer();

        // Accept initial text
        System.out.print("Enter initial text: ");
        sb.append(sc.nextLine());

        // Append text
        System.out.print("Enter text to append: ");
        sb.append(sc.nextLine());

        // Insert text at specific position
        System.out.print("Enter text to insert: ");
        String insertText = sc.nextLine();

        System.out.print("Enter position to insert: ");
        int position = sc.nextInt();

        // Insert operation
        if (position >= 0 && position <= sb.length()) {
            sb.insert(position, insertText);
        } else {
            System.out.println("Invalid position!");
        }

        // Reverse string
        sb.reverse();

        // Display final result
        System.out.println("Final reversed string: " + sb.toString());

        sc.close();
    }
}