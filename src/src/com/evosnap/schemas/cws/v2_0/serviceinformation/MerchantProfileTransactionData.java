
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains transaction-specific information associated with a specific merchant. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for MerchantProfileTransactionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerchantProfileTransactionData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankcardTransactionDataDefaults" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}BankcardTransactionDataDefaults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantProfileTransactionData", propOrder = {
    "bankcardTransactionDataDefaults"
})
public class MerchantProfileTransactionData {

    @XmlElement(name = "BankcardTransactionDataDefaults", nillable = true)
    protected BankcardTransactionDataDefaults bankcardTransactionDataDefaults;

    /**
     * Gets the value of the bankcardTransactionDataDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link BankcardTransactionDataDefaults }
     *     
     */
    public BankcardTransactionDataDefaults getBankcardTransactionDataDefaults() {
        return bankcardTransactionDataDefaults;
    }

    /**
     * Sets the value of the bankcardTransactionDataDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankcardTransactionDataDefaults }
     *     
     */
    public void setBankcardTransactionDataDefaults(BankcardTransactionDataDefaults value) {
        this.bankcardTransactionDataDefaults = value;
    }

}
