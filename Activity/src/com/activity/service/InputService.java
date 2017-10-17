package com.activity.service;

import java.util.Scanner;

import com.activity.payroll.EmployeeBean;

public class InputService {

	public static void enterInfo(String position) {
		Scanner scan = new Scanner(System.in);
		EmployeeBean employeeBean = new EmployeeBean();
		System.out.print("Enter the following\nEmployee Number: ");
		employeeBean.setEmployeeNumber(scan.nextInt());
		System.out.print("Name: ");
		employeeBean.setName(scan.next());	
		employeeBean.setPosition(position);
		scan.close();
	}
	
}
