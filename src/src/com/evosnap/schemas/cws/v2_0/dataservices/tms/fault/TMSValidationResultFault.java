
package com.evosnap.schemas.cws.v2_0.dataservices.tms.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.dataservices.tms.faults.TMSBaseFault;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contains a collection of one or more PTLS XML error messages in CWSValidationErrorFault. The application should respond to these validation errors and correct the data being sent in. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TMSValidationResultFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMSValidationResultFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults}TMSBaseFault">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault}ArrayOfTMSValidationError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSValidationResultFault", propOrder = {
    "errors"
})
public class TMSValidationResultFault
    extends TMSBaseFault
{

    @XmlElement(name = "Errors", nillable = true)
    protected ArrayOfTMSValidationError errors;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTMSValidationError }
     *     
     */
    public ArrayOfTMSValidationError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTMSValidationError }
     *     
     */
    public void setErrors(ArrayOfTMSValidationError value) {
        this.errors = value;
    }

}
