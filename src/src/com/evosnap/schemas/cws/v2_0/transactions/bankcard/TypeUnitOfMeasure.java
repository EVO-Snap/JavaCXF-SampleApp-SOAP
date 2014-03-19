
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeUnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Acre"/>
 *     &lt;enumeration value="AmpereHour"/>
 *     &lt;enumeration value="Ampere"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="TroyOunceOrApothecariesOunce"/>
 *     &lt;enumeration value="Are"/>
 *     &lt;enumeration value="AlcoholicStrengthByMass"/>
 *     &lt;enumeration value="AlcoholicStrengthByVolume"/>
 *     &lt;enumeration value="StandardAtmosphere"/>
 *     &lt;enumeration value="TechnicalAtmosphere"/>
 *     &lt;enumeration value="Bar"/>
 *     &lt;enumeration value="BoardFoot"/>
 *     &lt;enumeration value="BrakeHorsePower"/>
 *     &lt;enumeration value="BillionEURTrillionUS"/>
 *     &lt;enumeration value="DryBarrelUS"/>
 *     &lt;enumeration value="BarrelUSPetroleumEtc"/>
 *     &lt;enumeration value="Becquerel"/>
 *     &lt;enumeration value="BritishThermalUnit"/>
 *     &lt;enumeration value="BushelUS"/>
 *     &lt;enumeration value="BushelUK"/>
 *     &lt;enumeration value="CarryingCapacityInMetricTon"/>
 *     &lt;enumeration value="Candela"/>
 *     &lt;enumeration value="DegreeCelsius"/>
 *     &lt;enumeration value="Hundred"/>
 *     &lt;enumeration value="Centigram"/>
 *     &lt;enumeration value="CoulombPerKilogram"/>
 *     &lt;enumeration value="HundredLeave"/>
 *     &lt;enumeration value="Centilitre"/>
 *     &lt;enumeration value="Centiliter"/>
 *     &lt;enumeration value="SquareCentimetre"/>
 *     &lt;enumeration value="SquareCentimeter"/>
 *     &lt;enumeration value="CubicCentimetre"/>
 *     &lt;enumeration value="CubicCentimeter"/>
 *     &lt;enumeration value="Centimetre"/>
 *     &lt;enumeration value="Centimeter"/>
 *     &lt;enumeration value="HundredPack"/>
 *     &lt;enumeration value="CentalUK"/>
 *     &lt;enumeration value="Coulomb"/>
 *     &lt;enumeration value="MetricCarat"/>
 *     &lt;enumeration value="Curie"/>
 *     &lt;enumeration value="HundredPoundsCWTHundredWeightUS"/>
 *     &lt;enumeration value="HundredWeightUK"/>
 *     &lt;enumeration value="Decare"/>
 *     &lt;enumeration value="TenDay"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Decade"/>
 *     &lt;enumeration value="Decilitre"/>
 *     &lt;enumeration value="Deciliter"/>
 *     &lt;enumeration value="SquareDecimetre"/>
 *     &lt;enumeration value="SquareDecimeter"/>
 *     &lt;enumeration value="CubicDecimetre"/>
 *     &lt;enumeration value="CubicDecimeter"/>
 *     &lt;enumeration value="Decimetre"/>
 *     &lt;enumeration value="Decimeter"/>
 *     &lt;enumeration value="DozenPiece"/>
 *     &lt;enumeration value="DozenPair"/>
 *     &lt;enumeration value="DisplacementTonnage"/>
 *     &lt;enumeration value="DramUS"/>
 *     &lt;enumeration value="DramUK"/>
 *     &lt;enumeration value="DozenRoll"/>
 *     &lt;enumeration value="DrachmUK"/>
 *     &lt;enumeration value="DecitonneCentnerMetric100KgQuintalMetric100Kg"/>
 *     &lt;enumeration value="Pennyweight"/>
 *     &lt;enumeration value="Dozen"/>
 *     &lt;enumeration value="DozenPack"/>
 *     &lt;enumeration value="DegreeFahrenheit"/>
 *     &lt;enumeration value="Farad"/>
 *     &lt;enumeration value="Foot"/>
 *     &lt;enumeration value="SquareFoot"/>
 *     &lt;enumeration value="CubicFoot"/>
 *     &lt;enumeration value="Gigabecquerel"/>
 *     &lt;enumeration value="GramOfFissileIsotope"/>
 *     &lt;enumeration value="GreatGross"/>
 *     &lt;enumeration value="GillUS"/>
 *     &lt;enumeration value="GillUK"/>
 *     &lt;enumeration value="DryGallonUS"/>
 *     &lt;enumeration value="GallonUK"/>
 *     &lt;enumeration value="GallonUS"/>
 *     &lt;enumeration value="Gram"/>
 *     &lt;enumeration value="Grain"/>
 *     &lt;enumeration value="Gross"/>
 *     &lt;enumeration value="GrossRegisterTon"/>
 *     &lt;enumeration value="GigawattHour"/>
 *     &lt;enumeration value="Hectare"/>
 *     &lt;enumeration value="Hectobar"/>
 *     &lt;enumeration value="HundredBox"/>
 *     &lt;enumeration value="Hectogram"/>
 *     &lt;enumeration value="HundredInternationalUnit"/>
 *     &lt;enumeration value="Hectolitre"/>
 *     &lt;enumeration value="Hectoliter"/>
 *     &lt;enumeration value="MillionCubicMetre"/>
 *     &lt;enumeration value="MillionCubicMeter"/>
 *     &lt;enumeration value="Hectometre"/>
 *     &lt;enumeration value="Hectometer"/>
 *     &lt;enumeration value="HectolitreOfPureAlcohol"/>
 *     &lt;enumeration value="HectoliterOfPureAlcohol"/>
 *     &lt;enumeration value="Hertz"/>
 *     &lt;enumeration value="Hour"/>
 *     &lt;enumeration value="Inch"/>
 *     &lt;enumeration value="SquareInch"/>
 *     &lt;enumeration value="CubicInch"/>
 *     &lt;enumeration value="Joule"/>
 *     &lt;enumeration value="Kilobar"/>
 *     &lt;enumeration value="Kelvin"/>
 *     &lt;enumeration value="Kilogram"/>
 *     &lt;enumeration value="KilogramPerSecond"/>
 *     &lt;enumeration value="Kilohertz"/>
 *     &lt;enumeration value="Kilojoule"/>
 *     &lt;enumeration value="KilometrePerHour"/>
 *     &lt;enumeration value="KilometerPerHour"/>
 *     &lt;enumeration value="SquareKilometre"/>
 *     &lt;enumeration value="SquareKilometer"/>
 *     &lt;enumeration value="KilogramPerCubicMetre"/>
 *     &lt;enumeration value="KilogramPerCubicMeter"/>
 *     &lt;enumeration value="Kilometre"/>
 *     &lt;enumeration value="Kilometer"/>
 *     &lt;enumeration value="KilogramOfNitrogen"/>
 *     &lt;enumeration value="KilogramNamedSubstance"/>
 *     &lt;enumeration value="Knot"/>
 *     &lt;enumeration value="Kilopascal"/>
 *     &lt;enumeration value="KilogramOfPotassiumHydroxideCausticPotash"/>
 *     &lt;enumeration value="KilogramOfPotassiumOxide"/>
 *     &lt;enumeration value="KilogramOfPhosphorusPentoxidePhosphoricAnhydride"/>
 *     &lt;enumeration value="KilogramOfSubstance90PercentDry"/>
 *     &lt;enumeration value="KilogramOfSodiumHydroxideCausticSoda"/>
 *     &lt;enumeration value="Kilotonne"/>
 *     &lt;enumeration value="KilogramOfUranium"/>
 *     &lt;enumeration value="KilovoltAmpere"/>
 *     &lt;enumeration value="Kilovar"/>
 *     &lt;enumeration value="Kilovolt"/>
 *     &lt;enumeration value="KilowattHour"/>
 *     &lt;enumeration value="Kilowatt"/>
 *     &lt;enumeration value="Pound"/>
 *     &lt;enumeration value="TroyPoundUS"/>
 *     &lt;enumeration value="Leaf"/>
 *     &lt;enumeration value="LitreOfPureAlcohol"/>
 *     &lt;enumeration value="LiterOfPureAlcohol"/>
 *     &lt;enumeration value="TonUKorLongTonUS"/>
 *     &lt;enumeration value="Litre"/>
 *     &lt;enumeration value="Liter"/>
 *     &lt;enumeration value="Lumen"/>
 *     &lt;enumeration value="Lux"/>
 *     &lt;enumeration value="MegaLitre"/>
 *     &lt;enumeration value="MegaLiter"/>
 *     &lt;enumeration value="Megametre"/>
 *     &lt;enumeration value="Megameter"/>
 *     &lt;enumeration value="Megawatt"/>
 *     &lt;enumeration value="ThousandStandardBrickEquivalent"/>
 *     &lt;enumeration value="ThousandBoardFeet"/>
 *     &lt;enumeration value="Millibar"/>
 *     &lt;enumeration value="Millicurie"/>
 *     &lt;enumeration value="Milligram"/>
 *     &lt;enumeration value="Megahertz"/>
 *     &lt;enumeration value="SquareMile"/>
 *     &lt;enumeration value="Thousand"/>
 *     &lt;enumeration value="Minute"/>
 *     &lt;enumeration value="Million"/>
 *     &lt;enumeration value="MillionInternationalUnit"/>
 *     &lt;enumeration value="MilliardBillionUS"/>
 *     &lt;enumeration value="Millilitre"/>
 *     &lt;enumeration value="Milliliter"/>
 *     &lt;enumeration value="SquareMillimetre"/>
 *     &lt;enumeration value="SquareMillimeter"/>
 *     &lt;enumeration value="CubicMillimetre"/>
 *     &lt;enumeration value="CubicMillimeter"/>
 *     &lt;enumeration value="Millimetre"/>
 *     &lt;enumeration value="Millimeter"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Megapascal"/>
 *     &lt;enumeration value="CubicMetrePerHour"/>
 *     &lt;enumeration value="CubicMeterPerHour"/>
 *     &lt;enumeration value="CubicMetrePerSecond"/>
 *     &lt;enumeration value="CubicMeterPerSecond"/>
 *     &lt;enumeration value="MetrePerSecondSquared"/>
 *     &lt;enumeration value="MeterPerSecondSquared"/>
 *     &lt;enumeration value="SquareMetre"/>
 *     &lt;enumeration value="SquareMeter"/>
 *     &lt;enumeration value="CubicMetre"/>
 *     &lt;enumeration value="CubicMeter"/>
 *     &lt;enumeration value="Metre"/>
 *     &lt;enumeration value="Meter"/>
 *     &lt;enumeration value="MetrePerSecond"/>
 *     &lt;enumeration value="MeterPerSecond"/>
 *     &lt;enumeration value="MegavoltAmpere"/>
 *     &lt;enumeration value="MegawattHour1000KWH"/>
 *     &lt;enumeration value="NumberOfArticles"/>
 *     &lt;enumeration value="NumberOfBobbins"/>
 *     &lt;enumeration value="NumberOfCells"/>
 *     &lt;enumeration value="Newton"/>
 *     &lt;enumeration value="NumberOfInternationalUnits"/>
 *     &lt;enumeration value="NauticalMile"/>
 *     &lt;enumeration value="NumberOfPacks"/>
 *     &lt;enumeration value="NumberOfParcels"/>
 *     &lt;enumeration value="NumberOfPairs"/>
 *     &lt;enumeration value="NumberOfParts"/>
 *     &lt;enumeration value="NumberOfRolls"/>
 *     &lt;enumeration value="NetRegisterTon"/>
 *     &lt;enumeration value="Ohm"/>
 *     &lt;enumeration value="Ounce"/>
 *     &lt;enumeration value="FluidOunceUS"/>
 *     &lt;enumeration value="FluidOunceUK"/>
 *     &lt;enumeration value="Pascal"/>
 *     &lt;enumeration value="Piece"/>
 *     &lt;enumeration value="ProofGallon"/>
 *     &lt;enumeration value="DryPintUS"/>
 *     &lt;enumeration value="PintUK"/>
 *     &lt;enumeration value="LiquidPintUS"/>
 *     &lt;enumeration value="QuarterOfAYear"/>
 *     &lt;enumeration value="DryQuartUS"/>
 *     &lt;enumeration value="QuartUK"/>
 *     &lt;enumeration value="LiquidQuartUS"/>
 *     &lt;enumeration value="QuarterUK"/>
 *     &lt;enumeration value="RevolutionsPerMinute"/>
 *     &lt;enumeration value="RevolutionsPerSecond"/>
 *     &lt;enumeration value="HalfYear6Months"/>
 *     &lt;enumeration value="Score"/>
 *     &lt;enumeration value="Scruple"/>
 *     &lt;enumeration value="Second"/>
 *     &lt;enumeration value="Set"/>
 *     &lt;enumeration value="ShippingTon"/>
 *     &lt;enumeration value="Siemens"/>
 *     &lt;enumeration value="MileStatuteMile"/>
 *     &lt;enumeration value="ShortStandard7200Matches"/>
 *     &lt;enumeration value="StoneUK"/>
 *     &lt;enumeration value="TonUSOrShortTonUKUS"/>
 *     &lt;enumeration value="KiloampereHourThousandAmpereHour"/>
 *     &lt;enumeration value="TonneMetricTon"/>
 *     &lt;enumeration value="TenPair"/>
 *     &lt;enumeration value="ThousandCubicMetrePerDay"/>
 *     &lt;enumeration value="ThousandCubicMeterPerDay"/>
 *     &lt;enumeration value="TrillionEUR"/>
 *     &lt;enumeration value="TonneOfSubstance90PercentDry"/>
 *     &lt;enumeration value="TonOfSteamPerHour"/>
 *     &lt;enumeration value="Volt"/>
 *     &lt;enumeration value="Cord"/>
 *     &lt;enumeration value="Weber"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="WattHour"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Watt"/>
 *     &lt;enumeration value="SquareYard"/>
 *     &lt;enumeration value="CubicYard"/>
 *     &lt;enumeration value="Yard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeUnitOfMeasure")
