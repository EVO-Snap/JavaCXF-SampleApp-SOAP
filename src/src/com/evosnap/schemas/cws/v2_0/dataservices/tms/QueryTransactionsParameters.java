
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.dataservices.DateRange;
import com.evosnap.schemas.cws.v2_0.transactions.ArrayOfCaptureState;
import com.evosnap.schemas.cws.v2_0.transactions.ArrayOfTransactionState;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.ArrayOfTypeCardType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdecimal;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:q10="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q11="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q12="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q13="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:q14="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q15="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:q16="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q17="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q18="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q19="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q2="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:q20="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q21="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q22="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q23="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q24="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q25="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q26="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q27="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q28="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q29="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q3="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q30="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q31="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q32="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q33="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q34="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q35="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q36="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q37="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q38="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q39="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q4="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q40="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q41="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q42="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q43="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q44="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q45="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q46="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q47="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q5="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q6="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q7="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q8="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q9="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:ser="http://schemas.microsoft.com/2003/10/Serialization/" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Provides parameters used to filter a transaction query. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for QueryTransactionsParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryTransactionsParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amounts" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfdecimal" minOccurs="0"/>
 *         &lt;element name="ApprovalCodes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="BatchIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="CaptureDateRange" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices}DateRange" minOccurs="0"/>
 *         &lt;element name="CaptureStates" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}ArrayOfCaptureState" minOccurs="0"/>
 *         &lt;element name="CardTypes" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}ArrayOfTypeCardType" minOccurs="0"/>
 *         &lt;element name="IsAcknowledged" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}BooleanParameter" minOccurs="0"/>
 *         &lt;element name="MerchantProfileIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="OrderNumbers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="QueryType" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}QueryType" minOccurs="0"/>
 *         &lt;element name="ServiceIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ServiceKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="TransactionClassTypePairs" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}ArrayOfTransactionClassTypePair" minOccurs="0"/>
 *         &lt;element name="TransactionDateRange" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices}DateRange" minOccurs="0"/>
 *         &lt;element name="TransactionIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="TransactionStates" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}ArrayOfTransactionState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryTransactionsParameters", propOrder = {
    "amounts",
    "approvalCodes",
    "batchIds",
    "captureDateRange",
    "captureStates",
    "cardTypes",
    "isAcknowledged",
    "merchantProfileIds",
    "orderNumbers",
    "queryType",
    "serviceIds",
    "serviceKeys",
    "transactionClassTypePairs",
    "transactionDateRange",
    "transactionIds",
    "transactionStates"
})
public class QueryTransactionsParameters {

    @XmlElement(name = "Amounts", nillable = true)
    protected ArrayOfdecimal amounts;
    @XmlElement(name = "ApprovalCodes", nillable = true)
    protected ArrayOfstring approvalCodes;
    @XmlElement(name = "BatchIds", nillable = true)
    protected ArrayOfstring batchIds;
    @XmlElement(name = "CaptureDateRange", nillable = true)
    protected DateRange captureDateRange;
    @XmlElement(name = "CaptureStates", nillable = true)
    protected ArrayOfCaptureState captureStates;
    @XmlElement(name = "CardTypes", nillable = true)
    protected ArrayOfTypeCardType cardTypes;
    @XmlElement(name = "IsAcknowledged")
    protected BooleanParameter isAcknowledged;
    @XmlElement(name = "MerchantProfileIds", nillable = true)
    protected ArrayOfstring merchantProfileIds;
    @XmlElement(name = "OrderNumbers", nillable = true)
    protected ArrayOfstring orderNumbers;
    @XmlElement(name = "QueryType")
    protected QueryType queryType;
    @XmlElement(name = "ServiceIds", nillable = true)
    protected ArrayOfstring serviceIds;
    @XmlElement(name = "ServiceKeys", nillable = true)
    protected ArrayOfstring serviceKeys;
    @XmlElement(name = "TransactionClassTypePairs", nillable = true)
    protected ArrayOfTransactionClassTypePair transactionClassTypePairs;
    @XmlElement(name = "TransactionDateRange", nillable = true)
    protected DateRange transactionDateRange;
    @XmlElement(name = "TransactionIds", nillable = true)
    protected ArrayOfstring transactionIds;
    @XmlElement(name = "TransactionStates", nillable = true)
    protected ArrayOfTransactionState transactionStates;

