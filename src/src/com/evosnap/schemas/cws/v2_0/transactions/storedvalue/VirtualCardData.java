
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Aggregate used to submit account number length and BIN number for virtual card activation. Conditional, for virtual card activation when TxnCode = 'Issue_Account'. At least one of CardData, VirtualCardData, CardDataToken or SecureCardData must be provided. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for VirtualCardData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VirtualCardData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountNumberLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCardData", propOrder = {
    "accountNumberLength",
    "bin"
})
public class VirtualCardData {

    @XmlElement(name = "AccountNumberLength")
    protected Integer accountNumberLength;
    @XmlElement(name = "BIN", nillable = true)
    protected String bin;

    /**
     * Gets the value of the accountNumberLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountNumberLength() {
        return accountNumberLength;
    }

    /**
     * Sets the value of the accountNumberLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountNumberLength(Integer value) {
        this.accountNumberLength = value;
    }

    /**
     * Gets the value of the bin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIN() {
        return bin;
    }

    /**
     * Sets the value of the bin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIN(String value) {
        this.bin = value;
    }

}
