
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Overrides application data for the specific transaction. Optional. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BankcardApplicationConfigurationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardApplicationConfigurationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationAttended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplicationLocation" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}ApplicationLocation" minOccurs="0"/>
 *         &lt;element name="HardwareType" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}HardwareType" minOccurs="0"/>
 *         &lt;element name="PINCapability" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}PINCapability" minOccurs="0"/>
 *         &lt;element name="ReadCapability" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}ReadCapability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardApplicationConfigurationData", propOrder = {
    "applicationAttended",
    "applicationLocation",
    "hardwareType",
    "pinCapability",
    "readCapability"
})
public class BankcardApplicationConfigurationData {

    @XmlElement(name = "ApplicationAttended")
    protected Boolean applicationAttended;
    @XmlElement(name = "ApplicationLocation")
    protected ApplicationLocation applicationLocation;
    @XmlElement(name = "HardwareType")
    protected HardwareType hardwareType;
    @XmlElement(name = "PINCapability")
    protected PINCapability pinCapability;
    @XmlElement(name = "ReadCapability")
    protected ReadCapability readCapability;

    /**
     * Gets the value of the applicationAttended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicationAttended() {
        return applicationAttended;
    }

    /**
     * Sets the value of the applicationAttended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicationAttended(Boolean value) {
        this.applicationAttended = value;
    }

    /**
     * Gets the value of the applicationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationLocation }
     *     
     */
    public ApplicationLocation getApplicationLocation() {
        return applicationLocation;
    }

    /**
     * Sets the value of the applicationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationLocation }
     *     
     */
    public void setApplicationLocation(ApplicationLocation value) {
        this.applicationLocation = value;
    }

    /**
     * Gets the value of the hardwareType property.
     * 
     * @return
     *     possible object is
     *     {@link HardwareType }
     *     
     */
    public HardwareType getHardwareType() {
        return hardwareType;
    }

    /**
     * Sets the value of the hardwareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HardwareType }
     *     
     */
    public void setHardwareType(HardwareType value) {
        this.hardwareType = value;
    }

    /**
     * Gets the value of the pinCapability property.
     * 
     * @return
     *     possible object is
     *     {@link PINCapability }
     *     
     */
    public PINCapability getPINCapability() {
        return pinCapability;
    }

    /**
     * Sets the value of the pinCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINCapability }
     *     
     */
    public void setPINCapability(PINCapability value) {
        this.pinCapability = value;
    }

    /**
     * Gets the value of the readCapability property.
     * 
     * @return
     *     possible object is
     *     {@link ReadCapability }
     *     
     */
    public ReadCapability getReadCapability() {
        return readCapability;
    }

    /**
     * Sets the value of the readCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadCapability }
     *     
     */
    public void setReadCapability(ReadCapability value) {
        this.readCapability = value;
    }

}
