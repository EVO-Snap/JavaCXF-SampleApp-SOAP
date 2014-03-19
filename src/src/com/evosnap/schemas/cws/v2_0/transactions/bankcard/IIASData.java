
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Inventory Information Approval System (IIAS) data including amounts for FSA eligible items. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IIASData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IIASData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HealthcareAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ClinicOtherAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DentalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrescriptionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VisionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IIASDesignation" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}IIASDesignation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IIASData", propOrder = {
    "healthcareAmount",
    "clinicOtherAmount",
    "dentalAmount",
    "prescriptionAmount",
    "visionAmount",
    "iiasDesignation"
})
public class IIASData {

    @XmlElement(name = "HealthcareAmount")
    protected BigDecimal healthcareAmount;
    @XmlElement(name = "ClinicOtherAmount")
    protected BigDecimal clinicOtherAmount;
    @XmlElement(name = "DentalAmount")
    protected BigDecimal dentalAmount;
    @XmlElement(name = "PrescriptionAmount")
    protected BigDecimal prescriptionAmount;
    @XmlElement(name = "VisionAmount")
    protected BigDecimal visionAmount;
    @XmlElement(name = "IIASDesignation")
    protected IIASDesignation iiasDesignation;

    /**
     * Gets the value of the healthcareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHealthcareAmount() {
        return healthcareAmount;
    }

    /**
     * Sets the value of the healthcareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHealthcareAmount(BigDecimal value) {
        this.healthcareAmount = value;
    }

    /**
     * Gets the value of the clinicOtherAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClinicOtherAmount() {
        return clinicOtherAmount;
    }

    /**
     * Sets the value of the clinicOtherAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClinicOtherAmount(BigDecimal value) {
        this.clinicOtherAmount = value;
    }

    /**
     * Gets the value of the dentalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDentalAmount() {
        return dentalAmount;
    }

    /**
     * Sets the value of the dentalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDentalAmount(BigDecimal value) {
        this.dentalAmount = value;
    }

    /**
     * Gets the value of the prescriptionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrescriptionAmount() {
        return prescriptionAmount;
    }

    /**
     * Sets the value of the prescriptionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrescriptionAmount(BigDecimal value) {
        this.prescriptionAmount = value;
    }

    /**
     * Gets the value of the visionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVisionAmount() {
        return visionAmount;
    }

    /**
     * Sets the value of the visionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVisionAmount(BigDecimal value) {
        this.visionAmount = value;
    }

    /**
     * Gets the value of the iiasDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link IIASDesignation }
     *     
     */
    public IIASDesignation getIIASDesignation() {
        return iiasDesignation;
    }

    /**
     * Sets the value of the iiasDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IIASDesignation }
     *     
     */
    public void setIIASDesignation(IIASDesignation value) {
        this.iiasDesignation = value;
    }

}
