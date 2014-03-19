
package com.evosnap.schemas.cws.v2_0.transactions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCapture complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCapture">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Capture" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Capture" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCapture", propOrder = {
    "capture"
})
public class ArrayOfCapture {

    @XmlElement(name = "Capture", nillable = true)
    protected List<Capture> capture;

    /**
     * Gets the value of the capture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Capture }
     * 
     * 
     */
    public List<Capture> getCapture() {
        if (capture == null) {
            capture = new ArrayList<Capture>();
        }
        return this.capture;
    }

}
