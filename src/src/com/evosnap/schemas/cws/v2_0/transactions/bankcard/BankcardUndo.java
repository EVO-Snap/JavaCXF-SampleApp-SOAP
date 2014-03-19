
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.Undo;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information for undoing (voiding) Bankcard transactions (Credit and PIN Debit). Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BankcardUndo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardUndo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Undo">
 *       &lt;sequence>
 *         &lt;element name="PINDebitReason" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}PINDebitUndoReason" minOccurs="0"/>
 *         &lt;element name="TenderData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}BankcardTenderData" minOccurs="0"/>
 *         &lt;element name="ForceVoid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardUndo", propOrder = {
    "pinDebitReason",
    "tenderData",
    "forceVoid"
})
public class BankcardUndo
    extends Undo
{

    @XmlElement(name = "PINDebitReason")
    protected PINDebitUndoReason pinDebitReason;
    @XmlElement(name = "TenderData", nillable = true)
    protected BankcardTenderData tenderData;
    @XmlElement(name = "ForceVoid")
    protected Boolean forceVoid;

    /**
     * Gets the value of the pinDebitReason property.
     * 
     * @return
     *     possible object is
     *     {@link PINDebitUndoReason }
     *     
     */
    public PINDebitUndoReason getPINDebitReason() {
        return pinDebitReason;
    }

    /**
     * Sets the value of the pinDebitReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINDebitUndoReason }
     *     
     */
    public void setPINDebitReason(PINDebitUndoReason value) {
        this.pinDebitReason = value;
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
     * Gets the value of the forceVoid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceVoid() {
        return forceVoid;
    }

    /**
     * Sets the value of the forceVoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceVoid(Boolean value) {
        this.forceVoid = value;
    }

}
