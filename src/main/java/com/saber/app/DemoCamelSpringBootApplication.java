package com.saber.app;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.component.jms.JmsComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoCamelSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCamelSpringBootApplication.class, args);
	}
	
	
	@Bean(name="jms")
    public JmsComponent jmsComponent() {
		ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory();
	    cf.setBrokerURL("tcp://localhost:61616");
	    cf.setUserName("admin");
	    cf.setPassword("admin");
        JmsComponent jmsComponent = JmsComponent.jmsComponentAutoAcknowledge(cf);
        return jmsComponent;
    }

}
