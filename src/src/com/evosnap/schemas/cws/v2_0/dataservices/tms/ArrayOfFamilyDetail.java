
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFamilyDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFamilyDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FamilyDetail" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}FamilyDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFamilyDetail", propOrder = {
    "familyDetail"
})
public class ArrayOfFamilyDetail {

    @XmlElement(name = "FamilyDetail", nillable = true)
    protected List<FamilyDetail> familyDetail;

    /**
     * Gets the value of the familyDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyDetail }
     * 
     * 
     */
    public List<FamilyDetail> getFamilyDetail() {
        if (familyDetail == null) {
            familyDetail = new ArrayList<FamilyDetail>();
        }
        return this.familyDetail;
    }

}
