
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
 *         &lt;element name="jlxh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "jlxh" })
@XmlRootElement(name = "DeleteHfrwByJlxh")
public class DeleteHfrwByJlxh {

	protected String jlxh;

	/**
	 * Gets the value of the jlxh property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getJlxh() {
		return jlxh;
	}

	/**
	 * Sets the value of the jlxh property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setJlxh(String value) {
		this.jlxh = value;
	}

}
