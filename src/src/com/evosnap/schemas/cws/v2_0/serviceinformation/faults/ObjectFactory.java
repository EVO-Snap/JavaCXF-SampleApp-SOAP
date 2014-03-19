
package com.evosnap.schemas.cws.v2_0.serviceinformation.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.evosnap.schemas.cws.v2_0.serviceinformation.faults package. 
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

    private final static QName _CWSValidationErrorFaultEErrorType_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationErrorFault.EErrorType");
    private final static QName _CWSBaseFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", "CWSBaseFault");
    private final static QName _CWSValidationErrorFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationErrorFault");
    private final static QName _CWSValidationResultFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", "CWSValidationResultFault");
    private final static QName _ArrayOfCWSValidationErrorFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", "ArrayOfCWSValidationErrorFault");
    private final static QName _CWSServiceInformationUnavailableFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", "CWSServiceInformationUnavailableFault");
    private final static QName _CWSFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", "CWSFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.evosnap.schemas.cws.v2_0.serviceinformation.faults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CWSBaseFault }
     * 
     */
    public CWSBaseFault createCWSBaseFault() {
        return new CWSBaseFault();
    }

    /**
     * Create an instance of {@link CWSServiceInformationUnavailableFault }
     * 
     */
    public CWSServiceInformationUnavailableFault createCWSServiceInformationUnavailableFault() {
        return new CWSServiceInformationUnavailableFault();
    }

    /**
     * Create an instance of {@link CWSFault }
     * 
     */
    public CWSFault createCWSFault() {
        return new CWSFault();
    }

    /**
     * Create an instance of {@link ArrayOfCWSValidationErrorFault }
     * 
     */
    public ArrayOfCWSValidationErrorFault createArrayOfCWSValidationErrorFault() {
        return new ArrayOfCWSValidationErrorFault();
    }

    /**
     * Create an instance of {@link CWSValidationErrorFault }
     * 
     */
    public CWSValidationErrorFault createCWSValidationErrorFault() {
        return new CWSValidationErrorFault();
    }

    /**
     * Create an instance of {@link CWSValidationResultFault }
     * 
     */
    public CWSValidationResultFault createCWSValidationResultFault() {
        return new CWSValidationResultFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSValidationErrorFaultEErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", name = "CWSValidationErrorFault.EErrorType")
    public JAXBElement<CWSValidationErrorFaultEErrorType> createCWSValidationErrorFaultEErrorType(CWSValidationErrorFaultEErrorType value) {
        return new JAXBElement<CWSValidationErrorFaultEErrorType>(_CWSValidationErrorFaultEErrorType_QNAME, CWSValidationErrorFaultEErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSBaseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", name = "CWSBaseFault")
    public JAXBElement<CWSBaseFault> createCWSBaseFault(CWSBaseFault value) {
        return new JAXBElement<CWSBaseFault>(_CWSBaseFault_QNAME, CWSBaseFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSValidationErrorFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", name = "CWSValidationErrorFault")
    public JAXBElement<CWSValidationErrorFault> createCWSValidationErrorFault(CWSValidationErrorFault value) {
        return new JAXBElement<CWSValidationErrorFault>(_CWSValidationErrorFault_QNAME, CWSValidationErrorFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSValidationResultFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", name = "CWSValidationResultFault")
    public JAXBElement<CWSValidationResultFault> createCWSValidationResultFault(CWSValidationResultFault value) {
        return new JAXBElement<CWSValidationResultFault>(_CWSValidationResultFault_QNAME, CWSValidationResultFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCWSValidationErrorFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", name = "ArrayOfCWSValidationErrorFault")
    public JAXBElement<ArrayOfCWSValidationErrorFault> createArrayOfCWSValidationErrorFault(ArrayOfCWSValidationErrorFault value) {
        return new JAXBElement<ArrayOfCWSValidationErrorFault>(_ArrayOfCWSValidationErrorFault_QNAME, ArrayOfCWSValidationErrorFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSServiceInformationUnavailableFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", name = "CWSServiceInformationUnavailableFault")
    public JAXBElement<CWSServiceInformationUnavailableFault> createCWSServiceInformationUnavailableFault(CWSServiceInformationUnavailableFault value) {
        return new JAXBElement<CWSServiceInformationUnavailableFault>(_CWSServiceInformationUnavailableFault_QNAME, CWSServiceInformationUnavailableFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/ServiceInformation/Faults", name = "CWSFault")
    public JAXBElement<CWSFault> createCWSFault(CWSFault value) {
        return new JAXBElement<CWSFault>(_CWSFault_QNAME, CWSFault.class, null, value);
    }

}
