
package com.evosnap.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaptureState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaptureState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="CannotCapture"/>
 *     &lt;enumeration value="ReadyForCapture"/>
 *     &lt;enumeration value="CapturePending"/>
 *     &lt;enumeration value="Captured"/>
 *     &lt;enumeration value="CaptureDeclined"/>
 *     &lt;enumeration value="InProcess"/>
 *     &lt;enumeration value="CapturedUndoPermitted"/>
 *     &lt;enumeration value="CapturePendingUndoPermitted"/>
 *     &lt;enumeration value="CaptureError"/>
 *     &lt;enumeration value="CaptureUnknown"/>
 *     &lt;enumeration value="BatchSent"/>
 *     &lt;enumeration value="BatchSentUndoPermitted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CaptureState")
@XmlEnum
public enum CaptureState {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Transaction cannot be captured due to declined authorization or subsequent undoing of successful authorization. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CannotCapture")
    CANNOT_CAPTURE("CannotCapture"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Successfully authorized but capture not requested. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ReadyForCapture")
    READY_FOR_CAPTURE("ReadyForCapture"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Successfully transmitted capture but it is not yet known whether the processor accepted it. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CapturePending")
    CAPTURE_PENDING("CapturePending"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Successfully captured. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Captured")
    CAPTURED("Captured"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Capture was successfully submitted but declined by the service. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CaptureDeclined")
    CAPTURE_DECLINED("CaptureDeclined"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; The capture is in process. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("InProcess")
    IN_PROCESS("InProcess"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Indicates if an Undo is permitted for the Captured state. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CapturedUndoPermitted")
    CAPTURED_UNDO_PERMITTED("CapturedUndoPermitted"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Indicates if an Undo is permitted for the CapturePending state. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CapturePendingUndoPermitted")
    CAPTURE_PENDING_UNDO_PERMITTED("CapturePendingUndoPermitted"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Indicates an error state during capture. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CaptureError")
    CAPTURE_ERROR("CaptureError"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Unknow capture state. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CaptureUnknown")
    CAPTURE_UNKNOWN("CaptureUnknown"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Batch has been sent, response is out of band. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BatchSent")
    BATCH_SENT("BatchSent"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Batch has been sent, an Undo operation is allowed. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BatchSentUndoPermitted")
    BATCH_SENT_UNDO_PERMITTED("BatchSentUndoPermitted");
    private final String value;

    CaptureState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CaptureState fromValue(String v) {
        for (CaptureState c: CaptureState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
