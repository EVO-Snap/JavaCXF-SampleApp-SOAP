
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.Transaction;


/**
 * <p>Java class for StoredValueTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoredValueTransaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Transaction">
 *       &lt;sequence>
 *         &lt;element name="TenderData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}StoredValueTenderData" minOccurs="0"/>
 *         &lt;element name="TransactionData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}StoredValueTransactionData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueTransaction", propOrder = {
    "tenderData",
    "transactionData"
})
public class StoredValueTransaction
    extends Transaction
{

    @XmlElement(name = "TenderData", nillable = true)
    protected StoredValueTenderData tenderData;
    @XmlElement(name = "TransactionData", nillable = true)
    protected StoredValueTransactionData transactionData;

    /**
     * Gets the value of the tenderData property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueTenderData }
     *     
     */
    public StoredValueTenderData getTenderData() {
        return tenderData;
    }

    /**
     * Sets the value of the tenderData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueTenderData }
     *     
     */
    public void setTenderData(StoredValueTenderData value) {
        this.tenderData = value;
    }

    /**
     * Gets the value of the transactionData property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueTransactionData }
     *     
     */
    public StoredValueTransactionData getTransactionData() {
        return transactionData;
    }

    /**
     * Sets the value of the transactionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueTransactionData }
     *     
     */
    public void setTransactionData(StoredValueTransactionData value) {
        this.transactionData = value;
    }

}
