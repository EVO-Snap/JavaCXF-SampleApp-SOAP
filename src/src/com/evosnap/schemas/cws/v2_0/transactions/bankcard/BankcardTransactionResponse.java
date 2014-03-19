
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.evosnap.schemas.cws.v2_0.transactions.CVResult;
import com.evosnap.schemas.cws.v2_0.transactions.Response;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro.BankcardTransactionResponsePro;
import org.w3._2001.xmlschema.Adapter1;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Response to the Bankcard transaction (Credit and PIN Debit). Expected. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BankcardTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardTransactionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Response">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CardType" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}TypeCardType" minOccurs="0"/>
 *         &lt;element name="FeeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVSResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}AVSResult" minOccurs="0"/>
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}CVResult" minOccurs="0"/>
 *         &lt;element name="CardLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DowngradeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaskedPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentAccountDataToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RetrievalReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resubmit" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}Resubmit" minOccurs="0"/>
 *         &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FinalBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CashBackAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrepaidCard" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}PrepaidCard" minOccurs="0"/>
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
@XmlType(name = "BankcardTransactionResponse", propOrder = {
    "amount",
    "cardType",
    "feeAmount",
    "approvalCode",
    "avsResult",
    "batchId",
    "cvResult",
    "cardLevel",
    "downgradeCode",
    "maskedPAN",
    "paymentAccountDataToken",
    "retrievalReferenceNumber",
    "resubmit",
    "settlementDate",
    "finalBalance",
    "orderId",
    "cashBackAmount",
    "prepaidCard",
    "expire"
})
@XmlSeeAlso({
    BankcardTransactionResponsePro.class
})
public class BankcardTransactionResponse
    extends Response
{

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "CardType")
    protected TypeCardType cardType;
    @XmlElement(name = "FeeAmount")
    protected BigDecimal feeAmount;
    @XmlElement(name = "ApprovalCode", nillable = true)
    protected String approvalCode;
    @XmlElement(name = "AVSResult", nillable = true)
    protected AVSResult avsResult;
    @XmlElement(name = "BatchId", nillable = true)
    protected String batchId;
    @XmlElement(name = "CVResult")
    protected CVResult cvResult;
    @XmlElement(name = "CardLevel", nillable = true)
    protected String cardLevel;
    @XmlElement(name = "DowngradeCode", nillable = true)
    protected String downgradeCode;
    @XmlElement(name = "MaskedPAN", nillable = true)
    protected String maskedPAN;
    @XmlElement(name = "PaymentAccountDataToken", nillable = true)
    protected String paymentAccountDataToken;
    @XmlElement(name = "RetrievalReferenceNumber", nillable = true)
    protected String retrievalReferenceNumber;
    @XmlElement(name = "Resubmit")
    protected Resubmit resubmit;
    @XmlElement(name = "SettlementDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar settlementDate;
    @XmlElement(name = "FinalBalance")
    protected BigDecimal finalBalance;
    @XmlElement(name = "OrderId", nillable = true)
    protected String orderId;
    @XmlElement(name = "CashBackAmount")
    protected BigDecimal cashBackAmount;
    @XmlElement(name = "PrepaidCard")
    protected PrepaidCard prepaidCard;
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
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCardType }
     *     
     */
    public TypeCardType getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCardType }
     *     
     */
    public void setCardType(TypeCardType value) {
        this.cardType = value;
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
     * Gets the value of the avsResult property.
     * 
     * @return
     *     possible object is
     *     {@link AVSResult }
     *     
     */
    public AVSResult getAVSResult() {
        return avsResult;
    }

    /**
     * Sets the value of the avsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVSResult }
     *     
     */
    public void setAVSResult(AVSResult value) {
        this.avsResult = value;
    }

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
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
     * Gets the value of the cardLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLevel() {
        return cardLevel;
    }

    /**
     * Sets the value of the cardLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLevel(String value) {
        this.cardLevel = value;
    }

    /**
     * Gets the value of the downgradeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDowngradeCode() {
        return downgradeCode;
    }

    /**
     * Sets the value of the downgradeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDowngradeCode(String value) {
        this.downgradeCode = value;
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
     * Gets the value of the retrievalReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    /**
     * Sets the value of the retrievalReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrievalReferenceNumber(String value) {
        this.retrievalReferenceNumber = value;
    }

    /**
     * Gets the value of the resubmit property.
     * 
     * @return
     *     possible object is
     *     {@link Resubmit }
     *     
     */
    public Resubmit getResubmit() {
        return resubmit;
    }

    /**
     * Sets the value of the resubmit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resubmit }
     *     
     */
    public void setResubmit(Resubmit value) {
        this.resubmit = value;
    }

    /**
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementDate(Calendar value) {
        this.settlementDate = value;
    }

    /**
     * Gets the value of the finalBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinalBalance() {
        return finalBalance;
    }

    /**
     * Sets the value of the finalBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinalBalance(BigDecimal value) {
        this.finalBalance = value;
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
     * Gets the value of the prepaidCard property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidCard }
     *     
     */
    public PrepaidCard getPrepaidCard() {
        return prepaidCard;
    }

    /**
     * Sets the value of the prepaidCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidCard }
     *     
     */
    public void setPrepaidCard(PrepaidCard value) {
        this.prepaidCard = value;
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
