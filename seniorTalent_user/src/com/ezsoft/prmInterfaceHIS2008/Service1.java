
package com.ezsoft.prmInterfaceHIS2008;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
* Service1 service = new Service1();
* Service1Soap portType = service.getService1Soap();
* portType.queryInpatientInfo(...);
 * </pre>
 * </p>
 * 
 */
@WebServiceClient(name = "Service1", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:/D:/\u7528\u6237\u76ee\u5f55/\u6211\u7684\u6587\u6863/prmInterfaceHIS2008.xml")
public class Service1 extends Service {

	private final static URL SERVICE1_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ezsoft.prmInterfaceHIS2008.Service1.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ezsoft.prmInterfaceHIS2008.Service1.class.getResource(".");
			url = new URL(baseUrl,
					"file:/D:/\u7528\u6237\u76ee\u5f55/\u6211\u7684\u6587\u6863/prmInterfaceHIS2008.xml");
		} catch (MalformedURLException e) {
			logger.warning(
					"Failed to create URL for the wsdl Location: 'file:/D:/\u7528\u6237\u76ee\u5f55/\u6211\u7684\u6587\u6863/prmInterfaceHIS2008.xml', retrying as a local file");
			logger.warning(e.getMessage());
		}
		SERVICE1_WSDL_LOCATION = url;
	}

	public Service1(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public Service1() {
		super(SERVICE1_WSDL_LOCATION, new QName("http://tempuri.org/", "Service1"));
	}

	/**
	 * 
	 * @return returns Service1Soap
	 */
	@WebEndpoint(name = "Service1Soap")
	public Service1Soap getService1Soap() {
		return super.getPort(new QName("http://tempuri.org/", "Service1Soap"), Service1Soap.class);
	}

	/**
	 * 
	 * @return returns Service1Soap
	 */
	@WebEndpoint(name = "Service1Soap12")
	public Service1Soap getService1Soap12() {
		return super.getPort(new QName("http://tempuri.org/", "Service1Soap12"), Service1Soap.class);
	}

	/**
	 * 
	 * @return returns Service1HttpGet
	 */
	@WebEndpoint(name = "Service1HttpGet")
	public Service1HttpGet getService1HttpGet() {
		return super.getPort(new QName("http://tempuri.org/", "Service1HttpGet"), Service1HttpGet.class);
	}

	/**
	 * 
	 * @return returns Service1HttpPost
	 */
	@WebEndpoint(name = "Service1HttpPost")
	public Service1HttpPost getService1HttpPost() {
		return super.getPort(new QName("http://tempuri.org/", "Service1HttpPost"), Service1HttpPost.class);
	}

}