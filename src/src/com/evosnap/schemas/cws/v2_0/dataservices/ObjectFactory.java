
package com.evosnap.schemas.cws.v2_0.dataservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.evosnap.schemas.cws.v2_0.dataservices package. 
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

    private final static QName _PagingParameters_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices", "PagingParameters");
    private final static QName _DateRange_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices", "DateRange");
    private final static QName _DataServicesUnavailableFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices", "DataServicesUnavailableFault");
    private final static QName _DSBaseFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices", "DSBaseFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.evosnap.schemas.cws.v2_0.dataservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PagingParameters }
     * 
     */
    public PagingParameters createPagingParameters() {
        return new PagingParameters();
    }

    /**
     * Create an instance of {@link DateRange }
     * 
     */
    public DateRange createDateRange() {
        return new DateRange();
    }

    /**
     * Create an instance of {@link DSBaseFault }
     * 
     */
    public DSBaseFault createDSBaseFault() {
        return new DSBaseFault();
    }

    /**
     * Create an instance of {@link DataServicesUnavailableFault }
     * 
     */
    public DataServicesUnavailableFault createDataServicesUnavailableFault() {
        return new DataServicesUnavailableFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagingParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices", name = "PagingParameters")
    public JAXBElement<PagingParameters> createPagingParameters(PagingParameters value) {
        return new JAXBElement<PagingParameters>(_PagingParameters_QNAME, PagingParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices", name = "DateRange")
    public JAXBElement<DateRange> createDateRange(DateRange value) {
        return new JAXBElement<DateRange>(_DateRange_QNAME, DateRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataServicesUnavailableFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices", name = "DataServicesUnavailableFault")
    public JAXBElement<DataServicesUnavailableFault> createDataServicesUnavailableFault(DataServicesUnavailableFault value) {
        return new JAXBElement<DataServicesUnavailableFault>(_DataServicesUnavailableFault_QNAME, DataServicesUnavailableFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSBaseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices", name = "DSBaseFault")
    public JAXBElement<DSBaseFault> createDSBaseFault(DSBaseFault value) {
        return new JAXBElement<DSBaseFault>(_DSBaseFault_QNAME, DSBaseFault.class, null, value);
    }

}
