
package com.evosnap.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVResult">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Match"/>
 *     &lt;enumeration value="NoMatch"/>
 *     &lt;enumeration value="NotProcessed"/>
 *     &lt;enumeration value="NoCodePresent"/>
 *     &lt;enumeration value="ShouldHaveBeenPresent"/>
 *     &lt;enumeration value="IssuerNotCertified"/>
 *     &lt;enumeration value="Invalid"/>
 *     &lt;enumeration value="NoResponse"/>
 *     &lt;enumeration value="NotApplicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CVResult")
@XmlEnum
public enum CVResult {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CVV2/CVC2/CID match. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Match")
    MATCH("Match"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CVV2/CVC2/CID do not match. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NoMatch")
    NO_MATCH("NoMatch"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Not processed. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotProcessed")
    NOT_PROCESSED("NotProcessed"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Merchant has indicated that code is not present on card. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NoCodePresent")
    NO_CODE_PRESENT("NoCodePresent"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CVV2 should have been present. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ShouldHaveBeenPresent")
    SHOULD_HAVE_BEEN_PRESENT("ShouldHaveBeenPresent"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Issuer is not certified. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("IssuerNotCertified")
    ISSUER_NOT_CERTIFIED("IssuerNotCertified"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CVV2/CVC2/CID is invalid. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Invalid")
    INVALID("Invalid"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; No response from card association. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NoResponse")
    NO_RESPONSE("NoResponse"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CVV2/CVC2/CID is not applicable. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable");
    private final String value;

    CVResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CVResult fromValue(String v) {
        for (CVResult c: CVResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
