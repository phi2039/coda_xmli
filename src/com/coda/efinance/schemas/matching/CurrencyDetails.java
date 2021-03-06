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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.TypeCtCurLinkType;


/**
 * This element contains the match details in the specified currency.
 * 
 * <p>Java class for CurrencyDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrCode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="Which" type="{http://www.coda.com/efinance/schemas/matching}WhichCurrs" minOccurs="0"/&gt;
 *         &lt;element name="LinkType" type="{http://www.coda.com/efinance/schemas/common}typeCtCurLinkType" minOccurs="0"/&gt;
 *         &lt;element name="ParentCode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode" minOccurs="0"/&gt;
 *         &lt;element name="LineValue" type="{http://www.coda.com/efinance/schemas/common}typeMoney"/&gt;
 *         &lt;element name="MatchValue" type="{http://www.coda.com/efinance/schemas/common}typeMoney"/&gt;
 *         &lt;element name="MatchFullValue" type="{http://www.coda.com/efinance/schemas/common}typeMoney" minOccurs="0"/&gt;
 *         &lt;element name="DiscValue" type="{http://www.coda.com/efinance/schemas/common}typeMoney" minOccurs="0"/&gt;
 *         &lt;element name="DiscFullValue" type="{http://www.coda.com/efinance/schemas/common}typeMoney" minOccurs="0"/&gt;
 *         &lt;element name="DiscRate" type="{http://www.coda.com/efinance/schemas/common}typeRate" minOccurs="0"/&gt;
 *         &lt;element name="DiscFullRate" type="{http://www.coda.com/efinance/schemas/common}typeNum" minOccurs="0"/&gt;
 *         &lt;element name="ValidDiscRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WOffValue" type="{http://www.coda.com/efinance/schemas/common}typeMoney" minOccurs="0"/&gt;
 *         &lt;element name="WOffFullValue" type="{http://www.coda.com/efinance/schemas/common}typeMoney" minOccurs="0"/&gt;
 *         &lt;element name="WOffRate" type="{http://www.coda.com/efinance/schemas/common}typeRate" minOccurs="0"/&gt;
 *         &lt;element name="WOffFullRate" type="{http://www.coda.com/efinance/schemas/common}typeNum" minOccurs="0"/&gt;
 *         &lt;element name="ValidWOffRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RemValue" type="{http://www.coda.com/efinance/schemas/common}typeMoney" minOccurs="0"/&gt;
 *         &lt;element name="RemFullValue" type="{http://www.coda.com/efinance/schemas/common}typeMoney" minOccurs="0"/&gt;
 *         &lt;element name="PartMatchRate" type="{http://www.coda.com/efinance/schemas/common}typeRate" minOccurs="0"/&gt;
 *         &lt;element name="PartMatchFullRate" type="{http://www.coda.com/efinance/schemas/common}typeNum" minOccurs="0"/&gt;
 *         &lt;element name="ValidPartMatchRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyDetails", propOrder = {
    "currCode",
    "which",
    "linkType",
    "parentCode",
    "lineValue",
    "matchValue",
    "matchFullValue",
    "discValue",
    "discFullValue",
    "discRate",
    "discFullRate",
    "validDiscRate",
    "wOffValue",
    "wOffFullValue",
    "wOffRate",
    "wOffFullRate",
    "validWOffRate",
    "remValue",
    "remFullValue",
    "partMatchRate",
    "partMatchFullRate",
    "validPartMatchRate"
})
public class CurrencyDetails
    implements Serializable
{

    @XmlElement(name = "CurrCode", required = true)
    protected String currCode;
    @XmlElement(name = "Which")
    protected WhichCurrs which;
    @XmlElement(name = "LinkType")
    @XmlSchemaType(name = "string")
    protected TypeCtCurLinkType linkType;
    @XmlElement(name = "ParentCode")
    protected String parentCode;
    @XmlElement(name = "LineValue", required = true)
    protected BigDecimal lineValue;
    @XmlElement(name = "MatchValue", required = true)
    protected BigDecimal matchValue;
    @XmlElement(name = "MatchFullValue")
    protected BigDecimal matchFullValue;
    @XmlElement(name = "DiscValue")
    protected BigDecimal discValue;
    @XmlElement(name = "DiscFullValue")
    protected BigDecimal discFullValue;
    @XmlElement(name = "DiscRate")
    protected BigDecimal discRate;
    @XmlElement(name = "DiscFullRate")
    protected BigDecimal discFullRate;
    @XmlElement(name = "ValidDiscRate")
    protected Boolean validDiscRate;
    @XmlElement(name = "WOffValue")
    protected BigDecimal wOffValue;
    @XmlElement(name = "WOffFullValue")
    protected BigDecimal wOffFullValue;
    @XmlElement(name = "WOffRate")
    protected BigDecimal wOffRate;
    @XmlElement(name = "WOffFullRate")
    protected BigDecimal wOffFullRate;
    @XmlElement(name = "ValidWOffRate")
    protected Boolean validWOffRate;
    @XmlElement(name = "RemValue")
    protected BigDecimal remValue;
    @XmlElement(name = "RemFullValue")
    protected BigDecimal remFullValue;
    @XmlElement(name = "PartMatchRate")
    protected BigDecimal partMatchRate;
    @XmlElement(name = "PartMatchFullRate")
    protected BigDecimal partMatchFullRate;
    @XmlElement(name = "ValidPartMatchRate")
    protected Boolean validPartMatchRate;

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
     * Gets the value of the which property.
     * 
     * @return
     *     possible object is
     *     {@link WhichCurrs }
     *     
     */
    public WhichCurrs getWhich() {
        return which;
    }

    /**
     * Sets the value of the which property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhichCurrs }
     *     
     */
    public void setWhich(WhichCurrs value) {
        this.which = value;
    }

    /**
     * Gets the value of the linkType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCtCurLinkType }
     *     
     */
    public TypeCtCurLinkType getLinkType() {
        return linkType;
    }

    /**
     * Sets the value of the linkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCtCurLinkType }
     *     
     */
    public void setLinkType(TypeCtCurLinkType value) {
        this.linkType = value;
    }

    /**
     * Gets the value of the parentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * Sets the value of the parentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCode(String value) {
        this.parentCode = value;
    }

    /**
     * Gets the value of the lineValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineValue() {
        return lineValue;
    }

    /**
     * Sets the value of the lineValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineValue(BigDecimal value) {
        this.lineValue = value;
    }

    /**
     * Gets the value of the matchValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatchValue() {
        return matchValue;
    }

    /**
     * Sets the value of the matchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMatchValue(BigDecimal value) {
        this.matchValue = value;
    }

    /**
     * Gets the value of the matchFullValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatchFullValue() {
        return matchFullValue;
    }

    /**
     * Sets the value of the matchFullValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMatchFullValue(BigDecimal value) {
        this.matchFullValue = value;
    }

    /**
     * Gets the value of the discValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscValue() {
        return discValue;
    }

    /**
     * Sets the value of the discValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscValue(BigDecimal value) {
        this.discValue = value;
    }

    /**
     * Gets the value of the discFullValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscFullValue() {
        return discFullValue;
    }

    /**
     * Sets the value of the discFullValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscFullValue(BigDecimal value) {
        this.discFullValue = value;
    }

    /**
     * Gets the value of the discRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscRate() {
        return discRate;
    }

    /**
     * Sets the value of the discRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscRate(BigDecimal value) {
        this.discRate = value;
    }

    /**
     * Gets the value of the discFullRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscFullRate() {
        return discFullRate;
    }

    /**
     * Sets the value of the discFullRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscFullRate(BigDecimal value) {
        this.discFullRate = value;
    }

    /**
     * Gets the value of the validDiscRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidDiscRate() {
        return validDiscRate;
    }

    /**
     * Sets the value of the validDiscRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidDiscRate(Boolean value) {
        this.validDiscRate = value;
    }

    /**
     * Gets the value of the wOffValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWOffValue() {
        return wOffValue;
    }

    /**
     * Sets the value of the wOffValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWOffValue(BigDecimal value) {
        this.wOffValue = value;
    }

    /**
     * Gets the value of the wOffFullValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWOffFullValue() {
        return wOffFullValue;
    }

    /**
     * Sets the value of the wOffFullValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWOffFullValue(BigDecimal value) {
        this.wOffFullValue = value;
    }

    /**
     * Gets the value of the wOffRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWOffRate() {
        return wOffRate;
    }

    /**
     * Sets the value of the wOffRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWOffRate(BigDecimal value) {
        this.wOffRate = value;
    }

    /**
     * Gets the value of the wOffFullRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWOffFullRate() {
        return wOffFullRate;
    }

    /**
     * Sets the value of the wOffFullRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWOffFullRate(BigDecimal value) {
        this.wOffFullRate = value;
    }

    /**
     * Gets the value of the validWOffRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidWOffRate() {
        return validWOffRate;
    }

    /**
     * Sets the value of the validWOffRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidWOffRate(Boolean value) {
        this.validWOffRate = value;
    }

    /**
     * Gets the value of the remValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemValue() {
        return remValue;
    }

    /**
     * Sets the value of the remValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemValue(BigDecimal value) {
        this.remValue = value;
    }

    /**
     * Gets the value of the remFullValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemFullValue() {
        return remFullValue;
    }

    /**
     * Sets the value of the remFullValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemFullValue(BigDecimal value) {
        this.remFullValue = value;
    }

    /**
     * Gets the value of the partMatchRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartMatchRate() {
        return partMatchRate;
    }

    /**
     * Sets the value of the partMatchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartMatchRate(BigDecimal value) {
        this.partMatchRate = value;
    }

    /**
     * Gets the value of the partMatchFullRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartMatchFullRate() {
        return partMatchFullRate;
    }

    /**
     * Sets the value of the partMatchFullRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartMatchFullRate(BigDecimal value) {
        this.partMatchFullRate = value;
    }

    /**
     * Gets the value of the validPartMatchRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidPartMatchRate() {
        return validPartMatchRate;
    }

    /**
     * Sets the value of the validPartMatchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidPartMatchRate(Boolean value) {
        this.validPartMatchRate = value;
    }

}
