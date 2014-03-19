
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.dataservices.DateRange;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:q10="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q11="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q12="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q13="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:q14="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q15="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:q16="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q17="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q18="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q19="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q2="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:q20="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q21="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q22="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q23="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q24="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q25="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q26="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q27="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q28="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q29="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q3="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q30="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q31="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q32="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q33="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q34="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q35="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q36="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q37="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q38="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q39="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q4="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q40="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q41="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q42="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q43="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q44="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q45="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q46="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q47="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q5="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q6="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q7="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q8="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q9="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:ser="http://schemas.microsoft.com/2003/10/Serialization/" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Electronic Checking specific query parameters for QueryRejectedDetail and QueryRejectedSummary. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ElectronicCheckQueryRejectedParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicCheckQueryRejectedParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}QueryRejectedParameters">
 *       &lt;sequence>
 *         &lt;element name="QueryDateRange" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices}DateRange" minOccurs="0"/>
 *         &lt;element name="QueryDateType" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}TypeDateType" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicCheckQueryRejectedParameters", propOrder = {
    "queryDateRange",
    "queryDateType",
    "serviceId"
})
public class ElectronicCheckQueryRejectedParameters
    extends QueryRejectedParameters
{

    @XmlElement(name = "QueryDateRange", nillable = true)
    protected DateRange queryDateRange;
    @XmlElement(name = "QueryDateType")
    protected TypeDateType queryDateType;
    @XmlElement(name = "ServiceId", nillable = true)
    protected String serviceId;

    /**
     * Gets the value of the queryDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getQueryDateRange() {
        return queryDateRange;
    }

    /**
     * Sets the value of the queryDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setQueryDateRange(DateRange value) {
        this.queryDateRange = value;
    }

    /**
     * Gets the value of the queryDateType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDateType }
     *     
     */
    public TypeDateType getQueryDateType() {
        return queryDateType;
    }

    /**
     * Sets the value of the queryDateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateType }
     *     
     */
    public void setQueryDateType(TypeDateType value) {
        this.queryDateType = value;
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

}
