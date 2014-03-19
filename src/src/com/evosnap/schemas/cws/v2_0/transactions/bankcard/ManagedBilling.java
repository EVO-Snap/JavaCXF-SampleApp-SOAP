
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Configuration to setup and perform an automated recurring payment on behalf of the merchant. Conditional, optional if ManagedBilling (ServiceInformation) = 'true', otherwise not present. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ManagedBilling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedBilling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DownPayment" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Installments" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}ManagedBillingInstallments" minOccurs="0"/>
 *         &lt;element name="Interval" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}Interval" minOccurs="0"/>
 *         &lt;element name="Period" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedBilling", propOrder = {
    "downPayment",
    "installments",
    "interval",
    "period",
    "startDate"
})
public class ManagedBilling {

    @XmlElement(name = "DownPayment")
    protected BigDecimal downPayment;
    @XmlElement(name = "Installments", nillable = true)
    protected ManagedBillingInstallments installments;
    @XmlElement(name = "Interval")
    protected Interval interval;
    @XmlElement(name = "Period")
    protected Integer period;
    @XmlElement(name = "StartDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startDate;

    /**
     * Gets the value of the downPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDownPayment() {
        return downPayment;
    }

    /**
     * Sets the value of the downPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDownPayment(BigDecimal value) {
        this.downPayment = value;
    }

    /**
     * Gets the value of the installments property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedBillingInstallments }
     *     
     */
    public ManagedBillingInstallments getInstallments() {
        return installments;
    }

    /**
     * Sets the value of the installments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedBillingInstallments }
     *     
     */
    public void setInstallments(ManagedBillingInstallments value) {
        this.installments = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link Interval }
     *     
     */
    public Interval getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interval }
     *     
     */
    public void setInterval(Interval value) {
        this.interval = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriod(Integer value) {
        this.period = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Calendar value) {
        this.startDate = value;
    }

}
