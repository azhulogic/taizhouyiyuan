
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
 *         &lt;element name="QueryCypbResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "queryCypbResult" })
@XmlRootElement(name = "QueryCypbResponse")
public class QueryCypbResponse {

	@XmlElement(name = "QueryCypbResult")
	protected String queryCypbResult;

	/**
	 * Gets the value of the queryCypbResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQueryCypbResult() {
		return queryCypbResult;
	}

	/**
	 * Sets the value of the queryCypbResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQueryCypbResult(String value) {
		this.queryCypbResult = value;
	}

}
