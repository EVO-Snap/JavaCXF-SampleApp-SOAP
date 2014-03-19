
package com.evosnap.schemas.cws.v2_0.transactions.electronicchecking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.Transaction;


/**
 * <p>Java class for ElectronicCheckingTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicCheckingTransaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Transaction">
 *       &lt;sequence>
 *         &lt;element name="TenderData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking}ElectronicCheckingTenderData" minOccurs="0"/>
 *         &lt;element name="TransactionData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking}ElectronicCheckingTransactionData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicCheckingTransaction", propOrder = {
    "tenderData",
    "transactionData"
})
public class ElectronicCheckingTransaction
    extends Transaction
{

    @XmlElement(name = "TenderData", nillable = true)
    protected ElectronicCheckingTenderData tenderData;
    @XmlElement(name = "TransactionData", nillable = true)
    protected ElectronicCheckingTransactionData transactionData;

    /**
     * Gets the value of the tenderData property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicCheckingTenderData }
     *     
     */
    public ElectronicCheckingTenderData getTenderData() {
        return tenderData;
    }

    /**
     * Sets the value of the tenderData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicCheckingTenderData }
     *     
     */
    public void setTenderData(ElectronicCheckingTenderData value) {
        this.tenderData = value;
    }

    /**
     * Gets the value of the transactionData property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicCheckingTransactionData }
     *     
     */
    public ElectronicCheckingTransactionData getTransactionData() {
        return transactionData;
    }

    /**
     * Sets the value of the transactionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicCheckingTransactionData }
     *     
     */
    public void setTransactionData(ElectronicCheckingTransactionData value) {
        this.transactionData = value;
    }

}
