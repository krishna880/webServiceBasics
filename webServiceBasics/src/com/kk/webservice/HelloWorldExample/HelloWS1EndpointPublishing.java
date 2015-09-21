package com.kk.webservice.HelloWorldExample;

import javax.xml.ws.Endpoint;

// This class is used to publish a web service internally in JVM
// After running this class, you can also check the wsdl at http://localhost:9998/hello?WSDL
public class HelloWS1EndpointPublishing {
	//defining URI
	public static final String URI = "http://localhost:9998/hello";
	
	public static void main(String[] args) {
		HelloWS1 serviceImpl = new HelloWS1();
		Endpoint endpoint  =Endpoint.publish(URI, serviceImpl);
		boolean status = endpoint.isPublished();
		System.out.println("published status----> "+status);
	}

}
