
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
 *         &lt;element name="QueryRejectedDetailResult" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}QueryResponse" minOccurs="0"/>
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
    "queryRejectedDetailResult"
})
@XmlRootElement(name = "QueryRejectedDetailResponse")
public class QueryRejectedDetailResponse {

    @XmlElement(name = "QueryRejectedDetailResult", nillable = true)
    protected QueryResponse queryRejectedDetailResult;

    /**
     * Gets the value of the queryRejectedDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResponse }
     *     
     */
    public QueryResponse getQueryRejectedDetailResult() {
        return queryRejectedDetailResult;
    }

    /**
     * Sets the value of the queryRejectedDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResponse }
     *     
     */
    public void setQueryRejectedDetailResult(QueryResponse value) {
        this.queryRejectedDetailResult = value;
    }

}
