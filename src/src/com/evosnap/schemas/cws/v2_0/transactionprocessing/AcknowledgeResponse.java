
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.Response;


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
 *         &lt;element name="AcknowledgeResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Response" minOccurs="0"/>
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
    "acknowledgeResult"
})
@XmlRootElement(name = "AcknowledgeResponse")
public class AcknowledgeResponse {

    @XmlElement(name = "AcknowledgeResult", nillable = true)
    protected Response acknowledgeResult;

    /**
     * Gets the value of the acknowledgeResult property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getAcknowledgeResult() {
        return acknowledgeResult;
    }

    /**
     * Sets the value of the acknowledgeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setAcknowledgeResult(Response value) {
        this.acknowledgeResult = value;
    }

}
