package com.activity.test;

import com.activity.payroll.Employee;
import com.activity.payroll.EmployeeSelector;

public class Test {

	public static void main(String[] args) {
		EmployeeSelector selector = new EmployeeSelector();
		Employee employee = new Employee();
		employee = selector.selectEmployeeType(); //tama ba ginagawa ko? haha
		employee.doTransaction(employee);
		//select employee
		//deduct 
	}
	
}
