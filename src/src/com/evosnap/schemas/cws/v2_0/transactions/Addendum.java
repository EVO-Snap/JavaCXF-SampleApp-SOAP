
package com.evosnap.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Used to pass optional service-specific information. It is not necessary to pass this object unless specifically directed to do so by your Solutions Consultant. Optional. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Addendum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Addendum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unmanaged" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Unmanaged" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Addendum", propOrder = {
    "unmanaged"
})
public class Addendum {

    @XmlElement(name = "Unmanaged", nillable = true)
    protected Unmanaged unmanaged;

    /**
     * Gets the value of the unmanaged property.
     * 
     * @return
     *     possible object is
     *     {@link Unmanaged }
     *     
     */
    public Unmanaged getUnmanaged() {
        return unmanaged;
    }

    /**
     * Sets the value of the unmanaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unmanaged }
     *     
     */
    public void setUnmanaged(Unmanaged value) {
        this.unmanaged = value;
    }

}
