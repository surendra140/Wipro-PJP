package List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Assignment3 {

	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		
		System.out.println("Using Iterator:");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
        	System.out.println(it.next());
		
        System.out.println();
        
        System.out.println("Using Enumeration:");
		Enumeration<Integer> en = list.elements();
		while(en.hasMoreElements())
			System.out.println(en.nextElement());
		
		System.out.println();
		
		System.out.println("Using ListIterator:");
		ListIterator<Integer> listitr = list.listIterator();
		while(listitr.hasNext())
			System.out.println(listitr.next());
		
		
	}
}
