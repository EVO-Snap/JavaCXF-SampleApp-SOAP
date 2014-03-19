
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
 *         &lt;element name="GetMerchantProfileResult" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}MerchantProfile" minOccurs="0"/>
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
    "getMerchantProfileResult"
})
@XmlRootElement(name = "GetMerchantProfileResponse")
public class GetMerchantProfileResponse {

    @XmlElement(name = "GetMerchantProfileResult", nillable = true)
    protected MerchantProfile getMerchantProfileResult;

    /**
     * Gets the value of the getMerchantProfileResult property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantProfile }
     *     
     */
    public MerchantProfile getGetMerchantProfileResult() {
        return getMerchantProfileResult;
    }

    /**
     * Sets the value of the getMerchantProfileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantProfile }
     *     
     */
    public void setGetMerchantProfileResult(MerchantProfile value) {
        this.getMerchantProfileResult = value;
    }

}
