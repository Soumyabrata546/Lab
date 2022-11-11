package HandsOn_Lab;

import java.util.Scanner;

/*
 * Q. 2 

Write a Java program to find sequences 
of lowercase letters joined with a 
underscore.


 */
public class UnderscoreChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean f=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a stirng =");
	String s=sc.nextLine();
	 for (int i = 0; i < s.length(); i++) {
		 if(s.charAt(i)=='_' && s.charAt(i+1)=='e') {
			 System.out.println("Found a match");
			 f=true;
			 break;
		 }
	}
	 if(f==false)
		 System.out.println("Not matched");

}
}
