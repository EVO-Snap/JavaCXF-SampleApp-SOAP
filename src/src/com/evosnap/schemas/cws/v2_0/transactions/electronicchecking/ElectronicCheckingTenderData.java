
package com.evosnap.schemas.cws.v2_0.transactions.electronicchecking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.TransactionTenderData;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains information about the Electronic Checking transaction tender data. Required. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ElectronicCheckingTenderData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicCheckingTenderData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}TransactionTenderData">
 *       &lt;sequence>
 *         &lt;element name="CheckData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking}CheckData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicCheckingTenderData", propOrder = {
    "checkData"
})
public class ElectronicCheckingTenderData
    extends TransactionTenderData
{

    @XmlElement(name = "CheckData", nillable = true)
    protected CheckData checkData;

    /**
     * Gets the value of the checkData property.
     * 
     * @return
     *     possible object is
     *     {@link CheckData }
     *     
     */
    public CheckData getCheckData() {
        return checkData;
    }

    /**
     * Sets the value of the checkData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckData }
     *     
     */
    public void setCheckData(CheckData value) {
        this.checkData = value;
    }

}
