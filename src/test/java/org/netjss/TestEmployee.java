package org.netjss;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.netjs.account.dao.EmployeeDao;
import org.netjs.account.dto.Employee;
import org.netjs.account.service.EmployeeServiceImpl;
import org.netjs.account.service.EmployeeServices;

@RunWith(MockitoJUnitRunner.class)
class TestEmployee {
	static EmployeeServices employeeServices = null;
	static EmployeeDao mockEmployeeDao = null;
	private static Employee emp1;
	private static Employee emp2;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		mockEmployeeDao = Mockito.mock(EmployeeDao.class);
		employeeServices = new EmployeeServiceImpl(mockEmployeeDao);
		emp1 = new Employee();
		emp1.setEmpNo(1);
		emp1.setEmpName("Vaibhav");
		emp1.setSalary(20000);
		emp1.setJobString("Developer");
		emp1.setDeptNameString("Development");
		emp1.setHireDate(LocalDate.of(2021, 03, 20));
		
		
		emp2 = new Employee();
		emp2.setEmpNo(2);
		emp2.setEmpName("Sanjay");
		emp2.setSalary(50000);
		emp2.setJobString("Human Resource");
		emp2.setDeptNameString("HR");
		emp2.setHireDate(LocalDate.of(1998, 07, 10));
		
		Mockito.when(mockEmployeeDao.getEmployees()).thenReturn(Arrays.asList(emp1,emp2));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void getAllEmployeestest() {
		List<Employee> allEmployees = employeeServices.getEmployees();
		assertNotNull(allEmployees);
		assertEquals(2, allEmployees.size());
		
	}

}
