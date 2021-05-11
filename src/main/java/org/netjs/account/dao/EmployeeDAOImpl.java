package org.netjs.account.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.netjs.account.dto.Employee;
import org.netjs.account.service.EmployeeServices;

public class EmployeeDAOImpl implements EmployeeDao {
	List<Employee>empList = new ArrayList<Employee>();

	@Override
	public EmployeeServices findEmployeeByID(int empID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmpNo(1);
		employee.setEmpName("Vaibhav");
		employee.setSalary(20000);
		employee.setJobString("Developer");
		employee.setDeptNameString("Development");
		employee.setHireDate(LocalDate.of(2021, 03, 20));
		empList.add(employee);
		
		Employee employee2 = new Employee();
		employee2.setEmpNo(2);
		employee2.setEmpName("Sanjay");
		employee2.setSalary(50000);
		employee2.setJobString("Human Resource");
		employee2.setDeptNameString("HR");
		employee2.setHireDate(LocalDate.of(1998, 07, 10));
		empList.add(employee2);
		return empList;
	}

	@Override
	public List<Employee> getEmployeeByDept() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int empID) {
		// TODO Auto-generated method stub
		
	}


}
