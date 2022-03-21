package Assignment3;

public class Employee implements Comparable<Object> {
	
	private int empID;
	private String name;
	private float salary;
	
	public Employee(int empID, String name, float salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}


	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
	}


	public int compareTo(Object object) {
		Employee employee = (Employee) object;
		if(this.getSalary() < employee.getSalary())
			return -1;
		else
			return 1;
	}
		
}
