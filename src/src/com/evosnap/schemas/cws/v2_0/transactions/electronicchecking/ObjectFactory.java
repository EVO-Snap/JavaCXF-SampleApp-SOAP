
package com.evosnap.schemas.cws.v2_0.transactions.electronicchecking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.evosnap.schemas.cws.v2_0.transactions.electronicchecking package. 
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

    private final static QName _ElectronicCheckingCaptureResponse_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingCaptureResponse");
    private final static QName _CheckData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckData");
    private final static QName _SECCode_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "SECCode");
    private final static QName _ElectronicCheckingCustomerData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingCustomerData");
    private final static QName _ElectronicCheckingTransactionData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingTransactionData");
    private final static QName _ServiceType_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "ServiceType");
    private final static QName _ElectronicCheckingTransaction_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingTransaction");
    private final static QName _ReturnInformation_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "ReturnInformation");
    private final static QName _TransactionType_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "TransactionType");
    private final static QName _ElectronicCheckingTransactionResponse_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingTransactionResponse");
    private final static QName _OwnerType_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "OwnerType");
    private final static QName _ElectronicCheckingTenderData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "ElectronicCheckingTenderData");
    private final static QName _CheckCountryCode_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "CheckCountryCode");
    private final static QName _UseType_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", "UseType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.evosnap.schemas.cws.v2_0.transactions.electronicchecking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ElectronicCheckingCaptureResponse }
     * 
     */
    public ElectronicCheckingCaptureResponse createElectronicCheckingCaptureResponse() {
        return new ElectronicCheckingCaptureResponse();
    }

    /**
     * Create an instance of {@link ElectronicCheckingCustomerData }
     * 
     */
    public ElectronicCheckingCustomerData createElectronicCheckingCustomerData() {
        return new ElectronicCheckingCustomerData();
    }

    /**
     * Create an instance of {@link ElectronicCheckingTenderData }
     * 
     */
    public ElectronicCheckingTenderData createElectronicCheckingTenderData() {
        return new ElectronicCheckingTenderData();
    }

    /**
     * Create an instance of {@link ElectronicCheckingTransaction }
     * 
     */
    public ElectronicCheckingTransaction createElectronicCheckingTransaction() {
        return new ElectronicCheckingTransaction();
    }

    /**
     * Create an instance of {@link ReturnInformation }
     * 
     */
    public ReturnInformation createReturnInformation() {
        return new ReturnInformation();
    }

    /**
     * Create an instance of {@link ElectronicCheckingTransactionResponse }
     * 
     */
    public ElectronicCheckingTransactionResponse createElectronicCheckingTransactionResponse() {
        return new ElectronicCheckingTransactionResponse();
    }

    /**
     * Create an instance of {@link ElectronicCheckingTransactionData }
     * 
     */
    public ElectronicCheckingTransactionData createElectronicCheckingTransactionData() {
        return new ElectronicCheckingTransactionData();
    }

    /**
     * Create an instance of {@link CheckData }
     * 
     */
    public CheckData createCheckData() {
        return new CheckData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicCheckingCaptureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "ElectronicCheckingCaptureResponse")
    public JAXBElement<ElectronicCheckingCaptureResponse> createElectronicCheckingCaptureResponse(ElectronicCheckingCaptureResponse value) {
        return new JAXBElement<ElectronicCheckingCaptureResponse>(_ElectronicCheckingCaptureResponse_QNAME, ElectronicCheckingCaptureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "CheckData")
    public JAXBElement<CheckData> createCheckData(CheckData value) {
        return new JAXBElement<CheckData>(_CheckData_QNAME, CheckData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SECCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "SECCode")
    public JAXBElement<SECCode> createSECCode(SECCode value) {
        return new JAXBElement<SECCode>(_SECCode_QNAME, SECCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicCheckingCustomerData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "ElectronicCheckingCustomerData")
    public JAXBElement<ElectronicCheckingCustomerData> createElectronicCheckingCustomerData(ElectronicCheckingCustomerData value) {
        return new JAXBElement<ElectronicCheckingCustomerData>(_ElectronicCheckingCustomerData_QNAME, ElectronicCheckingCustomerData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicCheckingTransactionData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "ElectronicCheckingTransactionData")
    public JAXBElement<ElectronicCheckingTransactionData> createElectronicCheckingTransactionData(ElectronicCheckingTransactionData value) {
        return new JAXBElement<ElectronicCheckingTransactionData>(_ElectronicCheckingTransactionData_QNAME, ElectronicCheckingTransactionData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "ServiceType")
    public JAXBElement<ServiceType> createServiceType(ServiceType value) {
        return new JAXBElement<ServiceType>(_ServiceType_QNAME, ServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicCheckingTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "ElectronicCheckingTransaction")
    public JAXBElement<ElectronicCheckingTransaction> createElectronicCheckingTransaction(ElectronicCheckingTransaction value) {
        return new JAXBElement<ElectronicCheckingTransaction>(_ElectronicCheckingTransaction_QNAME, ElectronicCheckingTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "ReturnInformation")
    public JAXBElement<ReturnInformation> createReturnInformation(ReturnInformation value) {
        return new JAXBElement<ReturnInformation>(_ReturnInformation_QNAME, ReturnInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "TransactionType")
    public JAXBElement<TransactionType> createTransactionType(TransactionType value) {
        return new JAXBElement<TransactionType>(_TransactionType_QNAME, TransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicCheckingTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "ElectronicCheckingTransactionResponse")
    public JAXBElement<ElectronicCheckingTransactionResponse> createElectronicCheckingTransactionResponse(ElectronicCheckingTransactionResponse value) {
        return new JAXBElement<ElectronicCheckingTransactionResponse>(_ElectronicCheckingTransactionResponse_QNAME, ElectronicCheckingTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "OwnerType")
    public JAXBElement<OwnerType> createOwnerType(OwnerType value) {
        return new JAXBElement<OwnerType>(_OwnerType_QNAME, OwnerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicCheckingTenderData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "ElectronicCheckingTenderData")
    public JAXBElement<ElectronicCheckingTenderData> createElectronicCheckingTenderData(ElectronicCheckingTenderData value) {
        return new JAXBElement<ElectronicCheckingTenderData>(_ElectronicCheckingTenderData_QNAME, ElectronicCheckingTenderData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckCountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "CheckCountryCode")
    public JAXBElement<CheckCountryCode> createCheckCountryCode(CheckCountryCode value) {
        return new JAXBElement<CheckCountryCode>(_CheckCountryCode_QNAME, CheckCountryCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking", name = "UseType")
    public JAXBElement<UseType> createUseType(UseType value) {
        return new JAXBElement<UseType>(_UseType_QNAME, UseType.class, null, value);
    }

}
