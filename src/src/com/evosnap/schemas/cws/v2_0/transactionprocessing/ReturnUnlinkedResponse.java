
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
 *         &lt;element name="ReturnUnlinkedResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Response" minOccurs="0"/>
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
    "returnUnlinkedResult"
})
@XmlRootElement(name = "ReturnUnlinkedResponse")
public class ReturnUnlinkedResponse {

    @XmlElement(name = "ReturnUnlinkedResult", nillable = true)
    protected Response returnUnlinkedResult;

    /**
     * Gets the value of the returnUnlinkedResult property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getReturnUnlinkedResult() {
        return returnUnlinkedResult;
    }

    /**
     * Sets the value of the returnUnlinkedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setReturnUnlinkedResult(Response value) {
        this.returnUnlinkedResult = value;
    }

}
