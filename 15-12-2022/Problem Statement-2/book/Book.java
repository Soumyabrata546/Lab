package com.book;
//class InvalidBookException extends Exception{
//	InvalidBookException(String str){
//		super(str);
//	}
//}
public class Book {
int bookID ;
String title,author;
//parameterized constructor to intialize book
public Book(int id,String title,String auth){
	this.bookID=id;
	this.title=title;
	this.author=auth;
}
}
