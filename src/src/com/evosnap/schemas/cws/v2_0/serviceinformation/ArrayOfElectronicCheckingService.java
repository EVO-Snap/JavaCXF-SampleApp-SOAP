
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfElectronicCheckingService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfElectronicCheckingService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ElectronicCheckingService" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}ElectronicCheckingService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfElectronicCheckingService", propOrder = {
    "electronicCheckingService"
})
public class ArrayOfElectronicCheckingService {

    @XmlElement(name = "ElectronicCheckingService", nillable = true)
    protected List<ElectronicCheckingService> electronicCheckingService;

    /**
     * Gets the value of the electronicCheckingService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicCheckingService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicCheckingService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicCheckingService }
     * 
     * 
     */
    public List<ElectronicCheckingService> getElectronicCheckingService() {
        if (electronicCheckingService == null) {
            electronicCheckingService = new ArrayList<ElectronicCheckingService>();
        }
        return this.electronicCheckingService;
    }

}
