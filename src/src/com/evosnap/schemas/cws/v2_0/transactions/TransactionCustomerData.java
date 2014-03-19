
package com.evosnap.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.ElectronicCheckingCustomerData;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information about the customer. Conditional, required by some Service Providers. If this value is set on the transaction and not required by the Service Provider, the data will not be present on the transaction. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TransactionCustomerData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionCustomerData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}CustomerInfo" minOccurs="0"/>
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}CustomerInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCustomerData", propOrder = {
    "billingData",
    "customerId",
    "customerTaxId",
    "shippingData"
})
@XmlSeeAlso({
    ElectronicCheckingCustomerData.class
})
public class TransactionCustomerData {

    @XmlElement(name = "BillingData", nillable = true)
    protected CustomerInfo billingData;
    @XmlElement(name = "CustomerId", nillable = true)
    protected String customerId;
    @XmlElement(name = "CustomerTaxId", nillable = true)
    protected String customerTaxId;
    @XmlElement(name = "ShippingData", nillable = true)
    protected CustomerInfo shippingData;

    /**
     * Gets the value of the billingData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo }
     *     
     */
    public CustomerInfo getBillingData() {
        return billingData;
    }

    /**
     * Sets the value of the billingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo }
     *     
     */
    public void setBillingData(CustomerInfo value) {
        this.billingData = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTaxId() {
        return customerTaxId;
    }

    /**
     * Sets the value of the customerTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTaxId(String value) {
        this.customerTaxId = value;
    }

    /**
     * Gets the value of the shippingData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo }
     *     
     */
    public CustomerInfo getShippingData() {
        return shippingData;
    }

    /**
     * Sets the value of the shippingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo }
     *     
     */
    public void setShippingData(CustomerInfo value) {
        this.shippingData = value;
    }

}
