//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:25 AM EST 
//


package com.coda.efinance.schemas.elementmaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Holds details of an address.
 * 
 * <p>Java class for AddressElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefaultAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Tag" type="{http://www.coda.com/efinance/schemas/common}typeUWord" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.coda.com/efinance/schemas/common}typeAddressName"/&gt;
 *         &lt;element name="Address1" type="{http://www.coda.com/efinance/schemas/common}typeAddress" minOccurs="0"/&gt;
 *         &lt;element name="Address2" type="{http://www.coda.com/efinance/schemas/common}typeAddress" minOccurs="0"/&gt;
 *         &lt;element name="Address3" type="{http://www.coda.com/efinance/schemas/common}typeAddress" minOccurs="0"/&gt;
 *         &lt;element name="Address4" type="{http://www.coda.com/efinance/schemas/common}typeAddress" minOccurs="0"/&gt;
 *         &lt;element name="Address5" type="{http://www.coda.com/efinance/schemas/common}typeAddress" minOccurs="0"/&gt;
 *         &lt;element name="Address6" type="{http://www.coda.com/efinance/schemas/common}typeAddress" minOccurs="0"/&gt;
 *         &lt;element name="PostCode" type="{http://www.coda.com/efinance/schemas/common}typePostCode" minOccurs="0"/&gt;
 *         &lt;element name="Tel" type="{http://www.coda.com/efinance/schemas/common}typeTel" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.coda.com/efinance/schemas/common}typeFax" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.coda.com/efinance/schemas/common}typeTextB" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.coda.com/efinance/schemas/common}typeLanguage" minOccurs="0"/&gt;
 *         &lt;element name="Category" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCodeB" minOccurs="0"/&gt;
 *         &lt;element name="EMail" type="{http://www.coda.com/efinance/schemas/common}typeEMailAddrB" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressElement", propOrder = {
    "defaultAddress",
    "tag",
    "name",
    "address1",
    "address2",
    "address3",
    "address4",
    "address5",
    "address6",
    "postCode",
    "tel",
    "fax",
    "country",
    "language",
    "category",
    "eMail"
})
public class AddressElement
    implements Serializable
{

    @XmlElement(name = "DefaultAddress")
    protected Boolean defaultAddress;
    @XmlElement(name = "Tag")
    protected Short tag;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Address1")
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "Address3")
    protected String address3;
    @XmlElement(name = "Address4")
    protected String address4;
    @XmlElement(name = "Address5")
    protected String address5;
    @XmlElement(name = "Address6")
    protected String address6;
    @XmlElement(name = "PostCode")
    protected String postCode;
    @XmlElement(name = "Tel")
    protected String tel;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "EMail")
    protected String eMail;

    /**
     * Gets the value of the defaultAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultAddress() {
        return defaultAddress;
    }

    /**
     * Sets the value of the defaultAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultAddress(Boolean value) {
        this.defaultAddress = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTag(Short value) {
        this.tag = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the address4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress4() {
        return address4;
    }

    /**
     * Sets the value of the address4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress4(String value) {
        this.address4 = value;
    }

    /**
     * Gets the value of the address5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress5() {
        return address5;
    }

    /**
     * Sets the value of the address5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress5(String value) {
        this.address5 = value;
    }

    /**
     * Gets the value of the address6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress6() {
        return address6;
    }

    /**
     * Sets the value of the address6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress6(String value) {
        this.address6 = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

}