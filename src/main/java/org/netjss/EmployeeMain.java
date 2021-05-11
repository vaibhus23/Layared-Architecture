package org.netjss;

import java.util.List;

import org.netjs.account.dao.EmployeeDAOImpl;
import org.netjs.account.dao.EmployeeDao;
import org.netjs.account.dto.Employee;
import org.netjs.account.service.EmployeeServiceImpl;
import org.netjs.account.service.EmployeeServices;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao employeeDao = new EmployeeDAOImpl();
		EmployeeServices employeeServices = new EmployeeServiceImpl(employeeDao);
		
		List<Employee> empList = employeeServices.getEmployees();
		for(Employee employee: empList) {
			System.out.println(employee);
		}

	}

}
