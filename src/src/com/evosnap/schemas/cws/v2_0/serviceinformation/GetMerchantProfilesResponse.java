
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
 *         &lt;element name="GetMerchantProfilesResult" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}ArrayOfMerchantProfile" minOccurs="0"/>
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
    "getMerchantProfilesResult"
})
@XmlRootElement(name = "GetMerchantProfilesResponse")
public class GetMerchantProfilesResponse {

    @XmlElement(name = "GetMerchantProfilesResult", nillable = true)
    protected ArrayOfMerchantProfile getMerchantProfilesResult;

    /**
     * Gets the value of the getMerchantProfilesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMerchantProfile }
     *     
     */
    public ArrayOfMerchantProfile getGetMerchantProfilesResult() {
        return getMerchantProfilesResult;
    }

    /**
     * Sets the value of the getMerchantProfilesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMerchantProfile }
     *     
     */
    public void setGetMerchantProfilesResult(ArrayOfMerchantProfile value) {
        this.getMerchantProfilesResult = value;
    }

}
