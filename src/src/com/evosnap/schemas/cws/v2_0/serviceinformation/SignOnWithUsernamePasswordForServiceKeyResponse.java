
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignOnWithUsernamePasswordForServiceKeyResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "signOnWithUsernamePasswordForServiceKeyResult"
})
@XmlRootElement(name = "SignOnWithUsernamePasswordForServiceKeyResponse")
public class SignOnWithUsernamePasswordForServiceKeyResponse {

    @XmlElement(name = "SignOnWithUsernamePasswordForServiceKeyResult", nillable = true)
    protected String signOnWithUsernamePasswordForServiceKeyResult;

    /**
     * Gets the value of the signOnWithUsernamePasswordForServiceKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignOnWithUsernamePasswordForServiceKeyResult() {
        return signOnWithUsernamePasswordForServiceKeyResult;
    }

    /**
     * Sets the value of the signOnWithUsernamePasswordForServiceKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignOnWithUsernamePasswordForServiceKeyResult(String value) {
        this.signOnWithUsernamePasswordForServiceKeyResult = value;
    }

}
