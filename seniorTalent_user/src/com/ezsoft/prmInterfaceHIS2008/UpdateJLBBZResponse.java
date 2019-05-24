
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
 *         &lt;element name="UpdateJLBBZResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "updateJLBBZResult" })
@XmlRootElement(name = "UpdateJLBBZResponse")
public class UpdateJLBBZResponse {

	@XmlElement(name = "UpdateJLBBZResult")
	protected String updateJLBBZResult;

	/**
	 * Gets the value of the updateJLBBZResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUpdateJLBBZResult() {
		return updateJLBBZResult;
	}

	/**
	 * Sets the value of the updateJLBBZResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUpdateJLBBZResult(String value) {
		this.updateJLBBZResult = value;
	}

}
