package Map;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ContactList {
	
	TreeMap<String , Integer> contactsList = new TreeMap<>();
	
	public void addContact(String name, Integer number) {
		contactsList.put(name, number);
	}
	
	public void getPhoneNumber(String name) {
		
		Set<Map.Entry<String, Integer>> entries = contactsList.entrySet();
		
		
		Set set = contactsList.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			if(me.getKey().equals(name)) {
				System.out.println("Contact Number for name "+name+" is "+me.getValue());
			}
		}
		
		 
	}
	
	public void getContactName(Integer number) {
		
		Set<Map.Entry<String, Integer>> entries = contactsList.entrySet();
		
		Set set = contactsList.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			if(me.getValue().equals(number)) {
				System.out.println("Contact Name for number "+number+" is "+me.getKey());
			}
		}
		
		
		
	}
	
	public void listAllContact() {
		Set<Entry<String, Integer>> set = contactsList.entrySet();
		Iterator<Entry<String,Integer>> it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			System.out.println(me);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("Alicia", 558974);
		contactsList.addContact("Brie", 963214);
		contactsList.addContact("Preety", 157896);
		
		contactsList.getPhoneNumber("Brie");
		contactsList.getContactName(558974);
		
		System.out.println();
		
		System.out.println("All Contact Numbers");
		contactsList.listAllContact();
		
	}

}
