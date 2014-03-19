
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.IndustryType;
import com.evosnap.schemas.cws.v2_0.transactions.Response;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro.BankcardCaptureResponsePro;


/**
 * <p>Java class for BankcardCaptureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardCaptureResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Response">
 *       &lt;sequence>
 *         &lt;element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndustryType" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}IndustryType" minOccurs="0"/>
 *         &lt;element name="TransactionSummaryData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}TransactionSummaryData" minOccurs="0"/>
 *         &lt;element name="PrepaidCard" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}PrepaidCard" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardCaptureResponse", propOrder = {
    "batchId",
    "industryType",
    "transactionSummaryData",
    "prepaidCard"
})
@XmlSeeAlso({
    BankcardCaptureResponsePro.class
})
public class BankcardCaptureResponse
    extends Response
{

    @XmlElement(name = "BatchId", nillable = true)
    protected String batchId;
    @XmlElement(name = "IndustryType")
    protected IndustryType industryType;
    @XmlElement(name = "TransactionSummaryData", nillable = true)
    protected TransactionSummaryData transactionSummaryData;
    @XmlElement(name = "PrepaidCard")
    protected PrepaidCard prepaidCard;

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
     * Gets the value of the transactionSummaryData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSummaryData }
     *     
     */
    public TransactionSummaryData getTransactionSummaryData() {
        return transactionSummaryData;
    }

    /**
     * Sets the value of the transactionSummaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSummaryData }
     *     
     */
    public void setTransactionSummaryData(TransactionSummaryData value) {
        this.transactionSummaryData = value;
    }

    /**
     * Gets the value of the prepaidCard property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidCard }
     *     
     */
    public PrepaidCard getPrepaidCard() {
        return prepaidCard;
    }

    /**
     * Sets the value of the prepaidCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidCard }
     *     
     */
    public void setPrepaidCard(PrepaidCard value) {
        this.prepaidCard = value;
    }

}
