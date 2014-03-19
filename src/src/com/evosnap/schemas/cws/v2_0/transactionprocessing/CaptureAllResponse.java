
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.ArrayOfResponse;


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
 *         &lt;element name="CaptureAllResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}ArrayOfResponse" minOccurs="0"/>
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
    "captureAllResult"
})
@XmlRootElement(name = "CaptureAllResponse")
public class CaptureAllResponse {

    @XmlElement(name = "CaptureAllResult", nillable = true)
    protected ArrayOfResponse captureAllResult;

    /**
     * Gets the value of the captureAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResponse }
     *     
     */
    public ArrayOfResponse getCaptureAllResult() {
        return captureAllResult;
    }

    /**
     * Sets the value of the captureAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResponse }
     *     
     */
    public void setCaptureAllResult(ArrayOfResponse value) {
        this.captureAllResult = value;
    }

}
