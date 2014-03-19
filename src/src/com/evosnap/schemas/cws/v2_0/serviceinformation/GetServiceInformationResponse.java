
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
 *         &lt;element name="GetServiceInformationResult" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}ServiceInformation" minOccurs="0"/>
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
    "getServiceInformationResult"
})
@XmlRootElement(name = "GetServiceInformationResponse")
public class GetServiceInformationResponse {

    @XmlElement(name = "GetServiceInformationResult", nillable = true)
    protected ServiceInformation getServiceInformationResult;

    /**
     * Gets the value of the getServiceInformationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInformation }
     *     
     */
    public ServiceInformation getGetServiceInformationResult() {
        return getServiceInformationResult;
    }

    /**
     * Sets the value of the getServiceInformationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInformation }
     *     
     */
    public void setGetServiceInformationResult(ServiceInformation value) {
        this.getServiceInformationResult = value;
    }

}
