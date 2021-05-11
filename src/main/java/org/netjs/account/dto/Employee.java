package org.netjs.account.dto;

import java.time.LocalDate;

public class Employee {
	private int empNo;
	private String empName;
	private String jobString;
	private double salary;
	private String deptNameString;
	private LocalDate hireDate;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJobString() {
		return jobString;
	}
	public void setJobString(String jobString) {
		this.jobString = jobString;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDeptNameString() {
		return deptNameString;
	}
	public void setDeptNameString(String deptNameString) {
		this.deptNameString = deptNameString;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString() {
		return "Employee Details:"+ " empNo= " + empNo + "\t empName= " + empName + "\t jobString= " + jobString + "\t salary= " + salary
				+ "\t deptNameString= " + deptNameString + "\t hireDate= "+hireDate+"\n";
	}

	
	
	

}
