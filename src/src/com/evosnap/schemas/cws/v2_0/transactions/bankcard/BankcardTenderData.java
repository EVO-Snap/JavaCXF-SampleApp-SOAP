
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.TransactionTenderData;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information about the Bankcard transaction tender data. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BankcardTenderData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardTenderData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}TransactionTenderData">
 *       &lt;sequence>
 *         &lt;element name="CardData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}CardData" minOccurs="0"/>
 *         &lt;element name="CardSecurityData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}CardSecurityData" minOccurs="0"/>
 *         &lt;element name="EcommerceSecurityData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}EcommerceSecurityData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardTenderData", propOrder = {
    "cardData",
    "cardSecurityData",
    "ecommerceSecurityData"
})
public class BankcardTenderData
    extends TransactionTenderData
{

    @XmlElement(name = "CardData", nillable = true)
    protected CardData cardData;
    @XmlElement(name = "CardSecurityData", nillable = true)
    protected CardSecurityData cardSecurityData;
    @XmlElement(name = "EcommerceSecurityData", nillable = true)
    protected EcommerceSecurityData ecommerceSecurityData;

    /**
     * Gets the value of the cardData property.
     * 
     * @return
     *     possible object is
     *     {@link CardData }
     *     
     */
    public CardData getCardData() {
        return cardData;
    }

    /**
     * Sets the value of the cardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData }
     *     
     */
    public void setCardData(CardData value) {
        this.cardData = value;
    }

    /**
     * Gets the value of the cardSecurityData property.
     * 
     * @return
     *     possible object is
     *     {@link CardSecurityData }
     *     
     */
    public CardSecurityData getCardSecurityData() {
        return cardSecurityData;
    }

    /**
     * Sets the value of the cardSecurityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardSecurityData }
     *     
     */
    public void setCardSecurityData(CardSecurityData value) {
        this.cardSecurityData = value;
    }

    /**
     * Gets the value of the ecommerceSecurityData property.
     * 
     * @return
     *     possible object is
     *     {@link EcommerceSecurityData }
     *     
     */
    public EcommerceSecurityData getEcommerceSecurityData() {
        return ecommerceSecurityData;
    }

    /**
     * Sets the value of the ecommerceSecurityData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EcommerceSecurityData }
     *     
     */
    public void setEcommerceSecurityData(EcommerceSecurityData value) {
        this.ecommerceSecurityData = value;
    }

}
