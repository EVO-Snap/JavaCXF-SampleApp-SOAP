
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.dataservices.PagingParameters;


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
 *         &lt;element name="sessionToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryBatchParameters" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}QueryBatchParameters" minOccurs="0"/>
 *         &lt;element name="pagingParameters" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices}PagingParameters" minOccurs="0"/>
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
    "sessionToken",
    "queryBatchParameters",
    "pagingParameters"
})
@XmlRootElement(name = "QueryBatch")
public class QueryBatch {

    @XmlElement(nillable = true)
    protected String sessionToken;
    @XmlElement(nillable = true)
    protected QueryBatchParameters queryBatchParameters;
    @XmlElement(nillable = true)
    protected PagingParameters pagingParameters;

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionToken(String value) {
        this.sessionToken = value;
    }

    /**
     * Gets the value of the queryBatchParameters property.
     * 
     * @return
     *     possible object is
     *     {@link QueryBatchParameters }
     *     
     */
    public QueryBatchParameters getQueryBatchParameters() {
        return queryBatchParameters;
    }

    /**
     * Sets the value of the queryBatchParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryBatchParameters }
     *     
     */
    public void setQueryBatchParameters(QueryBatchParameters value) {
        this.queryBatchParameters = value;
    }

    /**
     * Gets the value of the pagingParameters property.
     * 
     * @return
     *     possible object is
     *     {@link PagingParameters }
     *     
     */
    public PagingParameters getPagingParameters() {
        return pagingParameters;
    }

    /**
     * Sets the value of the pagingParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingParameters }
     *     
     */
    public void setPagingParameters(PagingParameters value) {
        this.pagingParameters = value;
    }

}
