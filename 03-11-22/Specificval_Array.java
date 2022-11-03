package Fresh;

import java.util.Scanner;

public class Specificval_Array {
	static boolean search(int []arr,int n) {
		for(int i=0;i<arr.length;i++)//printing the inderx of element
			if(n==arr[i]) 
				return true;
			return false;
		
	}
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7};//array declaration
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element you want to seach:");
	//TAking user input 
	int nio=sc.nextInt();
	System.out.println(search(arr, nio));
	
	
}
}
