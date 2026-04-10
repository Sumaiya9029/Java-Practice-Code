
// package Assignment_1;

// 2.Design a Book class (title, author, ISBN) and a Library class that manages a
// collection (e.g., an ArrayList) of Book objects. Implement methods in Library to
// add a new book, remove a book by ISBN, and display all available books.

import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    // Constructor
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("----------------------");
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Add a new book
    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully.");
    }

    // Remove book by ISBN
    void removeBook(String isbn) {
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                books.remove(b);
                System.out.println("Book removed successfully!!!");
                return;
            }
        }
        System.out.println("Book not found!!!");
    }

    // Display all books
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available!!!");
            return;
        }

        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class _2Second {
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java Basics", "James Gosling", "101");
        Book b2 = new Book("Python Guide", "Guido Van Rossum", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        System.out.println("\nAll Books:");
        lib.displayBooks();

        System.out.println("\nRemoving Book with ISBN 101");
        lib.removeBook("101");

        System.out.println("\nBooks after removal:");
        lib.displayBooks();
    }
}