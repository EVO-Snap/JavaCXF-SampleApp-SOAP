
package com.evosnap.schemas.cws.v2_0.transactions.faults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Indicates that extended credit card data, such as Level 2, Level 3, and/or Managed Billing data, is not supported by the Service Provider. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CWSExtendedDataNotSupportedFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CWSExtendedDataNotSupportedFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults}CWSBaseFault">
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
@XmlType(name = "CWSExtendedDataNotSupportedFault")
public class CWSExtendedDataNotSupportedFault
    extends CWSBaseFault
{


}
