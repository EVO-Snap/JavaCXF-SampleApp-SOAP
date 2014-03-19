
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.AlternativeMerchantData;
import com.evosnap.schemas.cws.v2_0.transactions.EntryMode;
import com.evosnap.schemas.cws.v2_0.transactions.TransactionData;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro.BankcardTransactionDataPro;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information about the Bankcard transaction data. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BankcardTransactionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardTransactionData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}TransactionData">
 *       &lt;sequence>
 *         &lt;element name="AccountType" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}AccountType" minOccurs="0"/>
 *         &lt;element name="AlternativeMerchantData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}AlternativeMerchantData" minOccurs="0"/>
 *         &lt;element name="ApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CashBackAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerPresent" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}CustomerPresent" minOccurs="0"/>
 *         &lt;element name="EmployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntryMode" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}EntryMode" minOccurs="0"/>
 *         &lt;element name="GoodsType" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}GoodsType" minOccurs="0"/>
 *         &lt;element name="InternetTransactionData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}InternetTransactionData" minOccurs="0"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignatureCaptured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BatchAssignment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPartialShipment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LaneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartialApprovalCapable" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}PartialApprovalSupportType" minOccurs="0"/>
 *         &lt;element name="ScoreThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsQuasiCash" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}TransactionCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardTransactionData", propOrder = {
    "accountType",
    "alternativeMerchantData",
    "approvalCode",
    "cashBackAmount",
    "customerPresent",
    "employeeId",
    "entryMode",
    "goodsType",
    "internetTransactionData",
    "invoiceNumber",
    "orderNumber",
    "signatureCaptured",
    "terminalId",
    "tipAmount",
    "batchAssignment",
    "isPartialShipment",
    "feeAmount",
    "laneId",
    "partialApprovalCapable",
    "scoreThreshold",
    "isQuasiCash",
    "transactionCode"
})
@XmlSeeAlso({
    BankcardTransactionDataPro.class
})
public class BankcardTransactionData
    extends TransactionData
{

    @XmlElement(name = "AccountType")
    protected AccountType accountType;
    @XmlElement(name = "AlternativeMerchantData", nillable = true)
    protected AlternativeMerchantData alternativeMerchantData;
    @XmlElement(name = "ApprovalCode", nillable = true)
    protected String approvalCode;
    @XmlElement(name = "CashBackAmount")
    protected BigDecimal cashBackAmount;
    @XmlElement(name = "CustomerPresent")
    protected CustomerPresent customerPresent;
    @XmlElement(name = "EmployeeId", nillable = true)
    protected String employeeId;
    @XmlElement(name = "EntryMode")
    protected EntryMode entryMode;
    @XmlElement(name = "GoodsType")
    protected GoodsType goodsType;
    @XmlElement(name = "InternetTransactionData", nillable = true)
    protected InternetTransactionData internetTransactionData;
    @XmlElement(name = "InvoiceNumber", nillable = true)
    protected String invoiceNumber;
    @XmlElement(name = "OrderNumber", nillable = true)
    protected String orderNumber;
    @XmlElement(name = "SignatureCaptured")
    protected Boolean signatureCaptured;
    @XmlElement(name = "TerminalId", nillable = true)
    protected String terminalId;
    @XmlElement(name = "TipAmount")
    protected BigDecimal tipAmount;
    @XmlElement(name = "BatchAssignment", nillable = true)
    protected String batchAssignment;
    @XmlElement(name = "IsPartialShipment")
    protected Boolean isPartialShipment;
    @XmlElement(name = "FeeAmount")
    protected BigDecimal feeAmount;
    @XmlElement(name = "LaneId", nillable = true)
    protected String laneId;
    @XmlElement(name = "PartialApprovalCapable")
    protected PartialApprovalSupportType partialApprovalCapable;
    @XmlElement(name = "ScoreThreshold", nillable = true)
    protected String scoreThreshold;
    @XmlElement(name = "IsQuasiCash")
    protected Boolean isQuasiCash;
    @XmlElement(name = "TransactionCode")
    protected TransactionCode transactionCode;

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountType(AccountType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the alternativeMerchantData property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeMerchantData }
     *     
     */
    public AlternativeMerchantData getAlternativeMerchantData() {
        return alternativeMerchantData;
    }

    /**
     * Sets the value of the alternativeMerchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeMerchantData }
     *     
     */
    public void setAlternativeMerchantData(AlternativeMerchantData value) {
        this.alternativeMerchantData = value;
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
     * Gets the value of the customerPresent property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPresent }
     *     
     */
    public CustomerPresent getCustomerPresent() {
        return customerPresent;
    }

    /**
     * Sets the value of the customerPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPresent }
     *     
     */
    public void setCustomerPresent(CustomerPresent value) {
        this.customerPresent = value;
    }

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
     * Gets the value of the goodsType property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsType }
     *     
     */
    public GoodsType getGoodsType() {
        return goodsType;
    }

    /**
     * Sets the value of the goodsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsType }
     *     
     */
    public void setGoodsType(GoodsType value) {
        this.goodsType = value;
    }

    /**
     * Gets the value of the internetTransactionData property.
     * 
     * @return
     *     possible object is
     *     {@link InternetTransactionData }
     *     
     */
    public InternetTransactionData getInternetTransactionData() {
        return internetTransactionData;
    }

    /**
     * Sets the value of the internetTransactionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternetTransactionData }
     *     
     */
    public void setInternetTransactionData(InternetTransactionData value) {
        this.internetTransactionData = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
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
     * Gets the value of the signatureCaptured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignatureCaptured() {
        return signatureCaptured;
    }

    /**
     * Sets the value of the signatureCaptured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignatureCaptured(Boolean value) {
        this.signatureCaptured = value;
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
     * Gets the value of the batchAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchAssignment() {
        return batchAssignment;
    }

    /**
     * Sets the value of the batchAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchAssignment(String value) {
        this.batchAssignment = value;
    }

    /**
     * Gets the value of the isPartialShipment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartialShipment() {
        return isPartialShipment;
    }

    /**
     * Sets the value of the isPartialShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartialShipment(Boolean value) {
        this.isPartialShipment = value;
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
     * Gets the value of the laneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaneId() {
        return laneId;
    }

    /**
     * Sets the value of the laneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaneId(String value) {
        this.laneId = value;
    }

    /**
     * Gets the value of the partialApprovalCapable property.
     * 
     * @return
     *     possible object is
     *     {@link PartialApprovalSupportType }
     *     
     */
    public PartialApprovalSupportType getPartialApprovalCapable() {
        return partialApprovalCapable;
    }

    /**
     * Sets the value of the partialApprovalCapable property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialApprovalSupportType }
     *     
     */
    public void setPartialApprovalCapable(PartialApprovalSupportType value) {
        this.partialApprovalCapable = value;
    }

    /**
     * Gets the value of the scoreThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreThreshold() {
        return scoreThreshold;
    }

    /**
     * Sets the value of the scoreThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreThreshold(String value) {
        this.scoreThreshold = value;
    }

    /**
     * Gets the value of the isQuasiCash property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQuasiCash() {
        return isQuasiCash;
    }

    /**
     * Sets the value of the isQuasiCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQuasiCash(Boolean value) {
        this.isQuasiCash = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCode }
     *     
     */
    public TransactionCode getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCode }
     *     
     */
    public void setTransactionCode(TransactionCode value) {
        this.transactionCode = value;
    }

}
