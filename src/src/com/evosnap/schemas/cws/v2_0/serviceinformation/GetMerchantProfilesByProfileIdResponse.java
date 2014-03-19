
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
 *         &lt;element name="GetMerchantProfilesByProfileIdResult" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}ArrayOfMerchantProfile" minOccurs="0"/>
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
    "getMerchantProfilesByProfileIdResult"
})
@XmlRootElement(name = "GetMerchantProfilesByProfileIdResponse")
public class GetMerchantProfilesByProfileIdResponse {

    @XmlElement(name = "GetMerchantProfilesByProfileIdResult", nillable = true)
    protected ArrayOfMerchantProfile getMerchantProfilesByProfileIdResult;

    /**
     * Gets the value of the getMerchantProfilesByProfileIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMerchantProfile }
     *     
     */
    public ArrayOfMerchantProfile getGetMerchantProfilesByProfileIdResult() {
        return getMerchantProfilesByProfileIdResult;
    }

    /**
     * Sets the value of the getMerchantProfilesByProfileIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMerchantProfile }
     *     
     */
    public void setGetMerchantProfilesByProfileIdResult(ArrayOfMerchantProfile value) {
        this.getMerchantProfilesByProfileIdResult = value;
    }

}
