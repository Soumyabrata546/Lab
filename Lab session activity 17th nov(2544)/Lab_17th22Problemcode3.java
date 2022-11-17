package HandsOn_Lab;
/*
 * Problem code 3: 
Write a method called addTwoPositive that takes two int 
parameters, and if either value is not positive, throw an 
ArithmeticException, passing the string "Non-positive 
integer sent". to the constructor of the exception.if the
values are both positive, then return the sum of them. 
Under what curcumstances will the finally code block be 
executed in a try/catch/finally segments.

 */
public class Lab_17th22Problemcode3 {
int addTwoPositive (int a,int b) {
	try {
	if(a<0||b<0) {
		throw new ArithmeticException("Non-Positive Integer sent");
	}
	}catch(ArithmeticException ae){
		System.out.println(ae.getMessage());
		return 0;
	}
	finally {
		System.out.println("I will always execute");
	}
	return (a+b);
	}
	public static void main(String[] args) {
		Lab_17th22Problemcode3 obj=new Lab_17th22Problemcode3();
		System.out.println("Sum of them: "+obj.addTwoPositive(-10, 20));
}
}
