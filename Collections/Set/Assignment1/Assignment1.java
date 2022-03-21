package Set;

import java.util.HashSet;
import java.util.Iterator;

class HashSetDemo{
	
	HashSet<String> set = new HashSet<>();
	
	public HashSet<String> addCountry(String countryName){
		set.add(countryName);
		return set;
	}
	
	public String findCountry(String countryName) {
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().equals(countryName))
				return countryName;	
		}
		return "Country not Found";
	}
	
	void printAll() {
		
      Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	
	
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		HashSetDemo demo = new HashSetDemo();
		demo.addCountry("India");
		demo.addCountry("USA");
		demo.addCountry("Russia");
		demo.addCountry("China");
		demo.addCountry("Ukrain");
		
		demo.printAll();
		
		System.out.println("Country: " + demo.findCountry("India"));
		System.out.println("Country: " + demo.findCountry("Pakistan"));
	
		
	}

    

}
