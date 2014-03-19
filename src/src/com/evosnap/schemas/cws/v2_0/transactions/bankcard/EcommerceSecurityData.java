
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Ecommerce security elements. Conditional, optional for Ecommerce transactions, otherwise not present. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for EcommerceSecurityData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EcommerceSecurityData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TokenData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TokenIndicator" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}TokenIndicator" minOccurs="0"/>
 *         &lt;element name="XID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EcommerceSecurityData", propOrder = {
    "tokenData",
    "tokenIndicator",
    "xid"
})
public class EcommerceSecurityData {

    @XmlElement(name = "TokenData", nillable = true)
    protected String tokenData;
    @XmlElement(name = "TokenIndicator")
    protected TokenIndicator tokenIndicator;
    @XmlElement(name = "XID", nillable = true)
    protected String xid;

    /**
     * Gets the value of the tokenData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenData() {
        return tokenData;
    }

    /**
     * Sets the value of the tokenData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenData(String value) {
        this.tokenData = value;
    }

    /**
     * Gets the value of the tokenIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TokenIndicator }
     *     
     */
    public TokenIndicator getTokenIndicator() {
        return tokenIndicator;
    }

    /**
     * Sets the value of the tokenIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenIndicator }
     *     
     */
    public void setTokenIndicator(TokenIndicator value) {
        this.tokenIndicator = value;
    }

    /**
     * Gets the value of the xid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXID() {
        return xid;
    }

    /**
     * Sets the value of the xid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXID(String value) {
        this.xid = value;
    }

}
