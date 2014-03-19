
package com.evosnap.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntryMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntryMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Keyed"/>
 *     &lt;enumeration value="KeyedBadMagRead"/>
 *     &lt;enumeration value="TrackDataFromMSR"/>
 *     &lt;enumeration value="ChipReliable"/>
 *     &lt;enumeration value="ChipUnreliable"/>
 *     &lt;enumeration value="ContactlessMChipOrSmartCard"/>
 *     &lt;enumeration value="ContactlessStripe"/>
 *     &lt;enumeration value="TerminalNotUsed"/>
 *     &lt;enumeration value="BarCode"/>
 *     &lt;enumeration value="OCRReader"/>
 *     &lt;enumeration value="VSCCapable"/>
 *     &lt;enumeration value="ChipTrackDataFromRFID"/>
 *     &lt;enumeration value="MSRTrackDataFromRFID"/>
 *     &lt;enumeration value="NFCCapable"/>
 *     &lt;enumeration value="Track2DataFromMSR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntryMode")
@XmlEnum
public enum EntryMode {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Keyed. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Keyed")
    KEYED("Keyed"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Keyed after bad magnetic stripe read. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KeyedBadMagRead")
    KEYED_BAD_MAG_READ("KeyedBadMagRead"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Track data read from MSR. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TrackDataFromMSR")
    TRACK_DATA_FROM_MSR("TrackDataFromMSR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Chip, reliable. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ChipReliable")
    CHIP_RELIABLE("ChipReliable"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Chip, unreliable. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ChipUnreliable")
    CHIP_UNRELIABLE("ChipUnreliable"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contactless M/Chip or smart card. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ContactlessMChipOrSmartCard")
    CONTACTLESS_M_CHIP_OR_SMART_CARD("ContactlessMChipOrSmartCard"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contactless stripe. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ContactlessStripe")
    CONTACTLESS_STRIPE("ContactlessStripe"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Terminal not used. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TerminalNotUsed")
    TERMINAL_NOT_USED("TerminalNotUsed"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Bar code. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BarCode")
    BAR_CODE("BarCode"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; OCR reader. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("OCRReader")
    OCR_READER("OCRReader"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; VSC capable. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("VSCCapable")
    VSC_CAPABLE("VSCCapable"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Chip track data read from RFID. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ChipTrackDataFromRFID")
    CHIP_TRACK_DATA_FROM_RFID("ChipTrackDataFromRFID"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MSR track data read from RFID. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MSRTrackDataFromRFID")
    MSR_TRACK_DATA_FROM_RFID("MSRTrackDataFromRFID"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NFC capable. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NFCCapable")
    NFC_CAPABLE("NFCCapable"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Track data read from MSR. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Track2DataFromMSR")
    TRACK_2_DATA_FROM_MSR("Track2DataFromMSR");
    private final String value;

    EntryMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntryMode fromValue(String v) {
        for (EntryMode c: EntryMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
