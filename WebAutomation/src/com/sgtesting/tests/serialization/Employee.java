package com.sgtesting.tests.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int empNo;
	private String employeeName;
	private String jobName;
	private int salary;
	
	public Employee(int empNo, String employeeName, String jobName, int salary) {
		super();
		this.empNo = empNo;
		this.employeeName = employeeName;
		this.jobName = jobName;
		this.salary = salary;
	}
	
	public void showEmployeeNumber()
	{
		System.out.println("Employee Number :"+empNo);
	}
	
	public void showEmployeeName()
	{
		System.out.println("Employee Name :"+employeeName);
	}
	
	public void showJobName()
	{
		System.out.println("Employee Job Name :"+jobName);
	}
	
	public void showSalary()
	{
		System.out.println("Employee Salary :"+salary);
	}
}
