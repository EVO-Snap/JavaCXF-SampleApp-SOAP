
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.Return;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro.BankcardReturnPro;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information for returning Bankcard transactions (Credit and PIN Debit). Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BankcardReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardReturn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Return">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TenderData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}BankcardTenderData" minOccurs="0"/>
 *         &lt;element name="FeeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}TransactionCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardReturn", propOrder = {
    "amount",
    "tenderData",
    "feeAmount",
    "transactionCode"
})
@XmlSeeAlso({
    BankcardReturnPro.class
})
public class BankcardReturn
    extends Return
{

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "TenderData", nillable = true)
    protected BankcardTenderData tenderData;
    @XmlElement(name = "FeeAmount")
    protected BigDecimal feeAmount;
    @XmlElement(name = "TransactionCode")
    protected TransactionCode transactionCode;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
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
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeAmount(BigDecimal value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCode }
     *     
     */
    public TransactionCode getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCode }
     *     
     */
    public void setTransactionCode(TransactionCode value) {
        this.transactionCode = value;
    }

}
