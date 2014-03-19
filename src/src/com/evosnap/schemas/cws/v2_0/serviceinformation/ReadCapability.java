
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReadCapability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReadCapability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="HasMSR"/>
 *     &lt;enumeration value="NoMSR"/>
 *     &lt;enumeration value="KeyOnly"/>
 *     &lt;enumeration value="Chip"/>
 *     &lt;enumeration value="ContactlessChip"/>
 *     &lt;enumeration value="ContactlessMSR"/>
 *     &lt;enumeration value="ECR"/>
 *     &lt;enumeration value="VSCCapable"/>
 *     &lt;enumeration value="RFIDCapable"/>
 *     &lt;enumeration value="EmvICC"/>
 *     &lt;enumeration value="MSREMVICC"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="OCRReader"/>
 *     &lt;enumeration value="BarCodeReader"/>
 *     &lt;enumeration value="NotSpecified"/>
 *     &lt;enumeration value="ARUIVR"/>
 *     &lt;enumeration value="NoTerminal"/>
 *     &lt;enumeration value="NFCCapable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReadCapability")
@XmlEnum
public enum ReadCapability {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Value has not been explicitly set. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Has MSR. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("HasMSR")
    HAS_MSR("HasMSR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; No MSR. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NoMSR")
    NO_MSR("NoMSR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Key only. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KeyOnly")
    KEY_ONLY("KeyOnly"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Chip. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Chip")
    CHIP("Chip"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contactless chip. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ContactlessChip")
    CONTACTLESS_CHIP("ContactlessChip"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contactless MSR. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ContactlessMSR")
    CONTACTLESS_MSR("ContactlessMSR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ECR. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ECR("ECR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; VSC capable. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("VSCCapable")
    VSC_CAPABLE("VSCCapable"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; RFID capable. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("RFIDCapable")
    RFID_CAPABLE("RFIDCapable"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; EMV ICC. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("EmvICC")
    EMV_ICC("EmvICC"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MSR/EMV ICC. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MSREMVICC("MSREMVICC"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Unknown. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; OCR reader. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("OCRReader")
    OCR_READER("OCRReader"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Bar code reader. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BarCodeReader")
    BAR_CODE_READER("BarCodeReader"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Not specified. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotSpecified")
    NOT_SPECIFIED("NotSpecified"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ARU/IVR. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ARUIVR("ARUIVR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; No terminal. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NoTerminal")
    NO_TERMINAL("NoTerminal"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/ServiceInformation" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NFC capable. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NFCCapable")
    NFC_CAPABLE("NFCCapable");
    private final String value;

    ReadCapability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReadCapability fromValue(String v) {
        for (ReadCapability c: ReadCapability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
