
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
 *         &lt;element name="zyh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zygb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fyrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cypb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "zyh", "zygb", "fyrq", "cypb" })
@XmlRootElement(name = "QueryFYMX")
public class QueryFYMX {

	protected String zyh;
	protected int zygb;
	protected String fyrq;
	protected int cypb;

	/**
	 * Gets the value of the zyh property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZyh() {
		return zyh;
	}

	/**
	 * Sets the value of the zyh property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZyh(String value) {
		this.zyh = value;
	}

	/**
	 * Gets the value of the zygb property.
	 * 
	 */
	public int getZygb() {
		return zygb;
	}

	/**
	 * Sets the value of the zygb property.
	 * 
	 */
	public void setZygb(int value) {
		this.zygb = value;
	}

	/**
	 * Gets the value of the fyrq property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFyrq() {
		return fyrq;
	}

	/**
	 * Sets the value of the fyrq property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFyrq(String value) {
		this.fyrq = value;
	}

	/**
	 * Gets the value of the cypb property.
	 * 
	 */
	public int getCypb() {
		return cypb;
	}

	/**
	 * Sets the value of the cypb property.
	 * 
	 */
	public void setCypb(int value) {
		this.cypb = value;
	}

}
