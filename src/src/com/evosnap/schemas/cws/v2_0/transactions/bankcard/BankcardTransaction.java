
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.Transaction;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro.BankcardTransactionPro;


/**
 * <p>Java class for BankcardTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardTransaction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Transaction">
 *       &lt;sequence>
 *         &lt;element name="ApplicationConfigurationData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}BankcardApplicationConfigurationData" minOccurs="0"/>
 *         &lt;element name="TenderData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}BankcardTenderData" minOccurs="0"/>
 *         &lt;element name="TransactionData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}BankcardTransactionData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardTransaction", propOrder = {
    "applicationConfigurationData",
    "tenderData",
    "transactionData"
})
@XmlSeeAlso({
    BankcardTransactionPro.class
})
public class BankcardTransaction
    extends Transaction
{

    @XmlElement(name = "ApplicationConfigurationData", nillable = true)
    protected BankcardApplicationConfigurationData applicationConfigurationData;
    @XmlElement(name = "TenderData", nillable = true)
    protected BankcardTenderData tenderData;
    @XmlElement(name = "TransactionData", nillable = true)
    protected BankcardTransactionData transactionData;

    /**
     * Gets the value of the applicationConfigurationData property.
     * 
     * @return
     *     possible object is
     *     {@link BankcardApplicationConfigurationData }
     *     
     */
    public BankcardApplicationConfigurationData getApplicationConfigurationData() {
        return applicationConfigurationData;
    }

    /**
     * Sets the value of the applicationConfigurationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankcardApplicationConfigurationData }
     *     
     */
    public void setApplicationConfigurationData(BankcardApplicationConfigurationData value) {
        this.applicationConfigurationData = value;
    }

    /**
     * Gets the value of the tenderData property.
     * 
     * @return
     *     possible object is
     *     {@link BankcardTenderData }
     *     
     */
    public BankcardTenderData getTenderData() {
        return tenderData;
    }

    /**
     * Sets the value of the tenderData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankcardTenderData }
     *     
     */
    public void setTenderData(BankcardTenderData value) {
        this.tenderData = value;
    }

    /**
     * Gets the value of the transactionData property.
     * 
     * @return
     *     possible object is
     *     {@link BankcardTransactionData }
     *     
     */
    public BankcardTransactionData getTransactionData() {
        return transactionData;
    }

    /**
     * Sets the value of the transactionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankcardTransactionData }
     *     
     */
    public void setTransactionData(BankcardTransactionData value) {
        this.transactionData = value;
    }

}
