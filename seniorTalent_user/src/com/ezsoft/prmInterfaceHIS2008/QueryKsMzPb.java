
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
 *         &lt;element name="ksdm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qsrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "ksdm", "qsrq" })
@XmlRootElement(name = "QueryKsMzPb")
public class QueryKsMzPb {

	protected String ksdm;
	protected String qsrq;

	/**
	 * Gets the value of the ksdm property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getKsdm() {
		return ksdm;
	}

	/**
	 * Sets the value of the ksdm property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setKsdm(String value) {
		this.ksdm = value;
	}

	/**
	 * Gets the value of the qsrq property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQsrq() {
		return qsrq;
	}

	/**
	 * Sets the value of the qsrq property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQsrq(String value) {
		this.qsrq = value;
	}

}
