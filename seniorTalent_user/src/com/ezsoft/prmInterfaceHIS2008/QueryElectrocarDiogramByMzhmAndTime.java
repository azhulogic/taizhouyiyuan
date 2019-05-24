
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
 *         &lt;element name="starttime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "mzhm", "starttime", "endtime" })
@XmlRootElement(name = "QueryElectrocarDiogramByMzhmAndTime")
public class QueryElectrocarDiogramByMzhmAndTime {

	protected String mzhm;
	protected String starttime;
	protected String endtime;

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
	 * Gets the value of the starttime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStarttime() {
		return starttime;
	}

	/**
	 * Sets the value of the starttime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStarttime(String value) {
		this.starttime = value;
	}

	/**
	 * Gets the value of the endtime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEndtime() {
		return endtime;
	}

	/**
	 * Sets the value of the endtime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEndtime(String value) {
		this.endtime = value;
	}

}
