
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Lodging"/>
 *     &lt;enumeration value="Restaurant"/>
 *     &lt;enumeration value="GiftShop"/>
 *     &lt;enumeration value="HealthSpa"/>
 *     &lt;enumeration value="BeautyShop"/>
 *     &lt;enumeration value="ConventionFee"/>
 *     &lt;enumeration value="TennisProShop"/>
 *     &lt;enumeration value="GolfProShop"/>
 *     &lt;enumeration value="RetailOther"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargeType")
@XmlEnum
public enum ChargeType {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Lodging. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Lodging")
    LODGING("Lodging"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Restaurant. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Restaurant")
    RESTAURANT("Restaurant"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Gift Shop. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("GiftShop")
    GIFT_SHOP("GiftShop"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Health Spa. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("HealthSpa")
    HEALTH_SPA("HealthSpa"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Beauty Shop. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BeautyShop")
    BEAUTY_SHOP("BeautyShop"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Convention Fee. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ConventionFee")
    CONVENTION_FEE("ConventionFee"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Tennis/Pro Shop. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TennisProShop")
    TENNIS_PRO_SHOP("TennisProShop"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Golf/Pro Shop. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("GolfProShop")
    GOLF_PRO_SHOP("GolfProShop"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Retail/Other. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("RetailOther")
    RETAIL_OTHER("RetailOther");
    private final String value;

    ChargeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargeType fromValue(String v) {
        for (ChargeType c: ChargeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
