
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackDataSupportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackDataSupportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NotSupported"/>
 *     &lt;enumeration value="Track1"/>
 *     &lt;enumeration value="Track2"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackDataSupportType")
@XmlEnum
public enum TrackDataSupportType {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Neither Track1 or Track2 is supported &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotSupported")
    NOT_SUPPORTED("NotSupported"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Track1 is supported &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Track1")
    TRACK_1("Track1"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Track2 is supported &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Track2")
    TRACK_2("Track2"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Both Track1 and Track2 are supported &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    TrackDataSupportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackDataSupportType fromValue(String v) {
        for (TrackDataSupportType c: TrackDataSupportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
