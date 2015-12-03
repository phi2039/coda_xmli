//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.efinance.schemas.selectormaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A selector master key.
 * 
 * <p>Java class for Key complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Key"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CmpCode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode" minOccurs="0"/&gt;
 *         &lt;element name="ShortName" type="{http://www.coda.com/efinance/schemas/common}typeShortNameB" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{http://www.coda.com/efinance/schemas/common}typeApplicationNameb" minOccurs="0"/&gt;
 *         &lt;element name="ViewType" type="{http://www.coda.com/efinance/schemas/common}typeGenericOon" minOccurs="0"/&gt;
 *         &lt;element name="SelType" type="{http://www.coda.com/efinance/schemas/selectormaster}SourceModeSelectorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Key", propOrder = {
    "cmpCode",
    "code",
    "shortName",
    "product",
    "viewType",
    "selType"
})
public class Key
    implements Serializable
{

    @XmlElement(name = "CmpCode")
    protected String cmpCode;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "ShortName")
    protected String shortName;
    @XmlElement(name = "Product")
    protected String product;
    @XmlElement(name = "ViewType")
    protected String viewType;
    @XmlElement(name = "SelType")
    protected SourceModeSelectorType selType;

    /**
     * Gets the value of the cmpCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpCode() {
        return cmpCode;
    }

    /**
     * Sets the value of the cmpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpCode(String value) {
        this.cmpCode = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the viewType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewType() {
        return viewType;
    }

    /**
     * Sets the value of the viewType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewType(String value) {
        this.viewType = value;
    }

    /**
     * Gets the value of the selType property.
     * 
     * @return
     *     possible object is
     *     {@link SourceModeSelectorType }
     *     
     */
    public SourceModeSelectorType getSelType() {
        return selType;
    }

    /**
     * Sets the value of the selType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceModeSelectorType }
     *     
     */
    public void setSelType(SourceModeSelectorType value) {
        this.selType = value;
    }

}
