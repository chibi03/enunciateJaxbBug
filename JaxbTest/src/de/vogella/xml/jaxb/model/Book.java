package de.vogella.xml.jaxb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Bookstore storing some books
 *
 */
@XmlRootElement(name = "book")
@XmlType(propOrder = { "author", "name", "publisher", "isbn", "viral" })
public class Book {

private String name;
private String author;
private String publisher;
private String isbn;

@XmlElement(name="viral")
private BookViral viral;


/**
 * 
 * @return the title of the book
 */
@XmlElement(name = "title")
public String getName() {
 return name;
}

/**
 * 
 * @param name the title of the book
 */
public void setName(String name) {
 this.name = name;
}

/**
 * 
 * @return the name of the author
 */
public String getAuthor() {
 return author;
}

public void setAuthor(String author) {
 this.author = author;
}

public String getPublisher() {
 return publisher;
}

public void setPublisher(String publisher) {
 this.publisher = publisher;
}

public String getIsbn() {
 return isbn;
}

public void setIsbn(String isbn) {
 this.isbn = isbn;
}

public BookViral getViral(){
	return viral;
}

public void setViral(BookViral viral){
	this.viral = viral;
}

} 