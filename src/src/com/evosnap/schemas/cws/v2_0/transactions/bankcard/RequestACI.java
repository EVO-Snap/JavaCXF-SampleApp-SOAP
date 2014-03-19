
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestACI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestACI">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NotCPSMeritCapable"/>
 *     &lt;enumeration value="IsCPSMeritCapable"/>
 *     &lt;enumeration value="CPSMeritCapableIncAuth"/>
 *     &lt;enumeration value="PremierCustomer"/>
 *     &lt;enumeration value="RecurringInstallment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestACI")
@XmlEnum
public enum RequestACI {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Not CPS/Merit capable. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotCPSMeritCapable")
    NOT_CPS_MERIT_CAPABLE("NotCPSMeritCapable"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Is CPS/Merit capable. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("IsCPSMeritCapable")
    IS_CPS_MERIT_CAPABLE("IsCPSMeritCapable"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CPS/Merit capable incremental authorization. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CPSMeritCapableIncAuth")
    CPS_MERIT_CAPABLE_INC_AUTH("CPSMeritCapableIncAuth"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Premier customer. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PremierCustomer")
    PREMIER_CUSTOMER("PremierCustomer"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Recurring/installment. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("RecurringInstallment")
    RECURRING_INSTALLMENT("RecurringInstallment");
    private final String value;

    RequestACI(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestACI fromValue(String v) {
        for (RequestACI c: RequestACI.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
