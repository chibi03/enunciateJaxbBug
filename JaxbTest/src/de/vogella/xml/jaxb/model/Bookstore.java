package de.vogella.xml.jaxb.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Book storing information on books
 *
 */
@XmlRootElement(namespace = "de.vogella.xml.jaxb.model")
public class Bookstore {

@XmlElementWrapper(name = "bookList")
@XmlElement(name = "book")
private ArrayList<Book> bookList;
private String name;
private String location;

/**
 * 
 * @param bookList List of books in the bookstore
 */
public void setBookList(ArrayList<Book> bookList) {
  this.bookList = bookList;
}

public ArrayList<Book> getBooksList() {
  return bookList;
}

public String getName() {
  return name;
}

public void setName(String name) {
  this.name = name;
}

public String getLocation() {
  return location;
}

public void setLocation(String location) {
  this.location = location;
}
} 