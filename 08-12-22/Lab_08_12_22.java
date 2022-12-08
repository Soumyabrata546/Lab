package HandsOn_Lab;
/*
 * Problem Statement 1:

Write a Java program to update specific array element by given element

 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_08_12_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>color_list=new ArrayList<String>();//generic introduced after java 5 
		color_list.add("Red");
		color_list.add("Blue");
		color_list.add("Green");
		color_list.add("Black");
		System.out.println("Give any value want to update and loation");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		color_list.add(n,s);
		color_list.remove(n+1);
		System.out.println(color_list);


	}

}
