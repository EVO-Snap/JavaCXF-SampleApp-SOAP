
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElectronicCheckingRejectedDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicCheckingRejectedDetailResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}QueryResponse">
 *       &lt;sequence>
 *         &lt;element name="Summary" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}RejectedSummary" minOccurs="0"/>
 *         &lt;element name="Transactions" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}ArrayOfTransactionDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicCheckingRejectedDetailResponse", propOrder = {
    "summary",
    "transactions"
})
public class ElectronicCheckingRejectedDetailResponse
    extends QueryResponse
{

    @XmlElement(name = "Summary", nillable = true)
    protected RejectedSummary summary;
    @XmlElement(name = "Transactions", nillable = true)
    protected ArrayOfTransactionDetail transactions;

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedSummary }
     *     
     */
    public RejectedSummary getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedSummary }
     *     
     */
    public void setSummary(RejectedSummary value) {
        this.summary = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransactionDetail }
     *     
     */
    public ArrayOfTransactionDetail getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransactionDetail }
     *     
     */
    public void setTransactions(ArrayOfTransactionDetail value) {
        this.transactions = value;
    }

}
