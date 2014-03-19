
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTransactionClassTypePair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTransactionClassTypePair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionClassTypePair" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}TransactionClassTypePair" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTransactionClassTypePair", propOrder = {
    "transactionClassTypePair"
})
public class ArrayOfTransactionClassTypePair {

    @XmlElement(name = "TransactionClassTypePair", nillable = true)
    protected List<TransactionClassTypePair> transactionClassTypePair;

    /**
     * Gets the value of the transactionClassTypePair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionClassTypePair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionClassTypePair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionClassTypePair }
     * 
     * 
     */
    public List<TransactionClassTypePair> getTransactionClassTypePair() {
        if (transactionClassTypePair == null) {
            transactionClassTypePair = new ArrayList<TransactionClassTypePair>();
        }
        return this.transactionClassTypePair;
    }

}
