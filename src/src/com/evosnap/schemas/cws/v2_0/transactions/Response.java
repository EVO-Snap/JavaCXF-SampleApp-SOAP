
package com.evosnap.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardCaptureResponse;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardTransactionResponse;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.ElectronicCheckingCaptureResponse;
import com.evosnap.schemas.cws.v2_0.transactions.electronicchecking.ElectronicCheckingTransactionResponse;
import com.evosnap.schemas.cws.v2_0.transactions.storedvalue.StoredValueCaptureResponse;
import com.evosnap.schemas.cws.v2_0.transactions.storedvalue.StoredValueTransactionResponse;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Status" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginatorTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceTransactionDateTime" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}ServiceTransactionDateTime" minOccurs="0"/>
 *         &lt;element name="Addendum" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Addendum" minOccurs="0"/>
 *         &lt;element name="CaptureState" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}CaptureState" minOccurs="0"/>
 *         &lt;element name="TransactionState" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}TransactionState" minOccurs="0"/>
 *         &lt;element name="IsAcknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "status",
    "statusCode",
    "statusMessage",
    "transactionId",
    "originatorTransactionId",
    "serviceTransactionId",
    "serviceTransactionDateTime",
    "addendum",
    "captureState",
    "transactionState",
    "isAcknowledged",
    "reference"
})
@XmlSeeAlso({
    ElectronicCheckingCaptureResponse.class,
    ElectronicCheckingTransactionResponse.class,
    BankcardTransactionResponse.class,
    BankcardCaptureResponse.class,
    StoredValueTransactionResponse.class,
    StoredValueCaptureResponse.class
})
public class Response {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "StatusCode", nillable = true)
    protected String statusCode;
    @XmlElement(name = "StatusMessage", nillable = true)
    protected String statusMessage;
    @XmlElement(name = "TransactionId", nillable = true)
    protected String transactionId;
    @XmlElement(name = "OriginatorTransactionId", nillable = true)
    protected String originatorTransactionId;
    @XmlElement(name = "ServiceTransactionId", nillable = true)
    protected String serviceTransactionId;
    @XmlElement(name = "ServiceTransactionDateTime", nillable = true)
    protected ServiceTransactionDateTime serviceTransactionDateTime;
    @XmlElement(name = "Addendum", nillable = true)
    protected Addendum addendum;
    @XmlElement(name = "CaptureState")
    protected CaptureState captureState;
    @XmlElement(name = "TransactionState")
    protected TransactionState transactionState;
    @XmlElement(name = "IsAcknowledged")
    protected Boolean isAcknowledged;
    @XmlElement(name = "Reference", nillable = true)
    protected String reference;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the originatorTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorTransactionId() {
        return originatorTransactionId;
    }

    /**
     * Sets the value of the originatorTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorTransactionId(String value) {
        this.originatorTransactionId = value;
    }

    /**
     * Gets the value of the serviceTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTransactionId() {
        return serviceTransactionId;
    }

    /**
     * Sets the value of the serviceTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTransactionId(String value) {
        this.serviceTransactionId = value;
    }

    /**
     * Gets the value of the serviceTransactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTransactionDateTime }
     *     
     */
    public ServiceTransactionDateTime getServiceTransactionDateTime() {
        return serviceTransactionDateTime;
    }

    /**
     * Sets the value of the serviceTransactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTransactionDateTime }
     *     
     */
    public void setServiceTransactionDateTime(ServiceTransactionDateTime value) {
        this.serviceTransactionDateTime = value;
    }

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

    /**
     * Gets the value of the captureState property.
     * 
     * @return
     *     possible object is
     *     {@link CaptureState }
     *     
     */
    public CaptureState getCaptureState() {
        return captureState;
    }

    /**
     * Sets the value of the captureState property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaptureState }
     *     
     */
    public void setCaptureState(CaptureState value) {
        this.captureState = value;
    }

    /**
     * Gets the value of the transactionState property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionState }
     *     
     */
    public TransactionState getTransactionState() {
        return transactionState;
    }

    /**
     * Sets the value of the transactionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionState }
     *     
     */
    public void setTransactionState(TransactionState value) {
        this.transactionState = value;
    }

    /**
     * Gets the value of the isAcknowledged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAcknowledged() {
        return isAcknowledged;
    }

    /**
     * Sets the value of the isAcknowledged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAcknowledged(Boolean value) {
        this.isAcknowledged = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

}
