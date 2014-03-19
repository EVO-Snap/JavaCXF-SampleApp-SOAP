
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdviceResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdviceResponse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Unsupported"/>
 *     &lt;enumeration value="NewAccountInfoAvailable"/>
 *     &lt;enumeration value="TryAgainLater"/>
 *     &lt;enumeration value="DoNotTryAgainLater"/>
 *     &lt;enumeration value="DoNotHonor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdviceResponse")
@XmlEnum
public enum AdviceResponse {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Not supported. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Unsupported")
    UNSUPPORTED("Unsupported"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; New account info available. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NewAccountInfoAvailable")
    NEW_ACCOUNT_INFO_AVAILABLE("NewAccountInfoAvailable"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Try again later. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TryAgainLater")
    TRY_AGAIN_LATER("TryAgainLater"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Do not try again later. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DoNotTryAgainLater")
    DO_NOT_TRY_AGAIN_LATER("DoNotTryAgainLater"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Service provider recommends the merchant not honor the card. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DoNotHonor")
    DO_NOT_HONOR("DoNotHonor");
    private final String value;

    AdviceResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdviceResponse fromValue(String v) {
        for (AdviceResponse c: AdviceResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
