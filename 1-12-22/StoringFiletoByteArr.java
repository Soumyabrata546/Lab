package HandsOn_Lab;

import java.io.*;


public class StoringFiletoByteArr {
	public static void main(String[] args) throws IOException {
		FileInputStream f2=new FileInputStream("D:\\Test1.txt");
		byte b[]=f2.readAllBytes();
		ByteArrayInputStream bin=new ByteArrayInputStream(b);
		int i=0;
		while((i=bin.read())!=-1) {
			char ch=(char)i;
			System.out.print(ch);
			bin.close();
		}
}
}
