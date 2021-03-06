
package com.kk.webservice.hellowebserviceclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloWebServiceName", targetNamespace = "http://HelloWebServiceClient.webservice.kk.com", wsdlLocation = "http://localhost:9998/hello?wsdl")
public class HelloWebServiceName
    extends Service
{

    private final static URL HELLOWEBSERVICENAME_WSDL_LOCATION;
    private final static WebServiceException HELLOWEBSERVICENAME_EXCEPTION;
    private final static QName HELLOWEBSERVICENAME_QNAME = new QName("http://HelloWebServiceClient.webservice.kk.com", "HelloWebServiceName");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9998/hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWEBSERVICENAME_WSDL_LOCATION = url;
        HELLOWEBSERVICENAME_EXCEPTION = e;
    }

    public HelloWebServiceName() {
        super(__getWsdlLocation(), HELLOWEBSERVICENAME_QNAME);
    }

    public HelloWebServiceName(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWEBSERVICENAME_QNAME, features);
    }

    public HelloWebServiceName(URL wsdlLocation) {
        super(wsdlLocation, HELLOWEBSERVICENAME_QNAME);
    }

    public HelloWebServiceName(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWEBSERVICENAME_QNAME, features);
    }

    public HelloWebServiceName(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWebServiceName(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloInterface1
     */
    @WebEndpoint(name = "HelloWebSvcPort")
    public HelloInterface1 getHelloWebSvcPort() {
        return super.getPort(new QName("http://HelloWebServiceClient.webservice.kk.com", "HelloWebSvcPort"), HelloInterface1.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloInterface1
     */
    @WebEndpoint(name = "HelloWebSvcPort")
    public HelloInterface1 getHelloWebSvcPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://HelloWebServiceClient.webservice.kk.com", "HelloWebSvcPort"), HelloInterface1.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWEBSERVICENAME_EXCEPTION!= null) {
            throw HELLOWEBSERVICENAME_EXCEPTION;
        }
        return HELLOWEBSERVICENAME_WSDL_LOCATION;
    }

}
