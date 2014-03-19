
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.Response;
import com.evosnap.schemas.cws.v2_0.transactions.SummaryData;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Response to capturing one or more Stored Value transactions. Expected. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for StoredValueCaptureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoredValueCaptureResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Response">
 *       &lt;sequence>
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SummaryData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}SummaryData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueCaptureResponse", propOrder = {
    "batchId",
    "summaryData"
})
public class StoredValueCaptureResponse
    extends Response
{

    @XmlElement(name = "BatchId", nillable = true)
    protected String batchId;
    @XmlElement(name = "SummaryData", nillable = true)
    protected SummaryData summaryData;

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the summaryData property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryData }
     *     
     */
    public SummaryData getSummaryData() {
        return summaryData;
    }

    /**
     * Sets the value of the summaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryData }
     *     
     */
    public void setSummaryData(SummaryData value) {
        this.summaryData = value;
    }

}
