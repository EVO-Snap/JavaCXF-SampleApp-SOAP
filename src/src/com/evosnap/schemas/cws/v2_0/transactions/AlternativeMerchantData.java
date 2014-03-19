
package com.evosnap.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Specifies alternative merchant data that appears on accountholder statements. Subject to Issuer discretion. Conditional, optional when supported by service. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AlternativeMerchantData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternativeMerchantData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerServiceInternet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerServicePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}AddressInfo" minOccurs="0"/>
 *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeMerchantData", propOrder = {
    "customerServiceInternet",
    "customerServicePhone",
    "description",
    "sic",
    "address",
    "merchantId",
    "name"
})
public class AlternativeMerchantData {

    @XmlElement(name = "CustomerServiceInternet", nillable = true)
    protected String customerServiceInternet;
    @XmlElement(name = "CustomerServicePhone", nillable = true)
    protected String customerServicePhone;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "SIC", nillable = true)
    protected String sic;
    @XmlElement(name = "Address", nillable = true)
    protected AddressInfo address;
    @XmlElement(name = "MerchantId", nillable = true)
    protected String merchantId;
    @XmlElement(name = "Name", nillable = true)
    protected String name;

    /**
     * Gets the value of the customerServiceInternet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServiceInternet() {
        return customerServiceInternet;
    }

    /**
     * Sets the value of the customerServiceInternet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServiceInternet(String value) {
        this.customerServiceInternet = value;
    }

    /**
     * Gets the value of the customerServicePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerServicePhone() {
        return customerServicePhone;
    }

    /**
     * Sets the value of the customerServicePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerServicePhone(String value) {
        this.customerServicePhone = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the sic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIC() {
        return sic;
    }

    /**
     * Sets the value of the sic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIC(String value) {
        this.sic = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfo }
     *     
     */
    public AddressInfo getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfo }
     *     
     */
    public void setAddress(AddressInfo value) {
        this.address = value;
    }

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantId(String value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
