
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.TransactionTenderData;


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
 *         &lt;element name="sessionToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenderData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}TransactionTenderData" minOccurs="0"/>
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
    "sessionToken",
    "merchantProfileId",
    "tenderData"
})
@XmlRootElement(name = "RequestTransaction")
public class RequestTransaction {

    @XmlElement(nillable = true)
    protected String sessionToken;
    @XmlElement(nillable = true)
    protected String merchantProfileId;
    @XmlElement(nillable = true)
    protected TransactionTenderData tenderData;

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionToken(String value) {
        this.sessionToken = value;
    }

    /**
     * Gets the value of the merchantProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantProfileId() {
        return merchantProfileId;
    }

    /**
     * Sets the value of the merchantProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantProfileId(String value) {
        this.merchantProfileId = value;
    }

    /**
     * Gets the value of the tenderData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTenderData }
     *     
     */
    public TransactionTenderData getTenderData() {
        return tenderData;
    }

    /**
     * Sets the value of the tenderData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTenderData }
     *     
     */
    public void setTenderData(TransactionTenderData value) {
        this.tenderData = value;
    }

}
