package com.book;

import java.util.*;

public class Bookstore {
	
	ArrayList<Book>al1=new ArrayList<Book>();
	public void addBook(Book b) {
		al1.add(b);
	}
	//Search book based on title

	public void searchByTitle(String title) {
		Iterator<Book> it=al1.iterator();
		while(it.hasNext()) {
			Book obj=(Book)it.next();
			if(obj.title==title) {
				System.out.println("Book found=");
				System.out.println(obj.title+" "+obj.author);
			}
		}
	}
	//Search book based on author
	public void searchByAuthor(String auth) {
		Iterator<Book> it=al1.iterator();
		while(it.hasNext()) {
			Book obj=(Book)it.next();
			if(obj.author==auth) {
				System.out.println("Book found=");
				System.out.println(obj.title+" "+obj.author);
			}
		}
	}
	public void display() {
		Iterator<Book> it=al1.iterator();
		while(it.hasNext()) {
			Book obj=(Book)it.next();
			System.out.println(obj.bookID+" "+obj.title+" "+obj.author);

		}
	}
	
}
