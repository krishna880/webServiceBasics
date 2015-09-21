package com.kk.webservice.SAAJExamples;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;

public class Example1 {

	
	//This class call the Hello world web service from SAAJ level i.e. ground level.
	public static void main(String[] args) throws SOAPException, IOException {

		try {
			URL wsdl = new URL("http://localhost:9999/hello?WSDL");

			String ns = "http://HelloWorldExample.webservice.kk.com/";

			//I found this service name from WSDL
			String serviceName = "HelloWSService";
			QName serviceQName = new QName(ns, serviceName);

			Service service = Service.create(wsdl, serviceQName);
						
			//I found this port name from WSDL
			String portName = "HelloWSPort";
			QName portQName = new QName(ns, portName);


			Dispatch<SOAPMessage> dispatcher = service.createDispatch(
					portQName, SOAPMessage.class, Service.Mode.MESSAGE);
			
			SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
			SOAPPart soapPart = soapMessage.getSOAPPart();
			SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
			
			soapEnvelope.addNamespaceDeclaration("hw", "http://HelloWorldExample.webservice.kk.com/");
			
			SOAPBody soapBody = soapEnvelope.getBody();
			
			String bodyElement = "sayHello";
			QName bodyElementQName = soapEnvelope.createQName(bodyElement, "hw");
			SOAPBodyElement sw = soapBody.addBodyElement(bodyElementQName);
			
			QName elementQName = soapEnvelope.createQName("arg0", "hw");
			SOAPElement soapElement1 = sw.addChildElement(elementQName);
			soapElement1.addTextNode("KK");
			
			soapMessage.writeTo(System.out);
			
			System.out.println("\n");
			System.out.println("Invoking Hello World Example webservice");
			
			SOAPMessage responseSoapMessage = dispatcher.invoke(soapMessage);
			
			responseSoapMessage.writeTo(System.out);
			

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
