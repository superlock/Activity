package com.activity.payroll;

import java.util.Scanner;

import Bean.PayrollBean;

public class Developer extends Employee{
	private static final String POSITION = "Developer";
	private static final int SALARY = 20000;
	private static final double PERCENT = 0.15;

	@Override
	public void createInfo(PayrollBean bean,Scanner scan) {
		super.createInfo(bean, scan);
		super.setInfo(POSITION, SALARY, PERCENT);
	}
}
