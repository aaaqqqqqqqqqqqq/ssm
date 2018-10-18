package com.ssm.wsclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import com.ssm.webservice.HelloService;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.0
 * 2018-07-28T15:48:25.610+08:00
 * Generated source version: 2.5.0
 * 
 */
@WebServiceClient(name = "HelloServiceImplService", 
                  wsdlLocation = "http://127.0.0.1:8080/ssm/webservices/helloService?wsdl",
                  targetNamespace = "http://impl.webservice.ssm.com/") 
public class HelloServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.webservice.ssm.com/", "HelloServiceImplService");
    public final static QName HelloServiceImplPort = new QName("http://impl.webservice.ssm.com/", "HelloServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:8080/ssm/webservices/helloService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:8080/ssm/webservices/helloService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloService getHelloServiceImplPort() {
        return super.getPort(HelloServiceImplPort, HelloService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloService getHelloServiceImplPort(WebServiceFeature... features) {
        return super.getPort(HelloServiceImplPort, HelloService.class, features);
    }

}
