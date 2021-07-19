package com;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Book {

	int id;
	String name;
	String title;
	Author author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book( String name, String title, Author author) {
		super();
		
		this.name = name;
		this.title = title;
		this.author = author;
	}
	
	@Id
	@GeneratedValue
	@Column (name="book_id")
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@OneToOne (cascade=CascadeType.ALL)
	@JoinColumn (name="author_id")
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", title=" + title + ", author=" + author + "]";
	}
}
	