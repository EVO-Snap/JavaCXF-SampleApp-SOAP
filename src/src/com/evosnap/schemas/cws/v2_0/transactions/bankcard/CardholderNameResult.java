
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderNameResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardholderNameResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NotIncluded"/>
 *     &lt;enumeration value="Match"/>
 *     &lt;enumeration value="NoMatch"/>
 *     &lt;enumeration value="IssuerNotCertified"/>
 *     &lt;enumeration value="NoResponseFromCardAssociation"/>
 *     &lt;enumeration value="UnknownResponseFromCardAssociation"/>
 *     &lt;enumeration value="NotVerified"/>
 *     &lt;enumeration value="BadFormat"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardholderNameResult")
@XmlEnum
public enum CardholderNameResult {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Not included. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotIncluded")
    NOT_INCLUDED("NotIncluded"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Match. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Match")
    MATCH("Match"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; No match. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NoMatch")
    NO_MATCH("NoMatch"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Issuer is not certified. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("IssuerNotCertified")
    ISSUER_NOT_CERTIFIED("IssuerNotCertified"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; No response from card association. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NoResponseFromCardAssociation")
    NO_RESPONSE_FROM_CARD_ASSOCIATION("NoResponseFromCardAssociation"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; The response code from the card association was not recognized. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("UnknownResponseFromCardAssociation")
    UNKNOWN_RESPONSE_FROM_CARD_ASSOCIATION("UnknownResponseFromCardAssociation"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; AVS data was not verified. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotVerified")
    NOT_VERIFIED("NotVerified"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Supplied AVS data was incorrectly formatted. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BadFormat")
    BAD_FORMAT("BadFormat");
    private final String value;

    CardholderNameResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardholderNameResult fromValue(String v) {
        for (CardholderNameResult c: CardholderNameResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
