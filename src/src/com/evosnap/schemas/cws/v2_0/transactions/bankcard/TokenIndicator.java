
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenIndicator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TokenIndicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="VPAS"/>
 *     &lt;enumeration value="UCAFWithData"/>
 *     &lt;enumeration value="UCAFWithoutData"/>
 *     &lt;enumeration value="AttemptedCardUnsupported"/>
 *     &lt;enumeration value="AttemptedServiceUnavailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TokenIndicator")
@XmlEnum
public enum TokenIndicator {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; For Vbv &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    VPAS("VPAS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; For MCSC when token is sent to provider &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("UCAFWithData")
    UCAF_WITH_DATA("UCAFWithData"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; For MCSC when token is not sent to provider &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("UCAFWithoutData")
    UCAF_WITHOUT_DATA("UCAFWithoutData"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Merchant supports service but customer card does not &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("AttemptedCardUnsupported")
    ATTEMPTED_CARD_UNSUPPORTED("AttemptedCardUnsupported"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Both merchant and card support service but it could not be accessed &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("AttemptedServiceUnavailable")
    ATTEMPTED_SERVICE_UNAVAILABLE("AttemptedServiceUnavailable");
    private final String value;

    TokenIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TokenIndicator fromValue(String v) {
        for (TokenIndicator c: TokenIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
