
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncryptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="MagneSafeV4V5Compatible"/>
 *     &lt;enumeration value="IPADV1Compatible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EncryptionType")
@XmlEnum
public enum EncryptionType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Value has not been explicitly set. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MagneSafe V4/V5 compatible 2TDEA-CBC Encryption, IV=0. Block contains data only. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MagneSafeV4V5Compatible")
    MAGNE_SAFE_V_4_V_5_COMPATIBLE("MagneSafeV4V5Compatible"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; IPAD V1 compatible 2TDEA-CBC Encryption Block contains header + data. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("IPADV1Compatible")
    IPADV_1_COMPATIBLE("IPADV1Compatible");
    private final String value;

    EncryptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncryptionType fromValue(String v) {
        for (EncryptionType c: EncryptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
