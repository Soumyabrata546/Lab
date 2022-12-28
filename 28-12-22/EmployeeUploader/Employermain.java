package EmployeeUploader;

import java.sql.SQLException;

public class Employermain {
public static void main(String[] args) throws SQLException {
	EmployeeUploader e=new EmployeeUploader();
	e.storeDepartmentDetails();
	e.storeEmployeeDetails();
	e.retrieveEmployeeDetails(1);
}
}
