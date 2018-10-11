package com.ssm.wsclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.0
 * 2018-07-28T15:48:25.572+08:00
 * Generated source version: 2.5.0
 * 
 */
@WebService(targetNamespace = "http://webservice.ssm.com/", name = "HelloService")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloService {

    @WebMethod
    @RequestWrapper(localName = "testHello", targetNamespace = "http://webservice.ssm.com/", className = "com.ssm.webservice.TestHello")
    @ResponseWrapper(localName = "synCompanyResponse", targetNamespace = "http://webservice.ssm.com/", className = "com.ssm.webservice.SynCompanyResponse")
    @WebResult(name = "result", targetNamespace = "")
    public java.lang.String testHello(
        @WebParam(name = "msgId", targetNamespace = "")
        java.lang.String msgId
    );
}