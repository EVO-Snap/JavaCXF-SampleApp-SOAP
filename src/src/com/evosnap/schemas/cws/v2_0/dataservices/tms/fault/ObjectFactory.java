
package com.evosnap.schemas.cws.v2_0.dataservices.tms.fault;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.evosnap.schemas.cws.v2_0.dataservices.tms.fault package. 
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

    private final static QName _TMSValidationErrorEErrorType_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationError.EErrorType");
    private final static QName _TMSValidationError_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationError");
    private final static QName _ArrayOfTMSValidationError_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault", "ArrayOfTMSValidationError");
    private final static QName _TMSValidationResultFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault", "TMSValidationResultFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.evosnap.schemas.cws.v2_0.dataservices.tms.fault
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfTMSValidationError }
     * 
     */
    public ArrayOfTMSValidationError createArrayOfTMSValidationError() {
        return new ArrayOfTMSValidationError();
    }

    /**
     * Create an instance of {@link TMSValidationResultFault }
     * 
     */
    public TMSValidationResultFault createTMSValidationResultFault() {
        return new TMSValidationResultFault();
    }

    /**
     * Create an instance of {@link TMSValidationError }
     * 
     */
    public TMSValidationError createTMSValidationError() {
        return new TMSValidationError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMSValidationErrorEErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault", name = "TMSValidationError.EErrorType")
    public JAXBElement<TMSValidationErrorEErrorType> createTMSValidationErrorEErrorType(TMSValidationErrorEErrorType value) {
        return new JAXBElement<TMSValidationErrorEErrorType>(_TMSValidationErrorEErrorType_QNAME, TMSValidationErrorEErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMSValidationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault", name = "TMSValidationError")
    public JAXBElement<TMSValidationError> createTMSValidationError(TMSValidationError value) {
        return new JAXBElement<TMSValidationError>(_TMSValidationError_QNAME, TMSValidationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTMSValidationError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault", name = "ArrayOfTMSValidationError")
    public JAXBElement<ArrayOfTMSValidationError> createArrayOfTMSValidationError(ArrayOfTMSValidationError value) {
        return new JAXBElement<ArrayOfTMSValidationError>(_ArrayOfTMSValidationError_QNAME, ArrayOfTMSValidationError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMSValidationResultFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/DataServices/TMS/Fault", name = "TMSValidationResultFault")
    public JAXBElement<TMSValidationResultFault> createTMSValidationResultFault(TMSValidationResultFault value) {
        return new JAXBElement<TMSValidationResultFault>(_TMSValidationResultFault_QNAME, TMSValidationResultFault.class, null, value);
    }

}
