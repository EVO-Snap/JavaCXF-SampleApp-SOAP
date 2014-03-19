
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
 *         &lt;element name="CaptureAllAsyncResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Response" minOccurs="0"/>
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
    "captureAllAsyncResult"
})
@XmlRootElement(name = "CaptureAllAsyncResponse")
public class CaptureAllAsyncResponse {

    @XmlElement(name = "CaptureAllAsyncResult", nillable = true)
    protected Response captureAllAsyncResult;

    /**
     * Gets the value of the captureAllAsyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getCaptureAllAsyncResult() {
        return captureAllAsyncResult;
    }

    /**
     * Sets the value of the captureAllAsyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setCaptureAllAsyncResult(Response value) {
        this.captureAllAsyncResult = value;
    }

}
