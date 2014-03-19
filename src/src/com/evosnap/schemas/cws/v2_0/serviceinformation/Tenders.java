
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains specific information about the supported payment tenders. Returned to the application by GetServiceInformation. Expected. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Tenders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tenders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Credit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PINDebit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PINlessDebit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PINDebitReturnSupportType" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}PINDebitReturnSupportType" minOccurs="0"/>
 *         &lt;element name="PINDebitUndoTenderDataRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreditAuthorizeSupport" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}CreditAuthorizeSupportType" minOccurs="0"/>
 *         &lt;element name="QueryRejectedSupport" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}QueryRejectedSupportType" minOccurs="0"/>
 *         &lt;element name="PinDebitUndoSupport" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}PinDebitUndoSupportType" minOccurs="0"/>
 *         &lt;element name="BatchAssignmentSupport" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}BatchAssignmentSupport" minOccurs="0"/>
 *         &lt;element name="CreditReturnSupportType" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}CreditReturnSupportType" minOccurs="0"/>
 *         &lt;element name="TrackDataSupport" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}TrackDataSupportType" minOccurs="0"/>
 *         &lt;element name="CredentialsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreditReversalSupportType" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}CreditReversalSupportType" minOccurs="0"/>
 *         &lt;element name="PartialApprovalSupportType" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}PartialApprovalSupportType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tenders", propOrder = {
    "credit",
    "pinDebit",
    "piNlessDebit",
    "pinDebitReturnSupportType",
    "pinDebitUndoTenderDataRequired",
    "creditAuthorizeSupport",
    "queryRejectedSupport",
    "pinDebitUndoSupport",
    "batchAssignmentSupport",
    "creditReturnSupportType",
    "trackDataSupport",
    "credentialsRequired",
    "creditReversalSupportType",
    "partialApprovalSupportType"
})
public class Tenders {

    @XmlElement(name = "Credit")
    protected Boolean credit;
    @XmlElement(name = "PINDebit")
    protected Boolean pinDebit;
    @XmlElement(name = "PINlessDebit")
    protected Boolean piNlessDebit;
    @XmlElement(name = "PINDebitReturnSupportType")
    protected PINDebitReturnSupportType pinDebitReturnSupportType;
    @XmlElement(name = "PINDebitUndoTenderDataRequired")
    protected Boolean pinDebitUndoTenderDataRequired;
    @XmlElement(name = "CreditAuthorizeSupport")
    protected CreditAuthorizeSupportType creditAuthorizeSupport;
    @XmlElement(name = "QueryRejectedSupport")
    protected QueryRejectedSupportType queryRejectedSupport;
    @XmlElement(name = "PinDebitUndoSupport")
    protected PinDebitUndoSupportType pinDebitUndoSupport;
    @XmlElement(name = "BatchAssignmentSupport")
    protected BatchAssignmentSupport batchAssignmentSupport;
    @XmlElement(name = "CreditReturnSupportType")
    protected CreditReturnSupportType creditReturnSupportType;
    @XmlElement(name = "TrackDataSupport")
    protected TrackDataSupportType trackDataSupport;
    @XmlElement(name = "CredentialsRequired")
    protected Boolean credentialsRequired;
    @XmlElement(name = "CreditReversalSupportType")
    protected CreditReversalSupportType creditReversalSupportType;
    @XmlElement(name = "PartialApprovalSupportType")
    protected PartialApprovalSupportType partialApprovalSupportType;

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCredit(Boolean value) {
        this.credit = value;
    }

    /**
     * Gets the value of the pinDebit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPINDebit() {
        return pinDebit;
    }

    /**
     * Sets the value of the pinDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPINDebit(Boolean value) {
        this.pinDebit = value;
    }

    /**
     * Gets the value of the piNlessDebit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPINlessDebit() {
        return piNlessDebit;
    }

    /**
     * Sets the value of the piNlessDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPINlessDebit(Boolean value) {
        this.piNlessDebit = value;
    }

    /**
     * Gets the value of the pinDebitReturnSupportType property.
     * 
     * @return
     *     possible object is
     *     {@link PINDebitReturnSupportType }
     *     
     */
    public PINDebitReturnSupportType getPINDebitReturnSupportType() {
        return pinDebitReturnSupportType;
    }

    /**
     * Sets the value of the pinDebitReturnSupportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINDebitReturnSupportType }
     *     
     */
    public void setPINDebitReturnSupportType(PINDebitReturnSupportType value) {
        this.pinDebitReturnSupportType = value;
    }

