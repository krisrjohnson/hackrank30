/*
day 13

MyBook class
inherits (extends) Book class
parametrized constructor 
	(String title, String author, int price)
	void display()
		Title: title_variable
		Author: author_variable
		Price: price_variable
*/

//provided and retyped:
import java.util.*;

abstract class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	abstract void display();
}

// my code
class MyBook extends Book {
	int price;

	MyBook (String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	void display() {
		System.out.println("Title: " + title + "\n" + "Author: " + author + "\n" + "Price: " + price);
	}
}

// provided and retyped
public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		String author = scanner.nextLine();
		int price = scanner.nextInt();
		scanner.close();

		Book book = new MyBook(title, author, price);
		book.display();
	}
}