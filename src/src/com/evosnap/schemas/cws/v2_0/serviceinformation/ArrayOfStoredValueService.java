
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStoredValueService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStoredValueService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StoredValueService" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}StoredValueService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStoredValueService", propOrder = {
    "storedValueService"
})
public class ArrayOfStoredValueService {

    @XmlElement(name = "StoredValueService", nillable = true)
    protected List<StoredValueService> storedValueService;

    /**
     * Gets the value of the storedValueService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storedValueService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoredValueService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredValueService }
     * 
     * 
     */
    public List<StoredValueService> getStoredValueService() {
        if (storedValueService == null) {
            storedValueService = new ArrayList<StoredValueService>();
        }
        return this.storedValueService;
    }

}
