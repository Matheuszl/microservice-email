package com.ms.email.configs;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

	@Value("${spring.rabbitmq.queue}")
	private String queue;

	@Bean
	public Queue queue() {
		return new Queue(queue, true);// passa o nome da fila que define ali em cima e o outro define se a fila é
										// duravel ou nao
		// se for enterronpido nao perde os dados da fila
	}
	
	
	@Bean
	public Jackson2JsonMessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
		
	}
}
