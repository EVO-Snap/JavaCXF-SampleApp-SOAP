
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HardwareType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HardwareType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="PC"/>
 *     &lt;enumeration value="DialTerminal"/>
 *     &lt;enumeration value="ElectronicCashRegister"/>
 *     &lt;enumeration value="InStoreController"/>
 *     &lt;enumeration value="Mainframe"/>
 *     &lt;enumeration value="ThirdPartyDeveloper"/>
 *     &lt;enumeration value="POSPort"/>
 *     &lt;enumeration value="POSPartner"/>
 *     &lt;enumeration value="TicketMachine"/>
 *     &lt;enumeration value="ATM"/>
 *     &lt;enumeration value="ScripDevice"/>
 *     &lt;enumeration value="Telephone"/>
 *     &lt;enumeration value="InitiatedCAT"/>
 *     &lt;enumeration value="VirtualTerminal"/>
 *     &lt;enumeration value="MobileBanking"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HardwareType")
@XmlEnum
public enum HardwareType {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Unknown. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PC. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PC("PC"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Dial Terminal. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DialTerminal")
    DIAL_TERMINAL("DialTerminal"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Electronic Cash Register. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ElectronicCashRegister")
    ELECTRONIC_CASH_REGISTER("ElectronicCashRegister"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; In-Store Controller. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("InStoreController")
    IN_STORE_CONTROLLER("InStoreController"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Mainframe. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Mainframe")
    MAINFRAME("Mainframe"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Third party developer. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ThirdPartyDeveloper")
    THIRD_PARTY_DEVELOPER("ThirdPartyDeveloper"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; POS Port. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("POSPort")
    POS_PORT("POSPort"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; POS Partner. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("POSPartner")
    POS_PARTNER("POSPartner"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Ticket Machine/Kiosk. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TicketMachine")
    TICKET_MACHINE("TicketMachine"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ATM &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ATM("ATM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Scrip Device &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ScripDevice")
    SCRIP_DEVICE("ScripDevice"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Telephone &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Telephone")
    TELEPHONE("Telephone"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Initiated CAT &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("InitiatedCAT")
    INITIATED_CAT("InitiatedCAT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Virtual Terminal &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("VirtualTerminal")
    VIRTUAL_TERMINAL("VirtualTerminal"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Mobile Banking &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MobileBanking")
    MOBILE_BANKING("MobileBanking");
    private final String value;

    HardwareType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HardwareType fromValue(String v) {
        for (HardwareType c: HardwareType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
