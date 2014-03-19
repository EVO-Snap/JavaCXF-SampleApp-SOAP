
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoredValueBalanceTransferTenderData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoredValueBalanceTransferTenderData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}StoredValueTenderData">
 *       &lt;sequence>
 *         &lt;element name="SourceCardData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}CardData" minOccurs="0"/>
 *         &lt;element name="ConsumerIdentification" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}ConsumerIdentification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueBalanceTransferTenderData", propOrder = {
    "sourceCardData",
    "consumerIdentification"
})
public class StoredValueBalanceTransferTenderData
    extends StoredValueTenderData
{

    @XmlElement(name = "SourceCardData", nillable = true)
    protected CardData sourceCardData;
    @XmlElement(name = "ConsumerIdentification", nillable = true)
    protected ConsumerIdentification consumerIdentification;

    /**
     * Gets the value of the sourceCardData property.
     * 
     * @return
     *     possible object is
     *     {@link CardData }
     *     
     */
    public CardData getSourceCardData() {
        return sourceCardData;
    }

    /**
     * Sets the value of the sourceCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData }
     *     
     */
    public void setSourceCardData(CardData value) {
        this.sourceCardData = value;
    }

    /**
     * Gets the value of the consumerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerIdentification }
     *     
     */
    public ConsumerIdentification getConsumerIdentification() {
        return consumerIdentification;
    }

    /**
     * Sets the value of the consumerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerIdentification }
     *     
     */
    public void setConsumerIdentification(ConsumerIdentification value) {
        this.consumerIdentification = value;
    }

}
