
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.CVResult;
import com.evosnap.schemas.cws.v2_0.transactions.Response;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Response to the Stored Value transaction (gift card). Expected. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for StoredValueTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoredValueTransactionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Response">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FeeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}CVResult" minOccurs="0"/>
 *         &lt;element name="CashBackAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LockAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NewBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PreviousBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CardStatus" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}CardStatus" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardRestrictionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentAccountDataToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaskedPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueTransactionResponse", propOrder = {
    "amount",
    "feeAmount",
    "approvalCode",
    "cvResult",
    "cashBackAmount",
    "lockAmount",
    "newBalance",
    "previousBalance",
    "cardStatus",
    "accountNumber",
    "cvData",
    "cardRestrictionValue",
    "paymentAccountDataToken",
    "maskedPAN",
    "orderId",
    "expire"
})
public class StoredValueTransactionResponse
    extends Response
{

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "FeeAmount")
    protected BigDecimal feeAmount;
    @XmlElement(name = "ApprovalCode", nillable = true)
    protected String approvalCode;
    @XmlElement(name = "CVResult")
    protected CVResult cvResult;
    @XmlElement(name = "CashBackAmount")
    protected BigDecimal cashBackAmount;
    @XmlElement(name = "LockAmount")
    protected BigDecimal lockAmount;
    @XmlElement(name = "NewBalance")
    protected BigDecimal newBalance;
    @XmlElement(name = "PreviousBalance")
    protected BigDecimal previousBalance;
    @XmlElement(name = "CardStatus")
    protected CardStatus cardStatus;
    @XmlElement(name = "AccountNumber", nillable = true)
    protected String accountNumber;
    @XmlElement(name = "CVData", nillable = true)
    protected String cvData;
    @XmlElement(name = "CardRestrictionValue", nillable = true)
    protected String cardRestrictionValue;
    @XmlElement(name = "PaymentAccountDataToken", nillable = true)
    protected String paymentAccountDataToken;
    @XmlElement(name = "MaskedPAN", nillable = true)
    protected String maskedPAN;
    @XmlElement(name = "OrderId", nillable = true)
    protected String orderId;
    @XmlElement(name = "Expire", nillable = true)
    protected String expire;

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
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeAmount(BigDecimal value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the approvalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /**
     * Sets the value of the approvalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
    }

    /**
     * Gets the value of the cvResult property.
     * 
     * @return
     *     possible object is
     *     {@link CVResult }
     *     
     */
    public CVResult getCVResult() {
        return cvResult;
    }

    /**
     * Sets the value of the cvResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVResult }
     *     
     */
    public void setCVResult(CVResult value) {
        this.cvResult = value;
    }

    /**
     * Gets the value of the cashBackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashBackAmount() {
        return cashBackAmount;
    }

    /**
     * Sets the value of the cashBackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashBackAmount(BigDecimal value) {
        this.cashBackAmount = value;
    }

    /**
     * Gets the value of the lockAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLockAmount() {
        return lockAmount;
    }

    /**
     * Sets the value of the lockAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLockAmount(BigDecimal value) {
        this.lockAmount = value;
    }

    /**
     * Gets the value of the newBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewBalance() {
        return newBalance;
    }

    /**
     * Sets the value of the newBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewBalance(BigDecimal value) {
        this.newBalance = value;
    }

    /**
     * Gets the value of the previousBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreviousBalance() {
        return previousBalance;
    }

    /**
     * Sets the value of the previousBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreviousBalance(BigDecimal value) {
        this.previousBalance = value;
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
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the cvData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVData() {
        return cvData;
    }

    /**
     * Sets the value of the cvData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVData(String value) {
        this.cvData = value;
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
     * Gets the value of the paymentAccountDataToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountDataToken() {
        return paymentAccountDataToken;
    }

    /**
     * Sets the value of the paymentAccountDataToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountDataToken(String value) {
        this.paymentAccountDataToken = value;
    }

    /**
     * Gets the value of the maskedPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedPAN() {
        return maskedPAN;
    }

    /**
     * Sets the value of the maskedPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedPAN(String value) {
        this.maskedPAN = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the expire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpire() {
        return expire;
    }

    /**
     * Sets the value of the expire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpire(String value) {
        this.expire = value;
    }

}
