package com.roncoo.eshop.product.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQSender {

	@Autowired
	private AmqpTemplate amqTemplate;
	
	public void send(String queue,String message){
		this.amqTemplate.convertAndSend(queue,message);
	}
	
}