    /**
     * Gets the value of the amounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfdecimal }
     *     
     */
    public ArrayOfdecimal getAmounts() {
        return amounts;
    }

    /**
     * Sets the value of the amounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfdecimal }
     *     
     */
    public void setAmounts(ArrayOfdecimal value) {
        this.amounts = value;
    }

    /**
     * Gets the value of the approvalCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getApprovalCodes() {
        return approvalCodes;
    }

    /**
     * Sets the value of the approvalCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setApprovalCodes(ArrayOfstring value) {
        this.approvalCodes = value;
    }

    /**
     * Gets the value of the batchIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getBatchIds() {
        return batchIds;
    }

    /**
     * Sets the value of the batchIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setBatchIds(ArrayOfstring value) {
        this.batchIds = value;
    }

    /**
     * Gets the value of the captureDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getCaptureDateRange() {
        return captureDateRange;
    }

    /**
     * Sets the value of the captureDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setCaptureDateRange(DateRange value) {
        this.captureDateRange = value;
    }

    /**
     * Gets the value of the captureStates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCaptureState }
     *     
     */
    public ArrayOfCaptureState getCaptureStates() {
        return captureStates;
    }

    /**
     * Sets the value of the captureStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCaptureState }
     *     
     */
    public void setCaptureStates(ArrayOfCaptureState value) {
        this.captureStates = value;
    }

    /**
     * Gets the value of the cardTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTypeCardType }
     *     
     */
    public ArrayOfTypeCardType getCardTypes() {
        return cardTypes;
    }

    /**
     * Sets the value of the cardTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTypeCardType }
     *     
     */
    public void setCardTypes(ArrayOfTypeCardType value) {
        this.cardTypes = value;
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
     * Gets the value of the merchantProfileIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getMerchantProfileIds() {
        return merchantProfileIds;
    }

    /**
     * Sets the value of the merchantProfileIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setMerchantProfileIds(ArrayOfstring value) {
        this.merchantProfileIds = value;
    }

    /**
     * Gets the value of the orderNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getOrderNumbers() {
        return orderNumbers;
    }

    /**
     * Sets the value of the orderNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setOrderNumbers(ArrayOfstring value) {
        this.orderNumbers = value;
    }

    /**
     * Gets the value of the queryType property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQueryType() {
        return queryType;
    }

    /**
     * Sets the value of the queryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQueryType(QueryType value) {
        this.queryType = value;
    }

    /**
     * Gets the value of the serviceIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getServiceIds() {
        return serviceIds;
    }

    /**
     * Sets the value of the serviceIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setServiceIds(ArrayOfstring value) {
        this.serviceIds = value;
    }

    /**
     * Gets the value of the serviceKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getServiceKeys() {
        return serviceKeys;
    }

    /**
     * Sets the value of the serviceKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setServiceKeys(ArrayOfstring value) {
        this.serviceKeys = value;
    }

    /**
     * Gets the value of the transactionClassTypePairs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransactionClassTypePair }
     *     
     */
    public ArrayOfTransactionClassTypePair getTransactionClassTypePairs() {
        return transactionClassTypePairs;
    }

    /**
     * Sets the value of the transactionClassTypePairs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransactionClassTypePair }
     *     
     */
    public void setTransactionClassTypePairs(ArrayOfTransactionClassTypePair value) {
        this.transactionClassTypePairs = value;
    }

    /**
     * Gets the value of the transactionDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getTransactionDateRange() {
        return transactionDateRange;
    }

    /**
     * Sets the value of the transactionDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setTransactionDateRange(DateRange value) {
        this.transactionDateRange = value;
    }

    /**
     * Gets the value of the transactionIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getTransactionIds() {
        return transactionIds;
    }

    /**
     * Sets the value of the transactionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setTransactionIds(ArrayOfstring value) {
        this.transactionIds = value;
    }

    /**
     * Gets the value of the transactionStates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransactionState }
     *     
     */
    public ArrayOfTransactionState getTransactionStates() {
        return transactionStates;
    }

    /**
     * Sets the value of the transactionStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransactionState }
     *     
     */
    public void setTransactionStates(ArrayOfTransactionState value) {
        this.transactionStates = value;
    }

}
