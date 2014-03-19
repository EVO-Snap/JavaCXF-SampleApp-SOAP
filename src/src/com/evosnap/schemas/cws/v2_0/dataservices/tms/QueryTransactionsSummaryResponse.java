
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
 *         &lt;element name="QueryTransactionsSummaryResult" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}ArrayOfSummaryDetail" minOccurs="0"/>
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
    "queryTransactionsSummaryResult"
})
@XmlRootElement(name = "QueryTransactionsSummaryResponse")
public class QueryTransactionsSummaryResponse {

    @XmlElement(name = "QueryTransactionsSummaryResult", nillable = true)
    protected ArrayOfSummaryDetail queryTransactionsSummaryResult;

    /**
     * Gets the value of the queryTransactionsSummaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSummaryDetail }
     *     
     */
    public ArrayOfSummaryDetail getQueryTransactionsSummaryResult() {
        return queryTransactionsSummaryResult;
    }

    /**
     * Sets the value of the queryTransactionsSummaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSummaryDetail }
     *     
     */
    public void setQueryTransactionsSummaryResult(ArrayOfSummaryDetail value) {
        this.queryTransactionsSummaryResult = value;
    }

}
