package com.example.demo.rabbitmqproducer.producer;

import java.util.Date;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.rabbitmqproducer.beans.Employee;
import com.example.demo.rabbitmqproducer.config.RobbitMqConfig;

@Component
public class MessageProducer {
	
	@Autowired
    private RabbitTemplate rabbitTemplate;
	
	public String sendMessage(Employee employee) {

		System.out.println(new Date());
		rabbitTemplate.convertAndSend(RobbitMqConfig.ROUTING_KEY, employee);
	    //System.out.println("Is listener returned ::: "+rabbitTemplate.isReturnListener());
		return "Success";
	    
	}
	



}
