
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeCardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeCardType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="PrivateLabel"/>
 *     &lt;enumeration value="Visa"/>
 *     &lt;enumeration value="MasterCard"/>
 *     &lt;enumeration value="AmericanExpress"/>
 *     &lt;enumeration value="DinersCartBlanche"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="JCB"/>
 *     &lt;enumeration value="CitibankFinancial"/>
 *     &lt;enumeration value="RevolutionCard"/>
 *     &lt;enumeration value="UnbrandedATM"/>
 *     &lt;enumeration value="Dankort"/>
 *     &lt;enumeration value="Solo"/>
 *     &lt;enumeration value="Maestro"/>
 *     &lt;enumeration value="LaserCard"/>
 *     &lt;enumeration value="Electron"/>
 *     &lt;enumeration value="Finax"/>
 *     &lt;enumeration value="Kopkort"/>
 *     &lt;enumeration value="CarteAurore"/>
 *     &lt;enumeration value="CartesBancaires"/>
 *     &lt;enumeration value="DinersClub"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeCardType")
@XmlEnum
public enum TypeCardType {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Private Label. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PrivateLabel")
    PRIVATE_LABEL("PrivateLabel"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Visa. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Visa")
    VISA("Visa"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MasterCard. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; American Express. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("AmericanExpress")
    AMERICAN_EXPRESS("AmericanExpress"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Diners/Cart Blanche. DEPRECATED: Use MasterCard instead. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DinersCartBlanche")
    DINERS_CART_BLANCHE("DinersCartBlanche"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Discover. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; JCB. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    JCB("JCB"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Citibank Financial. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CitibankFinancial")
    CITIBANK_FINANCIAL("CitibankFinancial"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; RevolutionCard. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("RevolutionCard")
    REVOLUTION_CARD("RevolutionCard"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; UnbrandedATM. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("UnbrandedATM")
    UNBRANDED_ATM("UnbrandedATM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Dankort &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Dankort")
    DANKORT("Dankort"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Solo &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Solo")
    SOLO("Solo"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Maestro &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Maestro")
    MAESTRO("Maestro"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LaserCard &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("LaserCard")
    LASER_CARD("LaserCard"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Electron &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Electron")
    ELECTRON("Electron"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Finax &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Finax")
    FINAX("Finax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Köpkort &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Kopkort")
    KOPKORT("Kopkort"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Carte Aurore &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CarteAurore")
    CARTE_AURORE("CarteAurore"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Cartes Bancaires &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CartesBancaires")
    CARTES_BANCAIRES("CartesBancaires"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Diners Club (International) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DinersClub")
    DINERS_CLUB("DinersClub");
    private final String value;

    TypeCardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCardType fromValue(String v) {
        for (TypeCardType c: TypeCardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
