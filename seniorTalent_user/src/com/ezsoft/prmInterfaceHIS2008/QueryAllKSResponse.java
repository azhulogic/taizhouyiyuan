
package com.ezsoft.prmInterfaceHIS2008;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element name="QueryAllKSResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "queryAllKSResult" })
@XmlRootElement(name = "QueryAllKSResponse")
public class QueryAllKSResponse {

	@XmlElement(name = "QueryAllKSResult")
	protected QueryAllKSResponse.QueryAllKSResult queryAllKSResult;

	/**
	 * Gets the value of the queryAllKSResult property.
	 * 
	 * @return possible object is {@link QueryAllKSResponse.QueryAllKSResult }
	 * 
	 */
	public QueryAllKSResponse.QueryAllKSResult getQueryAllKSResult() {
		return queryAllKSResult;
	}

	/**
	 * Sets the value of the queryAllKSResult property.
	 * 
	 * @param value
	 *            allowed object is {@link QueryAllKSResponse.QueryAllKSResult }
	 * 
	 */
	public void setQueryAllKSResult(QueryAllKSResponse.QueryAllKSResult value) {
		this.queryAllKSResult = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;any/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "any" })
	public static class QueryAllKSResult {

		@XmlAnyElement(lax = true)
		protected List<Object> any;

		/**
		 * Gets the value of the any property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the any property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getAny().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link Object }
		 * 
		 * 
		 */
		public List<Object> getAny() {
			if (any == null) {
				any = new ArrayList<Object>();
			}
			return this.any;
		}

	}

}
