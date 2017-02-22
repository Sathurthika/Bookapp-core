package com.sathurthika.bookapp.dao;

import java.util.List;

import org.junit.Test;

import com.sathurthika.bookapp.model.Book;

public class BookDAOTest {

	@Test
	public void testSave() {
		Book book = new Book();
		book.setName("Java");
		book.setPrice(300f);

		BookDAO dao = new BookDAO();
		dao.save(book);
	}

	@Test
	public void testFindAll() {
		BookDAO dao = new BookDAO();
		List<Book> list = dao.findAll();
		for (Book b : list) {
			System.out.println(b);
		}

	}
		
	}


