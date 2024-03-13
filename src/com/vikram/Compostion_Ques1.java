/*Consider a Library system that contains Books, each identified by a unique ISBN number. Each Book has an associated Author. An Author is identified by their name and can have multiple books written by them.

Define a class Author with fields for the author's name and a list of books they have written. Implement methods to add a book written by the author and to display all the books written by the author.

Define a class Book with fields for the book's ISBN number and the associated author. Implement methods to display the book's details.

Define a class Library that contains a collection of books. Implement methods to add a book to the library, search for a book by its ISBN number, and display all books in the library.

Provide a Main class with a main method that demonstrates the usage of the Library system. Instantiate some authors, create books written by them, add those books to the library, and perform searches and displays.

*/

package com.vikram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Author {
    private String name;
    private List<Books> books;

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Books book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books by " + name + ":");
        for (Books book : books) {
            System.out.println("- " + book.getTitle());
        }
    }
}

class Books {
    private String isbn;
    private String title;
    private Author author;

    public Books(String isbn, String title, Author author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        author.addBook(this); // Adding the book to the author's list of books
    }

    public String getTitle() {
        return title;
    }

	public String getISBN() {
		// TODO Auto-generated method stub
		return isbn;
	}
}

class Library1 {
    private Map<String, Books> booksByISBN;

    public Library1() {
        this.booksByISBN = new HashMap<>();
    }

    public void addBook(Books book) {
        booksByISBN.put(book.getISBN(), book);
    }

    public Books searchByISBN(String isbn) {
        return booksByISBN.get(isbn);
    }

    public void displayAllBooks() {
        System.out.println("All books in the library:");
        for (Books book : booksByISBN.values()) {
            System.out.println("- " + book.getTitle() + " (ISBN: " + book.getISBN() + ")");
        }
    }
}

public class Compostion_Ques1 {
    public static void main(String[] args) {
        // Instantiate authors
        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("George Orwell");

        // Create books written by authors
        Books book1 = new Books("978-0439554930", "Harry Potter and the Sorcerer's Stone", author1);
        Books book2 = new Books("978-0439358071", "Harry Potter and the Chamber of Secrets", author1);
        Books book3 = new Books("978-0439136358", "Harry Potter and the Prisoner of Azkaban", author1);
        Books book4 = new Books("978-0451524935", "1984", author2);
        Books book5 = new Books("978-0156196253", "Animal Farm", author2);

        // Instantiate library
        Library1 library = new Library1();

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        // Perform searches and displays
        author1.displayBooks(); // Display books by J.K. Rowling
        author2.displayBooks(); // Display books by George Orwell

        Books searchedBook = library.searchByISBN("978-0451524935");
        if (searchedBook != null) {
            System.out.println("Book found: " + searchedBook.getTitle());
        } else {
            System.out.println("Book not found.");
        }

        library.displayAllBooks(); // Display all books in the library
    }
}

