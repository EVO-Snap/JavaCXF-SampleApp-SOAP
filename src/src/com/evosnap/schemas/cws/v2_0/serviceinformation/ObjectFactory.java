
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.evosnap.schemas.cws.v2_0.serviceinformation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BankcardMerchantData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "BankcardMerchantData");
    private final static QName _AddressInfo_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "AddressInfo");
    private final static QName _ElectronicCheckingMerchantData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "ElectronicCheckingMerchantData");
    private final static QName _ReadCapability_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "ReadCapability");
    private final static QName _TypeStateProvince_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "TypeStateProvince");
    private final static QName _TypeISOLanguageCodeA3_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "TypeISOLanguageCodeA3");
    private final static QName _TypeISOCountryCodeA3_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "TypeISOCountryCodeA3");
    private final static QName _StoredValueMerchantData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "StoredValueMerchantData");
    private final static QName _ApplicationLocation_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "ApplicationLocation");
    private final static QName _HardwareType_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "HardwareType");
    private final static QName _ApplicationData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "ApplicationData");
    private final static QName _IndustryType_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "IndustryType");
    private final static QName _PINCapability_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "PINCapability");
    private final static QName _MerchantProfileMerchantData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "MerchantProfileMerchantData");
    private final static QName _EncryptionType_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", "EncryptionType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.evosnap.schemas.cws.v2_0.serviceinformation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StoredValueMerchantData }
     * 
     */
    public StoredValueMerchantData createStoredValueMerchantData() {
        return new StoredValueMerchantData();
    }

    /**
     * Create an instance of {@link ElectronicCheckingMerchantData }
     * 
     */
    public ElectronicCheckingMerchantData createElectronicCheckingMerchantData() {
        return new ElectronicCheckingMerchantData();
    }

    /**
     * Create an instance of {@link MerchantProfileMerchantData }
     * 
     */
    public MerchantProfileMerchantData createMerchantProfileMerchantData() {
        return new MerchantProfileMerchantData();
    }

    /**
     * Create an instance of {@link ApplicationData }
     * 
     */
    public ApplicationData createApplicationData() {
        return new ApplicationData();
    }

    /**
     * Create an instance of {@link BankcardMerchantData }
     * 
     */
    public BankcardMerchantData createBankcardMerchantData() {
        return new BankcardMerchantData();
    }

    /**
     * Create an instance of {@link AddressInfo }
     * 
     */
    public AddressInfo createAddressInfo() {
        return new AddressInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankcardMerchantData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "BankcardMerchantData")
    public JAXBElement<BankcardMerchantData> createBankcardMerchantData(BankcardMerchantData value) {
        return new JAXBElement<BankcardMerchantData>(_BankcardMerchantData_QNAME, BankcardMerchantData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "AddressInfo")
    public JAXBElement<AddressInfo> createAddressInfo(AddressInfo value) {
        return new JAXBElement<AddressInfo>(_AddressInfo_QNAME, AddressInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicCheckingMerchantData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "ElectronicCheckingMerchantData")
    public JAXBElement<ElectronicCheckingMerchantData> createElectronicCheckingMerchantData(ElectronicCheckingMerchantData value) {
        return new JAXBElement<ElectronicCheckingMerchantData>(_ElectronicCheckingMerchantData_QNAME, ElectronicCheckingMerchantData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCapability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "ReadCapability")
    public JAXBElement<ReadCapability> createReadCapability(ReadCapability value) {
        return new JAXBElement<ReadCapability>(_ReadCapability_QNAME, ReadCapability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeStateProvince }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "TypeStateProvince")
    public JAXBElement<TypeStateProvince> createTypeStateProvince(TypeStateProvince value) {
        return new JAXBElement<TypeStateProvince>(_TypeStateProvince_QNAME, TypeStateProvince.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeISOLanguageCodeA3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "TypeISOLanguageCodeA3")
    public JAXBElement<TypeISOLanguageCodeA3> createTypeISOLanguageCodeA3(TypeISOLanguageCodeA3 value) {
        return new JAXBElement<TypeISOLanguageCodeA3>(_TypeISOLanguageCodeA3_QNAME, TypeISOLanguageCodeA3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeISOCountryCodeA3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "TypeISOCountryCodeA3")
    public JAXBElement<TypeISOCountryCodeA3> createTypeISOCountryCodeA3(TypeISOCountryCodeA3 value) {
        return new JAXBElement<TypeISOCountryCodeA3>(_TypeISOCountryCodeA3_QNAME, TypeISOCountryCodeA3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoredValueMerchantData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "StoredValueMerchantData")
    public JAXBElement<StoredValueMerchantData> createStoredValueMerchantData(StoredValueMerchantData value) {
        return new JAXBElement<StoredValueMerchantData>(_StoredValueMerchantData_QNAME, StoredValueMerchantData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "ApplicationLocation")
    public JAXBElement<ApplicationLocation> createApplicationLocation(ApplicationLocation value) {
        return new JAXBElement<ApplicationLocation>(_ApplicationLocation_QNAME, ApplicationLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HardwareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "HardwareType")
    public JAXBElement<HardwareType> createHardwareType(HardwareType value) {
        return new JAXBElement<HardwareType>(_HardwareType_QNAME, HardwareType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "ApplicationData")
    public JAXBElement<ApplicationData> createApplicationData(ApplicationData value) {
        return new JAXBElement<ApplicationData>(_ApplicationData_QNAME, ApplicationData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndustryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "IndustryType")
    public JAXBElement<IndustryType> createIndustryType(IndustryType value) {
        return new JAXBElement<IndustryType>(_IndustryType_QNAME, IndustryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PINCapability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "PINCapability")
    public JAXBElement<PINCapability> createPINCapability(PINCapability value) {
        return new JAXBElement<PINCapability>(_PINCapability_QNAME, PINCapability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MerchantProfileMerchantData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "MerchantProfileMerchantData")
    public JAXBElement<MerchantProfileMerchantData> createMerchantProfileMerchantData(MerchantProfileMerchantData value) {
        return new JAXBElement<MerchantProfileMerchantData>(_MerchantProfileMerchantData_QNAME, MerchantProfileMerchantData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation", name = "EncryptionType")
    public JAXBElement<EncryptionType> createEncryptionType(EncryptionType value) {
        return new JAXBElement<EncryptionType>(_EncryptionType_QNAME, EncryptionType.class, null, value);
    }

}
