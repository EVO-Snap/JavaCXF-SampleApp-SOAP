
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfItemizedTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfItemizedTax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemizedTax" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}ItemizedTax" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfItemizedTax", propOrder = {
    "itemizedTax"
})
public class ArrayOfItemizedTax {

    @XmlElement(name = "ItemizedTax", nillable = true)
    protected List<ItemizedTax> itemizedTax;

    /**
     * Gets the value of the itemizedTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemizedTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemizedTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemizedTax }
     * 
     * 
     */
    public List<ItemizedTax> getItemizedTax() {
        if (itemizedTax == null) {
            itemizedTax = new ArrayList<ItemizedTax>();
        }
        return this.itemizedTax;
    }

}
