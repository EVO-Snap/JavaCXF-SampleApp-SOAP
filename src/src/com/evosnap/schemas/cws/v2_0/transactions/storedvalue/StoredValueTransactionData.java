
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.EntryMode;
import com.evosnap.schemas.cws.v2_0.transactions.IndustryType;
import com.evosnap.schemas.cws.v2_0.transactions.TransactionData;
import com.evosnap.schemas.cws.v2_0.transactions.TypeISOCurrencyCodeA3;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information about the Stored Value transaction data. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for StoredValueTransactionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoredValueTransactionData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}TransactionData">
 *       &lt;sequence>
 *         &lt;element name="EmployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndustryType" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}IndustryType" minOccurs="0"/>
 *         &lt;element name="TipAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TenderCurrencyCode" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}TypeISOCurrencyCodeA3" minOccurs="0"/>
 *         &lt;element name="CardRestrictionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntryMode" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}EntryMode" minOccurs="0"/>
 *         &lt;element name="Unload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CardStatus" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}CardStatus" minOccurs="0"/>
 *         &lt;element name="OperationType" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}OperationType" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueTransactionData", propOrder = {
    "employeeId",
    "industryType",
    "tipAmount",
    "tenderCurrencyCode",
    "cardRestrictionValue",
    "entryMode",
    "unload",
    "cardStatus",
    "operationType",
    "orderNumber",
    "terminalId"
})
public class StoredValueTransactionData
    extends TransactionData
{

    @XmlElement(name = "EmployeeId", nillable = true)
    protected String employeeId;
    @XmlElement(name = "IndustryType")
    protected IndustryType industryType;
    @XmlElement(name = "TipAmount")
    protected BigDecimal tipAmount;
    @XmlElement(name = "TenderCurrencyCode")
    protected TypeISOCurrencyCodeA3 tenderCurrencyCode;
    @XmlElement(name = "CardRestrictionValue", nillable = true)
    protected String cardRestrictionValue;
    @XmlElement(name = "EntryMode")
    protected EntryMode entryMode;
    @XmlElement(name = "Unload")
    protected Boolean unload;
    @XmlElement(name = "CardStatus")
    protected CardStatus cardStatus;
    @XmlElement(name = "OperationType")
    protected OperationType operationType;
    @XmlElement(name = "OrderNumber", nillable = true)
    protected String orderNumber;
    @XmlElement(name = "TerminalId", nillable = true)
    protected String terminalId;

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the industryType property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryType }
     *     
     */
    public IndustryType getIndustryType() {
        return industryType;
    }

    /**
     * Sets the value of the industryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryType }
     *     
     */
    public void setIndustryType(IndustryType value) {
        this.industryType = value;
    }

    /**
     * Gets the value of the tipAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipAmount() {
        return tipAmount;
    }

    /**
     * Sets the value of the tipAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipAmount(BigDecimal value) {
        this.tipAmount = value;
    }

    /**
     * Gets the value of the tenderCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link TypeISOCurrencyCodeA3 }
     *     
     */
    public TypeISOCurrencyCodeA3 getTenderCurrencyCode() {
        return tenderCurrencyCode;
    }

    /**
     * Sets the value of the tenderCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeISOCurrencyCodeA3 }
     *     
     */
    public void setTenderCurrencyCode(TypeISOCurrencyCodeA3 value) {
        this.tenderCurrencyCode = value;
    }

    /**
     * Gets the value of the cardRestrictionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardRestrictionValue() {
        return cardRestrictionValue;
    }

    /**
     * Sets the value of the cardRestrictionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardRestrictionValue(String value) {
        this.cardRestrictionValue = value;
    }

    /**
     * Gets the value of the entryMode property.
     * 
     * @return
     *     possible object is
     *     {@link EntryMode }
     *     
     */
    public EntryMode getEntryMode() {
        return entryMode;
    }

    /**
     * Sets the value of the entryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryMode }
     *     
     */
    public void setEntryMode(EntryMode value) {
        this.entryMode = value;
    }

    /**
     * Gets the value of the unload property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnload() {
        return unload;
    }

    /**
     * Sets the value of the unload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnload(Boolean value) {
        this.unload = value;
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

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

}
