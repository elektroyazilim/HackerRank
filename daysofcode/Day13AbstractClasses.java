package daysofcode;

import java.util.Scanner;

abstract class Book {
	String title;
	String author;
	int price;

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	abstract void display();

}

class MyBook extends Book {

	public MyBook(String title, String author, int price) {
		super(title, author, price);
	}

	@Override
	void display() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Price: " + this.price);

	}

}

public class Day13AbstractClasses {

	public static void main(String[] args) {
		// Day 13: Abstract Classes
		
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		String author = scanner.nextLine();
		int price = scanner.nextInt();
		scanner.close();
		
		MyBook myBook = new MyBook(title, author, price);
		myBook.display();

	}

}

/*
 * 
The Alchemist
Paulo Coelho
248
Title: The Alchemist
Author: Paulo Coelho
Price: 248
*/
