
package com.evosnap.schemas.cws.v2_0.transactions.electronicchecking;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SECCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SECCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="BOC"/>
 *     &lt;enumeration value="CCD"/>
 *     &lt;enumeration value="PPD"/>
 *     &lt;enumeration value="TEL"/>
 *     &lt;enumeration value="WEB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SECCode")
@XmlEnum
public enum SECCode {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Value has not been explicitly set. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Back Office Conversion. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BOC("BOC"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Corporate Cash Disbursement. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CCD("CCD"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Prearranged Payment and Deposits. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PPD("PPD"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Telephone-initiated Entry. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TEL("TEL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Web-initiated Entry. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    WEB("WEB");
    private final String value;

    SECCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SECCode fromValue(String v) {
        for (SECCode c: SECCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
