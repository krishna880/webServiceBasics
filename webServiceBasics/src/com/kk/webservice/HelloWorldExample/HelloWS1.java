package com.kk.webservice.HelloWorldExample;

import javax.jws.WebService;

@WebService(
targetNamespace="http://HelloWebServiceClient.webservices.kk.com"
,name="HelloWebService" //this changes the port name and its binding from <port name="HelloWS1Port" binding="tns:HelloWS1PortBinding">
//to <port name="HelloWebServicePort" binding="tns:HelloWebServicePortBinding">
,serviceName="HelloWebServiceName" // this change the definitions name from <definitions..... name="HelloWS1Service"> to <definitions..... name="HelloWebServiceName">
//this also changes the service name from <service name="HelloWS1Service"> to <service name="HelloWebServiceName">
,portName="HelloWebSvcPort"// this changes the port name and its binding from <port name="HelloWebServicePort" binding="tns:HelloWebServicePortBinding">
//to <port name="HelloWebSvcPort" binding="tns:HelloWebSvcPortBinding"> 
,endpointInterface="com.kk.webservice.HelloWorldExample.HelloInterface"
)
public class HelloWS1 implements HelloInterface {

	@Override
	public String sayHello(String firstName) {
		return "Hello" + firstName + "!!";
	}

}
