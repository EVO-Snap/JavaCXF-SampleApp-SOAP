
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information specific to the merchant. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for MerchantProfileMerchantData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantProfileMerchantData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerServiceInternet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerServicePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}TypeISOLanguageCodeA3" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}AddressInfo" minOccurs="0"/>
 *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankcardMerchantData" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}BankcardMerchantData" minOccurs="0"/>
 *         &lt;element name="ElectronicCheckingMerchantData" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}ElectronicCheckingMerchantData" minOccurs="0"/>
 *         &lt;element name="StoredValueMerchantData" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}StoredValueMerchantData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantProfileMerchantData", propOrder = {
    "customerServiceInternet",
    "customerServicePhone",
    "language",
    "address",
    "merchantId",
    "name",
    "phone",
    "taxId",
    "bankcardMerchantData",
    "electronicCheckingMerchantData",
    "storedValueMerchantData"
})
public class MerchantProfileMerchantData {

    @XmlElement(name = "CustomerServiceInternet", nillable = true)
    protected String customerServiceInternet;
    @XmlElement(name = "CustomerServicePhone", nillable = true)
    protected String customerServicePhone;
    @XmlElement(name = "Language")
    protected TypeISOLanguageCodeA3 language;
    @XmlElement(name = "Address", nillable = true)
    protected AddressInfo address;
    @XmlElement(name = "MerchantId", nillable = true)
    protected String merchantId;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Phone", nillable = true)
    protected String phone;
    @XmlElement(name = "TaxId", nillable = true)
    protected String taxId;
    @XmlElement(name = "BankcardMerchantData", nillable = true)
    protected BankcardMerchantData bankcardMerchantData;
    @XmlElement(name = "ElectronicCheckingMerchantData", nillable = true)
    protected ElectronicCheckingMerchantData electronicCheckingMerchantData;
    @XmlElement(name = "StoredValueMerchantData", nillable = true)
    protected StoredValueMerchantData storedValueMerchantData;

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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link TypeISOLanguageCodeA3 }
     *     
     */
    public TypeISOLanguageCodeA3 getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeISOLanguageCodeA3 }
     *     
     */
    public void setLanguage(TypeISOLanguageCodeA3 value) {
        this.language = value;
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

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxId(String value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the bankcardMerchantData property.
     * 
     * @return
     *     possible object is
     *     {@link BankcardMerchantData }
     *     
     */
    public BankcardMerchantData getBankcardMerchantData() {
        return bankcardMerchantData;
    }

    /**
     * Sets the value of the bankcardMerchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankcardMerchantData }
     *     
     */
    public void setBankcardMerchantData(BankcardMerchantData value) {
        this.bankcardMerchantData = value;
    }

    /**
     * Gets the value of the electronicCheckingMerchantData property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicCheckingMerchantData }
     *     
     */
    public ElectronicCheckingMerchantData getElectronicCheckingMerchantData() {
        return electronicCheckingMerchantData;
    }

    /**
     * Sets the value of the electronicCheckingMerchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicCheckingMerchantData }
     *     
     */
    public void setElectronicCheckingMerchantData(ElectronicCheckingMerchantData value) {
        this.electronicCheckingMerchantData = value;
    }

    /**
     * Gets the value of the storedValueMerchantData property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueMerchantData }
     *     
     */
    public StoredValueMerchantData getStoredValueMerchantData() {
        return storedValueMerchantData;
    }

    /**
     * Sets the value of the storedValueMerchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueMerchantData }
     *     
     */
    public void setStoredValueMerchantData(StoredValueMerchantData value) {
        this.storedValueMerchantData = value;
    }

}
