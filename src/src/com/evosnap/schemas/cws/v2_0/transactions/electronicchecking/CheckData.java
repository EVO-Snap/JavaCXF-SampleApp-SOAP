
package com.evosnap.schemas.cws.v2_0.transactions.electronicchecking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Basic information about the check being processed. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CheckData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CheckCountryCode" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking}CheckCountryCode" minOccurs="0"/>
 *         &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerType" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking}OwnerType" minOccurs="0"/>
 *         &lt;element name="RoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseType" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking}UseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckData", propOrder = {
    "accountNumber",
    "checkCountryCode",
    "checkNumber",
    "ownerType",
    "routingNumber",
    "useType"
})
public class CheckData {

    @XmlElement(name = "AccountNumber", nillable = true)
    protected String accountNumber;
    @XmlElement(name = "CheckCountryCode")
    protected CheckCountryCode checkCountryCode;
    @XmlElement(name = "CheckNumber", nillable = true)
    protected String checkNumber;
    @XmlElement(name = "OwnerType")
    protected OwnerType ownerType;
    @XmlElement(name = "RoutingNumber", nillable = true)
    protected String routingNumber;
    @XmlElement(name = "UseType")
    protected UseType useType;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the checkCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CheckCountryCode }
     *     
     */
    public CheckCountryCode getCheckCountryCode() {
        return checkCountryCode;
    }

    /**
     * Sets the value of the checkCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckCountryCode }
     *     
     */
    public void setCheckCountryCode(CheckCountryCode value) {
        this.checkCountryCode = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerType }
     *     
     */
    public OwnerType getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerType }
     *     
     */
    public void setOwnerType(OwnerType value) {
        this.ownerType = value;
    }

    /**
     * Gets the value of the routingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the value of the routingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingNumber(String value) {
        this.routingNumber = value;
    }

    /**
     * Gets the value of the useType property.
     * 
     * @return
     *     possible object is
     *     {@link UseType }
     *     
     */
    public UseType getUseType() {
        return useType;
    }

    /**
     * Sets the value of the useType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseType }
     *     
     */
    public void setUseType(UseType value) {
        this.useType = value;
    }

}
