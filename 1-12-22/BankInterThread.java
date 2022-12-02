package HandsOn_Lab;

import java.util.Scanner;

class Bank1{
	//1.Implement inter thread communication by creating banking methods like deposit and withdraw.

	int bal=0;
	
	synchronized void deposit(int num) {
		bal+=num;
		System.out.println("Balance after deposit = "+bal);
		notify();
	}
   synchronized	void withdraw(int num) throws InterruptedException {
			if(num>bal)
				wait();
			 bal-=num;
				System.out.println("Balance after Withdraw = "+bal);
	   }
	}
public class BankInterThread extends Thread{
	Bank1 b1;
	int n1,n2;
	BankInterThread(Bank1 b,int num1,int num2){
		b1=b;
		n1=num1;
		n2=num2;
	}
	public void run() {
		System.out.println("Available Balance Before Any Operation="+b1.bal);
	b1.deposit(n1);
	try {
		b1.withdraw(n2);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount to be Deposited=");
		int n1=sc.nextInt();
		System.out.println("Enter Amount to be Withdrawn=");
 int n2=sc.nextInt();
		BankInterThread b=new BankInterThread(new Bank1(),n1,n2);
		b.start();
		
	}

}
