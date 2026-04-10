
// package Assignment_1;

// 19. A library wants to store details of multiple books.
// Question:
// Create a class Book with attributes:
//  title
//  author
//  price
// Create an array of Book objects and display the details of all books.

class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("----------------------");
    }
}

// Main class
public class _19Ninteen {
    public static void main(String[] args) {

        // Creating array of Book objects
        Book[] books = new Book[3];

        books[0] = new Book("Java Programming", "James Gosling", 500);
        books[1] = new Book("Python Basics", "Guido van Rossum", 400);
        books[2] = new Book("C++ Guide", "Bjarne Stroustrup", 600);

        // Displaying all books
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}