
package com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro package. 
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

    private final static QName _BankcardCapturePro_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardCapturePro");
    private final static QName _BankcardCaptureResponsePro_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardCaptureResponsePro");
    private final static QName _BankcardInterchangeData_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardInterchangeData");
    private final static QName _BankcardTransactionPro_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardTransactionPro");
    private final static QName _BankcardTransactionDataPro_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardTransactionDataPro");
    private final static QName _BankcardTransactionResponsePro_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardTransactionResponsePro");
    private final static QName _BankcardReturnPro_QNAME = new QName("http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", "BankcardReturnPro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BankcardCapturePro }
     * 
     */
    public BankcardCapturePro createBankcardCapturePro() {
        return new BankcardCapturePro();
    }

    /**
     * Create an instance of {@link BankcardReturnPro }
     * 
     */
    public BankcardReturnPro createBankcardReturnPro() {
        return new BankcardReturnPro();
    }

    /**
     * Create an instance of {@link BankcardInterchangeData }
     * 
     */
    public BankcardInterchangeData createBankcardInterchangeData() {
        return new BankcardInterchangeData();
    }

    /**
     * Create an instance of {@link BankcardCaptureResponsePro }
     * 
     */
    public BankcardCaptureResponsePro createBankcardCaptureResponsePro() {
        return new BankcardCaptureResponsePro();
    }

    /**
     * Create an instance of {@link BankcardTransactionPro }
     * 
     */
    public BankcardTransactionPro createBankcardTransactionPro() {
        return new BankcardTransactionPro();
    }

    /**
     * Create an instance of {@link BankcardTransactionDataPro }
     * 
     */
    public BankcardTransactionDataPro createBankcardTransactionDataPro() {
        return new BankcardTransactionDataPro();
    }

    /**
     * Create an instance of {@link BankcardTransactionResponsePro }
     * 
     */
    public BankcardTransactionResponsePro createBankcardTransactionResponsePro() {
        return new BankcardTransactionResponsePro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankcardCapturePro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", name = "BankcardCapturePro")
    public JAXBElement<BankcardCapturePro> createBankcardCapturePro(BankcardCapturePro value) {
        return new JAXBElement<BankcardCapturePro>(_BankcardCapturePro_QNAME, BankcardCapturePro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankcardCaptureResponsePro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", name = "BankcardCaptureResponsePro")
    public JAXBElement<BankcardCaptureResponsePro> createBankcardCaptureResponsePro(BankcardCaptureResponsePro value) {
        return new JAXBElement<BankcardCaptureResponsePro>(_BankcardCaptureResponsePro_QNAME, BankcardCaptureResponsePro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankcardInterchangeData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", name = "BankcardInterchangeData")
    public JAXBElement<BankcardInterchangeData> createBankcardInterchangeData(BankcardInterchangeData value) {
        return new JAXBElement<BankcardInterchangeData>(_BankcardInterchangeData_QNAME, BankcardInterchangeData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankcardTransactionPro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", name = "BankcardTransactionPro")
    public JAXBElement<BankcardTransactionPro> createBankcardTransactionPro(BankcardTransactionPro value) {
        return new JAXBElement<BankcardTransactionPro>(_BankcardTransactionPro_QNAME, BankcardTransactionPro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankcardTransactionDataPro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", name = "BankcardTransactionDataPro")
    public JAXBElement<BankcardTransactionDataPro> createBankcardTransactionDataPro(BankcardTransactionDataPro value) {
        return new JAXBElement<BankcardTransactionDataPro>(_BankcardTransactionDataPro_QNAME, BankcardTransactionDataPro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankcardTransactionResponsePro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", name = "BankcardTransactionResponsePro")
    public JAXBElement<BankcardTransactionResponsePro> createBankcardTransactionResponsePro(BankcardTransactionResponsePro value) {
        return new JAXBElement<BankcardTransactionResponsePro>(_BankcardTransactionResponsePro_QNAME, BankcardTransactionResponsePro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankcardReturnPro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro", name = "BankcardReturnPro")
    public JAXBElement<BankcardReturnPro> createBankcardReturnPro(BankcardReturnPro value) {
        return new JAXBElement<BankcardReturnPro>(_BankcardReturnPro_QNAME, BankcardReturnPro.class, null, value);
    }

}
