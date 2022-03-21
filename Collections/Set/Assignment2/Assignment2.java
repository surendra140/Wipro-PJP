package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> set  = new TreeSet<>();
		
		set.add("Sudhir");
		set.add("Manoj");
		set.add("Rohan");
		set.add("Arya");
		set.add("Shresh");
		
		System.out.println("Tree set: "+ set);
		Iterator itr1 = set.descendingIterator();
		System.out.println("Elements in Reverse Order: ");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Iterator itr2 = set.iterator();
		String query = "Tiwari";
		boolean result = false;
		
		
		while(itr2.hasNext()) {
			if(itr2.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if(result)
			System.out.println(query + " exists");
		else
			System.out.println(query + " doesnt't exist");
	}

}
