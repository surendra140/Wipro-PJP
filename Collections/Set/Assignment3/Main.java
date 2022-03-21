package Assignment3;

import java.util.*;

public class Main {
	
	TreeSet<Employee> set = new TreeSet<>();
	
	boolean addEmployee(Employee emp) {
		return set.add(emp);
	}
	
	void display() {
		Iterator<Employee> itr = set.iterator();
		while(itr.hasNext())
		{
			Employee emp = (Employee)itr.next();
			System.out.println("ID  : "+emp.getEmpID()+"  name  :  "+ emp.getName()+ "  salary :"+emp.getSalary());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee john = new Employee(101,"John", 40000);
		Employee david = new Employee(102,"david", 60000);
		Employee peter = new Employee(103,"peter", 50000);
		Employee atlas = new Employee(104,"atlas", 70000);
		
		TreeSet<Employee> set = new TreeSet<Employee>();
		
		Main m = new Main();
		
		m.addEmployee(john);
		m.addEmployee(david);
		m.addEmployee(peter);
		m.addEmployee(atlas);
	    
		System.out.println("Employee Details");
		m.display();
	}

}
