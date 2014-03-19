
package com.evosnap.schemas.cws.v2_0.transactions.electronicchecking;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.evosnap.schemas.cws.v2_0.transactions.Response;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for ElectronicCheckingTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectronicCheckingTransactionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Response">
 *       &lt;sequence>
 *         &lt;element name="ACHCapable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModifiedAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModifiedRoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentAccountDataToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnInformation" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/ElectronicChecking}ReturnInformation" minOccurs="0"/>
 *         &lt;element name="SubmitDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectronicCheckingTransactionResponse", propOrder = {
    "achCapable",
    "amount",
    "approvalCode",
    "modifiedAccountNumber",
    "modifiedRoutingNumber",
    "paymentAccountDataToken",
    "returnInformation",
    "submitDate"
})
public class ElectronicCheckingTransactionResponse
    extends Response
{

    @XmlElement(name = "ACHCapable")
    protected Boolean achCapable;
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElement(name = "ApprovalCode", nillable = true)
    protected String approvalCode;
    @XmlElement(name = "ModifiedAccountNumber", nillable = true)
    protected String modifiedAccountNumber;
    @XmlElement(name = "ModifiedRoutingNumber", nillable = true)
    protected String modifiedRoutingNumber;
    @XmlElement(name = "PaymentAccountDataToken", nillable = true)
    protected String paymentAccountDataToken;
    @XmlElement(name = "ReturnInformation", nillable = true)
    protected ReturnInformation returnInformation;
    @XmlElement(name = "SubmitDate", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar submitDate;

    /**
     * Gets the value of the achCapable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACHCapable() {
        return achCapable;
    }

    /**
     * Sets the value of the achCapable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACHCapable(Boolean value) {
        this.achCapable = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the approvalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /**
     * Sets the value of the approvalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
    }

    /**
     * Gets the value of the modifiedAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedAccountNumber() {
        return modifiedAccountNumber;
    }

    /**
     * Sets the value of the modifiedAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedAccountNumber(String value) {
        this.modifiedAccountNumber = value;
    }

    /**
     * Gets the value of the modifiedRoutingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedRoutingNumber() {
        return modifiedRoutingNumber;
    }

    /**
     * Sets the value of the modifiedRoutingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedRoutingNumber(String value) {
        this.modifiedRoutingNumber = value;
    }

    /**
     * Gets the value of the paymentAccountDataToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentAccountDataToken() {
        return paymentAccountDataToken;
    }

    /**
     * Sets the value of the paymentAccountDataToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAccountDataToken(String value) {
        this.paymentAccountDataToken = value;
    }

    /**
     * Gets the value of the returnInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnInformation }
     *     
     */
    public ReturnInformation getReturnInformation() {
        return returnInformation;
    }

    /**
     * Sets the value of the returnInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInformation }
     *     
     */
    public void setReturnInformation(ReturnInformation value) {
        this.returnInformation = value;
    }

    /**
     * Gets the value of the submitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getSubmitDate() {
        return submitDate;
    }

    /**
     * Sets the value of the submitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitDate(Calendar value) {
        this.submitDate = value;
    }

}
