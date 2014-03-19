
package com.evosnap.schemas.cws.v2_0.serviceinformation.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Indicates that the Service Information Service is temporary unavailable. The client application should retry the operation. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CWSServiceInformationUnavailableFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CWSServiceInformationUnavailableFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults}CWSBaseFault">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CWSServiceInformationUnavailableFault")
public class CWSServiceInformationUnavailableFault
    extends CWSBaseFault
{


}
