package com.kk.webservice.HelloWorldExample;

import javax.xml.ws.Endpoint;

// This class is used to publish a web service internally in JVM
// After running this class, you can also check the wsdl at http://localhost:9999/hello?WSDL
public class EndpointPublishing {
	//defining URI
	public static final String URI = "http://localhost:9999/hello";
	
	public static void main(String[] args) {
		HelloWS serviceImpl = new HelloWS();
		Endpoint endpoint  =Endpoint.publish(URI, serviceImpl);
		boolean status = endpoint.isPublished();
		System.out.println("published status----> "+status);
	}

}
