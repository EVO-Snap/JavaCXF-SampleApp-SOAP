
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfConsumerIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConsumerIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsumerIdentification" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue}ConsumerIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConsumerIdentification", propOrder = {
    "consumerIdentification"
})
public class ArrayOfConsumerIdentification {

    @XmlElement(name = "ConsumerIdentification", nillable = true)
    protected List<ConsumerIdentification> consumerIdentification;

    /**
     * Gets the value of the consumerIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumerIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumerIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumerIdentification }
     * 
     * 
     */
    public List<ConsumerIdentification> getConsumerIdentification() {
        if (consumerIdentification == null) {
            consumerIdentification = new ArrayList<ConsumerIdentification>();
        }
        return this.consumerIdentification;
    }

}
