
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
 *         &lt;element name="zyhm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "zyhm" })
@XmlRootElement(name = "QueryHfrwByZyhm")
public class QueryHfrwByZyhm {

	protected String zyhm;

	/**
	 * Gets the value of the zyhm property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZyhm() {
		return zyhm;
	}

	/**
	 * Sets the value of the zyhm property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZyhm(String value) {
		this.zyhm = value;
	}

}