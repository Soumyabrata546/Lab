package HandsOn_Lab;

public class Trainee extends Employee{
	public Trainee(int id,String name,String address,long phone,double salary) {
		super(id,name,address,phone);
		super.basicSalary=salary;
}
}
