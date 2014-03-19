
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdEntryMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdEntryMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="TrackData"/>
 *     &lt;enumeration value="Keyed"/>
 *     &lt;enumeration value="Internet"/>
 *     &lt;enumeration value="BlueTooth"/>
 *     &lt;enumeration value="RFID"/>
 *     &lt;enumeration value="Wireless"/>
 *     &lt;enumeration value="Biometric"/>
 *     &lt;enumeration value="NFC"/>
 *     &lt;enumeration value="Transponder"/>
 *     &lt;enumeration value="ContactlessDevice"/>
 *     &lt;enumeration value="ChipCapableDevice"/>
 *     &lt;enumeration value="ProviderIssued"/>
 *     &lt;enumeration value="BarCodeReader"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdEntryMode")
@XmlEnum
public enum IdEntryMode {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Value has not been explicitly set. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Track Data &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TrackData")
    TRACK_DATA("TrackData"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Keyed &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Keyed")
    KEYED("Keyed"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Internet &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Internet")
    INTERNET("Internet"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BlueTooth &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BlueTooth")
    BLUE_TOOTH("BlueTooth"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; RFID &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    RFID("RFID"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Wireless &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Wireless")
    WIRELESS("Wireless"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Biometric &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Biometric")
    BIOMETRIC("Biometric"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NFC &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    NFC("NFC"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Transponder &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Transponder")
    TRANSPONDER("Transponder"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Contactless device. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ContactlessDevice")
    CONTACTLESS_DEVICE("ContactlessDevice"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Chip capable device. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ChipCapableDevice")
    CHIP_CAPABLE_DEVICE("ChipCapableDevice"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Value to indicate the ConsumerId was generated by the service provider. Should only be used in responses where TxnCode = 'Issue_Account'. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ProviderIssued")
    PROVIDER_ISSUED("ProviderIssued"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Read from a bar code scanner. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BarCodeReader")
    BAR_CODE_READER("BarCodeReader");
    private final String value;

    IdEntryMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdEntryMode fromValue(String v) {
        for (IdEntryMode c: IdEntryMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
