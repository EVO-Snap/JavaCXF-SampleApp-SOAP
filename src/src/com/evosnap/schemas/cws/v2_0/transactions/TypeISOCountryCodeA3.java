
package com.evosnap.schemas.cws.v2_0.transactions;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeISOCountryCodeA3.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeISOCountryCodeA3">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="AFG"/>
 *     &lt;enumeration value="ALA"/>
 *     &lt;enumeration value="ALB"/>
 *     &lt;enumeration value="DZA"/>
 *     &lt;enumeration value="ASM"/>
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="AGO"/>
 *     &lt;enumeration value="AIA"/>
 *     &lt;enumeration value="ATA"/>
 *     &lt;enumeration value="ATG"/>
 *     &lt;enumeration value="ARG"/>
 *     &lt;enumeration value="ARM"/>
 *     &lt;enumeration value="ABW"/>
 *     &lt;enumeration value="AUS"/>
 *     &lt;enumeration value="AUT"/>
 *     &lt;enumeration value="AZE"/>
 *     &lt;enumeration value="BHS"/>
 *     &lt;enumeration value="BHR"/>
 *     &lt;enumeration value="BGD"/>
 *     &lt;enumeration value="BRB"/>
 *     &lt;enumeration value="BLR"/>
 *     &lt;enumeration value="BEL"/>
 *     &lt;enumeration value="BLZ"/>
 *     &lt;enumeration value="BEN"/>
 *     &lt;enumeration value="BMU"/>
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="BOL"/>
 *     &lt;enumeration value="BIH"/>
 *     &lt;enumeration value="BWA"/>
 *     &lt;enumeration value="BVT"/>
 *     &lt;enumeration value="BRA"/>
 *     &lt;enumeration value="IOT"/>
 *     &lt;enumeration value="BRN"/>
 *     &lt;enumeration value="BGR"/>
 *     &lt;enumeration value="BFA"/>
 *     &lt;enumeration value="BDI"/>
 *     &lt;enumeration value="KHM"/>
 *     &lt;enumeration value="CMR"/>
 *     &lt;enumeration value="CAN"/>
 *     &lt;enumeration value="CPV"/>
 *     &lt;enumeration value="CYM"/>
 *     &lt;enumeration value="CAF"/>
 *     &lt;enumeration value="TCD"/>
 *     &lt;enumeration value="CHL"/>
 *     &lt;enumeration value="CHN"/>
 *     &lt;enumeration value="CXR"/>
 *     &lt;enumeration value="CCK"/>
 *     &lt;enumeration value="COL"/>
 *     &lt;enumeration value="COM"/>
 *     &lt;enumeration value="COG"/>
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="COK"/>
 *     &lt;enumeration value="CRI"/>
 *     &lt;enumeration value="CIV"/>
 *     &lt;enumeration value="HRV"/>
 *     &lt;enumeration value="CUB"/>
 *     &lt;enumeration value="CYP"/>
 *     &lt;enumeration value="CZE"/>
 *     &lt;enumeration value="DNK"/>
 *     &lt;enumeration value="DJI"/>
 *     &lt;enumeration value="DMA"/>
 *     &lt;enumeration value="DOM"/>
 *     &lt;enumeration value="ECU"/>
 *     &lt;enumeration value="EGY"/>
 *     &lt;enumeration value="SLV"/>
 *     &lt;enumeration value="GNQ"/>
 *     &lt;enumeration value="ERI"/>
 *     &lt;enumeration value="EST"/>
 *     &lt;enumeration value="ETH"/>
 *     &lt;enumeration value="FLK"/>
 *     &lt;enumeration value="FRO"/>
 *     &lt;enumeration value="FJI"/>
 *     &lt;enumeration value="FIN"/>
 *     &lt;enumeration value="FRA"/>
 *     &lt;enumeration value="FXX"/>
 *     &lt;enumeration value="GUF"/>
 *     &lt;enumeration value="PYF"/>
 *     &lt;enumeration value="ATF"/>
 *     &lt;enumeration value="GAB"/>
 *     &lt;enumeration value="GMB"/>
 *     &lt;enumeration value="GEO"/>
 *     &lt;enumeration value="DEU"/>
 *     &lt;enumeration value="GHA"/>
 *     &lt;enumeration value="GIB"/>
 *     &lt;enumeration value="GRC"/>
 *     &lt;enumeration value="GRL"/>
 *     &lt;enumeration value="GRD"/>
 *     &lt;enumeration value="GLP"/>
 *     &lt;enumeration value="GUM"/>
 *     &lt;enumeration value="GTM"/>
 *     &lt;enumeration value="GGY"/>
 *     &lt;enumeration value="GIN"/>
 *     &lt;enumeration value="GNB"/>
 *     &lt;enumeration value="GUY"/>
 *     &lt;enumeration value="HTI"/>
 *     &lt;enumeration value="HMD"/>
 *     &lt;enumeration value="VAT"/>
 *     &lt;enumeration value="HND"/>
 *     &lt;enumeration value="HKG"/>
 *     &lt;enumeration value="HUN"/>
 *     &lt;enumeration value="ISL"/>
 *     &lt;enumeration value="IND"/>
 *     &lt;enumeration value="IDN"/>
 *     &lt;enumeration value="IRN"/>
 *     &lt;enumeration value="IRQ"/>
 *     &lt;enumeration value="IRL"/>
 *     &lt;enumeration value="IMN"/>
 *     &lt;enumeration value="ISR"/>
 *     &lt;enumeration value="ITA"/>
 *     &lt;enumeration value="JAM"/>
 *     &lt;enumeration value="JPN"/>
 *     &lt;enumeration value="JEY"/>
 *     &lt;enumeration value="JOR"/>
 *     &lt;enumeration value="KAZ"/>
 *     &lt;enumeration value="KEN"/>
 *     &lt;enumeration value="KIR"/>
 *     &lt;enumeration value="PRK"/>
 *     &lt;enumeration value="KOR"/>
 *     &lt;enumeration value="KWT"/>
 *     &lt;enumeration value="KGZ"/>
 *     &lt;enumeration value="LAO"/>
 *     &lt;enumeration value="LVA"/>
 *     &lt;enumeration value="LBN"/>
 *     &lt;enumeration value="LSO"/>
 *     &lt;enumeration value="LBR"/>
 *     &lt;enumeration value="LBY"/>
 *     &lt;enumeration value="LIE"/>
 *     &lt;enumeration value="LTU"/>
 *     &lt;enumeration value="LUX"/>
 *     &lt;enumeration value="MAC"/>
 *     &lt;enumeration value="MKD"/>
 *     &lt;enumeration value="MDG"/>
 *     &lt;enumeration value="MWI"/>
 *     &lt;enumeration value="MYS"/>
 *     &lt;enumeration value="MDV"/>
 *     &lt;enumeration value="MLI"/>
 *     &lt;enumeration value="MLT"/>
 *     &lt;enumeration value="MHL"/>
 *     &lt;enumeration value="MTQ"/>
 *     &lt;enumeration value="MRT"/>
 *     &lt;enumeration value="MUS"/>
 *     &lt;enumeration value="MYT"/>
 *     &lt;enumeration value="MEX"/>
 *     &lt;enumeration value="FSM"/>
 *     &lt;enumeration value="MDA"/>
 *     &lt;enumeration value="MCO"/>
 *     &lt;enumeration value="MNG"/>
 *     &lt;enumeration value="MNE"/>
 *     &lt;enumeration value="MSR"/>
 *     &lt;enumeration value="MAR"/>
 *     &lt;enumeration value="MOZ"/>
 *     &lt;enumeration value="MMR"/>
 *     &lt;enumeration value="NAM"/>
 *     &lt;enumeration value="NRU"/>
 *     &lt;enumeration value="NPL"/>
 *     &lt;enumeration value="NLD"/>
 *     &lt;enumeration value="ANT"/>
 *     &lt;enumeration value="NCL"/>
 *     &lt;enumeration value="NZL"/>
 *     &lt;enumeration value="NIC"/>
 *     &lt;enumeration value="NER"/>
 *     &lt;enumeration value="NGA"/>
 *     &lt;enumeration value="NIU"/>
 *     &lt;enumeration value="NFK"/>
 *     &lt;enumeration value="MNP"/>
 *     &lt;enumeration value="NOR"/>
 *     &lt;enumeration value="OMN"/>
 *     &lt;enumeration value="PAK"/>
 *     &lt;enumeration value="PLW"/>
 *     &lt;enumeration value="PSE"/>
 *     &lt;enumeration value="PAN"/>
 *     &lt;enumeration value="PNG"/>
 *     &lt;enumeration value="PRY"/>
 *     &lt;enumeration value="PER"/>
 *     &lt;enumeration value="PHL"/>
 *     &lt;enumeration value="PCN"/>
 *     &lt;enumeration value="POL"/>
 *     &lt;enumeration value="PRT"/>
 *     &lt;enumeration value="PRI"/>
 *     &lt;enumeration value="QAT"/>
 *     &lt;enumeration value="REU"/>
 *     &lt;enumeration value="ROU"/>
 *     &lt;enumeration value="RUS"/>
 *     &lt;enumeration value="RWA"/>
 *     &lt;enumeration value="SHN"/>
 *     &lt;enumeration value="KNA"/>
 *     &lt;enumeration value="LCA"/>
 *     &lt;enumeration value="SPM"/>
 *     &lt;enumeration value="VCT"/>
 *     &lt;enumeration value="WSM"/>
 *     &lt;enumeration value="SMR"/>
 *     &lt;enumeration value="STP"/>
 *     &lt;enumeration value="SAU"/>
 *     &lt;enumeration value="SEN"/>
 *     &lt;enumeration value="SRB"/>
 *     &lt;enumeration value="SCG"/>
 *     &lt;enumeration value="SYC"/>
 *     &lt;enumeration value="SLE"/>
 *     &lt;enumeration value="SGP"/>
 *     &lt;enumeration value="SVK"/>
 *     &lt;enumeration value="SVN"/>
 *     &lt;enumeration value="SLB"/>
 *     &lt;enumeration value="SOM"/>
 *     &lt;enumeration value="ZAF"/>
 *     &lt;enumeration value="SGS"/>
 *     &lt;enumeration value="ESP"/>
 *     &lt;enumeration value="LKA"/>
 *     &lt;enumeration value="SDN"/>
 *     &lt;enumeration value="SUR"/>
 *     &lt;enumeration value="SJM"/>
 *     &lt;enumeration value="SWZ"/>
 *     &lt;enumeration value="SWE"/>
 *     &lt;enumeration value="CHE"/>
 *     &lt;enumeration value="SYR"/>
 *     &lt;enumeration value="TWN"/>
 *     &lt;enumeration value="TJK"/>
 *     &lt;enumeration value="TZA"/>
 *     &lt;enumeration value="THA"/>
 *     &lt;enumeration value="TLS"/>
 *     &lt;enumeration value="TGO"/>
 *     &lt;enumeration value="TKL"/>
 *     &lt;enumeration value="TMP"/>
 *     &lt;enumeration value="TON"/>
 *     &lt;enumeration value="TTO"/>
 *     &lt;enumeration value="TUN"/>
 *     &lt;enumeration value="TUR"/>
 *     &lt;enumeration value="TKM"/>
 *     &lt;enumeration value="TCA"/>
 *     &lt;enumeration value="TUV"/>
 *     &lt;enumeration value="UGA"/>
 *     &lt;enumeration value="UKR"/>
 *     &lt;enumeration value="ARE"/>
 *     &lt;enumeration value="GBR"/>
 *     &lt;enumeration value="USA"/>
 *     &lt;enumeration value="UMI"/>
 *     &lt;enumeration value="URY"/>
 *     &lt;enumeration value="UZB"/>
 *     &lt;enumeration value="VUT"/>
 *     &lt;enumeration value="VEN"/>
 *     &lt;enumeration value="VNM"/>
 *     &lt;enumeration value="VGB"/>
 *     &lt;enumeration value="VIR"/>
 *     &lt;enumeration value="WLF"/>
 *     &lt;enumeration value="ESH"/>
 *     &lt;enumeration value="YEM"/>
 *     &lt;enumeration value="YUG"/>
 *     &lt;enumeration value="ZMB"/>
 *     &lt;enumeration value="ZWE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeISOCountryCodeA3")
