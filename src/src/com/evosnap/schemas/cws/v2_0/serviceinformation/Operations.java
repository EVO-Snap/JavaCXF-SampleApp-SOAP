
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; The transaction processing operations supported by the service. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for Operations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Operations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Verify" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QueryAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AuthAndCapture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Authorize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Adjust" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReturnById" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReturnUnlinked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Undo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Capture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CaptureSelective" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CaptureAll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CloseBatch" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}CloseBatch" minOccurs="0"/>
 *         &lt;element name="QueryRejected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ManageAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ManageAccountById" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Disburse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Operations", propOrder = {
    "verify",
    "queryAccount",
    "authAndCapture",
    "authorize",
    "adjust",
    "returnById",
    "returnUnlinked",
    "undo",
    "capture",
    "captureSelective",
    "captureAll",
    "closeBatch",
    "queryRejected",
    "manageAccount",
    "manageAccountById",
    "disburse"
})
public class Operations {

    @XmlElement(name = "Verify")
    protected Boolean verify;
    @XmlElement(name = "QueryAccount")
    protected Boolean queryAccount;
    @XmlElement(name = "AuthAndCapture")
    protected Boolean authAndCapture;
    @XmlElement(name = "Authorize")
    protected Boolean authorize;
    @XmlElement(name = "Adjust")
    protected Boolean adjust;
    @XmlElement(name = "ReturnById")
    protected Boolean returnById;
    @XmlElement(name = "ReturnUnlinked")
    protected Boolean returnUnlinked;
    @XmlElement(name = "Undo")
    protected Boolean undo;
    @XmlElement(name = "Capture")
    protected Boolean capture;
    @XmlElement(name = "CaptureSelective")
    protected Boolean captureSelective;
    @XmlElement(name = "CaptureAll")
    protected Boolean captureAll;
    @XmlElement(name = "CloseBatch")
    protected CloseBatch closeBatch;
    @XmlElement(name = "QueryRejected")
    protected Boolean queryRejected;
    @XmlElement(name = "ManageAccount")
    protected Boolean manageAccount;
    @XmlElement(name = "ManageAccountById")
    protected Boolean manageAccountById;
    @XmlElement(name = "Disburse")
    protected Boolean disburse;

    /**
     * Gets the value of the verify property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerify() {
        return verify;
    }

    /**
     * Sets the value of the verify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerify(Boolean value) {
        this.verify = value;
    }

    /**
     * Gets the value of the queryAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueryAccount() {
        return queryAccount;
    }

    /**
     * Sets the value of the queryAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryAccount(Boolean value) {
        this.queryAccount = value;
    }

    /**
     * Gets the value of the authAndCapture property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthAndCapture() {
        return authAndCapture;
    }

    /**
     * Sets the value of the authAndCapture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthAndCapture(Boolean value) {
        this.authAndCapture = value;
    }

    /**
     * Gets the value of the authorize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorize() {
        return authorize;
    }

    /**
     * Sets the value of the authorize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorize(Boolean value) {
        this.authorize = value;
    }

    /**
     * Gets the value of the adjust property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjust() {
        return adjust;
    }

    /**
     * Sets the value of the adjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjust(Boolean value) {
        this.adjust = value;
    }

    /**
     * Gets the value of the returnById property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnById() {
        return returnById;
    }

    /**
     * Sets the value of the returnById property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnById(Boolean value) {
        this.returnById = value;
    }

    /**
     * Gets the value of the returnUnlinked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnUnlinked() {
        return returnUnlinked;
    }

    /**
     * Sets the value of the returnUnlinked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnUnlinked(Boolean value) {
        this.returnUnlinked = value;
    }

    /**
     * Gets the value of the undo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUndo() {
        return undo;
    }

    /**
     * Sets the value of the undo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUndo(Boolean value) {
        this.undo = value;
    }

    /**
     * Gets the value of the capture property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCapture() {
        return capture;
    }

    /**
     * Sets the value of the capture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCapture(Boolean value) {
        this.capture = value;
    }

    /**
     * Gets the value of the captureSelective property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaptureSelective() {
        return captureSelective;
    }

    /**
     * Sets the value of the captureSelective property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaptureSelective(Boolean value) {
        this.captureSelective = value;
    }

    /**
     * Gets the value of the captureAll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaptureAll() {
        return captureAll;
    }

    /**
     * Sets the value of the captureAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaptureAll(Boolean value) {
        this.captureAll = value;
    }

    /**
     * Gets the value of the closeBatch property.
     * 
     * @return
     *     possible object is
     *     {@link CloseBatch }
     *     
     */
    public CloseBatch getCloseBatch() {
        return closeBatch;
    }

    /**
     * Sets the value of the closeBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseBatch }
     *     
     */
    public void setCloseBatch(CloseBatch value) {
        this.closeBatch = value;
    }

    /**
     * Gets the value of the queryRejected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueryRejected() {
        return queryRejected;
    }

    /**
     * Sets the value of the queryRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryRejected(Boolean value) {
        this.queryRejected = value;
    }

    /**
     * Gets the value of the manageAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManageAccount() {
        return manageAccount;
    }

    /**
     * Sets the value of the manageAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManageAccount(Boolean value) {
        this.manageAccount = value;
    }

    /**
     * Gets the value of the manageAccountById property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManageAccountById() {
        return manageAccountById;
    }

    /**
     * Sets the value of the manageAccountById property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManageAccountById(Boolean value) {
        this.manageAccountById = value;
    }

    /**
     * Gets the value of the disburse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisburse() {
        return disburse;
    }

    /**
     * Sets the value of the disburse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisburse(Boolean value) {
        this.disburse = value;
    }

}
