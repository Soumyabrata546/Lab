package com.cognizant.tax;

public class EmployeeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxCalculator obj=new TaxCalculator();
		obj.citizenship=true;
		obj.basicSalary=25000;
		obj.calculateTax();
		obj.deductTax();
		obj.validateSalary();
		TaxCalculator obj1=new TaxCalculator();
		obj1.citizenship=true;
		obj1.basicSalary=125000;
		obj1.calculateTax();
		obj1.deductTax();
		obj1.validateSalary();
	}

}
