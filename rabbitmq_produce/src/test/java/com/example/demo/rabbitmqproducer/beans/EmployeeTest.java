package com.example.demo.rabbitmqproducer.beans;

import org.junit.*;
import static org.junit.Assert.*;

public class EmployeeTest {
	/*@Test
	public void testEmployee_1()
		throws Exception {

		Employee result = new Employee();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Employee [name=asdf, email=asd, dob=as, salary=3, department=dsa]", result.toString());
		assertEquals("asdf" , result.getName());
		assertEquals("asd", result.getEmail());
		assertEquals("dsa", result.getDepartment());
		assertEquals(3, result.getSalary());
		assertEquals("as", result.getDob());
	}*/

	@Test
	public void testEmployee_2()
		throws Exception {
		String name = "asdf";
		String email = "aas";
		String dob = "asd";
		int salary = 1;
		String department = "dsa";

		Employee result = new Employee(name, email, dob, salary, department);

		assertNotNull(result);
		assertEquals("Employee [name=asdf, email=aas, dob=asd, salary=1, department=dsa]", result.toString());
		assertEquals("asdf", result.getName());
		assertEquals("aas", result.getEmail());
		assertEquals("dsa", result.getDepartment());
		assertEquals(1, result.getSalary());
		assertEquals("asd", result.getDob());
	}

	@Test
	public void testGetDepartment_1()
		throws Exception {
		Employee fixture = new Employee("asdf", "asd", "as", 1, "dsa");

		String result = fixture.getDepartment();

		
		assertEquals("dsa", result);
	}

	@Test
	public void testGetDob_1()
		throws Exception {
		Employee fixture = new Employee("asdf", "asd", "as", 1, "dsa");

		String result = fixture.getDob();

		
		assertEquals("as", result);
	}

	
	@Test
	public void testGetEmail_1()
		throws Exception {
		Employee fixture = new Employee("asdf", "asd", "as", 1, "dsa");

		String result = fixture.getEmail();

		
		assertEquals("asd", result);
	}

	@Test
	public void testGetName_1()
		throws Exception {
		Employee fixture = new Employee("asdf", "asd", "as", 1, "dsa");

		String result = fixture.getName();

		
		assertEquals("asdf", result);
	}

	@Test
	public void testGetSalary_1()
		throws Exception {
		Employee fixture = new Employee("asdf", "asd", "as", 2, "dsa");

		int result = fixture.getSalary();

		
		assertEquals(2, result);
	}

	@Test
	public void testSetDepartment_1()
		throws Exception {
		Employee fixture = new Employee("asdf", "asd", "as", 1, "dsa");
		String department = "dsa";

		fixture.setDepartment(department);

		
	}

	@Test
	public void testSetDob_1()
		throws Exception {
		Employee fixture = new Employee("asdf", "asd", "as", 1, "dsa");
		String dob = "as";

		fixture.setDob(dob);

		
	}

	@Test
	public void testSetEmail_1()
		throws Exception {
		Employee fixture = new Employee("asdf", "asd", "as", 1, "dsa");
		String email = "asd";

		fixture.setEmail(email);

	
	}

	@Test
	public void testSetName_1()
		throws Exception {
		Employee fixture = new Employee("asdf", "asd", "as", 1, "dsa");
		String name = "asdf";

		fixture.setName(name);

		
	}

	@Test
	public void testSetSalary_1()
		throws Exception {
		Employee fixture = new Employee("asdf", "asd", "as", 3, "dsa");
		int salary = 3;

		fixture.setSalary(salary);

		
	}

	@Test
	public void testToString_1()
		throws Exception {
		Employee fixture = new Employee("asdf", "asd", "as", 1, "dsa");

		String result = fixture.toString();

		
		assertEquals("Employee [name=asdf, email=asd, dob=as, salary=1, department=dsa]", result);
	}

	@Before
	public void setUp()
		throws Exception {
		
	}

	@After
	public void tearDown()
		throws Exception {
		
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EmployeeTest.class);
	}
}