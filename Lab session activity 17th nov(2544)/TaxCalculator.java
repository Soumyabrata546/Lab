package HandsOn_Lab;
class CountryNotValidException extends Exception{
	 CountryNotValidException(String str) {
		super(str);
	}
}
class TaxNotEligibleException extends Exception{
	TaxNotEligibleException(String str){
		super(str);
	}
}
public class TaxCalculator {
	double taxAmount;
double calculateTax (String ename,boolean isIndian,double empSal) throws CountryNotValidException, TaxNotEligibleException {
	if(isIndian==false)
		throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
	else if(ename==null)
		throw new CountryNotValidException("The employee name cannot be empty");
	else if(empSal>100000&&isIndian==true)
		taxAmount =empSal *8/100 ;
	else if(empSal<100000&&empSal>50000&&isIndian==true)
		taxAmount =empSal *6/100 ;
	else if(empSal<50000&&empSal>30000&&isIndian==true)
		taxAmount =empSal *5/100 ;
	else if(empSal<10000&&empSal>30000&&isIndian==true)
		taxAmount =empSal *4/100 ;
	else 
		throw new TaxNotEligibleException("The employee does not need to pay tax");
	return taxAmount;
}

}
