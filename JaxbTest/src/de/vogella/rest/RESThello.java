package de.vogella.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import de.vogella.xml.jaxb.model.Book;
import de.vogella.xml.jaxb.model.Bookstore;

@Path("/hello")
public class RESThello {

	@GET
	@Produces("text/xml")
	public Bookstore sayHello(){
		ArrayList<Book> bookList = new ArrayList<Book>();
	    // create books
	    Book book1 = new Book();
	    book1.setIsbn("978-0060554736");
	    book1.setName("The Game");
	    book1.setAuthor("Neil Strauss");
	    book1.setPublisher("Harpercollins");
	    bookList.add(book1);

	    Book book2 = new Book();
	    book2.setIsbn("978-3832180577");
	    book2.setName("Feuchtgebiete");
	    book2.setAuthor("Charlotte Roche");
	    book2.setPublisher("Dumont Buchverlag");
	    bookList.add(book2);

	    // create bookstore, assigning book
	    Bookstore bookstore = new Bookstore();
	    bookstore.setName("Fraport Bookstore");
	    bookstore.setLocation("Frankfurt Airport");
	    bookstore.setBookList(bookList);

		return bookstore;
	}
	
	
}
