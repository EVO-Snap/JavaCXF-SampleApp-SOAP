
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.ArrayOfCapture;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


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
 *         &lt;element name="differenceData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}ArrayOfCapture" minOccurs="0"/>
 *         &lt;element name="batchIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="applicationProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forceClose" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "differenceData",
    "batchIds",
    "applicationProfileId",
    "merchantProfileId",
    "workflowId",
    "forceClose"
})
@XmlRootElement(name = "CaptureAll")
public class CaptureAll {

    @XmlElement(nillable = true)
    protected String sessionToken;
    @XmlElement(nillable = true)
    protected ArrayOfCapture differenceData;
    @XmlElement(nillable = true)
    protected ArrayOfstring batchIds;
    @XmlElement(nillable = true)
    protected String applicationProfileId;
    @XmlElement(nillable = true)
    protected String merchantProfileId;
    @XmlElement(nillable = true)
    protected String workflowId;
    protected Boolean forceClose;

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
     * Gets the value of the differenceData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCapture }
     *     
     */
    public ArrayOfCapture getDifferenceData() {
        return differenceData;
    }

    /**
     * Sets the value of the differenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCapture }
     *     
     */
    public void setDifferenceData(ArrayOfCapture value) {
        this.differenceData = value;
    }

    /**
     * Gets the value of the batchIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getBatchIds() {
        return batchIds;
    }

    /**
     * Sets the value of the batchIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setBatchIds(ArrayOfstring value) {
        this.batchIds = value;
    }

    /**
     * Gets the value of the applicationProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationProfileId() {
        return applicationProfileId;
    }

    /**
     * Sets the value of the applicationProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationProfileId(String value) {
        this.applicationProfileId = value;
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
     * Gets the value of the workflowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowId() {
        return workflowId;
    }

    /**
     * Sets the value of the workflowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowId(String value) {
        this.workflowId = value;
    }

    /**
     * Gets the value of the forceClose property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceClose() {
        return forceClose;
    }

    /**
     * Sets the value of the forceClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceClose(Boolean value) {
        this.forceClose = value;
    }

}
