package com.activity.payroll;

public class EmployeeBean {
	private int employeeNumber;
	private String name;
	private String position;
	private String kindOfUser;
	private String salary;
	
	public String getKindOfUser() {
		return kindOfUser;
	}
	public void setKindOfUser(String kindOfUser) {
		this.kindOfUser = kindOfUser;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
