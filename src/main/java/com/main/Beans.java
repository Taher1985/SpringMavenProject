package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.module.setter.Employee;

public class Beans {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans-context.xml");
		
		Employees employee = (Employee) applicationContext.getBean("employee");
		employee.employeeCompanyName();
	}

}