@XmlEnum
public enum TypeUnitOfMeasure {


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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ACR - 077 - Acre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Acre")
    ACRE("Acre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; AMH - 263 - Ampere Hour &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("AmpereHour")
    AMPERE_HOUR("AmpereHour"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; AMP - 260 - Ampere &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Ampere")
    AMPERE("Ampere"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ANN - 366 - Year &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Year")
    YEAR("Year"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; APZ - 201 - Troy Ounce Or Apothecaries Ounce &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TroyOunceOrApothecariesOunce")
    TROY_OUNCE_OR_APOTHECARIES_OUNCE("TroyOunceOrApothecariesOunce"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ARE - 109 - Are &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Are")
    ARE("Are"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ASM - 820 - Alcoholic Strength By Mass &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("AlcoholicStrengthByMass")
    ALCOHOLIC_STRENGTH_BY_MASS("AlcoholicStrengthByMass"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ASU - 821 - Alcoholic Strength By Volume &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("AlcoholicStrengthByVolume")
    ALCOHOLIC_STRENGTH_BY_VOLUME("AlcoholicStrengthByVolume"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ATM - 300 - Standard Atmosphere &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("StandardAtmosphere")
    STANDARD_ATMOSPHERE("StandardAtmosphere"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ATT - 301 - Technical Atmosphere &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TechnicalAtmosphere")
    TECHNICAL_ATMOSPHERE("TechnicalAtmosphere"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BAR - 309 - Bar &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Bar")
    BAR("Bar"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BFT - 154 - Board Foot &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BoardFoot")
    BOARD_FOOT("BoardFoot"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BHP - 213 - Brake Horse Power &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BrakeHorsePower")
    BRAKE_HORSE_POWER("BrakeHorsePower"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BIL - 801 - Billion (EUR)/Trillion (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BillionEURTrillionUS")
    BILLION_EUR_TRILLION_US("BillionEURTrillionUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BLD - 151 - Dry Barrel (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DryBarrelUS")
    DRY_BARREL_US("DryBarrelUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BLL - 146 - Barrel (US) (Petroleum Etc.) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BarrelUSPetroleumEtc")
    BARREL_US_PETROLEUM_ETC("BarrelUSPetroleumEtc"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BQL - 323 - Becquerel &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Becquerel")
    BECQUEREL("Becquerel"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BTU - 275 - British Thermal Unit &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BritishThermalUnit")
    BRITISH_THERMAL_UNIT("BritishThermalUnit"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BUA - 150 - Bushel (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BushelUS")
    BUSHEL_US("BushelUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; BUI - 140 - Bushel (UK) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("BushelUK")
    BUSHEL_UK("BushelUK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CCT - 185 - Carrying Capacity In Metric Ton &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CarryingCapacityInMetricTon")
    CARRYING_CAPACITY_IN_METRIC_TON("CarryingCapacityInMetricTon"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CDL - 282 - Candela &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Candela")
    CANDELA("Candela"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CEL - 280 - Degree Celsius &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DegreeCelsius")
    DEGREE_CELSIUS("DegreeCelsius"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CEN - 797 - Hundred &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Hundred")
    HUNDRED("Hundred"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CGM - 173 - Centigram &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Centigram")
    CENTIGRAM("Centigram"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CKG - 349 - Coulomb Per Kilogram &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CoulombPerKilogram")
    COULOMB_PER_KILOGRAM("CoulombPerKilogram"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CLF - 626 - Hundred Leave &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("HundredLeave")
    HUNDRED_LEAVE("HundredLeave"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CLT - 117 - Centilitre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Centilitre")
    CENTILITRE("Centilitre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CLT - 117 - Centiliter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Centiliter")
    CENTILITER("Centiliter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CMK - 051 - Square Centimetre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareCentimetre")
    SQUARE_CENTIMETRE("SquareCentimetre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CMK - 051 - Square Centimeter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareCentimeter")
    SQUARE_CENTIMETER("SquareCentimeter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CMQ - 111 - Cubic Centimetre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicCentimetre")
    CUBIC_CENTIMETRE("CubicCentimetre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CMQ - 111 - Cubic Centimeter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicCentimeter")
    CUBIC_CENTIMETER("CubicCentimeter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CMT - 004 - Centimetre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Centimetre")
    CENTIMETRE("Centimetre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CMT - 004 - Centimeter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Centimeter")
    CENTIMETER("Centimeter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CNP - 781 - Hundred Pack &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("HundredPack")
    HUNDRED_PACK("HundredPack"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CNT - 192 - Cental (UK) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CentalUK")
    CENTAL_UK("CentalUK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; COU - 270 - Coulomb &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Coulomb")
    COULOMB("Coulomb"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CTM - 162 - Metric Carat &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MetricCarat")
    METRIC_CARAT("MetricCarat"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CUR - 305 - Curie &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Curie")
    CURIE("Curie"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CWA - 193 - Hundred Pounds (CWT)/Hundred Weight (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("HundredPoundsCWTHundredWeightUS")
    HUNDRED_POUNDS_CWT_HUNDRED_WEIGHT_US("HundredPoundsCWTHundredWeightUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; CWI - 194 - Hundred Weight (UK) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("HundredWeightUK")
    HUNDRED_WEIGHT_UK("HundredWeightUK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DAA - 058 - Decare &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Decare")
    DECARE("Decare"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DAD - 361 - Ten Day &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TenDay")
    TEN_DAY("TenDay"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DAY - 359 - Day &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Day")
    DAY("Day"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DEC - 368 - Decade &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Decade")
    DECADE("Decade"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DLT - 118 - Decilitre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Decilitre")
    DECILITRE("Decilitre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DLT - 118 - Deciliter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Deciliter")
    DECILITER("Deciliter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DMK - 053 - Square Decimetre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareDecimetre")
    SQUARE_DECIMETRE("SquareDecimetre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DMK - 053 - Square Decimeter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareDecimeter")
    SQUARE_DECIMETER("SquareDecimeter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DMQ - 112 - Cubic Decimetre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicDecimetre")
    CUBIC_DECIMETRE("CubicDecimetre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DMQ - 112 - Cubic Decimeter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicDecimeter")
    CUBIC_DECIMETER("CubicDecimeter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DMT - 005 - Decimetre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Decimetre")
    DECIMETRE("Decimetre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DMT - 005 - Decimeter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Decimeter")
    DECIMETER("Decimeter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DPC - 740 - Dozen Piece &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DozenPiece")
    DOZEN_PIECE("DozenPiece"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DPR - 733 - Dozen Pair &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DozenPair")
    DOZEN_PAIR("DozenPair"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DPT - 184 - Displacement Tonnage &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DisplacementTonnage")
    DISPLACEMENT_TONNAGE("DisplacementTonnage"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DRA - 200 - Dram (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DramUS")
    DRAM_US("DramUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DRI - 188 - Dram (UK) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DramUK")
    DRAM_UK("DramUK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DRL - 737 - Dozen Roll &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DozenRoll")
    DOZEN_ROLL("DozenRoll"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DRM - 199 - Drachm (UK) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DrachmUK")
    DRACHM_UK("DrachmUK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DTN - 206 - Decitonne / Centner - Metric 100 Kg / Quintal - Metric 100 Kg &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DecitonneCentnerMetric100KgQuintalMetric100Kg")
    DECITONNE_CENTNER_METRIC_100_KG_QUINTAL_METRIC_100_KG("DecitonneCentnerMetric100KgQuintalMetric100Kg"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DWT - 198 - Pennyweight &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Pennyweight")
    PENNYWEIGHT("Pennyweight"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DZN - 641 - Dozen &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Dozen")
    DOZEN("Dozen"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; DZP - 780 - Dozen Pack &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DozenPack")
    DOZEN_PACK("DozenPack"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; FAH - 281 - Degree Fahrenheit &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DegreeFahrenheit")
    DEGREE_FAHRENHEIT("DegreeFahrenheit"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; FAR - 314 - Farad &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Farad")
    FARAD("Farad"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; FOT - 041 - Foot &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Foot")
    FOOT("Foot"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; FTK - 073 - Square Foot &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareFoot")
    SQUARE_FOOT("SquareFoot"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; FTQ - 132 - Cubic Foot &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicFoot")
    CUBIC_FOOT("CubicFoot"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GBQ - 302 - Gigabecquerel &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Gigabecquerel")
    GIGABECQUEREL("Gigabecquerel"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GFI - 306 - Gram Of Fissile Isotope &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("GramOfFissileIsotope")
    GRAM_OF_FISSILE_ISOTOPE("GramOfFissileIsotope"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GGR - 731 - Great Gross &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("GreatGross")
    GREAT_GROSS("GreatGross"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GIA - 142 - Gill (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("GillUS")
    GILL_US("GillUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GII - 136 - Gill (UK) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("GillUK")
    GILL_UK("GillUK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GLD - 149 - Dry Gallon (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DryGallonUS")
    DRY_GALLON_US("DryGallonUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GLI - 139 - Gallon (UK) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("GallonUK")
    GALLON_UK("GallonUK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GLL - 145 - Gallon (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("GallonUS")
    GALLON_US("GallonUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GRM - 163 - Gram &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Gram")
    GRAM("Gram"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GRN - 189 - Grain &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Grain")
    GRAIN("Grain"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GRO - 638 - Gross &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Gross")
    GROSS("Gross"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GRT - 181 - Gross Register Ton &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("GrossRegisterTon")
    GROSS_REGISTER_TON("GrossRegisterTon"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; GWH - 247 - Gigawatt Hour &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("GigawattHour")
    GIGAWATT_HOUR("GigawattHour"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HAR - 059 - Hectare &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Hectare")
    HECTARE("Hectare"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HBA - 310 - Hectobar &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Hectobar")
    HECTOBAR("Hectobar"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HBX - 683 - Hundred Box &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("HundredBox")
    HUNDRED_BOX("HundredBox"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HGM - 160 - Hectogram &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Hectogram")
    HECTOGRAM("Hectogram"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HIU - 853 - Hundred International Unit &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("HundredInternationalUnit")
    HUNDRED_INTERNATIONAL_UNIT("HundredInternationalUnit"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HLT - 122 - Hectolitre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Hectolitre")
    HECTOLITRE("Hectolitre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HLT - 122 - Hectoliter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Hectoliter")
    HECTOLITER("Hectoliter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HMQ - 159 - Million Cubic Metre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MillionCubicMetre")
    MILLION_CUBIC_METRE("MillionCubicMetre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HMQ - 159 - Million Cubic Meter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MillionCubicMeter")
    MILLION_CUBIC_METER("MillionCubicMeter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HMT - 017 - Hectometre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Hectometre")
    HECTOMETRE("Hectometre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HMT - 017 - Hectometer &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Hectometer")
    HECTOMETER("Hectometer"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HPA - 833 - Hectolitre Of Pure Alcohol &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("HectolitreOfPureAlcohol")
    HECTOLITRE_OF_PURE_ALCOHOL("HectolitreOfPureAlcohol"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HPA - 833 - Hectoliter Of Pure Alcohol &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("HectoliterOfPureAlcohol")
    HECTOLITER_OF_PURE_ALCOHOL("HectoliterOfPureAlcohol"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HTZ - 290 - Hertz &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Hertz")
    HERTZ("Hertz"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; HUR - 356 - Hour &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Hour")
    HOUR("Hour"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; INH - 039 - Inch &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Inch")
    INCH("Inch"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; INK - 071 - Square Inch &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareInch")
    SQUARE_INCH("SquareInch"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; INQ - 131 - Cubic Inch &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicInch")
    CUBIC_INCH("CubicInch"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; JOU - 271 - Joule &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Joule")
    JOULE("Joule"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KBA - 312 - Kilobar &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Kilobar")
    KILOBAR("Kilobar"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KEL - 288 - Kelvin &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Kelvin")
    KELVIN("Kelvin"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KGM - 166 - Kilogram &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Kilogram")
    KILOGRAM("Kilogram"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KGS - 499 - Kilogram Per Second &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilogramPerSecond")
    KILOGRAM_PER_SECOND("KilogramPerSecond"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KHZ - 291 - Kilohertz &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Kilohertz")
    KILOHERTZ("Kilohertz"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KJO - 273 - Kilojoule &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Kilojoule")
    KILOJOULE("Kilojoule"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KMH - 333 - Kilometre Per Hour &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilometrePerHour")
    KILOMETRE_PER_HOUR("KilometrePerHour"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KMH - 333 - Kilometer Per Hour &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilometerPerHour")
    KILOMETER_PER_HOUR("KilometerPerHour"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KMK - 061 - Square Kilometre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareKilometre")
    SQUARE_KILOMETRE("SquareKilometre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KMK - 061 - Square Kilometer &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareKilometer")
    SQUARE_KILOMETER("SquareKilometer"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KMQ - 316 - Kilogram Per Cubic Metre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilogramPerCubicMetre")
    KILOGRAM_PER_CUBIC_METRE("KilogramPerCubicMetre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KMQ - 316 - Kilogram Per Cubic Meter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilogramPerCubicMeter")
    KILOGRAM_PER_CUBIC_METER("KilogramPerCubicMeter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KMT - 008 - Kilometre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Kilometre")
    KILOMETRE("Kilometre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KMT - 008 - Kilometer &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Kilometer")
    KILOMETER("Kilometer"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KNI - 861 - Kilogram Of Nitrogen &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilogramOfNitrogen")
    KILOGRAM_OF_NITROGEN("KilogramOfNitrogen"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KNS - 841 - Kilogram Named Substance &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilogramNamedSubstance")
    KILOGRAM_NAMED_SUBSTANCE("KilogramNamedSubstance"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KNT - 327 - Knot &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Knot")
    KNOT("Knot"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KPA - 297 - Kilopascal &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Kilopascal")
    KILOPASCAL("Kilopascal"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KPH - 859 - Kilogram Of Potassium Hydroxide (Caustic Potash) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilogramOfPotassiumHydroxideCausticPotash")
    KILOGRAM_OF_POTASSIUM_HYDROXIDE_CAUSTIC_POTASH("KilogramOfPotassiumHydroxideCausticPotash"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KPO - 857 - Kilogram Of Potassium Oxide &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilogramOfPotassiumOxide")
    KILOGRAM_OF_POTASSIUM_OXIDE("KilogramOfPotassiumOxide"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KPP - 865 - Kilogram Of Phosphorus Pentoxide (Phosphoric Anhydride) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilogramOfPhosphorusPentoxidePhosphoricAnhydride")
    KILOGRAM_OF_PHOSPHORUS_PENTOXIDE_PHOSPHORIC_ANHYDRIDE("KilogramOfPhosphorusPentoxidePhosphoricAnhydride"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KSD - 845 - Kilogram Of Substance 90% Dry &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilogramOfSubstance90PercentDry")
    KILOGRAM_OF_SUBSTANCE_90_PERCENT_DRY("KilogramOfSubstance90PercentDry"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KSH - 863 - Kilogram Of Sodium Hydroxide (Caustic Soda) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilogramOfSodiumHydroxideCausticSoda")
    KILOGRAM_OF_SODIUM_HYDROXIDE_CAUSTIC_SODA("KilogramOfSodiumHydroxideCausticSoda"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KTN - 170 - Kilotonne &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Kilotonne")
    KILOTONNE("Kilotonne"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KUR - 867 - Kilogram Of Uranium &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilogramOfUranium")
    KILOGRAM_OF_URANIUM("KilogramOfUranium"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KVA - 227 - Kilovolt - Ampere &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilovoltAmpere")
    KILOVOLT_AMPERE("KilovoltAmpere"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KVR - 230 - Kilovar &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Kilovar")
    KILOVAR("Kilovar"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KVT - 223 - Kilovolt &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Kilovolt")
    KILOVOLT("Kilovolt"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KWH - 245 - Kilowatt Hour &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KilowattHour")
    KILOWATT_HOUR("KilowattHour"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; KWT - 214 - Kilowatt &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Kilowatt")
    KILOWATT("Kilowatt"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LBR - 186 - Pound &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Pound")
    POUND("Pound"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LBT - 202 - Troy Pound (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TroyPoundUS")
    TROY_POUND_US("TroyPoundUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LEF - 625 - Leaf &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Leaf")
    LEAF("Leaf"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LPA - 831 - Litre Of Pure Alcohol &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("LitreOfPureAlcohol")
    LITRE_OF_PURE_ALCOHOL("LitreOfPureAlcohol"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LPA - 831 - Liter Of Pure Alcohol &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("LiterOfPureAlcohol")
    LITER_OF_PURE_ALCOHOL("LiterOfPureAlcohol"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LTN - 196 - Ton (UK) or Long Ton (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TonUKorLongTonUS")
    TON_U_KOR_LONG_TON_US("TonUKorLongTonUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LTR - 112 - Litre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Litre")
    LITRE("Litre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LTR - 112 - Liter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Liter")
    LITER("Liter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LUM - 284 - Lumen &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Lumen")
    LUMEN("Lumen"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; LUX - 283 - Lux &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Lux")
    LUX("Lux"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MAL - 126 - Mega Litre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MegaLitre")
    MEGA_LITRE("MegaLitre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MAL - 126 - Mega Liter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MegaLiter")
    MEGA_LITER("MegaLiter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MAM - 009 - Megametre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Megametre")
    MEGAMETRE("Megametre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MAM - 009 - Megameter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Megameter")
    MEGAMETER("Megameter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MAW - 215 - Megawatt &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Megawatt")
    MEGAWATT("Megawatt"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MBE - 630 - Thousand Standard Brick Equivalent &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ThousandStandardBrickEquivalent")
    THOUSAND_STANDARD_BRICK_EQUIVALENT("ThousandStandardBrickEquivalent"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MBF - 155 - Thousand Board Feet &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ThousandBoardFeet")
    THOUSAND_BOARD_FEET("ThousandBoardFeet"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MBR - 308 - Millibar &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Millibar")
    MILLIBAR("Millibar"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MCU - 304 - Millicurie &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Millicurie")
    MILLICURIE("Millicurie"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MGM - 161 - Milligram &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Milligram")
    MILLIGRAM("Milligram"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MHZ - 292 - Megahertz &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Megahertz")
    MEGAHERTZ("Megahertz"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MIK - 079 - Square Mile &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareMile")
    SQUARE_MILE("SquareMile"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MIL - 798 - Thousand &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Thousand")
    THOUSAND("Thousand"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MIN - 355 - Minute &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Minute")
    MINUTE("Minute"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MIO - 799 - Million &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Million")
    MILLION("Million"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MIU - 855 - Million International Unit &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MillionInternationalUnit")
    MILLION_INTERNATIONAL_UNIT("MillionInternationalUnit"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MLD - 800 - Milliard/Billion (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MilliardBillionUS")
    MILLIARD_BILLION_US("MilliardBillionUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MLT - 111 - Millilitre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Millilitre")
    MILLILITRE("Millilitre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MLT - 111 - Milliliter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Milliliter")
    MILLILITER("Milliliter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MMK - 050 - Square Millimetre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareMillimetre")
    SQUARE_MILLIMETRE("SquareMillimetre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MMK - 050 - Square Millimeter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareMillimeter")
    SQUARE_MILLIMETER("SquareMillimeter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MMQ - 110 - Cubic Millimetre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicMillimetre")
    CUBIC_MILLIMETRE("CubicMillimetre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MMQ - 110 - Cubic Millimeter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicMillimeter")
    CUBIC_MILLIMETER("CubicMillimeter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MMT - 003 - Millimetre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Millimetre")
    MILLIMETRE("Millimetre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MMT - 003 - Millimeter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Millimeter")
    MILLIMETER("Millimeter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MON - 362 - Month &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Month")
    MONTH("Month"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MPA - 298 - Megapascal &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Megapascal")
    MEGAPASCAL("Megapascal"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MQH - 598 - Cubic Metre Per Hour &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicMetrePerHour")
    CUBIC_METRE_PER_HOUR("CubicMetrePerHour"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MQH - 598 - Cubic Meter Per Hour &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicMeterPerHour")
    CUBIC_METER_PER_HOUR("CubicMeterPerHour"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MQS - 596 - Cubic Metre Per Second &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicMetrePerSecond")
    CUBIC_METRE_PER_SECOND("CubicMetrePerSecond"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MQS - 596 - Cubic Meter Per Second &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicMeterPerSecond")
    CUBIC_METER_PER_SECOND("CubicMeterPerSecond"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MSK - 335 - Metre Per Second Squared &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MetrePerSecondSquared")
    METRE_PER_SECOND_SQUARED("MetrePerSecondSquared"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MSK - 335 - Meter Per Second Squared &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MeterPerSecondSquared")
    METER_PER_SECOND_SQUARED("MeterPerSecondSquared"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MTK - 055 - Square Metre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareMetre")
    SQUARE_METRE("SquareMetre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MTK - 055 - Square Meter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareMeter")
    SQUARE_METER("SquareMeter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MTQ - 113 - Cubic Metre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicMetre")
    CUBIC_METRE("CubicMetre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MTQ - 113 - Cubic Meter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicMeter")
    CUBIC_METER("CubicMeter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MTR - 006 - Metre &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Metre")
    METRE("Metre"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MTR - 006 - Meter &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Meter")
    METER("Meter"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MTS - 328 - Metre Per Second &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MetrePerSecond")
    METRE_PER_SECOND("MetrePerSecond"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MTS - 328 - Meter Per Second &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MeterPerSecond")
    METER_PER_SECOND("MeterPerSecond"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MVA - 228 - Megavolt - Ampere &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MegavoltAmpere")
    MEGAVOLT_AMPERE("MegavoltAmpere"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; MWH - 246 - Megawatt Hour (1000 KWH) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MegawattHour1000KWH")
    MEGAWATT_HOUR_1000_KWH("MegawattHour1000KWH"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NAR - 657 - Number Of Articles &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NumberOfArticles")
    NUMBER_OF_ARTICLES("NumberOfArticles"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NBB - 616 - Number Of Bobbins &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NumberOfBobbins")
    NUMBER_OF_BOBBINS("NumberOfBobbins"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NCL - 745 - Number Of Cells &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NumberOfCells")
    NUMBER_OF_CELLS("NumberOfCells"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NEW - 289 - Newton &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Newton")
    NEWTON("Newton"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NIU - 851 - Number Of International Units &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NumberOfInternationalUnits")
    NUMBER_OF_INTERNATIONAL_UNITS("NumberOfInternationalUnits"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NMI - 047 - Nautical Mile &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NauticalMile")
    NAUTICAL_MILE("NauticalMile"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NMP - 778 - Number Of Packs &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NumberOfPacks")
    NUMBER_OF_PACKS("NumberOfPacks"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NPL - 734 - Number Of Parcels &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NumberOfParcels")
    NUMBER_OF_PARCELS("NumberOfParcels"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NPR - 715 - Number Of Pairs &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NumberOfPairs")
    NUMBER_OF_PAIRS("NumberOfPairs"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NPT - 735 - Number Of Parts &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NumberOfParts")
    NUMBER_OF_PARTS("NumberOfParts"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NRL - 736 - Number Of Rolls &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NumberOfRolls")
    NUMBER_OF_ROLLS("NumberOfRolls"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; NTT - 182 - Net Register Ton &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("NetRegisterTon")
    NET_REGISTER_TON("NetRegisterTon"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; OHM - 274 - Ohm &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Ohm")
    OHM("Ohm"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; ONZ - 187 - Ounce &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Ounce")
    OUNCE("Ounce"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; OZA - 141 - Fluid Ounce (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("FluidOunceUS")
    FLUID_OUNCE_US("FluidOunceUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; OZI - 135 - Fluid Ounce (UK) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("FluidOunceUK")
    FLUID_OUNCE_UK("FluidOunceUK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PAL - 294 - Pascal &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Pascal")
    PASCAL("Pascal"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PCE - 796 - Piece &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Piece")
    PIECE("Piece"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PGL - 835 - Proof Gallon &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ProofGallon")
    PROOF_GALLON("ProofGallon"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PTD - 147 - Dry Pint (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DryPintUS")
    DRY_PINT_US("DryPintUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PTI - 137 - Pint (UK) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("PintUK")
    PINT_UK("PintUK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; PTL - 143 - Liquid Pint (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("LiquidPintUS")
    LIQUID_PINT_US("LiquidPintUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; QAN - 364 - Quarter Of A Year &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("QuarterOfAYear")
    QUARTER_OF_A_YEAR("QuarterOfAYear"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; QTD - 148 - Dry Quart (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("DryQuartUS")
    DRY_QUART_US("DryQuartUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; QTI - 138 - Quart (UK) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("QuartUK")
    QUART_UK("QuartUK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; QTL - 144 - Liquid Quart (US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("LiquidQuartUS")
    LIQUID_QUART_US("LiquidQuartUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; QTR - 191 - Quarter (UK) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("QuarterUK")
    QUARTER_UK("QuarterUK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; RPM - 331 - Revolutions Per Minute &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("RevolutionsPerMinute")
    REVOLUTIONS_PER_MINUTE("RevolutionsPerMinute"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; RPS - 330 - Revolutions Per Second &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("RevolutionsPerSecond")
    REVOLUTIONS_PER_SECOND("RevolutionsPerSecond"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SAN - 365 - Half Year (6 Months) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("HalfYear6Months")
    HALF_YEAR_6_MONTHS("HalfYear6Months"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SCO - 730 - Score &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Score")
    SCORE("Score"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SCR - 197 - Scruple &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Scruple")
    SCRUPLE("Scruple"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SEC - 354 - Second &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Second")
    SECOND("Second"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SET - 704 - Set &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Set")
    SET("Set"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SHT - 183 - Shipping Ton &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ShippingTon")
    SHIPPING_TON("ShippingTon"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SIE - 296 - Siemens &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Siemens")
    SIEMENS("Siemens"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SMI - 045 - Mile (Statute Mile) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("MileStatuteMile")
    MILE_STATUTE_MILE("MileStatuteMile"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; SST - 738 - Short Standard (7200 Matches) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ShortStandard7200Matches")
    SHORT_STANDARD_7200_MATCHES("ShortStandard7200Matches"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; STI - 190 - Stone (UK) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("StoneUK")
    STONE_UK("StoneUK"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; STN - 195 - Ton (US) Or Short Ton (UK/US) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TonUSOrShortTonUKUS")
    TON_US_OR_SHORT_TON_UKUS("TonUSOrShortTonUKUS"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TAH - 264 - Kiloampere Hour (Thousand Ampere Hour) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("KiloampereHourThousandAmpereHour")
    KILOAMPERE_HOUR_THOUSAND_AMPERE_HOUR("KiloampereHourThousandAmpereHour"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TNE - 168 - Tonne (Metric Ton) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TonneMetricTon")
    TONNE_METRIC_TON("TonneMetricTon"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TPR - 732 - Ten Pair &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TenPair")
    TEN_PAIR("TenPair"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TQD - 599 - Thousand Cubic Metre Per Day &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ThousandCubicMetrePerDay")
    THOUSAND_CUBIC_METRE_PER_DAY("ThousandCubicMetrePerDay"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TQD - 599 - Thousand Cubic Meter Per Day &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("ThousandCubicMeterPerDay")
    THOUSAND_CUBIC_METER_PER_DAY("ThousandCubicMeterPerDay"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TRL - 802 - Trillion (EUR) &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TrillionEUR")
    TRILLION_EUR("TrillionEUR"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TSD - 847 - Tonne Of Substance 90% Dry &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TonneOfSubstance90PercentDry")
    TONNE_OF_SUBSTANCE_90_PERCENT_DRY("TonneOfSubstance90PercentDry"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; TSH - 533 - Ton Of Steam Per Hour &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("TonOfSteamPerHour")
    TON_OF_STEAM_PER_HOUR("TonOfSteamPerHour"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; VLT - 222 - Volt &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Volt")
    VOLT("Volt"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; WCD - 153 - Cord &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Cord")
    CORD("Cord"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; WEB - 324 - Weber &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Weber")
    WEBER("Weber"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; WEE - 360 - Week &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Week")
    WEEK("Week"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; WHR - 243 - Watt Hour &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("WattHour")
    WATT_HOUR("WattHour"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; WSD - 152 - Standard &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Standard")
    STANDARD("Standard"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; WTT - 212 - Watt &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Watt")
    WATT("Watt"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; YDK - 075 - Square Yard &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("SquareYard")
    SQUARE_YARD("SquareYard"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; YDQ - 133 - Cubic Yard &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("CubicYard")
    CUBIC_YARD("CubicYard"),

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; YRD - 043 - Yard &lt;/summary&gt;
     * </pre>
     * 
     * 
     */
    @XmlEnumValue("Yard")
    YARD("Yard");
    private final String value;

    TypeUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeUnitOfMeasure fromValue(String v) {
        for (TypeUnitOfMeasure c: TypeUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
