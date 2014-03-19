
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information returned to the application with details about the Bankcard service(s) for which it is configured. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BankcardService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternativeMerchantData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoBatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AVSData" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}BankcardServiceAVSData" minOccurs="0"/>
 *         &lt;element name="CutoffTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EncryptionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ManagedBilling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumBatchItems" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaximumLineItems" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MultiplePartialCapture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Operations" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}Operations" minOccurs="0"/>
 *         &lt;element name="PurchaseCardLevel" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}PurchaseCardLevel" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tenders" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}Tenders" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardService", propOrder = {
    "alternativeMerchantData",
    "autoBatch",
    "avsData",
    "cutoffTime",
    "encryptionKey",
    "managedBilling",
    "maximumBatchItems",
    "maximumLineItems",
    "multiplePartialCapture",
    "operations",
    "purchaseCardLevel",
    "serviceId",
    "serviceName",
    "tenders"
})
public class BankcardService {

    @XmlElement(name = "AlternativeMerchantData")
    protected Boolean alternativeMerchantData;
    @XmlElement(name = "AutoBatch")
    protected Boolean autoBatch;
    @XmlElement(name = "AVSData", nillable = true)
    protected BankcardServiceAVSData avsData;
    @XmlElement(name = "CutoffTime", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar cutoffTime;
    @XmlElement(name = "EncryptionKey", nillable = true)
    protected String encryptionKey;
    @XmlElement(name = "ManagedBilling")
    protected Boolean managedBilling;
    @XmlElement(name = "MaximumBatchItems")
    protected Long maximumBatchItems;
    @XmlElement(name = "MaximumLineItems")
    protected Long maximumLineItems;
    @XmlElement(name = "MultiplePartialCapture")
    protected Boolean multiplePartialCapture;
    @XmlElement(name = "Operations", nillable = true)
    protected Operations operations;
    @XmlElement(name = "PurchaseCardLevel")
    protected PurchaseCardLevel purchaseCardLevel;
    @XmlElement(name = "ServiceId", nillable = true)
    protected String serviceId;
    @XmlElement(name = "ServiceName", nillable = true)
    protected String serviceName;
    @XmlElement(name = "Tenders", nillable = true)
    protected Tenders tenders;

    /**
     * Gets the value of the alternativeMerchantData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternativeMerchantData() {
        return alternativeMerchantData;
    }

    /**
     * Sets the value of the alternativeMerchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternativeMerchantData(Boolean value) {
        this.alternativeMerchantData = value;
    }

    /**
     * Gets the value of the autoBatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoBatch() {
        return autoBatch;
    }

    /**
     * Sets the value of the autoBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoBatch(Boolean value) {
        this.autoBatch = value;
    }

    /**
     * Gets the value of the avsData property.
     * 
     * @return
     *     possible object is
     *     {@link BankcardServiceAVSData }
     *     
     */
    public BankcardServiceAVSData getAVSData() {
        return avsData;
    }

    /**
     * Sets the value of the avsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankcardServiceAVSData }
     *     
     */
    public void setAVSData(BankcardServiceAVSData value) {
        this.avsData = value;
    }

    /**
     * Gets the value of the cutoffTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCutoffTime() {
        return cutoffTime;
    }

    /**
     * Sets the value of the cutoffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutoffTime(Calendar value) {
        this.cutoffTime = value;
    }

    /**
     * Gets the value of the encryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Sets the value of the encryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKey(String value) {
        this.encryptionKey = value;
    }

    /**
     * Gets the value of the managedBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManagedBilling() {
        return managedBilling;
    }

    /**
     * Sets the value of the managedBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManagedBilling(Boolean value) {
        this.managedBilling = value;
    }

    /**
     * Gets the value of the maximumBatchItems property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumBatchItems() {
        return maximumBatchItems;
    }

    /**
     * Sets the value of the maximumBatchItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumBatchItems(Long value) {
        this.maximumBatchItems = value;
    }

    /**
     * Gets the value of the maximumLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumLineItems() {
        return maximumLineItems;
    }

    /**
     * Sets the value of the maximumLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumLineItems(Long value) {
        this.maximumLineItems = value;
    }

    /**
     * Gets the value of the multiplePartialCapture property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiplePartialCapture() {
        return multiplePartialCapture;
    }

    /**
     * Sets the value of the multiplePartialCapture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiplePartialCapture(Boolean value) {
        this.multiplePartialCapture = value;
    }

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link Operations }
     *     
     */
    public Operations getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operations }
     *     
     */
    public void setOperations(Operations value) {
        this.operations = value;
    }

    /**
     * Gets the value of the purchaseCardLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseCardLevel }
     *     
     */
    public PurchaseCardLevel getPurchaseCardLevel() {
        return purchaseCardLevel;
    }

    /**
     * Sets the value of the purchaseCardLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseCardLevel }
     *     
     */
    public void setPurchaseCardLevel(PurchaseCardLevel value) {
        this.purchaseCardLevel = value;
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
     * Gets the value of the tenders property.
     * 
     * @return
     *     possible object is
     *     {@link Tenders }
     *     
     */
    public Tenders getTenders() {
        return tenders;
    }

    /**
     * Sets the value of the tenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tenders }
     *     
     */
    public void setTenders(Tenders value) {
        this.tenders = value;
    }

}
