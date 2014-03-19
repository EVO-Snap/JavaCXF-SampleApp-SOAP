
package com.evosnap.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Collection of transaction details related to PINless Debit cards. Conditional, optional when processing a recurring or installment MOTO or Ecommerce transaction with a PIN Debit card without entering a PIN. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for PINlessDebitData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PINlessDebitData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillPayServiceData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}BillPayServiceData" minOccurs="0"/>
 *         &lt;element name="PayeeData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}PayeeData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PINlessDebitData", propOrder = {
    "billPayServiceData",
    "payeeData"
})
public class PINlessDebitData {

    @XmlElement(name = "BillPayServiceData", nillable = true)
    protected BillPayServiceData billPayServiceData;
    @XmlElement(name = "PayeeData", nillable = true)
    protected PayeeData payeeData;

    /**
     * Gets the value of the billPayServiceData property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayServiceData }
     *     
     */
    public BillPayServiceData getBillPayServiceData() {
        return billPayServiceData;
    }

    /**
     * Sets the value of the billPayServiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayServiceData }
     *     
     */
    public void setBillPayServiceData(BillPayServiceData value) {
        this.billPayServiceData = value;
    }

    /**
     * Gets the value of the payeeData property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeData }
     *     
     */
    public PayeeData getPayeeData() {
        return payeeData;
    }

    /**
     * Sets the value of the payeeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeData }
     *     
     */
    public void setPayeeData(PayeeData value) {
        this.payeeData = value;
    }

}
