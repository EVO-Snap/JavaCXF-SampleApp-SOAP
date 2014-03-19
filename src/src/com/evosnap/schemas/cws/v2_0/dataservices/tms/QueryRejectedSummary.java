
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
 *         &lt;element name="queryRejectedParameters" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}QueryRejectedParameters" minOccurs="0"/>
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
    "queryRejectedParameters",
    "pagingParameters"
})
@XmlRootElement(name = "QueryRejectedSummary")
public class QueryRejectedSummary {

    @XmlElement(nillable = true)
    protected String sessionToken;
    @XmlElement(nillable = true)
    protected QueryRejectedParameters queryRejectedParameters;
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
     * Gets the value of the queryRejectedParameters property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRejectedParameters }
     *     
     */
    public QueryRejectedParameters getQueryRejectedParameters() {
        return queryRejectedParameters;
    }

    /**
     * Sets the value of the queryRejectedParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRejectedParameters }
     *     
     */
    public void setQueryRejectedParameters(QueryRejectedParameters value) {
        this.queryRejectedParameters = value;
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
