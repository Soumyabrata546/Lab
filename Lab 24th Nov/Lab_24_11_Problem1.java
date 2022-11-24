package HandsOn_Lab;

import java.util.ArrayList;

class ListLoader{
	ArrayList<Integer>L=new ArrayList<Integer>();
	void loadList(Integer startNumber, Integer lastNumber){
		for(Integer i=startNumber;i<=lastNumber;i++) {
			L.add(i);
		}
		
	}
}
public class Lab_24_11_Problem1 {
public static void main(String[] args) {
	double f=System.currentTimeMillis();
	ListLoader l=new ListLoader();
	l.loadList(0, 100000);
	double f2=System.currentTimeMillis();
	System.out.println("Response Time="+(f2-f)+" milisecons");
}
}
