//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.efinance.schemas.transaction;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element holds the quantity information for the element at level 1.
 * 
 * <p>Java class for ElmQuantities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElmQuantities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Quantity1" type="{http://www.coda.com/efinance/schemas/common}typeNum" minOccurs="0"/&gt;
 *         &lt;element name="Quantity2" type="{http://www.coda.com/efinance/schemas/common}typeNum" minOccurs="0"/&gt;
 *         &lt;element name="Quantity3" type="{http://www.coda.com/efinance/schemas/common}typeNum" minOccurs="0"/&gt;
 *         &lt;element name="Quantity4" type="{http://www.coda.com/efinance/schemas/common}typeNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElmQuantities", propOrder = {
    "quantity1",
    "quantity2",
    "quantity3",
    "quantity4"
})
public class ElmQuantities
    implements Serializable
{

    @XmlElement(name = "Quantity1")
    protected BigDecimal quantity1;
    @XmlElement(name = "Quantity2")
    protected BigDecimal quantity2;
    @XmlElement(name = "Quantity3")
    protected BigDecimal quantity3;
    @XmlElement(name = "Quantity4")
    protected BigDecimal quantity4;

    /**
     * Gets the value of the quantity1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity1() {
        return quantity1;
    }

    /**
     * Sets the value of the quantity1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity1(BigDecimal value) {
        this.quantity1 = value;
    }

    /**
     * Gets the value of the quantity2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity2() {
        return quantity2;
    }

    /**
     * Sets the value of the quantity2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity2(BigDecimal value) {
        this.quantity2 = value;
    }

    /**
     * Gets the value of the quantity3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity3() {
        return quantity3;
    }

    /**
     * Sets the value of the quantity3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity3(BigDecimal value) {
        this.quantity3 = value;
    }

    /**
     * Gets the value of the quantity4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantity4() {
        return quantity4;
    }

    /**
     * Sets the value of the quantity4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantity4(BigDecimal value) {
        this.quantity4 = value;
    }

}
