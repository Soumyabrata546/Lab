package com.cognizant.tax;

public class TaxCalculator {
float basicSalary;
boolean citizenship;
float tax;
int nettsalary;
void calculateTax(){
	tax=30*basicSalary/100;
	System.out.println("The Tax of the employee  for  the "+basicSalary+" is "+tax);
}
void deductTax(){
	nettsalary=(int)basicSalary-(int)tax;
	System.out.println("The nett salary of the employee: "+nettsalary);
}
void validateSalary() {
	if(basicSalary>100000&&citizenship==true)
		System.out.println("The salary and citizenship eligibility : true");
	else
		System.out.println("The salary and citizenship eligibility : false");

}
}
