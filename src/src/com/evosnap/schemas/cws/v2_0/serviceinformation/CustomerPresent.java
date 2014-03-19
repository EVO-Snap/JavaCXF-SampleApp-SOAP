
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerPresent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerPresent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Present"/>
 *     &lt;enumeration value="Suspicious"/>
 *     &lt;enumeration value="BillPayment"/>
 *     &lt;enumeration value="Transponder"/>
 *     &lt;enumeration value="MOTO"/>
 *     &lt;enumeration value="VisaOpenNetworkTransaction"/>
 *     &lt;enumeration value="VisaCardPresentStripeUnreadable"/>
 *     &lt;enumeration value="MailFax"/>
 *     &lt;enumeration value="Ecommerce"/>
 *     &lt;enumeration value="TelARU"/>
 *     &lt;enumeration value="MOTOCC"/>
 *     &lt;enumeration value="VoiceResponse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerPresent")
@XmlEnum
public enum CustomerPresent {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Value has not been explicitly set. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Cardholder and card present. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Present")
    PRESENT("Present"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Suspicious. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Suspicious")
    SUSPICIOUS("Suspicious"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Bill payment transaction. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BillPayment")
    BILL_PAYMENT("BillPayment"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Transponder. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Transponder")
    TRANSPONDER("Transponder"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Mail Order/Telephone Order. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MOTO("MOTO"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Open network transaction (Visa only). &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("VisaOpenNetworkTransaction")
    VISA_OPEN_NETWORK_TRANSACTION("VisaOpenNetworkTransaction"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Card present, stripe can't be read (Visa only). &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("VisaCardPresentStripeUnreadable")
    VISA_CARD_PRESENT_STRIPE_UNREADABLE("VisaCardPresentStripeUnreadable"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Mail/fax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MailFax")
    MAIL_FAX("MailFax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Ecommerce. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Ecommerce")
    ECOMMERCE("Ecommerce"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Telephone ARU (Automated Response Unit). &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TelARU")
    TEL_ARU("TelARU"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Mail Order/Telephone Order Call Center. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MOTOCC("MOTOCC"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:q1="http://schemas.microsoft.com/2003/10/Serialization/Arrays" xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Voice response system. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("VoiceResponse")
    VOICE_RESPONSE("VoiceResponse");
    private final String value;

    CustomerPresent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerPresent fromValue(String v) {
        for (CustomerPresent c: CustomerPresent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
