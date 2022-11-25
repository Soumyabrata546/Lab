package HandsOn_Lab;

import java.util.ArrayList;

 class LoaderThread implements Runnable{
int startNo,lastNo;
LoaderThread(int sno,int lno){
	startNo=sno;
	lastNo=lno;
}
public void run() {
	ArrayList<Integer>L=new ArrayList<Integer>();
	for(Integer i=startNo;i<=lastNo;i++) {
		L.add(i);
	}
	for(int j:L)
		System.out.println(j);
}
	public static void main(String[] args) throws InterruptedException{
	Runnable r=new LoaderThread(1, 100);
	Thread t=new Thread(r);
	int a=(int)System.currentTimeMillis();//before executing time taken
	System.out.println("Response Time Before Load List ="+a+" millis");
	t.start();
	t.join();
	int b=(int)System.currentTimeMillis();
	System.out.println("Respone tiem after executing loadlist="+b);
	System.out.println("Respone tiem= "+(b-a));
}
}
