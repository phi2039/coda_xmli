//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:10 AM EST 
//


package com.coda.efinance.schemas.year;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Year complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Year"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Yea" type="{http://www.coda.com/efinance/schemas/year}Master"/&gt;
 *         &lt;element name="Cmp" type="{http://www.coda.com/efinance/schemas/year}YearRange"/&gt;
 *         &lt;element name="Periods" type="{http://www.coda.com/efinance/schemas/year}Periods"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Year", propOrder = {
    "yea",
    "cmp",
    "periods"
})
public class Year
    implements Serializable
{

    @XmlElement(name = "Yea", required = true)
    protected Master yea;
    @XmlElement(name = "Cmp", required = true)
    protected YearRange cmp;
    @XmlElement(name = "Periods", required = true)
    protected Periods periods;

    /**
     * Gets the value of the yea property.
     * 
     * @return
     *     possible object is
     *     {@link Master }
     *     
     */
    public Master getYea() {
        return yea;
    }

    /**
     * Sets the value of the yea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Master }
     *     
     */
    public void setYea(Master value) {
        this.yea = value;
    }

    /**
     * Gets the value of the cmp property.
     * 
     * @return
     *     possible object is
     *     {@link YearRange }
     *     
     */
    public YearRange getCmp() {
        return cmp;
    }

    /**
     * Sets the value of the cmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearRange }
     *     
     */
    public void setCmp(YearRange value) {
        this.cmp = value;
    }

    /**
     * Gets the value of the periods property.
     * 
     * @return
     *     possible object is
     *     {@link Periods }
     *     
     */
    public Periods getPeriods() {
        return periods;
    }

    /**
     * Sets the value of the periods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Periods }
     *     
     */
    public void setPeriods(Periods value) {
        this.periods = value;
    }

}