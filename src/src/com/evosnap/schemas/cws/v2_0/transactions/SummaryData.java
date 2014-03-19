
package com.evosnap.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Summary information for credit and debit totals. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SummaryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SummaryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CashBackTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}SummaryTotals" minOccurs="0"/>
 *         &lt;element name="CreditReturnTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}SummaryTotals" minOccurs="0"/>
 *         &lt;element name="CreditTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}SummaryTotals" minOccurs="0"/>
 *         &lt;element name="DebitReturnTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}SummaryTotals" minOccurs="0"/>
 *         &lt;element name="DebitTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}SummaryTotals" minOccurs="0"/>
 *         &lt;element name="NetTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}SummaryTotals" minOccurs="0"/>
 *         &lt;element name="VoidTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}SummaryTotals" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SummaryData", propOrder = {
    "cashBackTotals",
    "creditReturnTotals",
    "creditTotals",
    "debitReturnTotals",
    "debitTotals",
    "netTotals",
    "voidTotals"
})
public class SummaryData {

    @XmlElement(name = "CashBackTotals", nillable = true)
    protected SummaryTotals cashBackTotals;
    @XmlElement(name = "CreditReturnTotals", nillable = true)
    protected SummaryTotals creditReturnTotals;
    @XmlElement(name = "CreditTotals", nillable = true)
    protected SummaryTotals creditTotals;
    @XmlElement(name = "DebitReturnTotals", nillable = true)
    protected SummaryTotals debitReturnTotals;
    @XmlElement(name = "DebitTotals", nillable = true)
    protected SummaryTotals debitTotals;
    @XmlElement(name = "NetTotals", nillable = true)
    protected SummaryTotals netTotals;
    @XmlElement(name = "VoidTotals", nillable = true)
    protected SummaryTotals voidTotals;

    /**
     * Gets the value of the cashBackTotals property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryTotals }
     *     
     */
    public SummaryTotals getCashBackTotals() {
        return cashBackTotals;
    }

    /**
     * Sets the value of the cashBackTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryTotals }
     *     
     */
    public void setCashBackTotals(SummaryTotals value) {
        this.cashBackTotals = value;
    }

    /**
     * Gets the value of the creditReturnTotals property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryTotals }
     *     
     */
    public SummaryTotals getCreditReturnTotals() {
        return creditReturnTotals;
    }

    /**
     * Sets the value of the creditReturnTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryTotals }
     *     
     */
    public void setCreditReturnTotals(SummaryTotals value) {
        this.creditReturnTotals = value;
    }

    /**
     * Gets the value of the creditTotals property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryTotals }
     *     
     */
    public SummaryTotals getCreditTotals() {
        return creditTotals;
    }

    /**
     * Sets the value of the creditTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryTotals }
     *     
     */
    public void setCreditTotals(SummaryTotals value) {
        this.creditTotals = value;
    }

    /**
     * Gets the value of the debitReturnTotals property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryTotals }
     *     
     */
    public SummaryTotals getDebitReturnTotals() {
        return debitReturnTotals;
    }

    /**
     * Sets the value of the debitReturnTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryTotals }
     *     
     */
    public void setDebitReturnTotals(SummaryTotals value) {
        this.debitReturnTotals = value;
    }

    /**
     * Gets the value of the debitTotals property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryTotals }
     *     
     */
    public SummaryTotals getDebitTotals() {
        return debitTotals;
    }

    /**
     * Sets the value of the debitTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryTotals }
     *     
     */
    public void setDebitTotals(SummaryTotals value) {
        this.debitTotals = value;
    }

    /**
     * Gets the value of the netTotals property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryTotals }
     *     
     */
    public SummaryTotals getNetTotals() {
        return netTotals;
    }

    /**
     * Sets the value of the netTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryTotals }
     *     
     */
    public void setNetTotals(SummaryTotals value) {
        this.netTotals = value;
    }

    /**
     * Gets the value of the voidTotals property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryTotals }
     *     
     */
    public SummaryTotals getVoidTotals() {
        return voidTotals;
    }

    /**
     * Sets the value of the voidTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryTotals }
     *     
     */
    public void setVoidTotals(SummaryTotals value) {
        this.voidTotals = value;
    }

}
