
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.Addendum;


/**
 * <p>Java class for QueryRejectedParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryRejectedParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Addendum" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Addendum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryRejectedParameters", propOrder = {
    "addendum"
})
@XmlSeeAlso({
    ElectronicCheckQueryRejectedParameters.class
})
public class QueryRejectedParameters {

    @XmlElement(name = "Addendum", nillable = true)
    protected Addendum addendum;

    /**
     * Gets the value of the addendum property.
     * 
     * @return
     *     possible object is
     *     {@link Addendum }
     *     
     */
    public Addendum getAddendum() {
        return addendum;
    }

    /**
     * Sets the value of the addendum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Addendum }
     *     
     */
    public void setAddendum(Addendum value) {
        this.addendum = value;
    }

}
