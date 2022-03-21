public class Employee extends Person{
    String name;
    double annualSalary;
    int yearOfStart;
    String nationalInsuranceNo;

    Employee(String name, double annualSalary, int yearOfStart, String nationalInsuranceNo){
        super(name);
        this.annualSalary = annualSalary;
        this.yearOfStart = yearOfStart;
        this.nationalInsuranceNo = nationalInsuranceNo;
    }

    void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }

    double getAnnualSalary(){
        return this.annualSalary;
    }

    void setYearOfStart(int yearOfStart){
        this.yearOfStart = yearOfStart;
    }

    int getYearOfStart(){
        return this.yearOfStart;
    }

    void setNationalInsuranceNo(String nationalInsuranceNo){
        this.nationalInsuranceNo = nationalInsuranceNo;
    }

    String getNationalInsuranceNo(){
        return this.nationalInsuranceNo;
    }
}