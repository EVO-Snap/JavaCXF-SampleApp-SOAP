
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
 *         &lt;element name="IsMerchantProfileInitializedResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "isMerchantProfileInitializedResult"
})
@XmlRootElement(name = "IsMerchantProfileInitializedResponse")
public class IsMerchantProfileInitializedResponse {

    @XmlElement(name = "IsMerchantProfileInitializedResult")
    protected Boolean isMerchantProfileInitializedResult;

    /**
     * Gets the value of the isMerchantProfileInitializedResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMerchantProfileInitializedResult() {
        return isMerchantProfileInitializedResult;
    }

    /**
     * Sets the value of the isMerchantProfileInitializedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMerchantProfileInitializedResult(Boolean value) {
        this.isMerchantProfileInitializedResult = value;
    }

}
