
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information about the application that must be supplied to the Service Information endpoint prior to transacting. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ApplicationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationAttended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ApplicationLocation" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}ApplicationLocation" minOccurs="0"/>
 *         &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeveloperId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HardwareType" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}HardwareType" minOccurs="0"/>
 *         &lt;element name="PINCapability" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}PINCapability" minOccurs="0"/>
 *         &lt;element name="PTLSSocketId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReadCapability" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}ReadCapability" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftwareVersionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="VendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EncryptionType" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}EncryptionType" minOccurs="0"/>
 *         &lt;element name="DeviceSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationData", propOrder = {
    "applicationAttended",
    "applicationLocation",
    "applicationName",
    "developerId",
    "hardwareType",
    "pinCapability",
    "ptlsSocketId",
    "readCapability",
    "serialNumber",
    "softwareVersion",
    "softwareVersionDate",
    "vendorId",
    "encryptionType",
    "deviceSerialNumber"
})
public class ApplicationData {

    @XmlElement(name = "ApplicationAttended")
    protected Boolean applicationAttended;
    @XmlElement(name = "ApplicationLocation")
    protected ApplicationLocation applicationLocation;
    @XmlElement(name = "ApplicationName", nillable = true)
    protected String applicationName;
    @XmlElement(name = "DeveloperId", nillable = true)
    protected String developerId;
    @XmlElement(name = "HardwareType")
    protected HardwareType hardwareType;
    @XmlElement(name = "PINCapability")
    protected PINCapability pinCapability;
    @XmlElement(name = "PTLSSocketId", nillable = true)
    protected String ptlsSocketId;
    @XmlElement(name = "ReadCapability")
    protected ReadCapability readCapability;
    @XmlElement(name = "SerialNumber", nillable = true)
    protected String serialNumber;
    @XmlElement(name = "SoftwareVersion", nillable = true)
    protected String softwareVersion;
    @XmlElement(name = "SoftwareVersionDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar softwareVersionDate;
    @XmlElement(name = "VendorId", nillable = true)
    protected String vendorId;
    @XmlElement(name = "EncryptionType")
    protected EncryptionType encryptionType;
    @XmlElement(name = "DeviceSerialNumber", nillable = true)
    protected String deviceSerialNumber;

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
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the developerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperId() {
        return developerId;
    }

    /**
     * Sets the value of the developerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperId(String value) {
        this.developerId = value;
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
     * Gets the value of the ptlsSocketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTLSSocketId() {
        return ptlsSocketId;
    }

    /**
     * Sets the value of the ptlsSocketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTLSSocketId(String value) {
        this.ptlsSocketId = value;
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

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the softwareVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Sets the value of the softwareVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareVersion(String value) {
        this.softwareVersion = value;
    }

    /**
     * Gets the value of the softwareVersionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSoftwareVersionDate() {
        return softwareVersionDate;
    }

    /**
     * Sets the value of the softwareVersionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareVersionDate(Calendar value) {
        this.softwareVersionDate = value;
    }

    /**
     * Gets the value of the vendorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Sets the value of the vendorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorId(String value) {
        this.vendorId = value;
    }

    /**
     * Gets the value of the encryptionType property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionType }
     *     
     */
    public EncryptionType getEncryptionType() {
        return encryptionType;
    }

    /**
     * Sets the value of the encryptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionType }
     *     
     */
    public void setEncryptionType(EncryptionType value) {
        this.encryptionType = value;
    }

    /**
     * Gets the value of the deviceSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    /**
     * Sets the value of the deviceSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceSerialNumber(String value) {
        this.deviceSerialNumber = value;
    }

}
