package HandsOn_Lab;

 class employe {
	static String empName;
	static int empId;
	
static void create(int id,String name) {
	empId=id;
	empName=name;
	System.out.println(empId+" "+empName);
}
}

class mainemploye {

	public static void main(String [] args) {
		employe.create(100, "Soumya");
		employe.create(101, "Nil");
		employe.create(102, "Nisha");
		employe.create(103, "Suvam");
		employe.create(104, "Sourav");
	}
	
}