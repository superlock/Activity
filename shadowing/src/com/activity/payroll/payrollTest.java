package com.activity.payroll;

import java.util.Scanner;

import Bean.PayrollBean;

public class payrollTest {

	public static void main(String[] args) {
		PayrollBean bean = new PayrollBean();
		Scanner scan = new Scanner(System.in);
		payroll payroll = new payroll(bean, scan);
		
		Employee position = payroll.selectType();
		position.createInfo(bean, scan);
		payroll.deductSalary();
		position.printInfo();
	}

}
