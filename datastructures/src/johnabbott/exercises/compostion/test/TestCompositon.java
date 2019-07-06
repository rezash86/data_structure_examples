package johnabbott.exercises.compostion.test;

import java.util.ArrayList;
import java.util.List;

public class TestCompositon {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<Book>();
		
		Book b1 = new Book("Les Miserable");
		Book b2 = new Book("Blindness");
		
		books.add(b1);
		books.add(b2);
		
		Library lib = new Library(books);
		for (Book book : books) {
			System.out.println(book.getName());
		}
	}

}
