
package com.ezsoft.prmInterfaceHIS2008;

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
 *         &lt;element name="UpdatePhoneResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "updatePhoneResult" })
@XmlRootElement(name = "UpdatePhoneResponse")
public class UpdatePhoneResponse {

	@XmlElement(name = "UpdatePhoneResult")
	protected String updatePhoneResult;

	/**
	 * Gets the value of the updatePhoneResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUpdatePhoneResult() {
		return updatePhoneResult;
	}

	/**
	 * Sets the value of the updatePhoneResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUpdatePhoneResult(String value) {
		this.updatePhoneResult = value;
	}

}
