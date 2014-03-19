
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
 *         &lt;element name="GetApplicationDataResult" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}ApplicationData" minOccurs="0"/>
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
    "getApplicationDataResult"
})
@XmlRootElement(name = "GetApplicationDataResponse")
public class GetApplicationDataResponse {

    @XmlElement(name = "GetApplicationDataResult", nillable = true)
    protected ApplicationData getApplicationDataResult;

    /**
     * Gets the value of the getApplicationDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationData }
     *     
     */
    public ApplicationData getGetApplicationDataResult() {
        return getApplicationDataResult;
    }

    /**
     * Sets the value of the getApplicationDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationData }
     *     
     */
    public void setGetApplicationDataResult(ApplicationData value) {
        this.getApplicationDataResult = value;
    }

}
