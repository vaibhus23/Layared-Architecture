package org.netjs.account.dao;

import java.util.List;

import org.netjs.account.dto.Employee;
import org.netjs.account.service.EmployeeServices;

public interface EmployeeDao {
	public EmployeeServices findEmployeeByID(int empID);
	public List<Employee> getEmployees();
	public List<Employee> getEmployeeByDept();
	public void deleteEmployee(int empID);

}
