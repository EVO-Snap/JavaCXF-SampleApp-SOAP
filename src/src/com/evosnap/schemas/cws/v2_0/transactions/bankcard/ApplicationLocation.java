
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ApplicationLocation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="OnPremises"/>
 *     &lt;enumeration value="OffPremises"/>
 *     &lt;enumeration value="HomeInternet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ApplicationLocation")
@XmlEnum
public enum ApplicationLocation {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Value has not been explicitly set. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Unknown. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; On premises. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("OnPremises")
    ON_PREMISES("OnPremises"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Off premises. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("OffPremises")
    OFF_PREMISES("OffPremises"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Home/Internet. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("HomeInternet")
    HOME_INTERNET("HomeInternet");
    private final String value;

    ApplicationLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationLocation fromValue(String v) {
        for (ApplicationLocation c: ApplicationLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
