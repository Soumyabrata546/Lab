package HandsOn_Lab;

public class divisable {
//Write a Java program to print numbers between 1 to 100 
	//which are divisible by 3, 5 and by both.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=100;i++) {
	if(i%3==0||i%5==0|| i%3==0 && i%5==0) {
		System.out.print(i+" ");
	}
}
	}

}
