
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information about the supported service(s). Returned to the application by GetServiceInformation. Expected. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ServiceInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankcardServices" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}ArrayOfBankcardService" minOccurs="0"/>
 *         &lt;element name="ElectronicCheckingServices" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}ArrayOfElectronicCheckingService" minOccurs="0"/>
 *         &lt;element name="StoredValueServices" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}ArrayOfStoredValueService" minOccurs="0"/>
 *         &lt;element name="Workflows" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}ArrayOfWorkflow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInformation", propOrder = {
    "bankcardServices",
    "electronicCheckingServices",
    "storedValueServices",
    "workflows"
})
public class ServiceInformation {

    @XmlElement(name = "BankcardServices", nillable = true)
    protected ArrayOfBankcardService bankcardServices;
    @XmlElement(name = "ElectronicCheckingServices", nillable = true)
    protected ArrayOfElectronicCheckingService electronicCheckingServices;
    @XmlElement(name = "StoredValueServices", nillable = true)
    protected ArrayOfStoredValueService storedValueServices;
    @XmlElement(name = "Workflows", nillable = true)
    protected ArrayOfWorkflow workflows;

    /**
     * Gets the value of the bankcardServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBankcardService }
     *     
     */
    public ArrayOfBankcardService getBankcardServices() {
        return bankcardServices;
    }

    /**
     * Sets the value of the bankcardServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBankcardService }
     *     
     */
    public void setBankcardServices(ArrayOfBankcardService value) {
        this.bankcardServices = value;
    }

    /**
     * Gets the value of the electronicCheckingServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfElectronicCheckingService }
     *     
     */
    public ArrayOfElectronicCheckingService getElectronicCheckingServices() {
        return electronicCheckingServices;
    }

    /**
     * Sets the value of the electronicCheckingServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfElectronicCheckingService }
     *     
     */
    public void setElectronicCheckingServices(ArrayOfElectronicCheckingService value) {
        this.electronicCheckingServices = value;
    }

    /**
     * Gets the value of the storedValueServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStoredValueService }
     *     
     */
    public ArrayOfStoredValueService getStoredValueServices() {
        return storedValueServices;
    }

    /**
     * Sets the value of the storedValueServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStoredValueService }
     *     
     */
    public void setStoredValueServices(ArrayOfStoredValueService value) {
        this.storedValueServices = value;
    }

    /**
     * Gets the value of the workflows property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWorkflow }
     *     
     */
    public ArrayOfWorkflow getWorkflows() {
        return workflows;
    }

    /**
     * Sets the value of the workflows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWorkflow }
     *     
     */
    public void setWorkflows(ArrayOfWorkflow value) {
        this.workflows = value;
    }

}
