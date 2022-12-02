package HandsOn_Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class SwitchFile {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char ch='y';
	do {
	System.out.println("Enter Your Choice ----");
	System.out.println("1........for write in file");
	System.out.println("2........for Read in file");
	int i=sc.nextInt();
	switch(i) {
	case 1:try {
		FileOutputStream f=new FileOutputStream("D:\\Test1.txt");
		System.out.println("ENter anything You want to store in the File=");
		String s=sc.next();
		byte []b=s.getBytes();
		f.write(b);//byte value of C, byte to string
		f.close();
		System.out.println("Done");
		}catch(Exception e) {
			System.out.println(e);
		}break;
		case 2:
			try {
				FileInputStream f1=new FileInputStream("D:\\Test1.txt");
				int i1=0;
			if((i1=f1.read())!=-1) {
				while((i1=f1.read())!=-1)//-1 means end of the file 
				System.out.print((char)i1);	
			}else
				System.out.println("The File is empty");
//				
					
				System.out.println("\nDone");
				}catch(Exception e) {
					System.out.println(e);
				}break;
				default:System.out.println("Invalid Input");
	}
	System.out.println("Press y to continue and n for exit");
	ch=sc.next().charAt(0);
	}while(ch!='n');
}
}
