package com.example.design_pattern.iterator;

import org.junit.jupiter.api.Test;

public class IteratorTest {

	@Test
	void iterator_test() {
		BookShelf bookShelf = new BookShelf(4);
		
		bookShelf.appendBook(new Book("Aladdin"));
		bookShelf.appendBook(new Book("Beauty and the Beast"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Dumbo"));
		
		Iterator it = bookShelf.iterator();
		
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
}
