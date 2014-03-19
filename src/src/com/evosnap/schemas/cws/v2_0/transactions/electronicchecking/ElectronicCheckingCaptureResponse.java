
package com.evosnap.schemas.cws.v2_0.transactions.electronicchecking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.Response;
import com.evosnap.schemas.cws.v2_0.transactions.SummaryData;


/**
 * <p>Java class for ElectronicCheckingCaptureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicCheckingCaptureResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Response">
 *       &lt;sequence>
 *         &lt;element name="SummaryData" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}SummaryData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicCheckingCaptureResponse", propOrder = {
    "summaryData"
})
public class ElectronicCheckingCaptureResponse
    extends Response
{

    @XmlElement(name = "SummaryData", nillable = true)
    protected SummaryData summaryData;

    /**
     * Gets the value of the summaryData property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryData }
     *     
     */
    public SummaryData getSummaryData() {
        return summaryData;
    }

    /**
     * Sets the value of the summaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryData }
     *     
     */
    public void setSummaryData(SummaryData value) {
        this.summaryData = value;
    }

}
