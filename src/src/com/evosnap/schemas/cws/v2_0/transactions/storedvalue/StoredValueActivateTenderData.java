
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoredValueActivateTenderData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoredValueActivateTenderData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}StoredValueTenderData">
 *       &lt;sequence>
 *         &lt;element name="VirtualCardData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}VirtualCardData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueActivateTenderData", propOrder = {
    "virtualCardData"
})
public class StoredValueActivateTenderData
    extends StoredValueTenderData
{

    @XmlElement(name = "VirtualCardData", nillable = true)
    protected VirtualCardData virtualCardData;

    /**
     * Gets the value of the virtualCardData property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualCardData }
     *     
     */
    public VirtualCardData getVirtualCardData() {
        return virtualCardData;
    }

    /**
     * Sets the value of the virtualCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualCardData }
     *     
     */
    public void setVirtualCardData(VirtualCardData value) {
        this.virtualCardData = value;
    }

}
