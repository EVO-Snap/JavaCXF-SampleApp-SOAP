
package com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BillPayment;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.ExistingDebt;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.RequestACI;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.RequestAdvice;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.RequestCommercialCard;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard/Pro" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Details about a transaction that may lower interchange rates for the transaction. Optional. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BankcardInterchangeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardInterchangeData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillPayment" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}BillPayment" minOccurs="0"/>
 *         &lt;element name="RequestCommercialCard" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}RequestCommercialCard" minOccurs="0"/>
 *         &lt;element name="ExistingDebt" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}ExistingDebt" minOccurs="0"/>
 *         &lt;element name="RequestACI" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}RequestACI" minOccurs="0"/>
 *         &lt;element name="TotalNumberOfInstallments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrentInstallmentNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RequestAdvice" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}RequestAdvice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardInterchangeData", propOrder = {
    "billPayment",
    "requestCommercialCard",
    "existingDebt",
    "requestACI",
    "totalNumberOfInstallments",
    "currentInstallmentNumber",
    "requestAdvice"
})
public class BankcardInterchangeData {

    @XmlElement(name = "BillPayment")
    protected BillPayment billPayment;
    @XmlElement(name = "RequestCommercialCard")
    protected RequestCommercialCard requestCommercialCard;
    @XmlElement(name = "ExistingDebt")
    protected ExistingDebt existingDebt;
    @XmlElement(name = "RequestACI")
    protected RequestACI requestACI;
    @XmlElement(name = "TotalNumberOfInstallments")
    protected Integer totalNumberOfInstallments;
    @XmlElement(name = "CurrentInstallmentNumber")
    protected Integer currentInstallmentNumber;
    @XmlElement(name = "RequestAdvice")
    protected RequestAdvice requestAdvice;

    /**
     * Gets the value of the billPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BillPayment }
     *     
     */
    public BillPayment getBillPayment() {
        return billPayment;
    }

    /**
     * Sets the value of the billPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPayment }
     *     
     */
    public void setBillPayment(BillPayment value) {
        this.billPayment = value;
    }

    /**
     * Gets the value of the requestCommercialCard property.
     * 
     * @return
     *     possible object is
     *     {@link RequestCommercialCard }
     *     
     */
    public RequestCommercialCard getRequestCommercialCard() {
        return requestCommercialCard;
    }

    /**
     * Sets the value of the requestCommercialCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestCommercialCard }
     *     
     */
    public void setRequestCommercialCard(RequestCommercialCard value) {
        this.requestCommercialCard = value;
    }

    /**
     * Gets the value of the existingDebt property.
     * 
     * @return
     *     possible object is
     *     {@link ExistingDebt }
     *     
     */
    public ExistingDebt getExistingDebt() {
        return existingDebt;
    }

    /**
     * Sets the value of the existingDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistingDebt }
     *     
     */
    public void setExistingDebt(ExistingDebt value) {
        this.existingDebt = value;
    }

    /**
     * Gets the value of the requestACI property.
     * 
     * @return
     *     possible object is
     *     {@link RequestACI }
     *     
     */
    public RequestACI getRequestACI() {
        return requestACI;
    }

    /**
     * Sets the value of the requestACI property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestACI }
     *     
     */
    public void setRequestACI(RequestACI value) {
        this.requestACI = value;
    }

    /**
     * Gets the value of the totalNumberOfInstallments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumberOfInstallments() {
        return totalNumberOfInstallments;
    }

    /**
     * Sets the value of the totalNumberOfInstallments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumberOfInstallments(Integer value) {
        this.totalNumberOfInstallments = value;
    }

    /**
     * Gets the value of the currentInstallmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentInstallmentNumber() {
        return currentInstallmentNumber;
    }

    /**
     * Sets the value of the currentInstallmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentInstallmentNumber(Integer value) {
        this.currentInstallmentNumber = value;
    }

    /**
     * Gets the value of the requestAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link RequestAdvice }
     *     
     */
    public RequestAdvice getRequestAdvice() {
        return requestAdvice;
    }

    /**
     * Sets the value of the requestAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestAdvice }
     *     
     */
    public void setRequestAdvice(RequestAdvice value) {
        this.requestAdvice = value;
    }

}
