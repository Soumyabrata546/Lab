package com.BankingManagementSystem;

import java.util.Scanner;

import com.BankingManagementSystem.daoImpl.BankdaoImpl;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BankdaoImpl dao = new BankdaoImpl();
    	char c;
    	do {
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Press 1 for create an account \n Press 2 for Display account details details \n"
    				+ "Press 3 for update account details\n Press 4 for delete Account details \n Press 5 for exit ");
    		int a =sc.nextInt();
    		switch (a) {
			case 1:
				dao.createNewCustAcc();
				break;
			case 2:
				dao.displayAccDetails();
				break;
			case 3:
				dao.updateCustDetails();
				break;
			case 4:
				dao.closeCustAcc();
				
				break;
			case 5:
				System.out.println("Thanking You!!!!!!!!!!!");
				System.exit(0);
				break;

			default:
				System.out.println("Opps You put wrong input");
				break;
			}
    	}while(true);
    }
}
