package com.example.demo.rabbitmqproducer.producer;

import org.junit.*;
import static org.junit.Assert.*;
import com.example.demo.rabbitmqproducer.beans.Employee;

/**
 * The class <code>MessageProducerTest</code> contains tests for the class <code>{@link MessageProducer}</code>.
 *
 * @generatedBy CodePro at 7/9/18 8:00 PM
 * @author summehta
 * @version $Revision: 1.0 $
 */
public class MessageProducerTest {
	/**
	 * Run the String sendMessage(Employee) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 8:00 PM
	 */
	@Test
	public void testSendMessage_1()
		throws Exception {
		MessageProducer fixture = new MessageProducer();
		Employee employee = new Employee();

		String result = fixture.sendMessage(employee);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.example.demo.rabbitmqproducer.producer.MessageProducer.sendMessage(MessageProducer.java:21)
		assertNotNull(result);
	}

	/**
	 * Run the String sendMessage(Employee) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 7/9/18 8:00 PM
	 */
	@Test
	public void testSendMessage_2()
		throws Exception {
		MessageProducer fixture = new MessageProducer();
		Employee employee = new Employee();

		String result = fixture.sendMessage(employee);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.example.demo.rabbitmqproducer.producer.MessageProducer.sendMessage(MessageProducer.java:21)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 7/9/18 8:00 PM
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
	 * @generatedBy CodePro at 7/9/18 8:00 PM
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
	 * @generatedBy CodePro at 7/9/18 8:00 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MessageProducerTest.class);
	}
}