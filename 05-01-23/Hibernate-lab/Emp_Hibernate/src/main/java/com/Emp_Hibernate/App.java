package com.Emp_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
      SessionFactory s=new Configuration().configure().buildSessionFactory();
      Session ses=s.openSession();
      //operation performed in db,save permanent
      Transaction t=ses.beginTransaction();
      Employee obj=new Employee();
      //use object to enter data 
      //1st data 
      obj.setEmpId(101);
      obj.setEmpFirstName("Soumya");
      obj.setEmpLastName("Brata");
      obj.setEmpEmail("name@gmai.com");
      obj.setEmpAddr("Kolkata");
      obj.setEmpPhone("12345678");
      obj.setEmpSalary(20000.00);
      obj.setEmpAge("21");
      ses.save(obj);
      //2nd data 
      Employee obj1=new Employee();

      obj1.setEmpId(102);
      obj1.setEmpFirstName("Niladri");
      obj1.setEmpLastName("Choudhary");
      obj1.setEmpEmail("name@gmail.com");
      obj1.setEmpAddr("Bandel");
      obj1.setEmpPhone("12345678");
      obj1.setEmpSalary(20000.00);
      obj1.setEmpAge("30");
      ses.save(obj);
      //3rd data
      Employee obj2=new Employee();

      obj2.setEmpId(103);
      obj2.setEmpFirstName("Nisha");
      obj2.setEmpLastName("Sutradhar");
      obj2.setEmpEmail("nisha@gmail.com");
      obj2.setEmpAddr("Odisa");
      obj2.setEmpPhone("12345678");
      obj2.setEmpSalary(20000.00);
      obj2.setEmpAge("21");
      ses.save(obj);
      //4thn data
      Employee obj3=new Employee();

      obj3.setEmpId(104);
      obj3.setEmpFirstName("Shifa");
      obj3.setEmpLastName("Iqbal");
      obj3.setEmpEmail("shifa@gmai.com");
      obj3.setEmpAddr("Asansol");
      obj3.setEmpPhone("12345678");
      obj3.setEmpSalary(20000.00);
      obj3.setEmpAge("21");
      ses.save(obj);
      //5th data 
      Employee obj4=new Employee();

      obj4.setEmpId(105);
      obj4.setEmpFirstName("Akshay");
      obj4.setEmpLastName("Dash");
      obj4.setEmpEmail("akshay@gmai.com");
      obj4.setEmpAddr("Kolkata");
      obj4.setEmpPhone("12345678");
      obj4.setEmpSalary(20000.00);
      obj4.setEmpAge("25");
      ses.save(obj);
     t.commit();
      ses.close();
    }
}
