package HandsOn_Lab;
//Lab session 20th october
//Problem 2
class Bank_coustomer{
	private int acc_no,accbalance;//private data memebers
	private String acc_name;
	void create_acc(int ano,String name,int bal) {//method for creating account
		this.acc_name=name;
		this.acc_no=ano;
		this.accbalance=bal;
	}
	void addAmount(int amount) {//for deposit amount
		accbalance+=amount;
	}
	void getAmount() {//for printing amount
		System.out.println("Acount Name:"+acc_name+"\nAccount Balane:"+accbalance);
	}
	void withDrawAmount(int amount) {//for withdrawl amount
		accbalance-=amount;
	}
}
public class Bank_Operation {
public static void main(String[] args) {
	Bank_coustomer ob1,ob2;//object creation
	ob1=new Bank_coustomer();//intializing
	ob2=new Bank_coustomer();
	ob1.create_acc(101, "Soumyabrata", 500);//creating two accounts
	ob2.create_acc(102, "Cat", 1000);
	ob1.addAmount(500);//adding money
	ob2.withDrawAmount(500);//withdrawing money
	ob1.getAmount();
	ob2.getAmount();
}
}
