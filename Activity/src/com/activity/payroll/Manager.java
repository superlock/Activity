package com.activity.payroll;

import java.text.DecimalFormat;

public class Manager implements Deductable{
	private static final int SALARY = 50000;

	public void deduct() 
	{  //ang dumi ng code mo jam
		DecimalFormat df = new DecimalFormat("#.00"); 
		double deduction = SALARY * 0.3;
		
		String finalSalary = df.format(SALARY-deduction);
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setSalary(finalSalary);
	}

}
