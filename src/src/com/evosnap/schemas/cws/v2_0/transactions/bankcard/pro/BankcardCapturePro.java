
package com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.CustomerInfo;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.ArrayOfLineItemDetail;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardCapture;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.Level2Data;


/**
 * <p>Java class for BankcardCapturePro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardCapturePro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}BankcardCapture">
 *       &lt;sequence>
 *         &lt;element name="MultiplePartialCapture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Level2Data" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}Level2Data" minOccurs="0"/>
 *         &lt;element name="LineItemDetails" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}ArrayOfLineItemDetail" minOccurs="0"/>
 *         &lt;element name="ShippingData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}CustomerInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardCapturePro", propOrder = {
    "multiplePartialCapture",
    "level2Data",
    "lineItemDetails",
    "shippingData"
})
public class BankcardCapturePro
    extends BankcardCapture
{

    @XmlElement(name = "MultiplePartialCapture")
    protected Boolean multiplePartialCapture;
    @XmlElement(name = "Level2Data", nillable = true)
    protected Level2Data level2Data;
    @XmlElement(name = "LineItemDetails", nillable = true)
    protected ArrayOfLineItemDetail lineItemDetails;
    @XmlElement(name = "ShippingData", nillable = true)
    protected CustomerInfo shippingData;

    /**
     * Gets the value of the multiplePartialCapture property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiplePartialCapture() {
        return multiplePartialCapture;
    }

    /**
     * Sets the value of the multiplePartialCapture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiplePartialCapture(Boolean value) {
        this.multiplePartialCapture = value;
    }

    /**
     * Gets the value of the level2Data property.
     * 
     * @return
     *     possible object is
     *     {@link Level2Data }
     *     
     */
    public Level2Data getLevel2Data() {
        return level2Data;
    }

    /**
     * Sets the value of the level2Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Level2Data }
     *     
     */
    public void setLevel2Data(Level2Data value) {
        this.level2Data = value;
    }

    /**
     * Gets the value of the lineItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLineItemDetail }
     *     
     */
    public ArrayOfLineItemDetail getLineItemDetails() {
        return lineItemDetails;
    }

    /**
     * Sets the value of the lineItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLineItemDetail }
     *     
     */
    public void setLineItemDetails(ArrayOfLineItemDetail value) {
        this.lineItemDetails = value;
    }

    /**
     * Gets the value of the shippingData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfo }
     *     
     */
    public CustomerInfo getShippingData() {
        return shippingData;
    }

    /**
     * Sets the value of the shippingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfo }
     *     
     */
    public void setShippingData(CustomerInfo value) {
        this.shippingData = value;
    }

}
