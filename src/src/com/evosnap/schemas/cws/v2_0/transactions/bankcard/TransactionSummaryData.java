
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Summary information (item count and total amount) when transactions are captured. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TransactionSummaryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionSummaryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CashBackTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}Totals" minOccurs="0"/>
 *         &lt;element name="NetTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}Totals" minOccurs="0"/>
 *         &lt;element name="ReturnTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}Totals" minOccurs="0"/>
 *         &lt;element name="SaleTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}Totals" minOccurs="0"/>
 *         &lt;element name="VoidTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}Totals" minOccurs="0"/>
 *         &lt;element name="PINDebitReturnTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}Totals" minOccurs="0"/>
 *         &lt;element name="PINDebitSaleTotals" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}Totals" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSummaryData", propOrder = {
    "cashBackTotals",
    "netTotals",
    "returnTotals",
    "saleTotals",
    "voidTotals",
    "pinDebitReturnTotals",
    "pinDebitSaleTotals"
})
public class TransactionSummaryData {

    @XmlElement(name = "CashBackTotals", nillable = true)
    protected Totals cashBackTotals;
    @XmlElement(name = "NetTotals", nillable = true)
    protected Totals netTotals;
    @XmlElement(name = "ReturnTotals", nillable = true)
    protected Totals returnTotals;
    @XmlElement(name = "SaleTotals", nillable = true)
    protected Totals saleTotals;
    @XmlElement(name = "VoidTotals", nillable = true)
    protected Totals voidTotals;
    @XmlElement(name = "PINDebitReturnTotals", nillable = true)
    protected Totals pinDebitReturnTotals;
    @XmlElement(name = "PINDebitSaleTotals", nillable = true)
    protected Totals pinDebitSaleTotals;

    /**
     * Gets the value of the cashBackTotals property.
     * 
     * @return
     *     possible object is
     *     {@link Totals }
     *     
     */
    public Totals getCashBackTotals() {
        return cashBackTotals;
    }

    /**
     * Sets the value of the cashBackTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Totals }
     *     
     */
    public void setCashBackTotals(Totals value) {
        this.cashBackTotals = value;
    }

    /**
     * Gets the value of the netTotals property.
     * 
     * @return
     *     possible object is
     *     {@link Totals }
     *     
     */
    public Totals getNetTotals() {
        return netTotals;
    }

    /**
     * Sets the value of the netTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Totals }
     *     
     */
    public void setNetTotals(Totals value) {
        this.netTotals = value;
    }

    /**
     * Gets the value of the returnTotals property.
     * 
     * @return
     *     possible object is
     *     {@link Totals }
     *     
     */
    public Totals getReturnTotals() {
        return returnTotals;
    }

    /**
     * Sets the value of the returnTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Totals }
     *     
     */
    public void setReturnTotals(Totals value) {
        this.returnTotals = value;
    }

    /**
     * Gets the value of the saleTotals property.
     * 
     * @return
     *     possible object is
     *     {@link Totals }
     *     
     */
    public Totals getSaleTotals() {
        return saleTotals;
    }

    /**
     * Sets the value of the saleTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Totals }
     *     
     */
    public void setSaleTotals(Totals value) {
        this.saleTotals = value;
    }

    /**
     * Gets the value of the voidTotals property.
     * 
     * @return
     *     possible object is
     *     {@link Totals }
     *     
     */
    public Totals getVoidTotals() {
        return voidTotals;
    }

    /**
     * Sets the value of the voidTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Totals }
     *     
     */
    public void setVoidTotals(Totals value) {
        this.voidTotals = value;
    }

    /**
     * Gets the value of the pinDebitReturnTotals property.
     * 
     * @return
     *     possible object is
     *     {@link Totals }
     *     
     */
    public Totals getPINDebitReturnTotals() {
        return pinDebitReturnTotals;
    }

    /**
     * Sets the value of the pinDebitReturnTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Totals }
     *     
     */
    public void setPINDebitReturnTotals(Totals value) {
        this.pinDebitReturnTotals = value;
    }

    /**
     * Gets the value of the pinDebitSaleTotals property.
     * 
     * @return
     *     possible object is
     *     {@link Totals }
     *     
     */
    public Totals getPINDebitSaleTotals() {
        return pinDebitSaleTotals;
    }

    /**
     * Sets the value of the pinDebitSaleTotals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Totals }
     *     
     */
    public void setPINDebitSaleTotals(Totals value) {
        this.pinDebitSaleTotals = value;
    }

}
