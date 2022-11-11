package HandsOn_Lab;

import java.util.*;

public class Lab_10_11_22_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem statement 1
String s=new String("Welcome to Java World");
System.out.println("String is ="+s);
System.out.println("Character at 5th Position ="+s.charAt(4));
System.out.println(s.compareToIgnoreCase("Welcome"));
s+="- Let us learn";
System.out.println("After concatination="+s);
System.out.println("First occurance of a is :"+(s.indexOf('a')+1));
System.out.println("After replacing all a with e="+s.replace('a', 'e'));
System.out.println(s.substring(4, 11));
System.out.println(s.toLowerCase());

//Problem Statement 2
StringBuffer s1=new StringBuffer("This is StringBuffer");
s1.append("This is a sample program");
System.out.println(s1);
s1.insert(20,"Object");
System.out.println(s1);
s1.reverse();
System.out.println(s1);
//Problem statement 3
StringBuilder t=new StringBuilder("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
System.out.println("Folder:"+t.substring(0,3).concat("||")+t.substring(7,10).concat("||")+t.substring(11,18));
System.out.println("File:"+t.substring(20));
}

}
