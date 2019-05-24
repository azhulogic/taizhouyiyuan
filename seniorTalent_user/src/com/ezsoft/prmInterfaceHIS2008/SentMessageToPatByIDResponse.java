
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
 *         &lt;element name="SentMessageToPatByIDResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "sentMessageToPatByIDResult" })
@XmlRootElement(name = "SentMessageToPatByIDResponse")
public class SentMessageToPatByIDResponse {

	@XmlElement(name = "SentMessageToPatByIDResult")
	protected String sentMessageToPatByIDResult;

	/**
	 * Gets the value of the sentMessageToPatByIDResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSentMessageToPatByIDResult() {
		return sentMessageToPatByIDResult;
	}

	/**
	 * Sets the value of the sentMessageToPatByIDResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSentMessageToPatByIDResult(String value) {
		this.sentMessageToPatByIDResult = value;
	}

}
