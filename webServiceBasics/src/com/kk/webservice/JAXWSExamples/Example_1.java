package com.kk.webservice.JAXWSExamples;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.kk.webservice.HelloWorldExample.HelloInterface;

// This class call the Hello world web service defined in HelloWS.java
public class Example_1 {

	public static void main(String[] args) throws MalformedURLException {
		URL wsdl = new URL("http://localhost:9999/hello?WSDL");

		QName serviceName = new QName("http://HelloWorldExample.webservice.kk.com/","HelloWSService");
	
		Service service = Service.create(wsdl, serviceName);
		
		System.out.println("QNames of service endpoint");
		Iterator<QName> it = service.getPorts();
		QName lastEndPoint = null;
		while (it.hasNext()){
			lastEndPoint = it.next();
			System.out.println("name is--> " + lastEndPoint);
		}
		
		HelloInterface hws = service.getPort(lastEndPoint, HelloInterface.class);
		String result = hws.sayHello("KK");
		System.out.println(result);
	}

}
