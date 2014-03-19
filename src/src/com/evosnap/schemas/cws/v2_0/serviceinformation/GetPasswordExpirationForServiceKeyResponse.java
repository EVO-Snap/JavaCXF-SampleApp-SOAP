
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


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
 *         &lt;element name="GetPasswordExpirationForServiceKeyResult" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
    "getPasswordExpirationForServiceKeyResult"
})
@XmlRootElement(name = "GetPasswordExpirationForServiceKeyResponse")
public class GetPasswordExpirationForServiceKeyResponse {

    @XmlElement(name = "GetPasswordExpirationForServiceKeyResult", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar getPasswordExpirationForServiceKeyResult;

    /**
     * Gets the value of the getPasswordExpirationForServiceKeyResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getGetPasswordExpirationForServiceKeyResult() {
        return getPasswordExpirationForServiceKeyResult;
    }

    /**
     * Sets the value of the getPasswordExpirationForServiceKeyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPasswordExpirationForServiceKeyResult(Calendar value) {
        this.getPasswordExpirationForServiceKeyResult = value;
    }

}
