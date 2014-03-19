
package com.evosnap.schemas.cws.v2_0.dataservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/DataServices" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Indicates that the Transaction Processing Service is temporarily unavailable. The client application should Undo the transaction and try again. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DataServicesUnavailableFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataServicesUnavailableFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/DataServices}DSBaseFault">
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
@XmlType(name = "DataServicesUnavailableFault")
public class DataServicesUnavailableFault
    extends DSBaseFault
{


}
