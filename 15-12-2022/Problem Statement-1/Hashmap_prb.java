package Class_Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap_prb {
	HashMap<String,String>Countrymap=new HashMap<String,String>();
	HashMap<String, String>	storeCountryCapital(String CountryName, String capital) {
		Countrymap.put(CountryName,capital);
	return Countrymap;
	}
	String retrieveCapital(String CountryName) {
	return	Countrymap.get(CountryName);
	}
	String retrieveCountry(String capitalName) {
		Set<Entry<String,String>>set=Countrymap.entrySet();
		Iterator<Entry<String,String>>it=set.iterator();
		while(it.hasNext()) {
			Map.Entry<String,String> me=it.next();
			if(me.getValue().equals(capitalName)) {
				return me.getKey();
			}
		}
		return null;
	}
	public HashMap<String,String> swapKeyValue(){
		HashMap<String,String> M2=new HashMap<String,String>();
		Set<Entry<String,String>>set=Countrymap.entrySet();
		Iterator<Entry<String,String>>it=set.iterator();
		while(it.hasNext()) {
			Map.Entry<String,String> me=it.next();
			M2.put(me.getValue(), me.getKey());
		}
		return M2;
	}
	public ArrayList<String> toArrayList(){
		ArrayList<String>list=new ArrayList<>();
		Set<Entry<String,String>> set=Countrymap.entrySet();
		Iterator<Entry<String,String>>it=set.iterator();
		while(it.hasNext()) {
			Map.Entry<String,String> me=it.next();
			list.add(me.getKey());
		}
		return list;
	}
	public static void main(String[] args) {
		Hashmap_prb ob =new Hashmap_prb()	;
		System.out.println(ob.storeCountryCapital("India", "Delhi"));
		System.out.println(ob.storeCountryCapital("Japan", "Tokyo"));
		System.out.println(ob.storeCountryCapital("USA", "Washington"));
		System.out.println(ob.storeCountryCapital("Paris", "London"));
		
		System.out.println(ob.retrieveCapital("India"));
		System.out.println(ob.retrieveCountry("Tokyo"));
		System.out.println(ob.toArrayList());
		HashMap<String,String>M2=ob.swapKeyValue();
		System.out.println(M2);
	}
}
