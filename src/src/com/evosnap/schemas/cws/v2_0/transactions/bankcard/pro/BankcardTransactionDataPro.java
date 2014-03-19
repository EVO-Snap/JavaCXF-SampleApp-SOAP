
package com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.PINlessDebitData;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.ArrayOfLineItemDetail;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardTransactionData;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.IIASData;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.Level2Data;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.ManagedBilling;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information about the Bankcard Pro transaction data. Conditional, required to support Level 2, Level 3, and Managed Billing transaction data. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BankcardTransactionDataPro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardTransactionDataPro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}BankcardTransactionData">
 *       &lt;sequence>
 *         &lt;element name="ManagedBilling" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}ManagedBilling" minOccurs="0"/>
 *         &lt;element name="Level2Data" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}Level2Data" minOccurs="0"/>
 *         &lt;element name="LineItemDetails" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}ArrayOfLineItemDetail" minOccurs="0"/>
 *         &lt;element name="PINlessDebitData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}PINlessDebitData" minOccurs="0"/>
 *         &lt;element name="IIASData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}IIASData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardTransactionDataPro", propOrder = {
    "managedBilling",
    "level2Data",
    "lineItemDetails",
    "piNlessDebitData",
    "iiasData"
})
public class BankcardTransactionDataPro
    extends BankcardTransactionData
{

    @XmlElement(name = "ManagedBilling", nillable = true)
    protected ManagedBilling managedBilling;
    @XmlElement(name = "Level2Data", nillable = true)
    protected Level2Data level2Data;
    @XmlElement(name = "LineItemDetails", nillable = true)
    protected ArrayOfLineItemDetail lineItemDetails;
    @XmlElement(name = "PINlessDebitData", nillable = true)
    protected PINlessDebitData piNlessDebitData;
    @XmlElement(name = "IIASData", nillable = true)
    protected IIASData iiasData;

    /**
     * Gets the value of the managedBilling property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedBilling }
     *     
     */
    public ManagedBilling getManagedBilling() {
        return managedBilling;
    }

    /**
     * Sets the value of the managedBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedBilling }
     *     
     */
    public void setManagedBilling(ManagedBilling value) {
        this.managedBilling = value;
    }

    /**
     * Gets the value of the level2Data property.
     * 
     * @return
     *     possible object is
     *     {@link Level2Data }
     *     
     */
    public Level2Data getLevel2Data() {
        return level2Data;
    }

    /**
     * Sets the value of the level2Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Level2Data }
     *     
     */
    public void setLevel2Data(Level2Data value) {
        this.level2Data = value;
    }

    /**
     * Gets the value of the lineItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLineItemDetail }
     *     
     */
    public ArrayOfLineItemDetail getLineItemDetails() {
        return lineItemDetails;
    }

    /**
     * Sets the value of the lineItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLineItemDetail }
     *     
     */
    public void setLineItemDetails(ArrayOfLineItemDetail value) {
        this.lineItemDetails = value;
    }

    /**
     * Gets the value of the piNlessDebitData property.
     * 
     * @return
     *     possible object is
     *     {@link PINlessDebitData }
     *     
     */
    public PINlessDebitData getPINlessDebitData() {
        return piNlessDebitData;
    }

    /**
     * Sets the value of the piNlessDebitData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINlessDebitData }
     *     
     */
    public void setPINlessDebitData(PINlessDebitData value) {
        this.piNlessDebitData = value;
    }

    /**
     * Gets the value of the iiasData property.
     * 
     * @return
     *     possible object is
     *     {@link IIASData }
     *     
     */
    public IIASData getIIASData() {
        return iiasData;
    }

    /**
     * Sets the value of the iiasData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IIASData }
     *     
     */
    public void setIIASData(IIASData value) {
        this.iiasData = value;
    }

}
