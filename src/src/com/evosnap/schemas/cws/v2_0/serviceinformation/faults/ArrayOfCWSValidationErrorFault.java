
package com.evosnap.schemas.cws.v2_0.serviceinformation.faults;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCWSValidationErrorFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCWSValidationErrorFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CWSValidationErrorFault" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults}CWSValidationErrorFault" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCWSValidationErrorFault", propOrder = {
    "cwsValidationErrorFault"
})
public class ArrayOfCWSValidationErrorFault {

    @XmlElement(name = "CWSValidationErrorFault", nillable = true)
    protected List<CWSValidationErrorFault> cwsValidationErrorFault;

    /**
     * Gets the value of the cwsValidationErrorFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cwsValidationErrorFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCWSValidationErrorFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CWSValidationErrorFault }
     * 
     * 
     */
    public List<CWSValidationErrorFault> getCWSValidationErrorFault() {
        if (cwsValidationErrorFault == null) {
            cwsValidationErrorFault = new ArrayList<CWSValidationErrorFault>();
        }
        return this.cwsValidationErrorFault;
    }

}
