
package com.evosnap.schemas.cws.v2_0.dataservices.tms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBatchDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBatchDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BatchDetailData" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS}BatchDetailData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBatchDetailData", propOrder = {
    "batchDetailData"
})
public class ArrayOfBatchDetailData {

    @XmlElement(name = "BatchDetailData", nillable = true)
    protected List<BatchDetailData> batchDetailData;

    /**
     * Gets the value of the batchDetailData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchDetailData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchDetailData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchDetailData }
     * 
     * 
     */
    public List<BatchDetailData> getBatchDetailData() {
        if (batchDetailData == null) {
            batchDetailData = new ArrayList<BatchDetailData>();
        }
        return this.batchDetailData;
    }

}
