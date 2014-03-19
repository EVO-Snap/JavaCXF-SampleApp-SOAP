
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.CVDataProvided;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains security information for the payment card. Conditional, required for PIN Debit transactions. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CardSecurityData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardSecurityData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CVDataProvided" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}CVDataProvided" minOccurs="0"/>
 *         &lt;element name="CVData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardSecurityData", propOrder = {
    "cvDataProvided",
    "cvData"
})
public class CardSecurityData {

    @XmlElement(name = "CVDataProvided")
    protected CVDataProvided cvDataProvided;
    @XmlElement(name = "CVData", nillable = true)
    protected String cvData;

    /**
     * Gets the value of the cvDataProvided property.
     * 
     * @return
     *     possible object is
     *     {@link CVDataProvided }
     *     
     */
    public CVDataProvided getCVDataProvided() {
        return cvDataProvided;
    }

    /**
     * Sets the value of the cvDataProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVDataProvided }
     *     
     */
    public void setCVDataProvided(CVDataProvided value) {
        this.cvDataProvided = value;
    }

    /**
     * Gets the value of the cvData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVData() {
        return cvData;
    }

    /**
     * Sets the value of the cvData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVData(String value) {
        this.cvData = value;
    }

}
