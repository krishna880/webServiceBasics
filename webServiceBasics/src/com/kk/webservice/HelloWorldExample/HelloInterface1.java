package com.kk.webservice.HelloWorldExample;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(targetNamespace="http://HelloWebServiceClient.webservice.kk.com")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT)
public interface HelloInterface1{
	String sayHello(String name);
}
