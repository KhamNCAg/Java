package SE_Batch1.SalaryManagementSystem;

public class Employee {
	private String name;
	private int employeeId;
	private double basicSalary;
	
	public Employee(String name, int employeeId, double basicSalary) {
		this.name = name;
		this.employeeId = employeeId;
		this.basicSalary = basicSalary;
	}
	
	public double calculateSalary() {
		return this.basicSalary;
	}
	
	public void displayDetails() {
		System.out.println("Employee:\t"+ this.name);
		System.out.println("Employee Id:\t"+ this.employeeId);
		System.out.println("Basic Salary:\t"+ this.basicSalary);
		System.out.println("Total Salary:\t"+ this.calculateSalary());
	}
	
	
}
