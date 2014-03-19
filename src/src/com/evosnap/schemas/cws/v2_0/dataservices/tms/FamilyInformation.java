
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.TransactionState;
import com.microsoft.schemas._2003._10.serialization.Guid;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:q10="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q11="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q12="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q13="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:q14="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q15="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:q16="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q17="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q18="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q19="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q2="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:q20="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q21="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q22="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q23="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q24="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q25="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q26="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q27="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q28="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q29="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q3="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q30="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q31="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q32="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q33="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q34="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q35="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q36="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q37="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q38="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q39="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q4="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q40="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q41="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q42="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q43="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q44="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q45="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q46="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q47="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q5="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q6="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q7="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q8="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q9="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:ser="http://schemas.microsoft.com/2003/10/Serialization/" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains summary information for the family of transactions. Expected. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for FamilyInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="FamilySequenceCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FamilySequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FamilyState" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}TransactionState" minOccurs="0"/>
 *         &lt;element name="NetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyInformation", propOrder = {
    "familyId",
    "familySequenceCount",
    "familySequenceNumber",
    "familyState",
    "netAmount"
})
public class FamilyInformation {

    @XmlElement(name = "FamilyId")
    protected Guid familyId;
    @XmlElement(name = "FamilySequenceCount")
    protected Integer familySequenceCount;
    @XmlElement(name = "FamilySequenceNumber")
    protected Integer familySequenceNumber;
    @XmlElement(name = "FamilyState")
    protected TransactionState familyState;
    @XmlElement(name = "NetAmount")
    protected BigDecimal netAmount;

    /**
     * Gets the value of the familyId property.
     * 
     * @return
     *     possible object is
     *     {@link Guid }
     *     
     */
    public Guid getFamilyId() {
        return familyId;
    }

    /**
     * Sets the value of the familyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guid }
     *     
     */
    public void setFamilyId(Guid value) {
        this.familyId = value;
    }

    /**
     * Gets the value of the familySequenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFamilySequenceCount() {
        return familySequenceCount;
    }

    /**
     * Sets the value of the familySequenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFamilySequenceCount(Integer value) {
        this.familySequenceCount = value;
    }

    /**
     * Gets the value of the familySequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFamilySequenceNumber() {
        return familySequenceNumber;
    }

    /**
     * Sets the value of the familySequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFamilySequenceNumber(Integer value) {
        this.familySequenceNumber = value;
    }

    /**
     * Gets the value of the familyState property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionState }
     *     
     */
    public TransactionState getFamilyState() {
        return familyState;
    }

    /**
     * Sets the value of the familyState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionState }
     *     
     */
    public void setFamilyState(TransactionState value) {
        this.familyState = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
    }

}
