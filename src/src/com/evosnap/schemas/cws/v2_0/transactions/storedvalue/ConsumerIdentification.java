
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Consumer Identification data. Conditional required if CardData is not supplied. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ConsumerIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdType" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}IdType" minOccurs="0"/>
 *         &lt;element name="IdData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdEntryMode" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}IdEntryMode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerIdentification", propOrder = {
    "idType",
    "idData",
    "idEntryMode"
})
public class ConsumerIdentification {

    @XmlElement(name = "IdType")
    protected IdType idType;
    @XmlElement(name = "IdData", nillable = true)
    protected String idData;
    @XmlElement(name = "IdEntryMode")
    protected IdEntryMode idEntryMode;

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setIdType(IdType value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdData() {
        return idData;
    }

    /**
     * Sets the value of the idData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdData(String value) {
        this.idData = value;
    }

    /**
     * Gets the value of the idEntryMode property.
     * 
     * @return
     *     possible object is
     *     {@link IdEntryMode }
     *     
     */
    public IdEntryMode getIdEntryMode() {
        return idEntryMode;
    }

    /**
     * Sets the value of the idEntryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdEntryMode }
     *     
     */
    public void setIdEntryMode(IdEntryMode value) {
        this.idEntryMode = value;
    }

}
