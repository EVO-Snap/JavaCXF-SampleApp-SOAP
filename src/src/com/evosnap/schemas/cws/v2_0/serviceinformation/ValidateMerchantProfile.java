
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenderType" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}TenderType" minOccurs="0"/>
 *         &lt;element name="merchantProfile" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}MerchantProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionToken",
    "serviceId",
    "tenderType",
    "merchantProfile"
})
@XmlRootElement(name = "ValidateMerchantProfile")
public class ValidateMerchantProfile {

    @XmlElement(nillable = true)
    protected String sessionToken;
    @XmlElement(nillable = true)
    protected String serviceId;
    protected TenderType tenderType;
    @XmlElement(nillable = true)
    protected MerchantProfile merchantProfile;

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionToken(String value) {
        this.sessionToken = value;
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
     * Gets the value of the tenderType property.
     * 
     * @return
     *     possible object is
     *     {@link TenderType }
     *     
     */
    public TenderType getTenderType() {
        return tenderType;
    }

    /**
     * Sets the value of the tenderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderType }
     *     
     */
    public void setTenderType(TenderType value) {
        this.tenderType = value;
    }

    /**
     * Gets the value of the merchantProfile property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantProfile }
     *     
     */
    public MerchantProfile getMerchantProfile() {
        return merchantProfile;
    }

    /**
     * Sets the value of the merchantProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantProfile }
     *     
     */
    public void setMerchantProfile(MerchantProfile value) {
        this.merchantProfile = value;
    }

}
