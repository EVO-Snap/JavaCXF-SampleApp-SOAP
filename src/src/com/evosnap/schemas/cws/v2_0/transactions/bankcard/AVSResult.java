
package com.evosnap.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;summary xmlns:tns="http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt; Specifies the result of an Address Verification System (AVS) lookup by the Service Provider. Optional. &lt;/summary&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AVSResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AVSResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActualResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}AddressResult" minOccurs="0"/>
 *         &lt;element name="CountryResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}CountryResult" minOccurs="0"/>
 *         &lt;element name="StateResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}StateResult" minOccurs="0"/>
 *         &lt;element name="PostalCodeResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}PostalCodeResult" minOccurs="0"/>
 *         &lt;element name="PhoneResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}PhoneResult" minOccurs="0"/>
 *         &lt;element name="CardholderNameResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}CardholderNameResult" minOccurs="0"/>
 *         &lt;element name="CityResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions/Bankcard}CityResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AVSResult", propOrder = {
    "actualResult",
    "addressResult",
    "countryResult",
    "stateResult",
    "postalCodeResult",
    "phoneResult",
    "cardholderNameResult",
    "cityResult"
})
public class AVSResult {

    @XmlElement(name = "ActualResult", nillable = true)
    protected String actualResult;
    @XmlElement(name = "AddressResult")
    protected AddressResult addressResult;
    @XmlElement(name = "CountryResult")
    protected CountryResult countryResult;
    @XmlElement(name = "StateResult")
    protected StateResult stateResult;
    @XmlElement(name = "PostalCodeResult")
    protected PostalCodeResult postalCodeResult;
    @XmlElement(name = "PhoneResult")
    protected PhoneResult phoneResult;
    @XmlElement(name = "CardholderNameResult")
    protected CardholderNameResult cardholderNameResult;
    @XmlElement(name = "CityResult")
    protected CityResult cityResult;

    /**
     * Gets the value of the actualResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualResult() {
        return actualResult;
    }

    /**
     * Sets the value of the actualResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualResult(String value) {
        this.actualResult = value;
    }

    /**
     * Gets the value of the addressResult property.
     * 
     * @return
     *     possible object is
     *     {@link AddressResult }
     *     
     */
    public AddressResult getAddressResult() {
        return addressResult;
    }

    /**
     * Sets the value of the addressResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressResult }
     *     
     */
    public void setAddressResult(AddressResult value) {
        this.addressResult = value;
    }

    /**
     * Gets the value of the countryResult property.
     * 
     * @return
     *     possible object is
     *     {@link CountryResult }
     *     
     */
    public CountryResult getCountryResult() {
        return countryResult;
    }

    /**
     * Sets the value of the countryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryResult }
     *     
     */
    public void setCountryResult(CountryResult value) {
        this.countryResult = value;
    }

    /**
     * Gets the value of the stateResult property.
     * 
     * @return
     *     possible object is
     *     {@link StateResult }
     *     
     */
    public StateResult getStateResult() {
        return stateResult;
    }

    /**
     * Sets the value of the stateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateResult }
     *     
     */
    public void setStateResult(StateResult value) {
        this.stateResult = value;
    }

    /**
     * Gets the value of the postalCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link PostalCodeResult }
     *     
     */
    public PostalCodeResult getPostalCodeResult() {
        return postalCodeResult;
    }

    /**
     * Sets the value of the postalCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalCodeResult }
     *     
     */
    public void setPostalCodeResult(PostalCodeResult value) {
        this.postalCodeResult = value;
    }

    /**
     * Gets the value of the phoneResult property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneResult }
     *     
     */
    public PhoneResult getPhoneResult() {
        return phoneResult;
    }

    /**
     * Sets the value of the phoneResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneResult }
     *     
     */
    public void setPhoneResult(PhoneResult value) {
        this.phoneResult = value;
    }

    /**
     * Gets the value of the cardholderNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link CardholderNameResult }
     *     
     */
    public CardholderNameResult getCardholderNameResult() {
        return cardholderNameResult;
    }

    /**
     * Sets the value of the cardholderNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderNameResult }
     *     
     */
    public void setCardholderNameResult(CardholderNameResult value) {
        this.cardholderNameResult = value;
    }

    /**
     * Gets the value of the cityResult property.
     * 
     * @return
     *     possible object is
     *     {@link CityResult }
     *     
     */
    public CityResult getCityResult() {
        return cityResult;
    }

    /**
     * Sets the value of the cityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityResult }
     *     
     */
    public void setCityResult(CityResult value) {
        this.cityResult = value;
    }

}