@XmlEnum
public enum TypeISOCountryCodeA3 {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; AFG - AF - 004 - Afghanistan &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    AFG("AFG"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ALA - AX - 248 - Åland Islands &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ALA("ALA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ALB - AL - 008 - Albania &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ALB("ALB"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DZA - DZ - 012 - Algeria &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    DZA("DZA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ASM - AS - 016 - American Samoa &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ASM("ASM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; AND - AD - 020 - Andorra &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    AND("AND"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; AGO - AO - 024 - Angola &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    AGO("AGO"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; AIA - AI - 660 - Anguilla &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    AIA("AIA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ATA - AQ - 010 - Antarctica &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ATA("ATA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ATG - AG - 028 - Antigua and Barbuda &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ATG("ATG"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ARG - AR - 032 - Argentina &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ARG("ARG"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ARM - AM - 051 - Armenia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ARM("ARM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ABW - AW - 533 - Aruba &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ABW("ABW"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; AUS - AU - 036 - Australia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    AUS("AUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; AUT - AT - 040 - Austria &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    AUT("AUT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; AZE - AZ - 031 - Azerbaijan &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    AZE("AZE"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BHS - BS - 044 - Bahamas &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BHS("BHS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BHR - BH - 048 - Bahrain &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BHR("BHR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BGD - BD - 050 - Bangladesh &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BGD("BGD"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BRB - BB - 052 - Barbados &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BRB("BRB"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BLR - BY - 112 - Belarus &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BLR("BLR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BEL - BE - 056 - Belgium &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BEL("BEL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BLZ - BZ - 084 - Belize &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BLZ("BLZ"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BEN - BJ - 204 - Benin &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BEN("BEN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BMU - BM - 060 - Bermuda &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BMU("BMU"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BTN - BT - 064 - Bhutan &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BTN("BTN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BOL - BO - 068 - Bolivia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BOL("BOL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BIH - BA - 070 - Bosnia and Herzegovina &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BIH("BIH"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BWA - BW - 072 - Botswana &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BWA("BWA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BVT - BV - 074 - Bouvet Island &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BVT("BVT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BRA - BR - 076 - Brazil &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BRA("BRA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; IOT - IO - 086 - British Indian Ocean Territory &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    IOT("IOT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BRN - BN - 096 - Brunei Darussalam &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BRN("BRN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BGR - BG - 100 - Bulgaria &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BGR("BGR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BFA - BF - 854 - Burkina Faso &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BFA("BFA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BDI - BI - 108 - Burundi &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    BDI("BDI"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KHM - KH - 116 - Cambodia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    KHM("KHM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CMR - CM - 120 - Cameroon &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CMR("CMR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CAN - CA - 124 - Canada &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CAN("CAN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CPV - CV - 132 - Cape Verde &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CPV("CPV"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CYM - KY - 136 - Cayman Islands &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CYM("CYM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CAF - CF - 140 - Central African Republic &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CAF("CAF"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TCD - TD - 148 - Chad &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TCD("TCD"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CHL - CL - 152 - Chile &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CHL("CHL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CHN - CN - 156 - China &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CHN("CHN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CXR - CX - 162 - Christmas Island &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CXR("CXR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CCK - CC - 166 - Cocos (Keeling) Islands &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CCK("CCK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; COL - CO - 170 - Colombia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    COL("COL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; COM - KM - 174 - Comoros &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    COM("COM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; COG - CG - 178 - Congo &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    COG("COG"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; COD - CD - 180 - Congo, Democratic Republic of the &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    COD("COD"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; COK - CK - 184 - Cook Islands &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    COK("COK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CRI - CR - 188 - Costa Rica &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CRI("CRI"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CIV - CI - 384 - Côte d'Ivoire &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CIV("CIV"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HRV - HR - 191 - Croatia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    HRV("HRV"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CUB - CU - 192 - Cuba &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CUB("CUB"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CYP - CY - 196 - Cyprus &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CYP("CYP"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CZE - CZ - 203 - Czech Republic &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CZE("CZE"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DNK - DK - 208 - Denmark &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    DNK("DNK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DJI - DJ - 262 - Djibouti &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    DJI("DJI"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DMA - DM - 212 - Dominica &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    DMA("DMA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DOM - DO - 214 - Dominican Republic &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    DOM("DOM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ECU - EC - 218 - Ecuador &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ECU("ECU"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; EGY - EG - 818 - Egypt &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    EGY("EGY"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SLV - SV - 222 - El Salvador &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SLV("SLV"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GNQ - GQ - 226 - Equatorial Guinea &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GNQ("GNQ"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ERI - ER - 232 - Eritrea &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ERI("ERI"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; EST - EE - 233 - Estonia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    EST("EST"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ETH - ET - 231 - Ethiopia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ETH("ETH"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; FLK - FK - 238 - Falkland Islands (Malvinas) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    FLK("FLK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; FRO - FO - 234 - Faroe Islands &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    FRO("FRO"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; FJI - FJ - 242 - Fiji &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    FJI("FJI"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; FIN - FI - 246 - Finland &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    FIN("FIN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; FRA - FR - 250 - France &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    FRA("FRA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; FXX - FX - 249 - France, Metropolitan &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    FXX("FXX"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GUF - GF - 254 - French Guiana &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GUF("GUF"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PYF - PF - 258 - French Polynesia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PYF("PYF"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ATF - TF - 260 - French Southern Territories &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ATF("ATF"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GAB - GA - 266 - Gabon &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GAB("GAB"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GMB - GM - 270 - Gambia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GMB("GMB"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GEO - GE - 268 - Georgia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GEO("GEO"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DEU - DE - 276 - Germany &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    DEU("DEU"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GHA - GH - 288 - Ghana &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GHA("GHA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GIB - GI - 292 - Gibraltar &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GIB("GIB"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GRC - GR - 300 - Greece &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GRC("GRC"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GRL - GL - 304 - Greenland &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GRL("GRL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GRD - GD - 308 - Grenada &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GRD("GRD"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GLP - GP - 312 - Guadeloupe &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GLP("GLP"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GUM - GU - 316 - Guam &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GUM("GUM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GTM - GT - 320 - Guatemala &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GTM("GTM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GGY - GG - 831 - Guernsey &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GGY("GGY"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GIN - GN - 324 - Guinea &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GIN("GIN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GNB - GW - 624 - Guinea-Bissau &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GNB("GNB"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GUY - GY - 328 - Guyana &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GUY("GUY"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HTI - HT - 332 - Haiti &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    HTI("HTI"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HMD - HM - 334 - Heard Island and McDonald Islands &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    HMD("HMD"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; VAT - VA - 336 - Holy See (Vatican City State) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    VAT("VAT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HND - HN - 340 - Honduras &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    HND("HND"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HKG - HK - 344 - Hong Kong &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    HKG("HKG"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HUN - HU - 348 - Hungary &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    HUN("HUN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ISL - IS - 352 - Iceland &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ISL("ISL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; IND - IN - 356 - India &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    IND("IND"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; IDN - ID - 360 - Indonesia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    IDN("IDN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; IRN - IR - 364 - Iran, Islamic Republic of &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    IRN("IRN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; IRQ - IQ - 368 - Iraq &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    IRQ("IRQ"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; IRL - IE - 372 - Ireland &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    IRL("IRL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; IMN - IM - 833 - Isle of Man &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    IMN("IMN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ISR - IL - 376 - Israel &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ISR("ISR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ITA - IT - 380 - Italy &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ITA("ITA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; JAM - JM - 388 - Jamaica &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    JAM("JAM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; JPN - JP - 392 - Japan &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    JPN("JPN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; JEY - JE - 832 - Jersey &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    JEY("JEY"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; JOR - JO - 400 - Jordan &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    JOR("JOR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KAZ - KZ - 398 - Kazakhstan &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    KAZ("KAZ"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KEN - KE - 404 - Kenya &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    KEN("KEN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KIR - KI - 296 - Kiribati &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    KIR("KIR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PRK - KP - 408 - Korea, Democratic People's Republic of &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PRK("PRK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KOR - KR - 410 - Korea, Republic of &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    KOR("KOR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KWT - KW - 414 - Kuwait &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    KWT("KWT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KGZ - KG - 417 - Kyrgyzstan &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    KGZ("KGZ"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LAO - LA - 418 - Lao People's Democratic Republic &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    LAO("LAO"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LVA - LV - 428 - Latvia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    LVA("LVA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LBN - LB - 422 - Lebanon &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    LBN("LBN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LSO - LS - 426 - Lesotho &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    LSO("LSO"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LBR - LR - 430 - Liberia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    LBR("LBR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LBY - LY - 434 - Libyan Arab Jamahiriya &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    LBY("LBY"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LIE - LI - 438 - Liechtenstein &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    LIE("LIE"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LTU - LT - 440 - Lithuania &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    LTU("LTU"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LUX - LU - 442 - Luxembourg &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    LUX("LUX"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MAC - MO - 446 - Macao &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MAC("MAC"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MKD - MK - 807 - Macedonia, the former Yugoslav Republic of &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MKD("MKD"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MDG - MG - 450 - Madagascar &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MDG("MDG"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MWI - MW - 454 - Malawi &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MWI("MWI"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MYS - MY - 458 - Malaysia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MYS("MYS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MDV - MV - 462 - Maldives &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MDV("MDV"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MLI - ML - 466 - Mali &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MLI("MLI"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MLT - MT - 470 - Malta &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MLT("MLT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MHL - MH - 584 - Marshall Islands &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MHL("MHL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MTQ - MQ - 474 - Martinique &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MTQ("MTQ"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MRT - MR - 478 - Mauritania &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MRT("MRT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MUS - MU - 480 - Mauritius &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MUS("MUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MYT - YT - 175 - Mayotte &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MYT("MYT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MEX - MX - 484 - Mexico &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MEX("MEX"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; FSM - FM - 583 - Micronesia, Federated States of &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    FSM("FSM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MDA - MD - 498 - Moldova, Republic of &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MDA("MDA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MCO - MC - 492 - Monaco &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MCO("MCO"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MNG - MN - 496 - Mongolia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MNG("MNG"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MNE - ME - 499 - Montenegro &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MNE("MNE"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MSR - MS - 500 - Montserrat &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MSR("MSR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MAR - MA - 504 - Morocco &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MAR("MAR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MOZ - MZ - 508 - Mozambique &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MOZ("MOZ"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MMR - MM - 104 - Myanmar &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MMR("MMR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NAM - NA - 516 - Namibia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    NAM("NAM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NRU - NR - 520 - Nauru &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    NRU("NRU"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NPL - NP - 524 - Nepal &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    NPL("NPL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NLD - NL - 528 - Netherlands &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    NLD("NLD"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ANT - AN - 530 - Netherlands Antilles &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ANT("ANT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NCL - NC - 540 - New Caledonia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    NCL("NCL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NZL - NZ - 554 - New Zealand &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    NZL("NZL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NIC - NI - 558 - Nicaragua &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    NIC("NIC"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NER - NE - 562 - Niger &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    NER("NER"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NGA - NG - 566 - Nigeria &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    NGA("NGA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NIU - NU - 570 - Niue &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    NIU("NIU"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NFK - NF - 574 - Norfolk Island &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    NFK("NFK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MNP - MP - 580 - Northern Mariana Islands &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    MNP("MNP"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NOR - NO - 578 - Norway &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    NOR("NOR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; OMN - OM - 512 - Oman &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    OMN("OMN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PAK - PK - 586 - Pakistan &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PAK("PAK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PLW - PW - 585 - Palau &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PLW("PLW"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PSE - PS - 275 - Palestinian Territory, Occupied &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PSE("PSE"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PAN - PA - 591 - Panama &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PAN("PAN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PNG - PG - 598 - Papua New Guinea &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PNG("PNG"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PRY - PY - 600 - Paraguay &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PRY("PRY"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PER - PE - 604 - Peru &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PER("PER"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PHL - PH - 608 - Philippines &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PHL("PHL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PCN - PN - 612 - Pitcairn &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PCN("PCN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; POL - PL - 616 - Poland &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    POL("POL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PRT - PT - 620 - Portugal &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PRT("PRT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PRI - PR - 630 - Puerto Rico &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    PRI("PRI"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; QAT - QA - 634 - Qatar &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    QAT("QAT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; REU - RE - 638 - Réunion &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    REU("REU"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ROU - RO - 642 - Romania &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ROU("ROU"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; RUS - RU - 643 - Russian Federation &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    RUS("RUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; RWA - RW - 646 - Rwanda &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    RWA("RWA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SHN - SH - 654 - Saint Helena &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SHN("SHN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KNA - KN - 659 - Saint Kitts and Nevis &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    KNA("KNA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LCA - LC - 662 - Saint Lucia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    LCA("LCA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SPM - PM - 666 - Saint Pierre and Miquelon &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SPM("SPM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; VCT - VC - 670 - Saint Vincent and the Grenadines &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    VCT("VCT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; WSM - WS - 882 - Samoa &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    WSM("WSM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SMR - SM - 674 - San Marino &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SMR("SMR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; STP - ST - 678 - Sao Tome and Principe &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    STP("STP"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SAU - SA - 682 - Saudi Arabia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SAU("SAU"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SEN - SN - 686 - Senegal &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SEN("SEN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SRB - RS - 688 - Serbia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SRB("SRB"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SCG - CS - 891 - Serbia and Montenegro &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SCG("SCG"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SYC - SC - 690 - Seychelles &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SYC("SYC"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SLE - SL - 694 - Sierra Leone &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SLE("SLE"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SGP - SG - 702 - Singapore &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SGP("SGP"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SVK - SK - 703 - Slovakia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SVK("SVK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SVN - SI - 705 - Slovenia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SVN("SVN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SLB - SB - 090 - Solomon Islands &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SLB("SLB"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SOM - SO - 706 - Somalia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SOM("SOM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ZAF - ZA - 710 - South Africa &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ZAF("ZAF"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SGS - GS - 239 - South Georgia and the South Sandwich Islands &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SGS("SGS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ESP - ES - 724 - Spain &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ESP("ESP"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LKA - LK - 144 - Sri Lanka &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    LKA("LKA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SDN - SD - 736 - Sudan &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SDN("SDN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SUR - SR - 740 - Suriname &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SUR("SUR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SJM - SJ - 744 - Svalbard and Jan Mayen &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SJM("SJM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SWZ - SZ - 748 - Swaziland &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SWZ("SWZ"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SWE - SE - 752 - Sweden &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SWE("SWE"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CHE - CH - 756 - Switzerland &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    CHE("CHE"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SYR - SY - 760 - Syrian Arab Republic &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    SYR("SYR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TWN - TW - 158 - Taiwan, Province of China &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TWN("TWN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TJK - TJ - 762 - Tajikistan &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TJK("TJK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TZA - TZ - 834 - Tanzania, United Republic of &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TZA("TZA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; THA - TH - 764 - Thailand &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    THA("THA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TLS - TL - 626 - Timor-Leste &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TLS("TLS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TGO - TG - 768 - Togo &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TGO("TGO"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TKL - TK - 772 - Tokelau &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TKL("TKL"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TMP - TP - 626 - East Timor &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TMP("TMP"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TON - TO - 776 - Tonga &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TON("TON"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TTO - TT - 780 - Trinidad and Tobago &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TTO("TTO"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TUN - TN - 788 - Tunisia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TUN("TUN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TUR - TR - 792 - Turkey &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TUR("TUR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TKM - TM - 795 - Turkmenistan &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TKM("TKM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TCA - TC - 796 - Turks and Caicos Islands &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TCA("TCA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TUV - TV - 798 - Tuvalu &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    TUV("TUV"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; UGA - UG - 800 - Uganda &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    UGA("UGA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; UKR - UA - 804 - Ukraine &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    UKR("UKR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ARE - AE - 784 - United Arab Emirates &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ARE("ARE"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GBR - GB - 826 - United Kingdom &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    GBR("GBR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; USA - US - 840 - United States &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    USA("USA"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; UMI - UM - 581 - United States Minor Outlying Islands &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    UMI("UMI"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; URY - UY - 858 - Uruguay &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    URY("URY"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; UZB - UZ - 860 - Uzbekistan &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    UZB("UZB"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; VUT - VU - 548 - Vanuatu &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    VUT("VUT"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; VEN - VE - 862 - Venezuela &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    VEN("VEN"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; VNM - VN - 704 - Viet Nam &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    VNM("VNM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; VGB - VG - 092 - Virgin Islands, British &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    VGB("VGB"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; VIR - VI - 850 - Virgin Islands, U.S. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    VIR("VIR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; WLF - WF - 876 - Wallis and Futuna &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    WLF("WLF"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ESH - EH - 732 - Western Sahara &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ESH("ESH"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; YEM - YE - 887 - Yemen &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    YEM("YEM"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; YUG - YU - 891 - Yugoslavia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    YUG("YUG"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ZMB - ZM - 894 - Zambia &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ZMB("ZMB"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ZWE - ZW - 716 - Zimbabwe &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    ZWE("ZWE");
    private final String value;

    TypeISOCountryCodeA3(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeISOCountryCodeA3 fromValue(String v) {
        for (TypeISOCountryCodeA3 c: TypeISOCountryCodeA3 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
