package com.activity.payroll;

import java.text.DecimalFormat;
import java.util.Scanner;

import Bean.PayrollBean;

public class payroll {
	private PayrollBean bean = null;
	private Scanner scan = null;
	
	public payroll(PayrollBean bean,Scanner scan) {
		this.bean = bean;
		this.scan = scan;
	}
	
	public Employee selectType() {
		Employee manager = new Manager();
		Employee dev = new Developer();
		
		System.out.println("Are you a manager or a developer? [M/D]");
		bean.setKindOfUser(scan.next());
		
		if("M".equals(bean.getKindOfUser())||"m".equals(bean.getKindOfUser())) {
			return manager;
		}else if("D".equals(bean.getKindOfUser())||"d".equals(bean.getKindOfUser())) {
			return dev;
		}else {
			System.out.println("wrong input");
			return null;
		}
	}
	
	public void deductSalary() {
		DecimalFormat df = new DecimalFormat("###,###.###"); 
		String finalSalary = df.format(bean.getSalary()-(bean.getSalary()*bean.getDeductable()));
		bean.setPayroll(finalSalary);
	}
}
