
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeTaxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeTaxType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="CityTax"/>
 *     &lt;enumeration value="CountyTax"/>
 *     &lt;enumeration value="CountyParishTax"/>
 *     &lt;enumeration value="EnergyTax"/>
 *     &lt;enumeration value="FederalTax"/>
 *     &lt;enumeration value="EnvironmentalTax"/>
 *     &lt;enumeration value="GoodsServicesTax"/>
 *     &lt;enumeration value="HarmonizedTax"/>
 *     &lt;enumeration value="LuxuryTax"/>
 *     &lt;enumeration value="LocalSalesTax"/>
 *     &lt;enumeration value="MunicipalTax"/>
 *     &lt;enumeration value="OccupancyTax"/>
 *     &lt;enumeration value="OtherTax"/>
 *     &lt;enumeration value="QuebecSalesTax"/>
 *     &lt;enumeration value="RoomTax"/>
 *     &lt;enumeration value="StateLocalSalesTax"/>
 *     &lt;enumeration value="StateProvincialGoodsTax"/>
 *     &lt;enumeration value="StateSalesTax"/>
 *     &lt;enumeration value="StateProvincialTax"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="VAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeTaxType")
@XmlEnum
public enum TypeTaxType {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; City Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CityTax")
    CITY_TAX("CityTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; County Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CountyTax")
    COUNTY_TAX("CountyTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; County/Parish Sales Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CountyParishTax")
    COUNTY_PARISH_TAX("CountyParishTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Energy Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("EnergyTax")
    ENERGY_TAX("EnergyTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Federal Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("FederalTax")
    FEDERAL_TAX("FederalTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Environmental Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("EnvironmentalTax")
    ENVIRONMENTAL_TAX("EnvironmentalTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Goods and Services Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("GoodsServicesTax")
    GOODS_SERVICES_TAX("GoodsServicesTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Harmonized Tax (HST). &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("HarmonizedTax")
    HARMONIZED_TAX("HarmonizedTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Luxury Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("LuxuryTax")
    LUXURY_TAX("LuxuryTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Local Sales Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("LocalSalesTax")
    LOCAL_SALES_TAX("LocalSalesTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Municipal Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MunicipalTax")
    MUNICIPAL_TAX("MunicipalTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Occupancy Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("OccupancyTax")
    OCCUPANCY_TAX("OccupancyTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Other Not Specified Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("OtherTax")
    OTHER_TAX("OtherTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Quebec Sales Tax (QST). &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("QuebecSalesTax")
    QUEBEC_SALES_TAX("QuebecSalesTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Room Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("RoomTax")
    ROOM_TAX("RoomTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; State and Local Sales Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("StateLocalSalesTax")
    STATE_LOCAL_SALES_TAX("StateLocalSalesTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; State or Provincial Tax on Goods. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("StateProvincialGoodsTax")
    STATE_PROVINCIAL_GOODS_TAX("StateProvincialGoodsTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; State Sales Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("StateSalesTax")
    STATE_SALES_TAX("StateSalesTax"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; State/Provincial Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("StateProvincialTax")
    STATE_PROVINCIAL_TAX("StateProvincialTax"),

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Value Added Tax. &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    VAT("VAT");
    private final String value;

    TypeTaxType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeTaxType fromValue(String v) {
        for (TypeTaxType c: TypeTaxType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
