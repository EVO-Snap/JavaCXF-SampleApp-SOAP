
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMerchantProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMerchantProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MerchantProfile" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}MerchantProfile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMerchantProfile", propOrder = {
    "merchantProfile"
})
public class ArrayOfMerchantProfile {

    @XmlElement(name = "MerchantProfile", nillable = true)
    protected List<MerchantProfile> merchantProfile;

    /**
     * Gets the value of the merchantProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the merchantProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMerchantProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerchantProfile }
     * 
     * 
     */
    public List<MerchantProfile> getMerchantProfile() {
        if (merchantProfile == null) {
            merchantProfile = new ArrayList<MerchantProfile>();
        }
        return this.merchantProfile;
    }

}
