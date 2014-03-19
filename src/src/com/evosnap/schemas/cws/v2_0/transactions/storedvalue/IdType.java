
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="PIN"/>
 *     &lt;enumeration value="PINEncrypted"/>
 *     &lt;enumeration value="PINEncryptedKeySerialNumber"/>
 *     &lt;enumeration value="PhoneNumber"/>
 *     &lt;enumeration value="DriversLicenseNumber"/>
 *     &lt;enumeration value="EmailAddress"/>
 *     &lt;enumeration value="BiometricAlgorithm"/>
 *     &lt;enumeration value="BiometricMap"/>
 *     &lt;enumeration value="X509Certificate"/>
 *     &lt;enumeration value="Passphrase"/>
 *     &lt;enumeration value="Hash"/>
 *     &lt;enumeration value="PublicKey"/>
 *     &lt;enumeration value="RetinaAlg"/>
 *     &lt;enumeration value="RetinaMap"/>
 *     &lt;enumeration value="BarCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IdType")
@XmlEnum
public enum IdType {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PIN &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PIN("PIN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PIN Encrypted &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PINEncrypted")
    PIN_ENCRYPTED("PINEncrypted"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PIN Encrypted - Key Serial Number &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PINEncryptedKeySerialNumber")
    PIN_ENCRYPTED_KEY_SERIAL_NUMBER("PINEncryptedKeySerialNumber"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Phone Number &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PhoneNumber")
    PHONE_NUMBER("PhoneNumber"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Drivers License Number &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DriversLicenseNumber")
    DRIVERS_LICENSE_NUMBER("DriversLicenseNumber"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Email Address &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("EmailAddress")
    EMAIL_ADDRESS("EmailAddress"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Biometric - Algorithm &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BiometricAlgorithm")
    BIOMETRIC_ALGORITHM("BiometricAlgorithm"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Biometric - Map &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BiometricMap")
    BIOMETRIC_MAP("BiometricMap"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; x.509 Certificate &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("X509Certificate")
    X_509_CERTIFICATE("X509Certificate"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Passphrase &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Passphrase")
    PASSPHRASE("Passphrase"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Hash &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Hash")
    HASH("Hash"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Public Key &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PublicKey")
    PUBLIC_KEY("PublicKey"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Retina Algorithm &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("RetinaAlg")
    RETINA_ALG("RetinaAlg"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Retina Map &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("RetinaMap")
    RETINA_MAP("RetinaMap"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Bar code &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BarCode")
    BAR_CODE("BarCode");
    private final String value;

    IdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdType fromValue(String v) {
        for (IdType c: IdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
