/*Design a system for a library where you have Book and Library classes. Implement a method displayDetails() in Book class to display book details 
 * and Library class to display the number of books available and their details.
 */

package com.vikram;

import java.util.ArrayList;

interface DisplayBook {
	
	void displayDetails();
		
}


class Book  implements DisplayBook{

	private String title;
	private String author;
	private String genre;
	private int price;
	
	public Book(String title, String author, String genre, int price) {
		this.title=title;
		this.author=author;
		this.genre=genre;
		this.price=price;
	}
	
	
	@Override
	public void displayDetails() {

		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Genre: "+genre);
		System.out.println("Price: "+price);
		
	}
	
}

	class Library implements DisplayBook{

		private ArrayList<Book> books;
		
		public Library() {
			
			this.books = new ArrayList<Book>();
		}
		
		public void addBook(Book book) {
			
			books.add(book);
		}
		
		@Override
		public void displayDetails() {
			
			System.out.println("Number of Books Available: "+books.size());
			System.out.println("---------------------------------------------------");
			for(Book book : books) {
				book.displayDetails();
				System.out.println("---------------------------------------------------");
			}
			
		}
				
		
	}
	


public class Abstraction_Ques1 {

	public static void main(String[] args) {
		
		Book book1 = new Book("Harry Potter and the Philosopher's Stone",  "J.K. Rowling", "Fantasy", 500);
		Book book2 = new Book("Java Mastery",  "Vikram Sharma", "Tech", 400);
		
		Book book3 = new Book("Spring Boot Mastery",  "Vikram Sharma", "Tech", 500);
		Book book4 = new Book("Microservices Mastery",  "Vikram Sharma", "Tech", 700);
		Book book5 = new Book("React Mastery",  "Vikram Sharma", "Tech", 400);
		
		Library library = new Library();
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);
		
		library.displayDetails();
		
	}
	
}
