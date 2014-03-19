
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartialApprovalSupportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartialApprovalSupportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DisabledAlwaysSupported"/>
 *     &lt;enumeration value="DisabledNotSupported"/>
 *     &lt;enumeration value="Enabled"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PartialApprovalSupportType")
@XmlEnum
public enum PartialApprovalSupportType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Service does not support setting partial approval capability at the transaction level. Partial approvals are always supported and are set at the merchant account level. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DisabledAlwaysSupported")
    DISABLED_ALWAYS_SUPPORTED("DisabledAlwaysSupported"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Service does not support setting partial approval capability at the transaction level, partial approvals are never supported. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DisabledNotSupported")
    DISABLED_NOT_SUPPORTED("DisabledNotSupported"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Service supports setting partial approval capability at the transaction level. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Enabled")
    ENABLED("Enabled");
    private final String value;

    PartialApprovalSupportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartialApprovalSupportType fromValue(String v) {
        for (PartialApprovalSupportType c: PartialApprovalSupportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
