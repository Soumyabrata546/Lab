package HandsOn_Lab;
//Problem 1 of Lab 17th Nov
public class CalculatorSimulator {

	public static void main(String[] args) throws CountryNotValidException, TaxNotEligibleException {
		// TODO Auto-generated method stub
		TaxCalculator obj=new TaxCalculator();
		//Test case -1
		System.out.println("Tax amount is:"+	obj.calculateTax("Ron", false, 34000));
		//Test case -2
		System.out.println("Tax amount is:"+obj.calculateTax("Tim", true, 1000));
		//Test case -3
		System.out.println("Tax amount is: "+obj.calculateTax("Jack", true, 55000));
		//Test case -4
		System.out.println("Tax amount is:"+obj.calculateTax(null, true, 30000));
	}

}
