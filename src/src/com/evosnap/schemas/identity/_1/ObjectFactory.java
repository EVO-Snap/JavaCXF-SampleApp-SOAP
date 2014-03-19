
package com.evosnap.schemas.identity._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.evosnap.schemas.identity._1 package. 
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

    private final static QName _InvalidTokenFault_QNAME = new QName("http://schemas.evosnap.com/Identity/1.0/", "InvalidTokenFault");
    private final static QName _AuthenticationFault_QNAME = new QName("http://schemas.evosnap.com/Identity/1.0/", "AuthenticationFault");
    private final static QName _ExpiredTokenFault_QNAME = new QName("http://schemas.evosnap.com/Identity/1.0/", "ExpiredTokenFault");
    private final static QName _BaseFault_QNAME = new QName("http://schemas.evosnap.com/Identity/1.0/", "BaseFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.evosnap.schemas.identity._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthenticationFault }
     * 
     */
    public AuthenticationFault createAuthenticationFault() {
        return new AuthenticationFault();
    }

    /**
     * Create an instance of {@link InvalidTokenFault }
     * 
     */
    public InvalidTokenFault createInvalidTokenFault() {
        return new InvalidTokenFault();
    }

    /**
     * Create an instance of {@link BaseFault }
     * 
     */
    public BaseFault createBaseFault() {
        return new BaseFault();
    }

    /**
     * Create an instance of {@link ExpiredTokenFault }
     * 
     */
    public ExpiredTokenFault createExpiredTokenFault() {
        return new ExpiredTokenFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidTokenFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/Identity/1.0/", name = "InvalidTokenFault")
    public JAXBElement<InvalidTokenFault> createInvalidTokenFault(InvalidTokenFault value) {
        return new JAXBElement<InvalidTokenFault>(_InvalidTokenFault_QNAME, InvalidTokenFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/Identity/1.0/", name = "AuthenticationFault")
    public JAXBElement<AuthenticationFault> createAuthenticationFault(AuthenticationFault value) {
        return new JAXBElement<AuthenticationFault>(_AuthenticationFault_QNAME, AuthenticationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpiredTokenFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/Identity/1.0/", name = "ExpiredTokenFault")
    public JAXBElement<ExpiredTokenFault> createExpiredTokenFault(ExpiredTokenFault value) {
        return new JAXBElement<ExpiredTokenFault>(_ExpiredTokenFault_QNAME, ExpiredTokenFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.evosnap.com/Identity/1.0/", name = "BaseFault")
    public JAXBElement<BaseFault> createBaseFault(BaseFault value) {
        return new JAXBElement<BaseFault>(_BaseFault_QNAME, BaseFault.class, null, value);
    }

}
