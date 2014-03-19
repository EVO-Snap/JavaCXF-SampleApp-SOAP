
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryTransactionFamiliesResult" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}ArrayOfFamilyDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "queryTransactionFamiliesResult"
})
@XmlRootElement(name = "QueryTransactionFamiliesResponse")
public class QueryTransactionFamiliesResponse {

    @XmlElement(name = "QueryTransactionFamiliesResult", nillable = true)
    protected ArrayOfFamilyDetail queryTransactionFamiliesResult;

    /**
     * Gets the value of the queryTransactionFamiliesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFamilyDetail }
     *     
     */
    public ArrayOfFamilyDetail getQueryTransactionFamiliesResult() {
        return queryTransactionFamiliesResult;
    }

    /**
     * Sets the value of the queryTransactionFamiliesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFamilyDetail }
     *     
     */
    public void setQueryTransactionFamiliesResult(ArrayOfFamilyDetail value) {
        this.queryTransactionFamiliesResult = value;
    }

}
