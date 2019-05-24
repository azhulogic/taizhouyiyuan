
package com.enzemed.ios.validate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetKeyResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getKeyResult" })
@XmlRootElement(name = "GetKeyResponse")
public class GetKeyResponse {

	@XmlElement(name = "GetKeyResult")
	protected String getKeyResult;

	/**
	 * Gets the value of the getKeyResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGetKeyResult() {
		return getKeyResult;
	}

	/**
	 * Sets the value of the getKeyResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGetKeyResult(String value) {
		this.getKeyResult = value;
	}

}
