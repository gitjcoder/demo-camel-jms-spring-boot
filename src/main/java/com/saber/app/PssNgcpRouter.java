package com.saber.app;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class PssNgcpRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("jms:queue:pssngcp").
		to("jms:queue:ngcpbc");
		
	}
	

}
