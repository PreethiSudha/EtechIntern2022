package com.example.demo.direct.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanOutExchangeConfig {

	
	@Bean
	public Queue fanOutQueue1() {
		return new Queue("Sushmi.CSE.Student", false);
	}
	
	@Bean
	public Queue fanOutQueue2() {
		return new Queue("Sushmi.ECE.Student", false);
	}
	
	@Bean
	public FanoutExchange exchange() {
		return new FanoutExchange("Sushmi.PSNA.College");
	}
	
	@Bean
    public Binding binding1(FanoutExchange exchange, @Qualifier("fanOutQueue1") Queue fanoutQueue1) {
		return BindingBuilder.bind(fanoutQueue1).to(exchange);
    }

    @Bean
    public Binding binding2(FanoutExchange exchange, @Qualifier("fanOutQueue2")Queue fanoutQueue2) {
    	return BindingBuilder.bind(fanoutQueue2).to(exchange);
    }
	
	
}
