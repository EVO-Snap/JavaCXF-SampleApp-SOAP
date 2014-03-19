
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercialCardResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommercialCardResponse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NotImplemented"/>
 *     &lt;enumeration value="PurchaseCard"/>
 *     &lt;enumeration value="CorporateCard"/>
 *     &lt;enumeration value="BusinessCard"/>
 *     &lt;enumeration value="NonCommercialCard"/>
 *     &lt;enumeration value="PurchaseCardDataUnsupported"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommercialCardResponse")
@XmlEnum
public enum CommercialCardResponse {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Not implemented. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotImplemented")
    NOT_IMPLEMENTED("NotImplemented"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Purchase Card. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PurchaseCard")
    PURCHASE_CARD("PurchaseCard"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Corporate Card. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CorporateCard")
    CORPORATE_CARD("CorporateCard"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Business Card. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BusinessCard")
    BUSINESS_CARD("BusinessCard"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Not a commercial card. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NonCommercialCard")
    NON_COMMERCIAL_CARD("NonCommercialCard"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Commercial card does not support purchase card data. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PurchaseCardDataUnsupported")
    PURCHASE_CARD_DATA_UNSUPPORTED("PurchaseCardDataUnsupported"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Unknown. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CommercialCardResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommercialCardResponse fromValue(String v) {
        for (CommercialCardResponse c: CommercialCardResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
