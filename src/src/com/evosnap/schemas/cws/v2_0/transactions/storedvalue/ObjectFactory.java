
package com.evosnap.schemas.cws.v2_0.transactions.storedvalue;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.evosnap.schemas.cws.v2_0.transactions.storedvalue package. 
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

    private final static QName _ConsumerIdentification_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "ConsumerIdentification");
    private final static QName _CardSecurityData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "CardSecurityData");
    private final static QName _StoredValueCaptureResponse_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "StoredValueCaptureResponse");
    private final static QName _CardData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "CardData");
    private final static QName _OperationType_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "OperationType");
    private final static QName _StoredValueTransactionResponse_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTransactionResponse");
    private final static QName _StoredValueManage_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "StoredValueManage");
    private final static QName _IdEntryMode_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "IdEntryMode");
    private final static QName _StoredValueActivateTenderData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "StoredValueActivateTenderData");
    private final static QName _StoredValueTransactionData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTransactionData");
    private final static QName _IdType_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "IdType");
    private final static QName _VirtualCardData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "VirtualCardData");
    private final static QName _ArrayOfConsumerIdentification_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "ArrayOfConsumerIdentification");
    private final static QName _StoredValueReturn_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "StoredValueReturn");
    private final static QName _StoredValueCapture_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "StoredValueCapture");
    private final static QName _StoredValueBalanceTransferTenderData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "StoredValueBalanceTransferTenderData");
    private final static QName _StoredValueTenderData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTenderData");
    private final static QName _StoredValueTransaction_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTransaction");
    private final static QName _CardStatus_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", "CardStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.evosnap.schemas.cws.v2_0.transactions.storedvalue
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StoredValueCapture }
     * 
     */
    public StoredValueCapture createStoredValueCapture() {
        return new StoredValueCapture();
    }

    /**
     * Create an instance of {@link ConsumerIdentification }
     * 
     */
    public ConsumerIdentification createConsumerIdentification() {
        return new ConsumerIdentification();
    }

    /**
     * Create an instance of {@link CardSecurityData }
     * 
     */
    public CardSecurityData createCardSecurityData() {
        return new CardSecurityData();
    }

    /**
     * Create an instance of {@link StoredValueTransactionResponse }
     * 
     */
    public StoredValueTransactionResponse createStoredValueTransactionResponse() {
        return new StoredValueTransactionResponse();
    }

    /**
     * Create an instance of {@link VirtualCardData }
     * 
     */
    public VirtualCardData createVirtualCardData() {
        return new VirtualCardData();
    }

    /**
     * Create an instance of {@link ArrayOfConsumerIdentification }
     * 
     */
    public ArrayOfConsumerIdentification createArrayOfConsumerIdentification() {
        return new ArrayOfConsumerIdentification();
    }

    /**
     * Create an instance of {@link StoredValueCaptureResponse }
     * 
     */
    public StoredValueCaptureResponse createStoredValueCaptureResponse() {
        return new StoredValueCaptureResponse();
    }

    /**
     * Create an instance of {@link StoredValueBalanceTransferTenderData }
     * 
     */
    public StoredValueBalanceTransferTenderData createStoredValueBalanceTransferTenderData() {
        return new StoredValueBalanceTransferTenderData();
    }

    /**
     * Create an instance of {@link StoredValueReturn }
     * 
     */
    public StoredValueReturn createStoredValueReturn() {
        return new StoredValueReturn();
    }

    /**
     * Create an instance of {@link StoredValueActivateTenderData }
     * 
     */
    public StoredValueActivateTenderData createStoredValueActivateTenderData() {
        return new StoredValueActivateTenderData();
    }

    /**
     * Create an instance of {@link StoredValueTransaction }
     * 
     */
    public StoredValueTransaction createStoredValueTransaction() {
        return new StoredValueTransaction();
    }

    /**
     * Create an instance of {@link StoredValueTenderData }
     * 
     */
    public StoredValueTenderData createStoredValueTenderData() {
        return new StoredValueTenderData();
    }

    /**
     * Create an instance of {@link CardData }
     * 
     */
    public CardData createCardData() {
        return new CardData();
    }

    /**
     * Create an instance of {@link StoredValueTransactionData }
     * 
     */
    public StoredValueTransactionData createStoredValueTransactionData() {
        return new StoredValueTransactionData();
    }

    /**
     * Create an instance of {@link StoredValueManage }
     * 
     */
    public StoredValueManage createStoredValueManage() {
        return new StoredValueManage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumerIdentification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "ConsumerIdentification")
    public JAXBElement<ConsumerIdentification> createConsumerIdentification(ConsumerIdentification value) {
        return new JAXBElement<ConsumerIdentification>(_ConsumerIdentification_QNAME, ConsumerIdentification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardSecurityData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "CardSecurityData")
    public JAXBElement<CardSecurityData> createCardSecurityData(CardSecurityData value) {
        return new JAXBElement<CardSecurityData>(_CardSecurityData_QNAME, CardSecurityData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoredValueCaptureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "StoredValueCaptureResponse")
    public JAXBElement<StoredValueCaptureResponse> createStoredValueCaptureResponse(StoredValueCaptureResponse value) {
        return new JAXBElement<StoredValueCaptureResponse>(_StoredValueCaptureResponse_QNAME, StoredValueCaptureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "CardData")
    public JAXBElement<CardData> createCardData(CardData value) {
        return new JAXBElement<CardData>(_CardData_QNAME, CardData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "OperationType")
    public JAXBElement<OperationType> createOperationType(OperationType value) {
        return new JAXBElement<OperationType>(_OperationType_QNAME, OperationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoredValueTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "StoredValueTransactionResponse")
    public JAXBElement<StoredValueTransactionResponse> createStoredValueTransactionResponse(StoredValueTransactionResponse value) {
        return new JAXBElement<StoredValueTransactionResponse>(_StoredValueTransactionResponse_QNAME, StoredValueTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoredValueManage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "StoredValueManage")
    public JAXBElement<StoredValueManage> createStoredValueManage(StoredValueManage value) {
        return new JAXBElement<StoredValueManage>(_StoredValueManage_QNAME, StoredValueManage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdEntryMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "IdEntryMode")
    public JAXBElement<IdEntryMode> createIdEntryMode(IdEntryMode value) {
        return new JAXBElement<IdEntryMode>(_IdEntryMode_QNAME, IdEntryMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoredValueActivateTenderData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "StoredValueActivateTenderData")
    public JAXBElement<StoredValueActivateTenderData> createStoredValueActivateTenderData(StoredValueActivateTenderData value) {
        return new JAXBElement<StoredValueActivateTenderData>(_StoredValueActivateTenderData_QNAME, StoredValueActivateTenderData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoredValueTransactionData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "StoredValueTransactionData")
    public JAXBElement<StoredValueTransactionData> createStoredValueTransactionData(StoredValueTransactionData value) {
        return new JAXBElement<StoredValueTransactionData>(_StoredValueTransactionData_QNAME, StoredValueTransactionData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "IdType")
    public JAXBElement<IdType> createIdType(IdType value) {
        return new JAXBElement<IdType>(_IdType_QNAME, IdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirtualCardData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "VirtualCardData")
    public JAXBElement<VirtualCardData> createVirtualCardData(VirtualCardData value) {
        return new JAXBElement<VirtualCardData>(_VirtualCardData_QNAME, VirtualCardData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConsumerIdentification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "ArrayOfConsumerIdentification")
    public JAXBElement<ArrayOfConsumerIdentification> createArrayOfConsumerIdentification(ArrayOfConsumerIdentification value) {
        return new JAXBElement<ArrayOfConsumerIdentification>(_ArrayOfConsumerIdentification_QNAME, ArrayOfConsumerIdentification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoredValueReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "StoredValueReturn")
    public JAXBElement<StoredValueReturn> createStoredValueReturn(StoredValueReturn value) {
        return new JAXBElement<StoredValueReturn>(_StoredValueReturn_QNAME, StoredValueReturn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoredValueCapture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "StoredValueCapture")
    public JAXBElement<StoredValueCapture> createStoredValueCapture(StoredValueCapture value) {
        return new JAXBElement<StoredValueCapture>(_StoredValueCapture_QNAME, StoredValueCapture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoredValueBalanceTransferTenderData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "StoredValueBalanceTransferTenderData")
    public JAXBElement<StoredValueBalanceTransferTenderData> createStoredValueBalanceTransferTenderData(StoredValueBalanceTransferTenderData value) {
        return new JAXBElement<StoredValueBalanceTransferTenderData>(_StoredValueBalanceTransferTenderData_QNAME, StoredValueBalanceTransferTenderData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoredValueTenderData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "StoredValueTenderData")
    public JAXBElement<StoredValueTenderData> createStoredValueTenderData(StoredValueTenderData value) {
        return new JAXBElement<StoredValueTenderData>(_StoredValueTenderData_QNAME, StoredValueTenderData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoredValueTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "StoredValueTransaction")
    public JAXBElement<StoredValueTransaction> createStoredValueTransaction(StoredValueTransaction value) {
        return new JAXBElement<StoredValueTransaction>(_StoredValueTransaction_QNAME, StoredValueTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/StoredValue", name = "CardStatus")
    public JAXBElement<CardStatus> createCardStatus(CardStatus value) {
        return new JAXBElement<CardStatus>(_CardStatus_QNAME, CardStatus.class, null, value);
    }

}
