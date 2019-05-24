
package com.ezsoft.prmInterfaceHIS2008;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="rq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "rq" })
@XmlRootElement(name = "QueryHfrw")
public class QueryHfrw {

	protected String rq;

	/**
	 * Gets the value of the rq property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRq() {
		return rq;
	}

	/**
	 * Sets the value of the rq property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRq(String value) {
		this.rq = value;
	}

}
