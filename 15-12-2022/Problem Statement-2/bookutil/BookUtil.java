package com.bookutil;

import java.util.Scanner;

import com.book.Book;
import com.book.Bookstore;


public class BookUtil {

		public static void main(String[] args){									//main method
			Bookstore obj = new Bookstore();								//instantiating BookStore object
			Scanner s  = new Scanner(System.in);								//instantiating scanner object
			
			

			for(int i=1; i<=3; i++) {									//running for loop three times to add 3 book instances
			//taking inputs from user 
			
			System.out.println("For book-"+i);
			System.out.println("Enter bookID:");
			Scanner scanBookID  = new Scanner(System.in);								//instantiating scanner object
			int bookID = scanBookID.nextInt();									//taking input for bookID
			
			System.out.println("Enter title:");
			Scanner scanTitle  = new Scanner(System.in);								//instantiating scanner object
			String title = scanTitle.nextLine();									//taking input for title
			
			System.out.println("Enter author:");
			Scanner scanAuthor  = new Scanner(System.in);								//instantiating scanner object
			String author = scanAuthor.nextLine();									//taking input for author
			obj.addBook(new Book(bookID,title,author));						//adding Book instances into 
			}
			obj.display(); 
			obj.searchByAuthor("Soumya");
			obj.searchByTitle("C++");

//	Scanner sc=new Scanner(System.in);
//	Book []arr=new Book[3];
//	for(int i=0;i<3;i++) {
//	System.out.println("Enter Book id, Title and Auth=");
//	int id;
//	String t,a;
//	id=sc.nextInt();
//	t=sc.nextLine();
//	a=sc.nextLine();
//	arr[i]=new Book(id,t,a);
//	}
//	Bookstore obj=new Bookstore();
//	for(int i=0;i<3;i++) {
//	obj.addBook(arr[i]);
//	}
//	obj.searchByTitle("C++");
//	obj.searchByAuthor("Soumya");
//	obj.display();
}
}
