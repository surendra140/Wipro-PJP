package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Assignment1 {
	
	HashMap<String, String> mapObj = new HashMap<String, String>();

	public HashMap<String, String> saveCountryCapital(String countryName, String capital){
		mapObj.put(countryName, capital);
		return mapObj;
	}
	
	public String getCapital(String countryName) {
		Set set = mapObj.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			if(me.getKey().equals(countryName)) {
				return (String)me.getValue();
			}
		}
		return "No Country Found";
	}
	
	public String getCountry(String capital) {
		Set set = mapObj.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			if(me.getValue().equals(capital)) {
				return (String)me.getKey();
			}
		}
		return "No Capital Found";
	}
	
	public HashMap<String, String> swap(){
		
		HashMap<String, String> mapObj2 = new HashMap<String,String>();
		Set set = mapObj.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			mapObj2.put((String)me.getValue(), (String)me.getKey());
		}
		return mapObj2;
	}
	
	public ArrayList key() {
		ArrayList<String> al = new ArrayList<String>();
		Set set = mapObj.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			al.add((String) me.getKey());
		}
		return al;
	}
	
	public ArrayList value() {
		ArrayList<String> al1 = new ArrayList<String>();
		Set set = mapObj.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			al1.add((String) me.getValue());
		}
		return al1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment1 obj = new Assignment1();
		
		obj.saveCountryCapital("India", "Delhi");
		obj.saveCountryCapital("Japan", "Tokyo");
		
		System.out.println(obj.getCapital("India"));
		System.out.println(obj.getCountry("Tokyo"));
		
		HashMap<String, String> m = obj.swap();
		
		
		System.out.println("All Country Names: ");
		ArrayList<Integer> al = obj.key();
		System.out.println(al.toString());
		
		System.out.println();
		
		System.out.println("All Capital Names: ");
		ArrayList<Integer> al1 = obj.value();
		System.out.println(al1.toString());
	}

}
