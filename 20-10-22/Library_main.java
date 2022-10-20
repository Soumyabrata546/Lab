package HandsOn_Lab;
//Lab session 20th october
//Problem 3
class Library_Management{//library class
	private int bookId;//
	private String bookName,bookAuthor;
	void addBook(int id,String bname,String bauthor) {//for storing book
		this.bookAuthor=bauthor;
		this.bookId=id;
		this.bookName=bname;
	}
	
	void dispenseBook(String name) {
	if(name==bookName) {
		System.out.println("Book id:"+bookId+"\nBook name:"+bookName+"\nBook author="+bookAuthor);
	}else
		System.out.println("Book not found");
	}
}
public class Library_main {
public static void main(String[] args) {
	Library_Management ob=new Library_Management();
	Library_Management ob2=new Library_Management();
	ob.addBook(101, "C++", "Ram");
	ob2.addBook(102, "Java", "Sham");
	ob.dispenseBook("C++");
	ob2.dispenseBook("Java");
	ob2.dispenseBook("Jaba");
}
}
