
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information specific to the Bankcard Processing service class for the merchant using the application. Required for merchants using Credit Card and PIN Debit services. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BankcardMerchantData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardMerchantData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ABANumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcquirerBIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgentBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgentChain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Aggregator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClientNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndustryType" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}IndustryType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintCustomerServicePhone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QualificationCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReimbursementAttribute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettlementAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SharingGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StoreId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeZoneDifferential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardMerchantData", propOrder = {
    "abaNumber",
    "acquirerBIN",
    "agentBank",
    "agentChain",
    "aggregator",
    "clientNumber",
    "industryType",
    "location",
    "merchantType",
    "printCustomerServicePhone",
    "qualificationCodes",
    "reimbursementAttribute",
    "sic",
    "secondaryTerminalId",
    "settlementAgent",
    "sharingGroup",
    "storeId",
    "terminalId",
    "timeZoneDifferential"
})
public class BankcardMerchantData {

    @XmlElement(name = "ABANumber", nillable = true)
    protected String abaNumber;
    @XmlElement(name = "AcquirerBIN", nillable = true)
    protected String acquirerBIN;
    @XmlElement(name = "AgentBank", nillable = true)
    protected String agentBank;
    @XmlElement(name = "AgentChain", nillable = true)
    protected String agentChain;
    @XmlElement(name = "Aggregator")
    protected Boolean aggregator;
    @XmlElement(name = "ClientNumber", nillable = true)
    protected String clientNumber;
    @XmlElement(name = "IndustryType")
    protected IndustryType industryType;
    @XmlElement(name = "Location", nillable = true)
    protected String location;
    @XmlElement(name = "MerchantType", nillable = true)
    protected String merchantType;
    @XmlElement(name = "PrintCustomerServicePhone")
    protected Boolean printCustomerServicePhone;
    @XmlElement(name = "QualificationCodes", nillable = true)
    protected String qualificationCodes;
    @XmlElement(name = "ReimbursementAttribute", nillable = true)
    protected String reimbursementAttribute;
    @XmlElement(name = "SIC", nillable = true)
    protected String sic;
    @XmlElement(name = "SecondaryTerminalId", nillable = true)
    protected String secondaryTerminalId;
    @XmlElement(name = "SettlementAgent", nillable = true)
    protected String settlementAgent;
    @XmlElement(name = "SharingGroup", nillable = true)
    protected String sharingGroup;
    @XmlElement(name = "StoreId", nillable = true)
    protected String storeId;
    @XmlElement(name = "TerminalId", nillable = true)
    protected String terminalId;
    @XmlElement(name = "TimeZoneDifferential", nillable = true)
    protected String timeZoneDifferential;

    /**
     * Gets the value of the abaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABANumber() {
        return abaNumber;
    }

    /**
     * Sets the value of the abaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABANumber(String value) {
        this.abaNumber = value;
    }

    /**
     * Gets the value of the acquirerBIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerBIN() {
        return acquirerBIN;
    }

    /**
     * Sets the value of the acquirerBIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquirerBIN(String value) {
        this.acquirerBIN = value;
    }

    /**
     * Gets the value of the agentBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentBank() {
        return agentBank;
    }

    /**
     * Sets the value of the agentBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentBank(String value) {
        this.agentBank = value;
    }

    /**
     * Gets the value of the agentChain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentChain() {
        return agentChain;
    }

    /**
     * Sets the value of the agentChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentChain(String value) {
        this.agentChain = value;
    }

    /**
     * Gets the value of the aggregator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAggregator() {
        return aggregator;
    }

    /**
     * Sets the value of the aggregator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAggregator(Boolean value) {
        this.aggregator = value;
    }

    /**
     * Gets the value of the clientNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientNumber() {
        return clientNumber;
    }

    /**
     * Sets the value of the clientNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientNumber(String value) {
        this.clientNumber = value;
    }

    /**
     * Gets the value of the industryType property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryType }
     *     
     */
    public IndustryType getIndustryType() {
        return industryType;
    }

    /**
     * Sets the value of the industryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryType }
     *     
     */
    public void setIndustryType(IndustryType value) {
        this.industryType = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the merchantType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantType() {
        return merchantType;
    }

    /**
     * Sets the value of the merchantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantType(String value) {
        this.merchantType = value;
    }

    /**
     * Gets the value of the printCustomerServicePhone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintCustomerServicePhone() {
        return printCustomerServicePhone;
    }

    /**
     * Sets the value of the printCustomerServicePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintCustomerServicePhone(Boolean value) {
        this.printCustomerServicePhone = value;
    }

    /**
     * Gets the value of the qualificationCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationCodes() {
        return qualificationCodes;
    }

    /**
     * Sets the value of the qualificationCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationCodes(String value) {
        this.qualificationCodes = value;
    }

    /**
     * Gets the value of the reimbursementAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReimbursementAttribute() {
        return reimbursementAttribute;
    }

    /**
     * Sets the value of the reimbursementAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReimbursementAttribute(String value) {
        this.reimbursementAttribute = value;
    }

    /**
     * Gets the value of the sic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIC() {
        return sic;
    }

    /**
     * Sets the value of the sic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIC(String value) {
        this.sic = value;
    }

    /**
     * Gets the value of the secondaryTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryTerminalId() {
        return secondaryTerminalId;
    }

    /**
     * Sets the value of the secondaryTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryTerminalId(String value) {
        this.secondaryTerminalId = value;
    }

    /**
     * Gets the value of the settlementAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAgent() {
        return settlementAgent;
    }

    /**
     * Sets the value of the settlementAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAgent(String value) {
        this.settlementAgent = value;
    }

    /**
     * Gets the value of the sharingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharingGroup() {
        return sharingGroup;
    }

    /**
     * Sets the value of the sharingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharingGroup(String value) {
        this.sharingGroup = value;
    }

    /**
     * Gets the value of the storeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * Sets the value of the storeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreId(String value) {
        this.storeId = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the timeZoneDifferential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneDifferential() {
        return timeZoneDifferential;
    }

    /**
     * Sets the value of the timeZoneDifferential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneDifferential(String value) {
        this.timeZoneDifferential = value;
    }

}
