package HandsOn_Lab;

import java.util.ArrayList;
import java.util.List;
/*
 * Problem Statement 2:

Write a Java program to extract a portion of an array list.

 */
public class Lab_08_12_23_Problem_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>color_list=new ArrayList<String>();//generic introduced after java 5 
		color_list.add("Red");
		color_list.add("Blue");
		color_list.add("Green");
		color_list.add("Black");
		System.out.println("Extracted from the arraylist-");
		System.out.println(color_list.subList(0, 3));
	}

}
