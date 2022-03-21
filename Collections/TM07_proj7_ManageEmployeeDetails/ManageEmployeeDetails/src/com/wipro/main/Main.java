package com.wipro.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.wipro.bean.EmployeeBean;
import com.wipro.service.*;

public class Main extends EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
         EmployeeBean eb1=new EmployeeBean(1001,"Sunny",35000,"Project Engineer");
         EmployeeBean eb2=new EmployeeBean(1002,"Vikash",40000,"System Engineer");
         EmployeeBean eb3=new EmployeeBean(1003,"Shubham",45000,"Senior Engineer");
         EmployeeBean eb4=new EmployeeBean(1004,"Shashank",65000,"Associate Engineer");
         EmployeeBean eb5=new EmployeeBean(1005,"Vishal",25000,"Junior Engineer");
	
         EmployeeService es=new EmployeeService();
		
         System.out.println("Insert Employee: ");
         System.out.println(es.insertEmployee(eb1));
         System.out.println(es.insertEmployee(eb2));
         System.out.println(es.insertEmployee(eb3));
         
         System.out.println("Insert Employee By ID: ");
         System.out.println(es.insertEmployeeByPosition(eb4, 1));
         System.out.println(es.insertEmployeeByPosition(eb5, 200));
        
         System.out.println("Fetch All Employee: ");
         es.fecthAllEmployees();
         
         for(EmployeeBean emp:es.fecthAllEmployees()) {
             System.out.println(emp.toString());
         }
         
         System.out.println();
         
         System.out.println("Delete Employee by ID: ");
         es.deleteEmployeeByID(1003);
         
         for(EmployeeBean emp:es.fecthAllEmployees()) {
             System.out.println(emp.toString());
         }
         
         
         System.out.println();
         
         System.out.println("Update Employee: by ID ");
         
         es.updateEmployeeByID(1001);
         
         System.out.println();
         
         es.fecthAllEmployees();
         
         for(EmployeeBean emp:es.fecthAllEmployees()) {
             System.out.println(emp.toString());
         }
         
         System.out.println();
         System.out.println("Find Employee By ID: ");
         System.out.println(es.findEmployeeByEmpID(1002));
         
	}

	

}
