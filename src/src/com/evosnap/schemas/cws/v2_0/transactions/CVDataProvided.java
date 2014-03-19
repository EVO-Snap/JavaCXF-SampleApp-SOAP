
package com.evosnap.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVDataProvided.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVDataProvided">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="DeliberatelyBypass"/>
 *     &lt;enumeration value="Provided"/>
 *     &lt;enumeration value="ValueIllegible"/>
 *     &lt;enumeration value="CardholderStatesNotAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CVDataProvided")
@XmlEnum
public enum CVDataProvided {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Value has not been explicitly set. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Deliberately bypass. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DeliberatelyBypass")
    DELIBERATELY_BYPASS("DeliberatelyBypass"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Provided. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Provided")
    PROVIDED("Provided"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Value illegible. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ValueIllegible")
    VALUE_ILLEGIBLE("ValueIllegible"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Cardholder states not available. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CardholderStatesNotAvailable")
    CARDHOLDER_STATES_NOT_AVAILABLE("CardholderStatesNotAvailable");
    private final String value;

    CVDataProvided(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CVDataProvided fromValue(String v) {
        for (CVDataProvided c: CVDataProvided.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
