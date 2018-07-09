package com.example.demo.rabbitmqproducer.controller;

import org.junit.*;
import org.mockito.Mock;

import com.example.demo.rabbitmqproducer.beans.Employee;
import com.example.demo.rabbitmqproducer.producer.MessageProducer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ProducerControllerTest {
	

	
	@Test
	public void testM2_1()
		throws Exception {
		ProducerController fixture = new ProducerController();

		String result = fixture.m2();
		/* 
		Object emp;
		when(messageprovider.sendMessage(employee).thenReturn(emp));
*/
		// add additional test code here
		assertEquals("File Added", result);
	}

	/**
	 * Run the String m2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 3:29 PM
	 */
	@Test
	public void testM2_2()
		throws Exception {
		ProducerController fixture = new ProducerController();

		String result = fixture.m2();

		// add additional test code here
		assertEquals("File Added", result);
	}

	/**
	 * Run the String m2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 3:29 PM
	 */
	@Test
	public void testM2_3()
		throws Exception {
		ProducerController fixture = new ProducerController();

		String result = fixture.m2();

		// add additional test code here
		assertEquals("File Added", result);
	}

	/**
	 * Run the String m2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 3:29 PM
	 */
	@Test
	public void testM2_4()
		throws Exception {
		ProducerController fixture = new ProducerController();

		String result = fixture.m2();

		// add additional test code here
		assertEquals("File Added", result);
	}

	/**
	 * Run the String m2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 3:29 PM
	 */
	@Test
	public void testM2_5()
		throws Exception {
		ProducerController fixture = new ProducerController();

		String result = fixture.m2();

		// add additional test code here
		assertEquals("File Added", result);
	}

	/**
	 * Run the String m2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 3:29 PM
	 */
	@Test
	public void testM2_6()
		throws Exception {
		ProducerController fixture = new ProducerController();

		String result = fixture.m2();

		// add additional test code here
		assertEquals("File Added", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/9/18 3:29 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 7/9/18 3:29 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 7/9/18 3:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProducerControllerTest.class);
	}
}