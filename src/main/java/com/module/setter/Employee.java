package com.module.setter;

public class Employee {

	private String employeeName;
	private Company company;
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public void employeeCompanyName() {
		System.out.println(employeeName + " works for " + company.getCompanyName());
	}
}
