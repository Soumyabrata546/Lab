package HandsOn_Lab;
class RunnableThreadTest1 extends Thread{
	/*
	 * Observe the result in the Output window. 
Output Window 
ACBACBACBACBACABCABCABCABCABCB
	 */
	
	public void run() {
		for(int i=1;i<=4;i++)
		System.out.print("ACB");
		System.out.print("ACA");
		
		for(int i=1;i<=4;i++)
			System.out.print("BCA");
			System.out.print("BCB");
	}
}
public class Lab_24_11_Problem3 {

	public static void main(String[] args) {
		RunnableThreadTest1 r=new RunnableThreadTest1();
		r.start();
	}
}
