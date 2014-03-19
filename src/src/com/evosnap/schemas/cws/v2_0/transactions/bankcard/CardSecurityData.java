
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.CVDataProvided;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains security information for the payment card. Conditional, required for PIN Debit transactions. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CardSecurityData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardSecurityData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AVSData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}AVSData" minOccurs="0"/>
 *         &lt;element name="CVDataProvided" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}CVDataProvided" minOccurs="0"/>
 *         &lt;element name="CVData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeySerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentificationInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardSecurityData", propOrder = {
    "avsData",
    "cvDataProvided",
    "cvData",
    "keySerialNumber",
    "pin",
    "identificationInformation"
})
public class CardSecurityData {

    @XmlElement(name = "AVSData", nillable = true)
    protected AVSData avsData;
    @XmlElement(name = "CVDataProvided")
    protected CVDataProvided cvDataProvided;
    @XmlElement(name = "CVData", nillable = true)
    protected String cvData;
    @XmlElement(name = "KeySerialNumber", nillable = true)
    protected String keySerialNumber;
    @XmlElement(name = "PIN", nillable = true)
    protected String pin;
    @XmlElement(name = "IdentificationInformation", nillable = true)
    protected String identificationInformation;

    /**
     * Gets the value of the avsData property.
     * 
     * @return
     *     possible object is
     *     {@link AVSData }
     *     
     */
    public AVSData getAVSData() {
        return avsData;
    }

    /**
     * Sets the value of the avsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AVSData }
     *     
     */
    public void setAVSData(AVSData value) {
        this.avsData = value;
    }

    /**
     * Gets the value of the cvDataProvided property.
     * 
     * @return
     *     possible object is
     *     {@link CVDataProvided }
     *     
     */
    public CVDataProvided getCVDataProvided() {
        return cvDataProvided;
    }

    /**
     * Sets the value of the cvDataProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVDataProvided }
     *     
     */
    public void setCVDataProvided(CVDataProvided value) {
        this.cvDataProvided = value;
    }

    /**
     * Gets the value of the cvData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVData() {
        return cvData;
    }

    /**
     * Sets the value of the cvData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVData(String value) {
        this.cvData = value;
    }

    /**
     * Gets the value of the keySerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySerialNumber() {
        return keySerialNumber;
    }

    /**
     * Sets the value of the keySerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySerialNumber(String value) {
        this.keySerialNumber = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the identificationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationInformation() {
        return identificationInformation;
    }

    /**
     * Sets the value of the identificationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationInformation(String value) {
        this.identificationInformation = value;
    }

}
