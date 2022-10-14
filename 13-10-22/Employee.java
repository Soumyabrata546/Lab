package HandsOn_Lab;

public class Employee {
String employeeName,employeeAddress;
long employeeId
,employeePhone;
double basicSalary,
specialAllowance=250.80,
Hra=1000.50;
public Employee(int id,String Name,String address,long phone) {
employeeId=id;
employeeName=Name;
employeeAddress=address;
employeePhone=phone;

	// TODO Auto-generated constructor stub
}
void calculateSalary() {
	double salary;
	salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
System.out.println("Salary="+salary);
}
void calculateTransportAllowance () {
	double transportAllowance =10*basicSalary/100;
	System.out.println("transportAllowance"+transportAllowance);
}
}
