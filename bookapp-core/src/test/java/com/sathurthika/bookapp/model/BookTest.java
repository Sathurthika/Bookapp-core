package com.sathurthika.bookapp.model;



import org.junit.Test;

public class BookTest {
	Book book = new Book();

	@Test
	public void testGetId() {
		System.out.println(book.getId());
	}
 
	@Test
	public void testSetId() {
		book.setId(1);
		;
	}

	@Test
	public void testGetName() {
		System.out.println(book.getName());
	}

	@Test
	public void testSetName() {
		book.setName("java");
	}

	@Test
	public void testGetPrice() {
		System.out.println(book.getPrice());
	}

	@Test
	public void testSetPrice() {
		book.setPrice(200f);
	}

	@Test
	public void testToString() {
		System.out.println(book);
	}

}
