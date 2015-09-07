package com.kk.webservice.HelloWorldExample;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style=SOAPBinding.Style.RPC)
public interface HelloInterface{
	String sayHello(String name);
}
