
package com.evosnap.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Declined"/>
 *     &lt;enumeration value="Verified"/>
 *     &lt;enumeration value="Authorized"/>
 *     &lt;enumeration value="Adjusted"/>
 *     &lt;enumeration value="Captured"/>
 *     &lt;enumeration value="CaptureDeclined"/>
 *     &lt;enumeration value="PartiallyCaptured"/>
 *     &lt;enumeration value="Undone"/>
 *     &lt;enumeration value="ReturnRequested"/>
 *     &lt;enumeration value="PartialReturnRequested"/>
 *     &lt;enumeration value="ReturnUndone"/>
 *     &lt;enumeration value="Returned"/>
 *     &lt;enumeration value="PartiallyReturned"/>
 *     &lt;enumeration value="InProcess"/>
 *     &lt;enumeration value="ErrorValidation"/>
 *     &lt;enumeration value="ErrorUnknown"/>
 *     &lt;enumeration value="ErrorConnecting"/>
 *     &lt;enumeration value="FundsRequested"/>
 *     &lt;enumeration value="FundsTransferred"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionState")
@XmlEnum
public enum TransactionState {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; The original transaction was successfully transmitted but declined by the service. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Declined")
    DECLINED("Declined"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; A verify transaction was successfully run. Check response for details. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Verified")
    VERIFIED("Verified"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; The original transaction was successfully authorized. The transaction has not yet been captured. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Authorized")
    AUTHORIZED("Authorized"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; The original transaction was successfully authorized and the amount subsequently successfully adjusted. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Adjusted")
    ADJUSTED("Adjusted"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; The transaction was successfully captured. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Captured")
    CAPTURED("Captured"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; An attempt to capture the transaction was declined by the service provider. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CaptureDeclined")
    CAPTURE_DECLINED("CaptureDeclined"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; The transaction was captured for a partial amount with the expectation that another capture may be attempted for the additional authorized funds. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PartiallyCaptured")
    PARTIALLY_CAPTURED("PartiallyCaptured"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; The transaction was completely voided or reversed. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Undone")
    UNDONE("Undone"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Either the original transaction was a standalone return, or a successfully captured transaction was subsequently returned for the full amount. The return has not yet been captured. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ReturnRequested")
    RETURN_REQUESTED("ReturnRequested"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; A successfully captured transaction was returned for less than the captured amount. The return has not yet been captured. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PartialReturnRequested")
    PARTIAL_RETURN_REQUESTED("PartialReturnRequested"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; A standalone return or a return of a successfully captured transaction was voided. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ReturnUndone")
    RETURN_UNDONE("ReturnUndone"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Either the original transaction was a standalone return, or a successfully captured transaction was subsequently returned for the full amount. The return has been captured. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Returned")
    RETURNED("Returned"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; A successfully captured transaction was returned for less than the captured amount. The return has been captured. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PartiallyReturned")
    PARTIALLY_RETURNED("PartiallyReturned"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Transaction is in process. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("InProcess")
    IN_PROCESS("InProcess"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; There was a validation error on the transaction. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ErrorValidation")
    ERROR_VALIDATION("ErrorValidation"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; An unknown error occured during the processing of this error. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ErrorUnknown")
    ERROR_UNKNOWN("ErrorUnknown"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; There was a connection error during the processing of this transaction. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ErrorConnecting")
    ERROR_CONNECTING("ErrorConnecting"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Indicated funds have been requested for Disburse transaction. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("FundsRequested")
    FUNDS_REQUESTED("FundsRequested"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Indicated funds have been transferred for Disburse transaction. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("FundsTransferred")
    FUNDS_TRANSFERRED("FundsTransferred");
    private final String value;

    TransactionState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionState fromValue(String v) {
        for (TransactionState c: TransactionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
