package com.te.methods.common;

public class Book {
	
	String title;
	String author;
	double price;
	
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
	
	public Book(String title, String author, double price) {
		this(title,author);
		this.price=price;
	}
	
	public void display() {
		
		System.out.println("Title : "+ title);
		System.out.println("Author : "+ author);
		System.out.println("price : "+ price);

	}
	
	public static void main(String[] args) {
		Book book= new Book("C++", "jonas", 453.33);
		book.display();
	}

}
