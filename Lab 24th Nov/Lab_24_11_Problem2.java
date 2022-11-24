package HandsOn_Lab;
class first extends Thread{
	public void run() {
		for(int i=1;i<=100;i++)
			if(i%2==0)
			System.out.print(i+", ");
		System.out.println();
	}
}
//Create two threads to print even numbers and odd numbers from 1 to 100?
//note: after printing of all even numbers only odd numbers should print

public class Lab_24_11_Problem2 extends Thread{
	public void run() {
		for(int i=1;i<=100;i++)
			if(i%2!=0)
			System.out.print(i+", ");
	}
	public static void main(String[] args) {
		first f=new first()	;
		Lab_24_11_Problem2 l=new Lab_24_11_Problem2();
		System.out.println("Even nos from 1-100=");
		f.start();
		try {
			f.sleep(1000);
			f.join();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Odd nos from 1-100=");
		l.start();
	}
}
