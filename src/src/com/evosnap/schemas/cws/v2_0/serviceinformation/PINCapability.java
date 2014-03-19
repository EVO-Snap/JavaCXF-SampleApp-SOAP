
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINCapability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PINCapability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="PINSupported"/>
 *     &lt;enumeration value="PINNotSupported"/>
 *     &lt;enumeration value="PINVerifiedByDevice"/>
 *     &lt;enumeration value="PINPadInoperative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PINCapability")
@XmlEnum
public enum PINCapability {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Unknown. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Supports PIN. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PINSupported")
    PIN_SUPPORTED("PINSupported"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Does not support PIN. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PINNotSupported")
    PIN_NOT_SUPPORTED("PINNotSupported"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PIN verified by device. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PINVerifiedByDevice")
    PIN_VERIFIED_BY_DEVICE("PINVerifiedByDevice"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PIN pad inoperative. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PINPadInoperative")
    PIN_PAD_INOPERATIVE("PINPadInoperative");
    private final String value;

    PINCapability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PINCapability fromValue(String v) {
        for (PINCapability c: PINCapability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
