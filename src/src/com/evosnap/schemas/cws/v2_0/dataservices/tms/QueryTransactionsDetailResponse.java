
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
 *         &lt;element name="QueryTransactionsDetailResult" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}ArrayOfTransactionDetail" minOccurs="0"/>
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
    "queryTransactionsDetailResult"
})
@XmlRootElement(name = "QueryTransactionsDetailResponse")
public class QueryTransactionsDetailResponse {

    @XmlElement(name = "QueryTransactionsDetailResult", nillable = true)
    protected ArrayOfTransactionDetail queryTransactionsDetailResult;

    /**
     * Gets the value of the queryTransactionsDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransactionDetail }
     *     
     */
    public ArrayOfTransactionDetail getQueryTransactionsDetailResult() {
        return queryTransactionsDetailResult;
    }

    /**
     * Sets the value of the queryTransactionsDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransactionDetail }
     *     
     */
    public void setQueryTransactionsDetailResult(ArrayOfTransactionDetail value) {
        this.queryTransactionsDetailResult = value;
    }

}
