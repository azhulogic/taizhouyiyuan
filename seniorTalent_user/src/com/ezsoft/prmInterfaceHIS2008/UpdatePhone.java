
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
 *         &lt;element name="zyhm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phonenum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "zyh", "zyhm", "phonenum", "bz" })
@XmlRootElement(name = "UpdatePhone")
public class UpdatePhone {

	protected String zyh;
	protected String zyhm;
	protected String phonenum;
	protected String bz;

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

	/**
	 * Gets the value of the phonenum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPhonenum() {
		return phonenum;
	}

	/**
	 * Sets the value of the phonenum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPhonenum(String value) {
		this.phonenum = value;
	}

	/**
	 * Gets the value of the bz property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBz() {
		return bz;
	}

	/**
	 * Sets the value of the bz property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBz(String value) {
		this.bz = value;
	}

}
