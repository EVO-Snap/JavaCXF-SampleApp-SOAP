
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.Manage;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Stored Value udpdate data for building Deactivate, Status, Reload and BalanceTransfer from Activate. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for StoredValueManage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoredValueManage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Manage">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SourceCardData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}CardData" minOccurs="0"/>
 *         &lt;element name="CardStatus" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}CardStatus" minOccurs="0"/>
 *         &lt;element name="IsCashOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OperationType" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}OperationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueManage", propOrder = {
    "amount",
    "sourceCardData",
    "cardStatus",
    "isCashOut",
    "operationType"
})
public class StoredValueManage
    extends Manage
{

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "SourceCardData", nillable = true)
    protected CardData sourceCardData;
    @XmlElement(name = "CardStatus")
    protected CardStatus cardStatus;
    @XmlElement(name = "IsCashOut")
    protected Boolean isCashOut;
    @XmlElement(name = "OperationType")
    protected OperationType operationType;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

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
     * Gets the value of the cardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CardStatus }
     *     
     */
    public CardStatus getCardStatus() {
        return cardStatus;
    }

    /**
     * Sets the value of the cardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardStatus }
     *     
     */
    public void setCardStatus(CardStatus value) {
        this.cardStatus = value;
    }

    /**
     * Gets the value of the isCashOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCashOut() {
        return isCashOut;
    }

    /**
     * Sets the value of the isCashOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCashOut(Boolean value) {
        this.isCashOut = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setOperationType(OperationType value) {
        this.operationType = value;
    }

}
