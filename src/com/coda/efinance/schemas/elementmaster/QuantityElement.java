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
 * Holds details of one of the element's quantities.
 * 
 * <p>Java class for QuantityElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Used" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.coda.com/efinance/schemas/common}typeQtyTitle"/&gt;
 *         &lt;element name="Mand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BalCode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCodeB" minOccurs="0"/&gt;
 *         &lt;element name="Decimals" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityElement", propOrder = {
    "used",
    "title",
    "mand",
    "balCode",
    "decimals"
})
public class QuantityElement
    implements Serializable
{

    @XmlElement(name = "Used")
    protected Boolean used;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Mand")
    protected Boolean mand;
    @XmlElement(name = "BalCode")
    protected String balCode;
    @XmlElement(name = "Decimals")
    protected Short decimals;

    /**
     * Gets the value of the used property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsed() {
        return used;
    }

    /**
     * Sets the value of the used property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsed(Boolean value) {
        this.used = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the mand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMand() {
        return mand;
    }

    /**
     * Sets the value of the mand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMand(Boolean value) {
        this.mand = value;
    }

    /**
     * Gets the value of the balCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalCode() {
        return balCode;
    }

    /**
     * Sets the value of the balCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalCode(String value) {
        this.balCode = value;
    }

    /**
     * Gets the value of the decimals property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDecimals() {
        return decimals;
    }

    /**
     * Sets the value of the decimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDecimals(Short value) {
        this.decimals = value;
    }

}
