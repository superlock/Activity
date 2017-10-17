package com.activity.payroll;

import java.util.Scanner;

import com.activity.service.InputService;

public class EmployeeSelector {
	
	public void selectEmployeeType() { //jam bakit dito mo nilagay tama ba to
		Scanner scanner = new Scanner(System.in);
		EmployeeBean employeeBean = new EmployeeBean();
		Manager manager = new Manager();
		Developer developer = new Developer();
		
		System.out.println("Are you a manager or a developer? [M/D]");
		employeeBean.setKindOfUser(scanner.next());
		
		if(ifManager(employeeBean)) 
		{
			InputService.enterInfo("Manager");
			manager.deduct();
		}
		else if(ifDeveloper(employeeBean)) 
		{
			InputService.enterInfo("Developer");
			developer.deduct();
		}
		else
		{
			System.out.println("wrong input");
		}
		scanner.close();
	}

	private boolean ifDeveloper(EmployeeBean employeeBean) {
		return "D".equals(employeeBean.getKindOfUser())||"d".equals(employeeBean.getKindOfUser());
	}

	private boolean ifManager(EmployeeBean employeeBean) {
		return "M".equals(employeeBean.getKindOfUser()) ||"m".equals(employeeBean.getKindOfUser());
	}

}
