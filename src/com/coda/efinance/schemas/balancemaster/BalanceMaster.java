//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:31 AM EST 
//


package com.coda.efinance.schemas.balancemaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element holds a balance master.
 * 
 * <p>Java class for BalanceMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceMaster"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CmpCode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Code" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="Name" type="{http://www.coda.com/efinance/schemas/common}typeName"/&gt;
 *         &lt;element name="ShortName" type="{http://www.coda.com/efinance/schemas/common}typeShortNameB"/&gt;
 *         &lt;element name="CODAMaintained" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DecimalPlaces" type="{http://www.coda.com/efinance/schemas/common}typeDecPlace"/&gt;
 *         &lt;element name="BalMaintainedByCommitments" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceMaster", propOrder = {
    "cmpCode",
    "timeStamp",
    "code",
    "name",
    "shortName",
    "codaMaintained",
    "decimalPlaces",
    "balMaintainedByCommitments"
})
public class BalanceMaster
    implements Serializable
{

    @XmlElement(name = "CmpCode", required = true)
    protected String cmpCode;
    @XmlElement(name = "TimeStamp")
    protected short timeStamp;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ShortName", required = true)
    protected String shortName;
    @XmlElement(name = "CODAMaintained")
    protected boolean codaMaintained;
    @XmlElement(name = "DecimalPlaces")
    protected short decimalPlaces;
    @XmlElement(name = "BalMaintainedByCommitments")
    protected boolean balMaintainedByCommitments;

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
     * Gets the value of the timeStamp property.
     * 
     */
    public short getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     */
    public void setTimeStamp(short value) {
        this.timeStamp = value;
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
     * Gets the value of the codaMaintained property.
     * 
     */
    public boolean isCODAMaintained() {
        return codaMaintained;
    }

    /**
     * Sets the value of the codaMaintained property.
     * 
     */
    public void setCODAMaintained(boolean value) {
        this.codaMaintained = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     */
    public short getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     */
    public void setDecimalPlaces(short value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the balMaintainedByCommitments property.
     * 
     */
    public boolean isBalMaintainedByCommitments() {
        return balMaintainedByCommitments;
    }

    /**
     * Sets the value of the balMaintainedByCommitments property.
     * 
     */
    public void setBalMaintainedByCommitments(boolean value) {
        this.balMaintainedByCommitments = value;
    }

}
