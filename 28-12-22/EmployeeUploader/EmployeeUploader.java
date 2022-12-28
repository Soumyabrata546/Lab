package EmployeeUploader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeUploader {
	int d_id,e_id;
	String d_name,d_head,d_desc;
	Scanner sc=new Scanner(System.in);
	//for storing in the department table
	void 	storeDepartmentDetails() {
		
	try {
		//register my sql driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/soumyadb","root","1234");
	System.out.println("Enter department id=");
	d_id=sc.nextInt();
	System.out.println("Enter department Name:");
	d_name=sc.next();
	System.out.println("Enter department head:");
	d_head=sc.next();
	System.out.println("Enter department description:");
	d_desc=sc.nextLine();
	PreparedStatement stmt=conn.prepareStatement
			("insert into department values (?,?,?,?)");
	stmt.setInt(1,d_id);
	stmt.setString(2,d_name);
	stmt.setString(3,d_head);
	stmt.setString(4,d_desc);
	stmt.executeUpdate();
	
	}catch(Exception e) {
		System.out.println(e);
	}
	}
	//for storing in employee table 
	void storeEmployeeDetails() throws  SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/soumyadb","root","1234");
		System.out.println("Enter Employee id=");
		 e_id=sc.nextInt();
		System.out.println("Enter Employee Name:");
		String e_name=sc.next();
		System.out.println("Enter Employee Address:");
		String e_addres=sc.next();
		System.out.println("Enter Employee salary:");
		int e_salary=sc.nextInt();
		System.out.println("Enter Employee Contact no:");
		int e_con=sc.nextInt();
		System.out.println("Enter Department id:");
		int d_id=sc.nextInt();
		PreparedStatement stmt=conn.prepareStatement
				("insert into employee values (?,?,?,?,?,?)");
		stmt.setInt(1,e_id);
		stmt.setString(2,e_name);
		stmt.setString(3,e_addres);
		stmt.setInt(4,e_salary);
		stmt.setInt(5,e_con);
		stmt.setInt(6,d_id);
		stmt.executeUpdate();
	}
	void retrieveEmployeeDetails (int id) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn;
			conn = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/soumyadb","root","1234");
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee where Employee_Id="+e_id);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getInt(5)+" "+rs.getInt(6));
		}
	}
	
}
