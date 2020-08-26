package test;

import static org.junit.Assert.*;

import org.junit.Test;

import tallerpruebas.Employee;
import tallerpruebas.EmployeeType;

public class EmployeeTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void evaluateCS() {
		Employee e1 = new Employee(100F, "USD", 50F, EmployeeType.Worker);
		float f = e1.cs();
		assertEquals(100F, f);
	}

}
