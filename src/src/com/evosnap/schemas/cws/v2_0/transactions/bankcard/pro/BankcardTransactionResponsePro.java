
package com.evosnap.schemas.cws.v2_0.transactions.bankcard.pro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.AdviceResponse;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.BankcardTransactionResponse;
import com.evosnap.schemas.cws.v2_0.transactions.bankcard.CommercialCardResponse;


/**
 * <p>Java class for BankcardTransactionResponsePro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankcardTransactionResponsePro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}BankcardTransactionResponse">
 *       &lt;sequence>
 *         &lt;element name="AdviceResponse" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}AdviceResponse" minOccurs="0"/>
 *         &lt;element name="CommercialCardResponse" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}CommercialCardResponse" minOccurs="0"/>
 *         &lt;element name="ReturnedACI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankcardTransactionResponsePro", propOrder = {
    "adviceResponse",
    "commercialCardResponse",
    "returnedACI"
})
public class BankcardTransactionResponsePro
    extends BankcardTransactionResponse
{

    @XmlElement(name = "AdviceResponse")
    protected AdviceResponse adviceResponse;
    @XmlElement(name = "CommercialCardResponse")
    protected CommercialCardResponse commercialCardResponse;
    @XmlElement(name = "ReturnedACI", nillable = true)
    protected String returnedACI;

    /**
     * Gets the value of the adviceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AdviceResponse }
     *     
     */
    public AdviceResponse getAdviceResponse() {
        return adviceResponse;
    }

    /**
     * Sets the value of the adviceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdviceResponse }
     *     
     */
    public void setAdviceResponse(AdviceResponse value) {
        this.adviceResponse = value;
    }

    /**
     * Gets the value of the commercialCardResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialCardResponse }
     *     
     */
    public CommercialCardResponse getCommercialCardResponse() {
        return commercialCardResponse;
    }

    /**
     * Sets the value of the commercialCardResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialCardResponse }
     *     
     */
    public void setCommercialCardResponse(CommercialCardResponse value) {
        this.commercialCardResponse = value;
    }

    /**
     * Gets the value of the returnedACI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnedACI() {
        return returnedACI;
    }

    /**
     * Sets the value of the returnedACI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnedACI(String value) {
        this.returnedACI = value;
    }

}
