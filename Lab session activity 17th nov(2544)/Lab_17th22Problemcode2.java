package HandsOn_Lab;
/*
 * Problem code 2:
Take two numbers x and y. Throw the exception if the two numbers are negative else print the 
Product of x and y.
Input Format
The only line of input consists of two integers, x and y.
Constraints   -----      -20<= x, y <=20
Output Format
Print the product if both are positive else print the output as below:
java.lang.Exception: x and y should not be zero.

 */
import java.util.Scanner;

public class Lab_17th22Problemcode2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers=");
int x=sc.nextInt();
int y=sc.nextInt();
if(x<0||y<0)
	throw new Exception("x and y should not be zero.");
else
	System.out.println("Product of x and y: "+(x*y));
	}

}
