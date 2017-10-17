package Bean;

public class PayrollBean {
	private int employeeNumber, salary;
	private String name, position, kindOfUser,payroll;
	private double deductable;
	
	public String getPayroll() {
		return payroll;
	}
	public void setPayroll(String payroll) {
		this.payroll = payroll;
	}
	public double getDeductable() {
		return deductable;
	}
	public void setDeductable(double deductable) {
		this.deductable = deductable;
	}
	
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
