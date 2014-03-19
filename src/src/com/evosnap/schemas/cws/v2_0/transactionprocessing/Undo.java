
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="differenceData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Undo" minOccurs="0"/>
 *         &lt;element name="applicationProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workflowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "applicationProfileId",
    "workflowId"
})
@XmlRootElement(name = "Undo")
public class Undo {

    @XmlElement(nillable = true)
    protected String sessionToken;
    @XmlElement(nillable = true)
    protected com.evosnap.schemas.cws.v2_0.transactions.Undo differenceData;
    @XmlElement(nillable = true)
    protected String applicationProfileId;
    @XmlElement(nillable = true)
    protected String workflowId;

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
     *     {@link com.evosnap.schemas.cws.v2_0.transactions.Undo }
     *     
     */
    public com.evosnap.schemas.cws.v2_0.transactions.Undo getDifferenceData() {
        return differenceData;
    }

    /**
     * Sets the value of the differenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.evosnap.schemas.cws.v2_0.transactions.Undo }
     *     
     */
    public void setDifferenceData(com.evosnap.schemas.cws.v2_0.transactions.Undo value) {
        this.differenceData = value;
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

}
