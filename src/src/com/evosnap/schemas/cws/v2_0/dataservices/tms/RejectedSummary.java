
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:q10="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q11="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q12="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q13="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:q14="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q15="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:q16="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q17="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q18="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q19="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q2="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:q20="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q21="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q22="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q23="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q24="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q25="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q26="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q27="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q28="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q29="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q3="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q30="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q31="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q32="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q33="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q34="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q35="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q36="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q37="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q38="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q39="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q4="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q40="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q41="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q42="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q43="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q44="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q45="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q46="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q47="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q5="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q6="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q7="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q8="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q9="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:ser="http://schemas.microsoft.com/2003/10/Serialization/" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Summary information about the rejected transactions. Expected. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for RejectedSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RejectedSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditTransactionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreditTransactionTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebitTransactionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DebitTransactionTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectedSummary", propOrder = {
    "creditTransactionCount",
    "creditTransactionTotal",
    "debitTransactionCount",
    "debitTransactionTotal"
})
public class RejectedSummary {

    @XmlElement(name = "CreditTransactionCount")
    protected Integer creditTransactionCount;
    @XmlElement(name = "CreditTransactionTotal")
    protected BigDecimal creditTransactionTotal;
    @XmlElement(name = "DebitTransactionCount")
    protected Integer debitTransactionCount;
    @XmlElement(name = "DebitTransactionTotal")
    protected BigDecimal debitTransactionTotal;

    /**
     * Gets the value of the creditTransactionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditTransactionCount() {
        return creditTransactionCount;
    }

    /**
     * Sets the value of the creditTransactionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditTransactionCount(Integer value) {
        this.creditTransactionCount = value;
    }

    /**
     * Gets the value of the creditTransactionTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditTransactionTotal() {
        return creditTransactionTotal;
    }

    /**
     * Sets the value of the creditTransactionTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditTransactionTotal(BigDecimal value) {
        this.creditTransactionTotal = value;
    }

    /**
     * Gets the value of the debitTransactionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDebitTransactionCount() {
        return debitTransactionCount;
    }

    /**
     * Sets the value of the debitTransactionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDebitTransactionCount(Integer value) {
        this.debitTransactionCount = value;
    }

    /**
     * Gets the value of the debitTransactionTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitTransactionTotal() {
        return debitTransactionTotal;
    }

    /**
     * Sets the value of the debitTransactionTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitTransactionTotal(BigDecimal value) {
        this.debitTransactionTotal = value;
    }

}
