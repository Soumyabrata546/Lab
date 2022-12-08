package HandsOn_Lab;

import java.util.ArrayList;
import java.util.List;

public class Lab_08_12_23_Problem_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>color_list=new ArrayList<String>();//generic introduced after java 5 
		color_list.add("Red");
		color_list.add("Green");
		color_list.add("Black");
		color_list.add("White");
		color_list.add("Pink");
		System.out.println("List is "+color_list);
		System.out.println("List is Empty="+color_list.isEmpty());
		color_list.removeAll(color_list);
		System.out.println("After Rmoval is List empty="+color_list.isEmpty());
	}

}
