package HandsOn_Lab;
//Problem 3 28th oct lab
import java.text.SimpleDateFormat;
import java.util.*;
public class Date1 {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();
      Calendar calendar = Calendar.getInstance();
      
      
      SimpleDateFormat ft = 
    new SimpleDateFormat ("dd/m/yy h:mma");
      // display time and date using toString()
      System.out.println(date.toString());
      System.out.println("Current Date: " + ft.format(date));
      System.out.println("Current Calendar's Day: " + (calendar.get(Calendar.DATE)+10));
   }
}