
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
 *         &lt;element name="QueryBatchResult" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}ArrayOfBatchDetailData" minOccurs="0"/>
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
    "queryBatchResult"
})
@XmlRootElement(name = "QueryBatchResponse")
public class QueryBatchResponse {

    @XmlElement(name = "QueryBatchResult", nillable = true)
    protected ArrayOfBatchDetailData queryBatchResult;

    /**
     * Gets the value of the queryBatchResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchDetailData }
     *     
     */
    public ArrayOfBatchDetailData getQueryBatchResult() {
        return queryBatchResult;
    }

    /**
     * Sets the value of the queryBatchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchDetailData }
     *     
     */
    public void setQueryBatchResult(ArrayOfBatchDetailData value) {
        this.queryBatchResult = value;
    }

}
