
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information sent with all Bankcard transactions. May be overridden on each transaction, as necessary. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BankcardTransactionDataDefaults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardTransactionDataDefaults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyCode" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}TypeISOCurrencyCodeA3" minOccurs="0"/>
 *         &lt;element name="CustomerPresent" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}CustomerPresent" minOccurs="0"/>
 *         &lt;element name="EntryMode" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}EntryMode" minOccurs="0"/>
 *         &lt;element name="RequestACI" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}RequestACI" minOccurs="0"/>
 *         &lt;element name="RequestAdvice" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}RequestAdvice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardTransactionDataDefaults", propOrder = {
    "currencyCode",
    "customerPresent",
    "entryMode",
    "requestACI",
    "requestAdvice"
})
public class BankcardTransactionDataDefaults {

    @XmlElement(name = "CurrencyCode")
    protected TypeISOCurrencyCodeA3 currencyCode;
    @XmlElement(name = "CustomerPresent")
    protected CustomerPresent customerPresent;
    @XmlElement(name = "EntryMode")
    protected EntryMode entryMode;
    @XmlElement(name = "RequestACI")
    protected RequestACI requestACI;
    @XmlElement(name = "RequestAdvice")
    protected RequestAdvice requestAdvice;

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link TypeISOCurrencyCodeA3 }
     *     
     */
    public TypeISOCurrencyCodeA3 getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeISOCurrencyCodeA3 }
     *     
     */
    public void setCurrencyCode(TypeISOCurrencyCodeA3 value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the customerPresent property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPresent }
     *     
     */
    public CustomerPresent getCustomerPresent() {
        return customerPresent;
    }

    /**
     * Sets the value of the customerPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPresent }
     *     
     */
    public void setCustomerPresent(CustomerPresent value) {
        this.customerPresent = value;
    }

    /**
     * Gets the value of the entryMode property.
     * 
     * @return
     *     possible object is
     *     {@link EntryMode }
     *     
     */
    public EntryMode getEntryMode() {
        return entryMode;
    }

    /**
     * Sets the value of the entryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryMode }
     *     
     */
    public void setEntryMode(EntryMode value) {
        this.entryMode = value;
    }

    /**
     * Gets the value of the requestACI property.
     * 
     * @return
     *     possible object is
     *     {@link RequestACI }
     *     
     */
    public RequestACI getRequestACI() {
        return requestACI;
    }

    /**
     * Sets the value of the requestACI property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestACI }
     *     
     */
    public void setRequestACI(RequestACI value) {
        this.requestACI = value;
    }

    /**
     * Gets the value of the requestAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link RequestAdvice }
     *     
     */
    public RequestAdvice getRequestAdvice() {
        return requestAdvice;
    }

    /**
     * Sets the value of the requestAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestAdvice }
     *     
     */
    public void setRequestAdvice(RequestAdvice value) {
        this.requestAdvice = value;
    }

}
