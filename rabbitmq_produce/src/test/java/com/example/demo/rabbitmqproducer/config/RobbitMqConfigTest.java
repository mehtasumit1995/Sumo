package com.example.demo.rabbitmqproducer.config;

import org.junit.*;
import static org.junit.Assert.*;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.MessageConverter;

public class RobbitMqConfigTest {
	
	@Test
	public void testRobbitMqConfig_1()
		throws Exception {
		RobbitMqConfig result = new RobbitMqConfig();
		assertNotNull(result);
	
	}


	@Test
	public void testBinding_1()
		throws Exception {
		RobbitMqConfig fixture = new RobbitMqConfig();
		Queue queue = new Queue("Sumit");
		TopicExchange exchange = new TopicExchange("Mehta");

		Binding result = fixture.binding(queue, exchange);

		
		assertNotNull(result);
		assertEquals("Binding [destination=Sumit, exchange=Mehta, routingKey=my.queue.key]", result.toString());
		assertEquals("Sumit", result.getDestination());
		assertEquals("my.queue.key", result.getRoutingKey());
		assertEquals("Mehta", result.getExchange());
		assertEquals(true, result.isDestinationQueue());
		assertEquals(true, result.shouldDeclare());
		assertEquals(false, result.isIgnoreDeclarationExceptions());
	}

	@Test
	public void testExchange_1()
		throws Exception {
		RobbitMqConfig fixture = new RobbitMqConfig();

		TopicExchange result = fixture.exchange();

	
		assertNotNull(result);
		assertEquals("topic", result.getType());
		assertEquals("Exchange [name=my_queue_exchange, type=topic, durable=true, autoDelete=false, internal=false, arguments={}]", result.toString());
		assertEquals("my_queue_exchange", result.getName());
		assertEquals(false, result.isInternal());
		assertEquals(true, result.isDurable());
		assertEquals(false, result.isAutoDelete());
		assertEquals(false, result.isDelayed());
		assertEquals(true, result.shouldDeclare());
		assertEquals(false, result.isIgnoreDeclarationExceptions());
	}

	@Test
	public void testJsonMessageConverter_1()
		throws Exception {
		RobbitMqConfig fixture = new RobbitMqConfig();

		MessageConverter result = fixture.jsonMessageConverter();

		
		assertNotNull(result);
	}

	@Test
	public void testQueue_1()
		throws Exception {
		RobbitMqConfig fixture = new RobbitMqConfig();

		Queue result = fixture.queue();

		
		assertNotNull(result);
		assertEquals("Queue [name=my.queue.key, durable=true, autoDelete=false, exclusive=false, arguments=null]", result.toString());
		assertEquals("my.queue.key", result.getName());
		assertEquals(null, result.getArguments());
		assertEquals(false, result.isExclusive());
		assertEquals(true, result.isDurable());
		assertEquals(false, result.isAutoDelete());
		assertEquals(true, result.shouldDeclare());
		assertEquals(false, result.isIgnoreDeclarationExceptions());
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
		new org.junit.runner.JUnitCore().run(RobbitMqConfigTest.class);
	}
}