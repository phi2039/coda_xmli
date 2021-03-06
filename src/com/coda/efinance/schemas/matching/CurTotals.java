//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.efinance.schemas.matching;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element contains the match totals in matching currency.
 * 
 * <p>Java class for CurTotals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurTotals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrCode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="TotalDisc" type="{http://www.coda.com/efinance/schemas/common}typeMoney"/&gt;
 *         &lt;element name="TotalWOff" type="{http://www.coda.com/efinance/schemas/common}typeMoney"/&gt;
 *         &lt;element name="NetValue" type="{http://www.coda.com/efinance/schemas/common}typeMoney"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurTotals", propOrder = {
    "currCode",
    "totalDisc",
    "totalWOff",
    "netValue"
})
public class CurTotals
    implements Serializable
{

    @XmlElement(name = "CurrCode", required = true)
    protected String currCode;
    @XmlElement(name = "TotalDisc", required = true)
    protected BigDecimal totalDisc;
    @XmlElement(name = "TotalWOff", required = true)
    protected BigDecimal totalWOff;
    @XmlElement(name = "NetValue", required = true)
    protected BigDecimal netValue;

    /**
     * Gets the value of the currCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Sets the value of the currCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrCode(String value) {
        this.currCode = value;
    }

    /**
     * Gets the value of the totalDisc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDisc() {
        return totalDisc;
    }

    /**
     * Sets the value of the totalDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDisc(BigDecimal value) {
        this.totalDisc = value;
    }

    /**
     * Gets the value of the totalWOff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalWOff() {
        return totalWOff;
    }

    /**
     * Sets the value of the totalWOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalWOff(BigDecimal value) {
        this.totalWOff = value;
    }

    /**
     * Gets the value of the netValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetValue() {
        return netValue;
    }

    /**
     * Sets the value of the netValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetValue(BigDecimal value) {
        this.netValue = value;
    }

}
