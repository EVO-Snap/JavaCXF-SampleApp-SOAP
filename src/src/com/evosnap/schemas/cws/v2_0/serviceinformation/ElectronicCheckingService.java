
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information returned to the application with details about the Electronic Checking service(s) for which it is configured. Conditional, required if the service supports Electronic Checking. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ElectronicCheckingService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicCheckingService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operations" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}Operations" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tenders" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}Tenders" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicCheckingService", propOrder = {
    "operations",
    "serviceId",
    "serviceName",
    "tenders"
})
public class ElectronicCheckingService {

    @XmlElement(name = "Operations", nillable = true)
    protected Operations operations;
    @XmlElement(name = "ServiceId", nillable = true)
    protected String serviceId;
    @XmlElement(name = "ServiceName", nillable = true)
    protected String serviceName;
    @XmlElement(name = "Tenders", nillable = true)
    protected Tenders tenders;

    /**
     * Gets the value of the operations property.
     * 
     * @return
     *     possible object is
     *     {@link Operations }
     *     
     */
    public Operations getOperations() {
        return operations;
    }

    /**
     * Sets the value of the operations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operations }
     *     
     */
    public void setOperations(Operations value) {
        this.operations = value;
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
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the tenders property.
     * 
     * @return
     *     possible object is
     *     {@link Tenders }
     *     
     */
    public Tenders getTenders() {
        return tenders;
    }

    /**
     * Sets the value of the tenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tenders }
     *     
     */
    public void setTenders(Tenders value) {
        this.tenders = value;
    }

}
