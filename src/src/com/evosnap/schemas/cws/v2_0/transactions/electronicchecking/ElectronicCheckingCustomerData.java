
package com.evosnap.schemas.cws.v2_0.transactions.electronicchecking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.PersonalInfo;
import com.evosnap.schemas.cws.v2_0.transactions.TransactionCustomerData;


/**
 * <p>Java class for ElectronicCheckingCustomerData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicCheckingCustomerData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}TransactionCustomerData">
 *       &lt;sequence>
 *         &lt;element name="AdditionalBillingData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}PersonalInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicCheckingCustomerData", propOrder = {
    "additionalBillingData"
})
public class ElectronicCheckingCustomerData
    extends TransactionCustomerData
{

    @XmlElement(name = "AdditionalBillingData", nillable = true)
    protected PersonalInfo additionalBillingData;

    /**
     * Gets the value of the additionalBillingData property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInfo }
     *     
     */
    public PersonalInfo getAdditionalBillingData() {
        return additionalBillingData;
    }

    /**
     * Sets the value of the additionalBillingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInfo }
     *     
     */
    public void setAdditionalBillingData(PersonalInfo value) {
        this.additionalBillingData = value;
    }

}
