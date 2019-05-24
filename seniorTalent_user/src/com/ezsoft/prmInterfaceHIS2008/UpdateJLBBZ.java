
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
 *         &lt;element name="mzhm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "mzhm", "pb" })
@XmlRootElement(name = "UpdateJLBBZ")
public class UpdateJLBBZ {

	protected String mzhm;
	protected int pb;

	/**
	 * Gets the value of the mzhm property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMzhm() {
		return mzhm;
	}

	/**
	 * Sets the value of the mzhm property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMzhm(String value) {
		this.mzhm = value;
	}

	/**
	 * Gets the value of the pb property.
	 * 
	 */
	public int getPb() {
		return pb;
	}

	/**
	 * Sets the value of the pb property.
	 * 
	 */
	public void setPb(int value) {
		this.pb = value;
	}

}
