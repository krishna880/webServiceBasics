
package com.kk.webservices.hellowebserviceclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloInterface", targetNamespace = "http://HelloWorldExample.webservice.kk.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloInterface {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://HelloWorldExample.webservice.kk.com/HelloInterface/sayHelloRequest", output = "http://HelloWorldExample.webservice.kk.com/HelloInterface/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}
