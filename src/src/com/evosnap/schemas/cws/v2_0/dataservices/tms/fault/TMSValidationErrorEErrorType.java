
package com.evosnap.schemas.cws.v2_0.dataservices.tms.fault;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TMSValidationError.EErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TMSValidationError.EErrorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Validation"/>
 *     &lt;enumeration value="Processing"/>
 *     &lt;enumeration value="System"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TMSValidationError.EErrorType")
@XmlEnum
public enum TMSValidationErrorEErrorType {


    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Rule failed validation. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Validation")
    VALIDATION("Validation"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Processing error. An error that has nothing to do with the message nor with the validator engine. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Processing")
    PROCESSING("Processing"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Systems error. An error that has nothing to do with the message and indicates that something failed in the validator engine. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("System")
    SYSTEM("System");
    private final String value;

    TMSValidationErrorEErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TMSValidationErrorEErrorType fromValue(String v) {
        for (TMSValidationErrorEErrorType c: TMSValidationErrorEErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
