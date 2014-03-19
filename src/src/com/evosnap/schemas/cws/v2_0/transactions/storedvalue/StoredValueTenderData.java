
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.TransactionTenderData;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Stored Value tender data. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for StoredValueTenderData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoredValueTenderData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}TransactionTenderData">
 *       &lt;sequence>
 *         &lt;element name="CardData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}CardData" minOccurs="0"/>
 *         &lt;element name="CardSecurityData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}CardSecurityData" minOccurs="0"/>
 *         &lt;element name="CardholderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerIdentifications" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}ArrayOfConsumerIdentification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueTenderData", propOrder = {
    "cardData",
    "cardSecurityData",
    "cardholderId",
    "consumerIdentifications"
})
@XmlSeeAlso({
    StoredValueBalanceTransferTenderData.class,
    StoredValueActivateTenderData.class
})
public class StoredValueTenderData
    extends TransactionTenderData
{

    @XmlElement(name = "CardData", nillable = true)
    protected CardData cardData;
    @XmlElement(name = "CardSecurityData", nillable = true)
    protected CardSecurityData cardSecurityData;
    @XmlElement(name = "CardholderId", nillable = true)
    protected String cardholderId;
    @XmlElement(name = "ConsumerIdentifications", nillable = true)
    protected ArrayOfConsumerIdentification consumerIdentifications;

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
     * Gets the value of the cardholderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderId() {
        return cardholderId;
    }

    /**
     * Sets the value of the cardholderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderId(String value) {
        this.cardholderId = value;
    }

    /**
     * Gets the value of the consumerIdentifications property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConsumerIdentification }
     *     
     */
    public ArrayOfConsumerIdentification getConsumerIdentifications() {
        return consumerIdentifications;
    }

    /**
     * Sets the value of the consumerIdentifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConsumerIdentification }
     *     
     */
    public void setConsumerIdentifications(ArrayOfConsumerIdentification value) {
        this.consumerIdentifications = value;
    }

}
