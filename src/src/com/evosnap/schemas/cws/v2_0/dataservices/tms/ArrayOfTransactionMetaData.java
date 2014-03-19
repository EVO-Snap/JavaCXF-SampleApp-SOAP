
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTransactionMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTransactionMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionMetaData" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}TransactionMetaData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTransactionMetaData", propOrder = {
    "transactionMetaData"
})
public class ArrayOfTransactionMetaData {

    @XmlElement(name = "TransactionMetaData", nillable = true)
    protected List<TransactionMetaData> transactionMetaData;

    /**
     * Gets the value of the transactionMetaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionMetaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionMetaData }
     * 
     * 
     */
    public List<TransactionMetaData> getTransactionMetaData() {
        if (transactionMetaData == null) {
            transactionMetaData = new ArrayList<TransactionMetaData>();
        }
        return this.transactionMetaData;
    }

}
