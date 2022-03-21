package com.wipro.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.wipro.bean.EmployeeBean;
import com.wipro.service.*;

public class EmployeeService {

	private List<EmployeeBean> listEmp = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public boolean insertEmployee(EmployeeBean bean) {
		boolean x = listEmp.add(bean);
		if(x == false) {
			return false;
		}
		return true;
	}
	
	
	public String insertEmployeeByPosition( EmployeeBean bean, int position) {
		if(position < 0 || position > listEmp.size()) {
			listEmp.add(bean);
			return "Inserted employee at end position ";
		}
		listEmp.add(position, bean);
		
		return "Inserted employee at position :"+(position+1);	
	}
	
	public List<EmployeeBean> fecthAllEmployees(){
		
		if(listEmp == null) {
			return null;
		}
		return listEmp;
		
	}
	
	public boolean deleteEmployeeByID(int empID) {

		ListIterator<EmployeeBean> li = listEmp.listIterator();
		
		while(li.hasNext()) {
			if(li.next().getEmpID()==empID) {
				li.remove();
				return true;
			}
		}
		return false;
		
	}
	
	public boolean updateEmployeeByID(int empID) {
		
      
		for(EmployeeBean emp: listEmp) {
			if(emp.getEmpID() == empID) {
			 System.out.println("Enter name : ");
			    emp.setName(sc.nextLine());
			    System.out.println("Enter salary : ");
			    // do not mix nextLine and nextFloat!
			    emp.setSalary(Float.parseFloat(sc.nextLine()));
			    System.out.println("Enter designation : ");
			    emp.setDesignation(sc.nextLine());
               return true;
		   }
		 }
		return false;	
	}
	                   
	public EmployeeBean findEmployeeByEmpID(int empID) {
		
		for(EmployeeBean emp : listEmp) {
			if(emp.getEmpID() == empID) {
				return emp;
			}
		}
		
		return null;
		
	}
	
}
