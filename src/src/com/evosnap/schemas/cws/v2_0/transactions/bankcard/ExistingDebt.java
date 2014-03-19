
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExistingDebt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExistingDebt">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NotExistingDebt"/>
 *     &lt;enumeration value="IsExistingDebt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExistingDebt")
@XmlEnum
public enum ExistingDebt {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Not existing debt. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotExistingDebt")
    NOT_EXISTING_DEBT("NotExistingDebt"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Is existing debt. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("IsExistingDebt")
    IS_EXISTING_DEBT("IsExistingDebt");
    private final String value;

    ExistingDebt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExistingDebt fromValue(String v) {
        for (ExistingDebt c: ExistingDebt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
