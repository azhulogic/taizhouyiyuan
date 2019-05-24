
package com.enzemed.ios.validate;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.enzemed.ios.validate package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.enzemed.ios.validate
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link GetKey }
	 * 
	 */
	public GetKey createGetKey() {
		return new GetKey();
	}

	/**
	 * Create an instance of {@link GetVaild }
	 * 
	 */
	public GetVaild createGetVaild() {
		return new GetVaild();
	}

	/**
	 * Create an instance of {@link GetKeyResponse }
	 * 
	 */
	public GetKeyResponse createGetKeyResponse() {
		return new GetKeyResponse();
	}

	/**
	 * Create an instance of {@link GetVaildResponse }
	 * 
	 */
	public GetVaildResponse createGetVaildResponse() {
		return new GetVaildResponse();
	}

}
