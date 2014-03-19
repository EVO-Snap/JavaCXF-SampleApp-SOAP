
package com.evosnap.schemas.cws.v2_0.transactions.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.evosnap.schemas.cws.v2_0.transactions.faults package. 
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

    private final static QName _CWSFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSFault");
    private final static QName _CWSTransactionServiceUnavailableFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSTransactionServiceUnavailableFault");
    private final static QName _CWSExtendedDataNotSupportedFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault");
    private final static QName _CWSValidationResultFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSValidationResultFault");
    private final static QName _CWSValidationErrorFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSValidationErrorFault");
    private final static QName _CWSTransactionFailedFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSTransactionFailedFault");
    private final static QName _CWSBaseFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSBaseFault");
    private final static QName _CWSValidationErrorFaultEErrorType_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSValidationErrorFault.EErrorType");
    private final static QName _CWSInvalidOperationFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSInvalidOperationFault");
    private final static QName _CWSDeserializationFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSDeserializationFault");
    private final static QName _CWSInvalidServiceInformationFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSInvalidServiceInformationFault");
    private final static QName _ArrayOfCWSValidationErrorFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "ArrayOfCWSValidationErrorFault");
    private final static QName _CWSTransactionAlreadySettledFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSTransactionAlreadySettledFault");
    private final static QName _CWSOperationNotSupportedFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSOperationNotSupportedFault");
    private final static QName _CWSInvalidMessageFormatFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSInvalidMessageFormatFault");
    private final static QName _CWSConnectionFault_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", "CWSConnectionFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.evosnap.schemas.cws.v2_0.transactions.faults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CWSTransactionFailedFault }
     * 
     */
    public CWSTransactionFailedFault createCWSTransactionFailedFault() {
        return new CWSTransactionFailedFault();
    }

    /**
     * Create an instance of {@link CWSInvalidMessageFormatFault }
     * 
     */
    public CWSInvalidMessageFormatFault createCWSInvalidMessageFormatFault() {
        return new CWSInvalidMessageFormatFault();
    }

    /**
     * Create an instance of {@link CWSInvalidServiceInformationFault }
     * 
     */
    public CWSInvalidServiceInformationFault createCWSInvalidServiceInformationFault() {
        return new CWSInvalidServiceInformationFault();
    }

    /**
     * Create an instance of {@link CWSTransactionServiceUnavailableFault }
     * 
     */
    public CWSTransactionServiceUnavailableFault createCWSTransactionServiceUnavailableFault() {
        return new CWSTransactionServiceUnavailableFault();
    }

    /**
     * Create an instance of {@link CWSTransactionAlreadySettledFault }
     * 
     */
    public CWSTransactionAlreadySettledFault createCWSTransactionAlreadySettledFault() {
        return new CWSTransactionAlreadySettledFault();
    }

    /**
     * Create an instance of {@link CWSConnectionFault }
     * 
     */
    public CWSConnectionFault createCWSConnectionFault() {
        return new CWSConnectionFault();
    }

    /**
     * Create an instance of {@link CWSBaseFault }
     * 
     */
    public CWSBaseFault createCWSBaseFault() {
        return new CWSBaseFault();
    }

    /**
     * Create an instance of {@link CWSInvalidOperationFault }
     * 
     */
    public CWSInvalidOperationFault createCWSInvalidOperationFault() {
        return new CWSInvalidOperationFault();
    }

    /**
     * Create an instance of {@link CWSDeserializationFault }
     * 
     */
    public CWSDeserializationFault createCWSDeserializationFault() {
        return new CWSDeserializationFault();
    }

    /**
     * Create an instance of {@link CWSFault }
     * 
     */
    public CWSFault createCWSFault() {
        return new CWSFault();
    }

    /**
     * Create an instance of {@link CWSExtendedDataNotSupportedFault }
     * 
     */
    public CWSExtendedDataNotSupportedFault createCWSExtendedDataNotSupportedFault() {
        return new CWSExtendedDataNotSupportedFault();
    }

    /**
     * Create an instance of {@link ArrayOfCWSValidationErrorFault }
     * 
     */
    public ArrayOfCWSValidationErrorFault createArrayOfCWSValidationErrorFault() {
        return new ArrayOfCWSValidationErrorFault();
    }

    /**
     * Create an instance of {@link CWSOperationNotSupportedFault }
     * 
     */
    public CWSOperationNotSupportedFault createCWSOperationNotSupportedFault() {
        return new CWSOperationNotSupportedFault();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSFault")
    public JAXBElement<CWSFault> createCWSFault(CWSFault value) {
        return new JAXBElement<CWSFault>(_CWSFault_QNAME, CWSFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSTransactionServiceUnavailableFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSTransactionServiceUnavailableFault")
    public JAXBElement<CWSTransactionServiceUnavailableFault> createCWSTransactionServiceUnavailableFault(CWSTransactionServiceUnavailableFault value) {
        return new JAXBElement<CWSTransactionServiceUnavailableFault>(_CWSTransactionServiceUnavailableFault_QNAME, CWSTransactionServiceUnavailableFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSExtendedDataNotSupportedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSExtendedDataNotSupportedFault")
    public JAXBElement<CWSExtendedDataNotSupportedFault> createCWSExtendedDataNotSupportedFault(CWSExtendedDataNotSupportedFault value) {
        return new JAXBElement<CWSExtendedDataNotSupportedFault>(_CWSExtendedDataNotSupportedFault_QNAME, CWSExtendedDataNotSupportedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSValidationResultFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSValidationResultFault")
    public JAXBElement<CWSValidationResultFault> createCWSValidationResultFault(CWSValidationResultFault value) {
        return new JAXBElement<CWSValidationResultFault>(_CWSValidationResultFault_QNAME, CWSValidationResultFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSValidationErrorFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSValidationErrorFault")
    public JAXBElement<CWSValidationErrorFault> createCWSValidationErrorFault(CWSValidationErrorFault value) {
        return new JAXBElement<CWSValidationErrorFault>(_CWSValidationErrorFault_QNAME, CWSValidationErrorFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSTransactionFailedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSTransactionFailedFault")
    public JAXBElement<CWSTransactionFailedFault> createCWSTransactionFailedFault(CWSTransactionFailedFault value) {
        return new JAXBElement<CWSTransactionFailedFault>(_CWSTransactionFailedFault_QNAME, CWSTransactionFailedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSBaseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSBaseFault")
    public JAXBElement<CWSBaseFault> createCWSBaseFault(CWSBaseFault value) {
        return new JAXBElement<CWSBaseFault>(_CWSBaseFault_QNAME, CWSBaseFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSValidationErrorFaultEErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSValidationErrorFault.EErrorType")
    public JAXBElement<CWSValidationErrorFaultEErrorType> createCWSValidationErrorFaultEErrorType(CWSValidationErrorFaultEErrorType value) {
        return new JAXBElement<CWSValidationErrorFaultEErrorType>(_CWSValidationErrorFaultEErrorType_QNAME, CWSValidationErrorFaultEErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSInvalidOperationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSInvalidOperationFault")
    public JAXBElement<CWSInvalidOperationFault> createCWSInvalidOperationFault(CWSInvalidOperationFault value) {
        return new JAXBElement<CWSInvalidOperationFault>(_CWSInvalidOperationFault_QNAME, CWSInvalidOperationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSDeserializationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSDeserializationFault")
    public JAXBElement<CWSDeserializationFault> createCWSDeserializationFault(CWSDeserializationFault value) {
        return new JAXBElement<CWSDeserializationFault>(_CWSDeserializationFault_QNAME, CWSDeserializationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSInvalidServiceInformationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSInvalidServiceInformationFault")
    public JAXBElement<CWSInvalidServiceInformationFault> createCWSInvalidServiceInformationFault(CWSInvalidServiceInformationFault value) {
        return new JAXBElement<CWSInvalidServiceInformationFault>(_CWSInvalidServiceInformationFault_QNAME, CWSInvalidServiceInformationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCWSValidationErrorFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "ArrayOfCWSValidationErrorFault")
    public JAXBElement<ArrayOfCWSValidationErrorFault> createArrayOfCWSValidationErrorFault(ArrayOfCWSValidationErrorFault value) {
        return new JAXBElement<ArrayOfCWSValidationErrorFault>(_ArrayOfCWSValidationErrorFault_QNAME, ArrayOfCWSValidationErrorFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSTransactionAlreadySettledFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSTransactionAlreadySettledFault")
    public JAXBElement<CWSTransactionAlreadySettledFault> createCWSTransactionAlreadySettledFault(CWSTransactionAlreadySettledFault value) {
        return new JAXBElement<CWSTransactionAlreadySettledFault>(_CWSTransactionAlreadySettledFault_QNAME, CWSTransactionAlreadySettledFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSOperationNotSupportedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSOperationNotSupportedFault")
    public JAXBElement<CWSOperationNotSupportedFault> createCWSOperationNotSupportedFault(CWSOperationNotSupportedFault value) {
        return new JAXBElement<CWSOperationNotSupportedFault>(_CWSOperationNotSupportedFault_QNAME, CWSOperationNotSupportedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSInvalidMessageFormatFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSInvalidMessageFormatFault")
    public JAXBElement<CWSInvalidMessageFormatFault> createCWSInvalidMessageFormatFault(CWSInvalidMessageFormatFault value) {
        return new JAXBElement<CWSInvalidMessageFormatFault>(_CWSInvalidMessageFormatFault_QNAME, CWSInvalidMessageFormatFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CWSConnectionFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults", name = "CWSConnectionFault")
    public JAXBElement<CWSConnectionFault> createCWSConnectionFault(CWSConnectionFault value) {
        return new JAXBElement<CWSConnectionFault>(_CWSConnectionFault_QNAME, CWSConnectionFault.class, null, value);
    }

}