    /**
     * Gets the value of the pinDebitUndoTenderDataRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPINDebitUndoTenderDataRequired() {
        return pinDebitUndoTenderDataRequired;
    }

    /**
     * Sets the value of the pinDebitUndoTenderDataRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPINDebitUndoTenderDataRequired(Boolean value) {
        this.pinDebitUndoTenderDataRequired = value;
    }

    /**
     * Gets the value of the creditAuthorizeSupport property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAuthorizeSupportType }
     *     
     */
    public CreditAuthorizeSupportType getCreditAuthorizeSupport() {
        return creditAuthorizeSupport;
    }

    /**
     * Sets the value of the creditAuthorizeSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAuthorizeSupportType }
     *     
     */
    public void setCreditAuthorizeSupport(CreditAuthorizeSupportType value) {
        this.creditAuthorizeSupport = value;
    }

    /**
     * Gets the value of the queryRejectedSupport property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRejectedSupportType }
     *     
     */
    public QueryRejectedSupportType getQueryRejectedSupport() {
        return queryRejectedSupport;
    }

    /**
     * Sets the value of the queryRejectedSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRejectedSupportType }
     *     
     */
    public void setQueryRejectedSupport(QueryRejectedSupportType value) {
        this.queryRejectedSupport = value;
    }

    /**
     * Gets the value of the pinDebitUndoSupport property.
     * 
     * @return
     *     possible object is
     *     {@link PinDebitUndoSupportType }
     *     
     */
    public PinDebitUndoSupportType getPinDebitUndoSupport() {
        return pinDebitUndoSupport;
    }

    /**
     * Sets the value of the pinDebitUndoSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinDebitUndoSupportType }
     *     
     */
    public void setPinDebitUndoSupport(PinDebitUndoSupportType value) {
        this.pinDebitUndoSupport = value;
    }

    /**
     * Gets the value of the batchAssignmentSupport property.
     * 
     * @return
     *     possible object is
     *     {@link BatchAssignmentSupport }
     *     
     */
    public BatchAssignmentSupport getBatchAssignmentSupport() {
        return batchAssignmentSupport;
    }

    /**
     * Sets the value of the batchAssignmentSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchAssignmentSupport }
     *     
     */
    public void setBatchAssignmentSupport(BatchAssignmentSupport value) {
        this.batchAssignmentSupport = value;
    }

    /**
     * Gets the value of the creditReturnSupportType property.
     * 
     * @return
     *     possible object is
     *     {@link CreditReturnSupportType }
     *     
     */
    public CreditReturnSupportType getCreditReturnSupportType() {
        return creditReturnSupportType;
    }

    /**
     * Sets the value of the creditReturnSupportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditReturnSupportType }
     *     
     */
    public void setCreditReturnSupportType(CreditReturnSupportType value) {
        this.creditReturnSupportType = value;
    }

    /**
     * Gets the value of the trackDataSupport property.
     * 
     * @return
     *     possible object is
     *     {@link TrackDataSupportType }
     *     
     */
    public TrackDataSupportType getTrackDataSupport() {
        return trackDataSupport;
    }

    /**
     * Sets the value of the trackDataSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackDataSupportType }
     *     
     */
    public void setTrackDataSupport(TrackDataSupportType value) {
        this.trackDataSupport = value;
    }

    /**
     * Gets the value of the credentialsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCredentialsRequired() {
        return credentialsRequired;
    }

    /**
     * Sets the value of the credentialsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCredentialsRequired(Boolean value) {
        this.credentialsRequired = value;
    }

    /**
     * Gets the value of the creditReversalSupportType property.
     * 
     * @return
     *     possible object is
     *     {@link CreditReversalSupportType }
     *     
     */
    public CreditReversalSupportType getCreditReversalSupportType() {
        return creditReversalSupportType;
    }

    /**
     * Sets the value of the creditReversalSupportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditReversalSupportType }
     *     
     */
    public void setCreditReversalSupportType(CreditReversalSupportType value) {
        this.creditReversalSupportType = value;
    }

    /**
     * Gets the value of the partialApprovalSupportType property.
     * 
     * @return
     *     possible object is
     *     {@link PartialApprovalSupportType }
     *     
     */
    public PartialApprovalSupportType getPartialApprovalSupportType() {
        return partialApprovalSupportType;
    }

    /**
     * Sets the value of the partialApprovalSupportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialApprovalSupportType }
     *     
     */
    public void setPartialApprovalSupportType(PartialApprovalSupportType value) {
        this.partialApprovalSupportType = value;
    }

}
