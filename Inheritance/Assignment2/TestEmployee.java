

public class TestEmployee {
    public static void main(String[] args){
        
        Employee emp = new Employee("Sahil", 250000, 2018, "INDIC7583");

        
        System.out.println("Details of Employee:");
		System.out.println("Name: " + emp.getName());
		System.out.println("Year Of Starting: " + emp.getYearOfStart());
		System.out.println("Annual Salary: " + emp.getAnnualSalary());
		System.out.println("Insurance Number: " + emp.getNationalInsuranceNo());
        }
}
