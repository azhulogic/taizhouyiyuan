
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
 *         &lt;element name="jlxh" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sfbz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "jlxh", "sfbz" })
@XmlRootElement(name = "UpdateMzAtscSfbz")
public class UpdateMzAtscSfbz {

	protected long jlxh;
	protected int sfbz;

	/**
	 * Gets the value of the jlxh property.
	 * 
	 */
	public long getJlxh() {
		return jlxh;
	}

	/**
	 * Sets the value of the jlxh property.
	 * 
	 */
	public void setJlxh(long value) {
		this.jlxh = value;
	}

	/**
	 * Gets the value of the sfbz property.
	 * 
	 */
	public int getSfbz() {
		return sfbz;
	}

	/**
	 * Sets the value of the sfbz property.
	 * 
	 */
	public void setSfbz(int value) {
		this.sfbz = value;
	}

}
