
package com.evosnap.schemas.cws.v2_0.dataservices.tms.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.evosnap.schemas.cws.v2_0.dataservices.tms.faults package. 
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

    private final static QName _TMSTransactionFailedFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults", "TMSTransactionFailedFault");
    private final static QName _TMSBaseFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults", "TMSBaseFault");
    private final static QName _TMSUnknownServiceKeyFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnknownServiceKeyFault");
    private final static QName _TMSUnavailableFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults", "TMSUnavailableFault");
    private final static QName _TMSOperationNotSupportedFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults", "TMSOperationNotSupportedFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.evosnap.schemas.cws.v2_0.dataservices.tms.faults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TMSOperationNotSupportedFault }
     * 
     */
    public TMSOperationNotSupportedFault createTMSOperationNotSupportedFault() {
        return new TMSOperationNotSupportedFault();
    }

    /**
     * Create an instance of {@link TMSUnavailableFault }
     * 
     */
    public TMSUnavailableFault createTMSUnavailableFault() {
        return new TMSUnavailableFault();
    }

    /**
     * Create an instance of {@link TMSUnknownServiceKeyFault }
     * 
     */
    public TMSUnknownServiceKeyFault createTMSUnknownServiceKeyFault() {
        return new TMSUnknownServiceKeyFault();
    }

    /**
     * Create an instance of {@link TMSTransactionFailedFault }
     * 
     */
    public TMSTransactionFailedFault createTMSTransactionFailedFault() {
        return new TMSTransactionFailedFault();
    }

    /**
     * Create an instance of {@link TMSBaseFault }
     * 
     */
    public TMSBaseFault createTMSBaseFault() {
        return new TMSBaseFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMSTransactionFailedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults", name = "TMSTransactionFailedFault")
    public JAXBElement<TMSTransactionFailedFault> createTMSTransactionFailedFault(TMSTransactionFailedFault value) {
        return new JAXBElement<TMSTransactionFailedFault>(_TMSTransactionFailedFault_QNAME, TMSTransactionFailedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMSBaseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults", name = "TMSBaseFault")
    public JAXBElement<TMSBaseFault> createTMSBaseFault(TMSBaseFault value) {
        return new JAXBElement<TMSBaseFault>(_TMSBaseFault_QNAME, TMSBaseFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMSUnknownServiceKeyFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults", name = "TMSUnknownServiceKeyFault")
    public JAXBElement<TMSUnknownServiceKeyFault> createTMSUnknownServiceKeyFault(TMSUnknownServiceKeyFault value) {
        return new JAXBElement<TMSUnknownServiceKeyFault>(_TMSUnknownServiceKeyFault_QNAME, TMSUnknownServiceKeyFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMSUnavailableFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults", name = "TMSUnavailableFault")
    public JAXBElement<TMSUnavailableFault> createTMSUnavailableFault(TMSUnavailableFault value) {
        return new JAXBElement<TMSUnavailableFault>(_TMSUnavailableFault_QNAME, TMSUnavailableFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMSOperationNotSupportedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Faults", name = "TMSOperationNotSupportedFault")
    public JAXBElement<TMSOperationNotSupportedFault> createTMSOperationNotSupportedFault(TMSOperationNotSupportedFault value) {
        return new JAXBElement<TMSOperationNotSupportedFault>(_TMSOperationNotSupportedFault_QNAME, TMSOperationNotSupportedFault.class, null, value);
    }

}
