package org.employee;


public class EmployeeDetails {
	
	private void empName() {
		System.out.println("Anand");
	}
	
	private void empMobile() {
		System.out.println("8939278836");
	}
	
	private void empStatus() {
		System.out.println("Working");
	}
	
	public static void main(String[] args) {
		
		
		EmployeeDetails e = new EmployeeDetails();
		e.empMobile();
		e.empName();
		
		Company c = new Company();
		c.comId();
		c.comName();
		
		
	}

}
