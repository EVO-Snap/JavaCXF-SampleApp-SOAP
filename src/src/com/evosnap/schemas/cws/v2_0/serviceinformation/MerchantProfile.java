
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains data specific to a merchant and the service(s) for which the merchant profile will be saved. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for MerchantProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MerchantData" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}MerchantProfileMerchantData" minOccurs="0"/>
 *         &lt;element name="TransactionData" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}MerchantProfileTransactionData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantProfile", propOrder = {
    "profileId",
    "serviceId",
    "serviceName",
    "lastUpdated",
    "merchantData",
    "transactionData"
})
public class MerchantProfile {

    @XmlElement(name = "ProfileId", nillable = true)
    protected String profileId;
    @XmlElement(name = "ServiceId", nillable = true)
    protected String serviceId;
    @XmlElement(name = "ServiceName", nillable = true)
    protected String serviceName;
    @XmlElement(name = "LastUpdated", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar lastUpdated;
    @XmlElement(name = "MerchantData", nillable = true)
    protected MerchantProfileMerchantData merchantData;
    @XmlElement(name = "TransactionData", nillable = true)
    protected MerchantProfileTransactionData transactionData;

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdated(Calendar value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the merchantData property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantProfileMerchantData }
     *     
     */
    public MerchantProfileMerchantData getMerchantData() {
        return merchantData;
    }

    /**
     * Sets the value of the merchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantProfileMerchantData }
     *     
     */
    public void setMerchantData(MerchantProfileMerchantData value) {
        this.merchantData = value;
    }

    /**
     * Gets the value of the transactionData property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantProfileTransactionData }
     *     
     */
    public MerchantProfileTransactionData getTransactionData() {
        return transactionData;
    }

    /**
     * Sets the value of the transactionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantProfileTransactionData }
     *     
     */
    public void setTransactionData(MerchantProfileTransactionData value) {
        this.transactionData = value;
    }

}
