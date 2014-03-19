
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINDebitUndoReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PINDebitUndoReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="NotApplicable"/>
 *     &lt;enumeration value="NoResponse"/>
 *     &lt;enumeration value="LateResponse"/>
 *     &lt;enumeration value="UnableToDeliverToPOS"/>
 *     &lt;enumeration value="CustomerCancellation"/>
 *     &lt;enumeration value="SuspectMalfunction"/>
 *     &lt;enumeration value="PartiallyCompleted"/>
 *     &lt;enumeration value="OriginalAmountIncorrect"/>
 *     &lt;enumeration value="ResponseIncomplete"/>
 *     &lt;enumeration value="CADFailure"/>
 *     &lt;enumeration value="UnableToDeliverResponse"/>
 *     &lt;enumeration value="ResponseTimeout"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PINDebitUndoReason")
@XmlEnum
public enum PINDebitUndoReason {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Not applicable. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; No response. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NoResponse")
    NO_RESPONSE("NoResponse"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Late response. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("LateResponse")
    LATE_RESPONSE("LateResponse"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Unable to deliver to POS. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("UnableToDeliverToPOS")
    UNABLE_TO_DELIVER_TO_POS("UnableToDeliverToPOS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Customer cancellation. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CustomerCancellation")
    CUSTOMER_CANCELLATION("CustomerCancellation"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Suspect malfunction. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SuspectMalfunction")
    SUSPECT_MALFUNCTION("SuspectMalfunction"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Partially completed. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PartiallyCompleted")
    PARTIALLY_COMPLETED("PartiallyCompleted"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Original amount incorrect. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("OriginalAmountIncorrect")
    ORIGINAL_AMOUNT_INCORRECT("OriginalAmountIncorrect"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Response incomplete. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ResponseIncomplete")
    RESPONSE_INCOMPLETE("ResponseIncomplete"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CAD failure. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CADFailure")
    CAD_FAILURE("CADFailure"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Unable to deliver response. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("UnableToDeliverResponse")
    UNABLE_TO_DELIVER_RESPONSE("UnableToDeliverResponse"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Response timeout. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ResponseTimeout")
    RESPONSE_TIMEOUT("ResponseTimeout");
    private final String value;

    PINDebitUndoReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PINDebitUndoReason fromValue(String v) {
        for (PINDebitUndoReason c: PINDebitUndoReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
