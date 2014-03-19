
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillPayment.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BillPayment">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="DeferredBilling"/>
 *     &lt;enumeration value="SinglePayment"/>
 *     &lt;enumeration value="Installment"/>
 *     &lt;enumeration value="Recurring"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BillPayment")
@XmlEnum
public enum BillPayment {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Payment for goods that were invoiced for later payment. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DeferredBilling")
    DEFERRED_BILLING("DeferredBilling"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Single payment being made to a bill. For example, utility bill or credit balance. Typically customer initiated. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SinglePayment")
    SINGLE_PAYMENT("SinglePayment"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Bill payment transaction that is recurring in nature but has a finite duration. For example, payment 2 of 3 for goods purchased. When used in settlement, CurrentInstallmentNumber and TotalNumberOfInstallments must be populated. Initial payments are customer initiated and subsequent transactions are typically merchant initiated. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Installment")
    INSTALLMENT("Installment"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Bill payment transaction that is recurring in nature but has no specified end point. Transactions are typically of the same amount. Initial payments are customer initiated and subsequent transactions are typically merchant initiated. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Recurring")
    RECURRING("Recurring");
    private final String value;

    BillPayment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BillPayment fromValue(String v) {
        for (BillPayment c: BillPayment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
