
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IsTaxExempt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IsTaxExempt">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Exempt"/>
 *     &lt;enumeration value="NotExemptTaxInfoNotProvided"/>
 *     &lt;enumeration value="NotExemptTaxInfoProvided"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IsTaxExempt")
@XmlEnum
public enum IsTaxExempt {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Exempt. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Exempt")
    EXEMPT("Exempt"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Not exempt but tax information not provided. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotExemptTaxInfoNotProvided")
    NOT_EXEMPT_TAX_INFO_NOT_PROVIDED("NotExemptTaxInfoNotProvided"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Not exempt tax information is provided. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotExemptTaxInfoProvided")
    NOT_EXEMPT_TAX_INFO_PROVIDED("NotExemptTaxInfoProvided");
    private final String value;

    IsTaxExempt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IsTaxExempt fromValue(String v) {
        for (IsTaxExempt c: IsTaxExempt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
