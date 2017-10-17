package com.activity.payroll;

import java.text.DecimalFormat;

public class Developer implements Deductable
{
	private static final int SALARY = 20000;
	
	public void deduct() {
		DecimalFormat df = new DecimalFormat("#.00"); 
		double deduction = SALARY * 0.15;
		String finalSalary = df.format(SALARY-deduction);
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setSalary(finalSalary);
	}
}
