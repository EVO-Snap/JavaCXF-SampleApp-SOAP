
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.dataservices.DateRange;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:q10="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q11="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q12="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q13="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:q14="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q15="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:q16="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q17="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q18="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q19="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q2="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:q20="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q21="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q22="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q23="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q24="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q25="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q26="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q27="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q28="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q29="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q3="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q30="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q31="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q32="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q33="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q34="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:q35="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q36="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q37="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q38="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q39="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q4="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q40="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q41="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q42="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q43="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:q44="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q45="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q46="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q47="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:q5="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q6="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q7="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q8="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:q9="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:ser="http://schemas.microsoft.com/2003/10/Serialization/" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; The filter criteria used to perform transaction batch queries. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for QueryBatchParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryBatchParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BatchDateRange" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices}DateRange" minOccurs="0"/>
 *         &lt;element name="BatchIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="MerchantProfileIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ServiceKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="TransactionIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryBatchParameters", propOrder = {
    "batchDateRange",
    "batchIds",
    "merchantProfileIds",
    "serviceKeys",
    "transactionIds"
})
public class QueryBatchParameters {

    @XmlElement(name = "BatchDateRange", nillable = true)
    protected DateRange batchDateRange;
    @XmlElement(name = "BatchIds", nillable = true)
    protected ArrayOfstring batchIds;
    @XmlElement(name = "MerchantProfileIds", nillable = true)
    protected ArrayOfstring merchantProfileIds;
    @XmlElement(name = "ServiceKeys", nillable = true)
    protected ArrayOfstring serviceKeys;
    @XmlElement(name = "TransactionIds", nillable = true)
    protected ArrayOfstring transactionIds;

    /**
     * Gets the value of the batchDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getBatchDateRange() {
        return batchDateRange;
    }

    /**
     * Sets the value of the batchDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setBatchDateRange(DateRange value) {
        this.batchDateRange = value;
    }

    /**
     * Gets the value of the batchIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getBatchIds() {
        return batchIds;
    }

    /**
     * Sets the value of the batchIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setBatchIds(ArrayOfstring value) {
        this.batchIds = value;
    }

    /**
     * Gets the value of the merchantProfileIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getMerchantProfileIds() {
        return merchantProfileIds;
    }

    /**
     * Sets the value of the merchantProfileIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setMerchantProfileIds(ArrayOfstring value) {
        this.merchantProfileIds = value;
    }

    /**
     * Gets the value of the serviceKeys property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getServiceKeys() {
        return serviceKeys;
    }

    /**
     * Sets the value of the serviceKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setServiceKeys(ArrayOfstring value) {
        this.serviceKeys = value;
    }

    /**
     * Gets the value of the transactionIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getTransactionIds() {
        return transactionIds;
    }

    /**
     * Sets the value of the transactionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setTransactionIds(ArrayOfstring value) {
        this.transactionIds = value;
    }

}
