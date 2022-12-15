package Class_Assignment;

import java.util.*;


public class HashedProblem_13_12_22 {
	String Country;
	HashSet<String>H1=new HashSet<String>();
	HashSet<String> storeCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
		
	}
	String retrieveCountry(String CountryName) {
	//creating hashset
		if(H1.contains(CountryName)) {
		return CountryName+" is present in the hashset";
	}else
		return null;
	
	
	}
	public static void main(String[] args) {
		HashedProblem_13_12_22 ob=new HashedProblem_13_12_22();
		ob.storeCountryNames("China");
		ob.storeCountryNames("India");
		ob.storeCountryNames("America");
		System.out.println(ob.storeCountryNames("Russia"));
		System.out.println(ob.retrieveCountry("Morocco"));
		System.out.println(ob.retrieveCountry("India"));


	}
}
