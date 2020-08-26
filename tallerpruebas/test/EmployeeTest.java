package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	
	@Before
	public Employee createEmployee(float salary, String currency,
			float bonusPercentage, EmployeeType employeeType) {
		return new Employee(salary,currency,bonusPercentage,employeeType);
		
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
