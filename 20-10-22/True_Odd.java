package HandsOn_Lab;
/*
 * Problem 1.
Write a Java method to check whether 
every digit of a given integer is even. 
Return true if every digit is odd otherwise false?
 */
public class True_Odd {
 boolean check(int d) {//method for checking every digit is odd or even
	 int rem;
	 while(d!=0) {
		 rem=d%10;
		 if(rem%2==0)
			 return false;
		 d=d/10;
	 }
	 return true;
 }
 public static void main(String[] args) {
	True_Odd ob=new True_Odd();
	System.out.println(ob.check(1573));
}
}
