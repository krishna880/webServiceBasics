package com.kk.webservice.HelloWorldExample;

import javax.jws.WebService;

@WebService(endpointInterface="com.kk.webservice.HelloWorldExample.HelloInterface")
public class HelloWS implements HelloInterface {

	@Override
	public String sayHello(String firstName) {
		return "Hello" + firstName + "!!";
	}
 
}
