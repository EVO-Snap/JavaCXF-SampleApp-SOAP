
package com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardTransaction;


/**
 * <p>Java class for BankcardTransactionPro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardTransactionPro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}BankcardTransaction">
 *       &lt;sequence>
 *         &lt;element name="InterchangeData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro}BankcardInterchangeData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardTransactionPro", propOrder = {
    "interchangeData"
})
public class BankcardTransactionPro
    extends BankcardTransaction
{

    @XmlElement(name = "InterchangeData", nillable = true)
    protected BankcardInterchangeData interchangeData;

    /**
     * Gets the value of the interchangeData property.
     * 
     * @return
     *     possible object is
     *     {@link BankcardInterchangeData }
     *     
     */
    public BankcardInterchangeData getInterchangeData() {
        return interchangeData;
    }

    /**
     * Sets the value of the interchangeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankcardInterchangeData }
     *     
     */
    public void setInterchangeData(BankcardInterchangeData value) {
        this.interchangeData = value;
    }

}
