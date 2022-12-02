package HandsOn_Lab;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoringByteArrtoFile {
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("D:\\Test1.txt");
		byte b[]= {66,67,98,45,72};
		ByteArrayInputStream bin=new ByteArrayInputStream(b);
		int i=0;
		while((i=bin.read())!=-1) {
			f.write(i);
			char ch=(char)i;
			System.out.print(ch);
			bin.close();
		}
}

}
