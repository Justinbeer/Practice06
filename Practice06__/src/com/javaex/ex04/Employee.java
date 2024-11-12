package com.javaex.ex04;

public class Employee extends User{

	protected int salary;
	
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
		
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public void showInfo() {
		System.out.println("Employee [ID=" + super.getId() + ", password =" + super.getPassword() + ", name=" + super.getName() + ", Salary=" + salary + "]");
	}
	
	

	
}
