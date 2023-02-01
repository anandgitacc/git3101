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
	private void empId() {
		System.out.println("Employee id : 111");
	}
//<<<<<<< HEAD
//=======
//>>>>>>> e3efc060bbcbdf52adf751a39733d2df40457591
	
	public static void main(String[] args) {
		
		
		EmployeeDetails e = new EmployeeDetails();
		e.empMobile();
		e.empName();
		
		Company c = new Company();
		c.comId();
		c.comName();
		
		
	}

}
