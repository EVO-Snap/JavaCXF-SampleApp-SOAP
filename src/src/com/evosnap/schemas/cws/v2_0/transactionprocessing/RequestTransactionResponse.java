
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
 *         &lt;element name="RequestTransactionResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}ArrayOfResponse" minOccurs="0"/>
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
    "requestTransactionResult"
})
@XmlRootElement(name = "RequestTransactionResponse")
public class RequestTransactionResponse {

    @XmlElement(name = "RequestTransactionResult", nillable = true)
    protected ArrayOfResponse requestTransactionResult;

    /**
     * Gets the value of the requestTransactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResponse }
     *     
     */
    public ArrayOfResponse getRequestTransactionResult() {
        return requestTransactionResult;
    }

    /**
     * Sets the value of the requestTransactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResponse }
     *     
     */
    public void setRequestTransactionResult(ArrayOfResponse value) {
        this.requestTransactionResult = value;
    }

}
