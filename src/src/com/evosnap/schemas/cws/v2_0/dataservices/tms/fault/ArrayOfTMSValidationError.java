
package com.evosnap.schemas.cws.v2_0.dataservices.tms.fault;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTMSValidationError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTMSValidationError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TMSValidationError" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault}TMSValidationError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTMSValidationError", propOrder = {
    "tmsValidationError"
})
public class ArrayOfTMSValidationError {

    @XmlElement(name = "TMSValidationError", nillable = true)
    protected List<TMSValidationError> tmsValidationError;

    /**
     * Gets the value of the tmsValidationError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmsValidationError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTMSValidationError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMSValidationError }
     * 
     * 
     */
    public List<TMSValidationError> getTMSValidationError() {
        if (tmsValidationError == null) {
            tmsValidationError = new ArrayList<TMSValidationError>();
        }
        return this.tmsValidationError;
    }

}
