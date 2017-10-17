package com.activity.payroll;

import java.util.Scanner;

import Bean.PayrollBean;

public abstract class Employee {
	private PayrollBean bean =null;
	
	public void createInfo(PayrollBean bean,Scanner scan) {	
		this.bean = bean;
		
		System.out.print("Enter the following\nEmployee Number: ");
		bean.setEmployeeNumber(scan.nextInt());
	
		System.out.print("Name: ");
		bean.setName(scan.next());	
	}
	
	public void setInfo(String position, int salary, double deduct) {
		bean.setPosition(position);
		bean.setSalary(salary);
		bean.setDeductable(deduct);
	}
	
	public void printInfo() {
		System.out.println("");
		System.out.println("EMPLOYEE NUMBER: " +bean.getEmployeeNumber());
		System.out.println("NAME: " +bean.getName());
		System.out.println("POSITION: " +bean.getPosition());
		System.out.println("PHP "+bean.getPayroll());
	}
}
