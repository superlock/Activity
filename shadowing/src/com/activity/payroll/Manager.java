package com.activity.payroll;

import java.util.Scanner;

import Bean.PayrollBean;

public class Manager extends Employee{
	private static final String POSITION = "Manager";
	private static final int SALARY = 50000;
	private static final double PERCENT = 0.30;
	
	@Override
	public void createInfo(PayrollBean bean,Scanner scan) {
		super.createInfo(bean, scan);
		super.setInfo(POSITION, SALARY, PERCENT);
	}
}
