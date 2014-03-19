
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.evosnap.schemas.cws.v2_0.transactions.CaptureState;
import com.evosnap.schemas.cws.v2_0.transactions.Status;
import com.evosnap.schemas.cws.v2_0.transactions.TransactionState;
import org.w3._2001.xmlschema.Adapter1;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:q10="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q11="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q12="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q13="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:q14="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q15="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:q16="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q17="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q18="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q19="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q2="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:q20="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q21="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q22="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q23="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q24="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q25="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q26="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q27="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q28="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q29="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q3="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q30="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q31="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q32="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q33="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q34="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q35="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q36="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q37="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q38="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q39="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q4="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q40="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q41="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q42="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q43="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q44="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q45="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q46="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q47="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q5="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q6="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q7="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q8="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q9="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:ser="http://schemas.microsoft.com/2003/10/Serialization/" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains detailed transaction data for a single transaction. Expected. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TransactionInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankcardData" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}BankcardData" minOccurs="0"/>
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaptureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CaptureState" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}CaptureState" minOccurs="0"/>
 *         &lt;element name="CaptureStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CapturedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ElectronicCheckData" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}ElectronicCheckData" minOccurs="0"/>
 *         &lt;element name="IsAcknowledged" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}BooleanParameter" minOccurs="0"/>
 *         &lt;element name="MaskedPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginatorTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Status" minOccurs="0"/>
 *         &lt;element name="StoredValueData" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}StoredValueData" minOccurs="0"/>
 *         &lt;element name="TransactionClassTypePair" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}TransactionClassTypePair" minOccurs="0"/>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionState" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}TransactionState" minOccurs="0"/>
 *         &lt;element name="TransactionStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInformation", propOrder = {
    "amount",
    "approvalCode",
    "bankcardData",
    "batchId",
    "captureDateTime",
    "captureState",
    "captureStatusMessage",
    "capturedAmount",
    "customerId",
    "electronicCheckData",
    "isAcknowledged",
    "maskedPAN",
    "merchantProfileId",
    "originatorTransactionId",
    "reference",
    "serviceId",
    "serviceKey",
    "serviceTransactionId",
    "status",
    "storedValueData",
    "transactionClassTypePair",
    "transactionId",
    "transactionState",
    "transactionStatusCode",
    "transactionTimestamp"
})
public class TransactionInformation {

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "ApprovalCode", nillable = true)
    protected String approvalCode;
    @XmlElement(name = "BankcardData", nillable = true)
    protected BankcardData bankcardData;
    @XmlElement(name = "BatchId", nillable = true)
    protected String batchId;
    @XmlElement(name = "CaptureDateTime", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar captureDateTime;
    @XmlElement(name = "CaptureState")
    protected CaptureState captureState;
    @XmlElement(name = "CaptureStatusMessage", nillable = true)
    protected String captureStatusMessage;
    @XmlElement(name = "CapturedAmount")
    protected BigDecimal capturedAmount;
    @XmlElement(name = "CustomerId", nillable = true)
    protected String customerId;
    @XmlElement(name = "ElectronicCheckData", nillable = true)
    protected ElectronicCheckData electronicCheckData;
    @XmlElement(name = "IsAcknowledged")
    protected BooleanParameter isAcknowledged;
    @XmlElement(name = "MaskedPAN", nillable = true)
    protected String maskedPAN;
    @XmlElement(name = "MerchantProfileId", nillable = true)
    protected String merchantProfileId;
    @XmlElement(name = "OriginatorTransactionId", nillable = true)
    protected String originatorTransactionId;
    @XmlElement(name = "Reference", nillable = true)
    protected String reference;
    @XmlElement(name = "ServiceId", nillable = true)
    protected String serviceId;
    @XmlElement(name = "ServiceKey", nillable = true)
    protected String serviceKey;
    @XmlElement(name = "ServiceTransactionId", nillable = true)
    protected String serviceTransactionId;
    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "StoredValueData", nillable = true)
    protected StoredValueData storedValueData;
    @XmlElement(name = "TransactionClassTypePair", nillable = true)
    protected TransactionClassTypePair transactionClassTypePair;
    @XmlElement(name = "TransactionId", nillable = true)
    protected String transactionId;
    @XmlElement(name = "TransactionState")
    protected TransactionState transactionState;
    @XmlElement(name = "TransactionStatusCode", nillable = true)
    protected String transactionStatusCode;
    @XmlElement(name = "TransactionTimestamp", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar transactionTimestamp;

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
     * Gets the value of the bankcardData property.
     * 
     * @return
     *     possible object is
     *     {@link BankcardData }
     *     
     */
    public BankcardData getBankcardData() {
        return bankcardData;
    }

    /**
     * Sets the value of the bankcardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankcardData }
     *     
     */
    public void setBankcardData(BankcardData value) {
        this.bankcardData = value;
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
     * Gets the value of the captureDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCaptureDateTime() {
        return captureDateTime;
    }

    /**
     * Sets the value of the captureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureDateTime(Calendar value) {
        this.captureDateTime = value;
    }

    /**
     * Gets the value of the captureState property.
     * 
     * @return
     *     possible object is
     *     {@link CaptureState }
     *     
     */
    public CaptureState getCaptureState() {
        return captureState;
    }

    /**
     * Sets the value of the captureState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaptureState }
     *     
     */
    public void setCaptureState(CaptureState value) {
        this.captureState = value;
    }

    /**
     * Gets the value of the captureStatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptureStatusMessage() {
        return captureStatusMessage;
    }

    /**
     * Sets the value of the captureStatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptureStatusMessage(String value) {
        this.captureStatusMessage = value;
    }

    /**
     * Gets the value of the capturedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapturedAmount() {
        return capturedAmount;
    }

    /**
     * Sets the value of the capturedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapturedAmount(BigDecimal value) {
        this.capturedAmount = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the electronicCheckData property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicCheckData }
     *     
     */
    public ElectronicCheckData getElectronicCheckData() {
        return electronicCheckData;
    }

    /**
     * Sets the value of the electronicCheckData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicCheckData }
     *     
     */
    public void setElectronicCheckData(ElectronicCheckData value) {
        this.electronicCheckData = value;
    }

    /**
     * Gets the value of the isAcknowledged property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanParameter }
     *     
     */
    public BooleanParameter getIsAcknowledged() {
        return isAcknowledged;
    }

    /**
     * Sets the value of the isAcknowledged property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanParameter }
     *     
     */
    public void setIsAcknowledged(BooleanParameter value) {
        this.isAcknowledged = value;
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
     * Gets the value of the merchantProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantProfileId() {
        return merchantProfileId;
    }

    /**
     * Sets the value of the merchantProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantProfileId(String value) {
        this.merchantProfileId = value;
    }

    /**
     * Gets the value of the originatorTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorTransactionId() {
        return originatorTransactionId;
    }

    /**
     * Sets the value of the originatorTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorTransactionId(String value) {
        this.originatorTransactionId = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the serviceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceKey() {
        return serviceKey;
    }

    /**
     * Sets the value of the serviceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceKey(String value) {
        this.serviceKey = value;
    }

    /**
     * Gets the value of the serviceTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTransactionId() {
        return serviceTransactionId;
    }

    /**
     * Sets the value of the serviceTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTransactionId(String value) {
        this.serviceTransactionId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the storedValueData property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueData }
     *     
     */
    public StoredValueData getStoredValueData() {
        return storedValueData;
    }

    /**
     * Sets the value of the storedValueData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueData }
     *     
     */
    public void setStoredValueData(StoredValueData value) {
        this.storedValueData = value;
    }

    /**
     * Gets the value of the transactionClassTypePair property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionClassTypePair }
     *     
     */
    public TransactionClassTypePair getTransactionClassTypePair() {
        return transactionClassTypePair;
    }

    /**
     * Sets the value of the transactionClassTypePair property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionClassTypePair }
     *     
     */
    public void setTransactionClassTypePair(TransactionClassTypePair value) {
        this.transactionClassTypePair = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionState property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionState }
     *     
     */
    public TransactionState getTransactionState() {
        return transactionState;
    }

    /**
     * Sets the value of the transactionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionState }
     *     
     */
    public void setTransactionState(TransactionState value) {
        this.transactionState = value;
    }

    /**
     * Gets the value of the transactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusCode() {
        return transactionStatusCode;
    }

    /**
     * Sets the value of the transactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatusCode(String value) {
        this.transactionStatusCode = value;
    }

    /**
     * Gets the value of the transactionTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTransactionTimestamp() {
        return transactionTimestamp;
    }

    /**
     * Sets the value of the transactionTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTimestamp(Calendar value) {
        this.transactionTimestamp = value;
    }

}
