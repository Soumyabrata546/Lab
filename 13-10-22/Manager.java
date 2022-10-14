package HandsOn_Lab;

public class Manager extends Employee{
public Manager(int id,String name,String address,long phone,double salary) {
super(id,name,address,phone);
super.basicSalary=salary;
	// TODO Auto-generated constructor stub
}
void calculateTransportAllowance () {
	double transportAllowance =15*basicSalary/100;
	System.out.println("transportAllowance"+transportAllowance);
}
}
