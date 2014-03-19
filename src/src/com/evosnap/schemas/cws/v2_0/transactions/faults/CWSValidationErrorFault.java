
package com.evosnap.schemas.cws.v2_0.transactions.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains the details of the CWSValidationResultFault. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CWSValidationErrorFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CWSValidationErrorFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorType" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults}CWSValidationErrorFault.EErrorType" minOccurs="0"/>
 *         &lt;element name="RuleKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RuleLocationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RuleMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CWSValidationErrorFault", propOrder = {
    "errorType",
    "ruleKey",
    "ruleLocationKey",
    "ruleMessage",
    "transactionId"
})
public class CWSValidationErrorFault {

    @XmlElement(name = "ErrorType")
    protected CWSValidationErrorFaultEErrorType errorType;
    @XmlElement(name = "RuleKey", nillable = true)
    protected String ruleKey;
    @XmlElement(name = "RuleLocationKey", nillable = true)
    protected String ruleLocationKey;
    @XmlElement(name = "RuleMessage", nillable = true)
    protected String ruleMessage;
    @XmlElement(name = "TransactionId", nillable = true)
    protected String transactionId;

    /**
     * Gets the value of the errorType property.
     * 
     * @return
     *     possible object is
     *     {@link CWSValidationErrorFaultEErrorType }
     *     
     */
    public CWSValidationErrorFaultEErrorType getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CWSValidationErrorFaultEErrorType }
     *     
     */
    public void setErrorType(CWSValidationErrorFaultEErrorType value) {
        this.errorType = value;
    }

    /**
     * Gets the value of the ruleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleKey() {
        return ruleKey;
    }

    /**
     * Sets the value of the ruleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleKey(String value) {
        this.ruleKey = value;
    }

    /**
     * Gets the value of the ruleLocationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleLocationKey() {
        return ruleLocationKey;
    }

    /**
     * Sets the value of the ruleLocationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleLocationKey(String value) {
        this.ruleLocationKey = value;
    }

    /**
     * Gets the value of the ruleMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleMessage() {
        return ruleMessage;
    }

    /**
     * Sets the value of the ruleMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleMessage(String value) {
        this.ruleMessage = value;
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

}
