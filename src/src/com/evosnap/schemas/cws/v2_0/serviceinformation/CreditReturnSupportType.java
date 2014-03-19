
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditReturnSupportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditReturnSupportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="Standalone"/>
 *     &lt;enumeration value="Linked"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditReturnSupportType")
@XmlEnum
public enum CreditReturnSupportType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PIN Debit returns are not supported. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Standalone PIN Debit returns are supported. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Standalone")
    STANDALONE("Standalone"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Linked PIN Debit returns are supported. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Linked")
    LINKED("Linked"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Both PIN Debit linked and standalone returns are supported. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    CreditReturnSupportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditReturnSupportType fromValue(String v) {
        for (CreditReturnSupportType c: CreditReturnSupportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
