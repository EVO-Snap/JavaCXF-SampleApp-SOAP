
package com.evosnap.schemas.cws.v2_0.transactions.electronicchecking;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Savings"/>
 *     &lt;enumeration value="Checking"/>
 *     &lt;enumeration value="Travelers"/>
 *     &lt;enumeration value="Payroll"/>
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="TwoParty"/>
 *     &lt;enumeration value="Government"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UseType")
@XmlEnum
public enum UseType {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Savings. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Savings")
    SAVINGS("Savings"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Checking. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Checking")
    CHECKING("Checking"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Travelers. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Travelers")
    TRAVELERS("Travelers"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Payroll. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Payroll")
    PAYROLL("Payroll"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Cash. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Cash")
    CASH("Cash"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Two Party. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TwoParty")
    TWO_PARTY("TwoParty"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Government. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Government")
    GOVERNMENT("Government");
    private final String value;

    UseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UseType fromValue(String v) {
        for (UseType c: UseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
