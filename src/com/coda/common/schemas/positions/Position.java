//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:38 AM EST 
//


package com.coda.common.schemas.positions;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element contains details of a position master.
 * 
 * <p>Java class for Position complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Position"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.coda.com/efinance/schemas/common}typeCode"/&gt;
 *         &lt;element name="Name" type="{http://www.coda.com/efinance/schemas/common}typeName"/&gt;
 *         &lt;element name="ShortName" type="{http://www.coda.com/efinance/schemas/common}typeShortNameB"/&gt;
 *         &lt;element name="PositionMemberList" type="{http://www.coda.com/common/schemas/positions}PositionMemberList"/&gt;
 *         &lt;element name="AttributeList" type="{http://www.coda.com/common/schemas/positions}PositionAttributeList"/&gt;
 *         &lt;element name="AuthorisationLimitList" type="{http://www.coda.com/common/schemas/positions}AuthorisationLimitList"/&gt;
 *         &lt;element name="ReferenceCount" type="{http://www.coda.com/efinance/schemas/common}typeULongB" minOccurs="0"/&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position", propOrder = {
    "code",
    "name",
    "shortName",
    "positionMemberList",
    "attributeList",
    "authorisationLimitList",
    "referenceCount",
    "timeStamp"
})
public class Position
    implements Serializable
{

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ShortName", required = true)
    protected String shortName;
    @XmlElement(name = "PositionMemberList", required = true)
    protected PositionMemberList positionMemberList;
    @XmlElement(name = "AttributeList", required = true)
    protected PositionAttributeList attributeList;
    @XmlElement(name = "AuthorisationLimitList", required = true)
    protected AuthorisationLimitList authorisationLimitList;
    @XmlElement(name = "ReferenceCount")
    protected Integer referenceCount;
    @XmlElement(name = "TimeStamp")
    protected short timeStamp;

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
     * Gets the value of the positionMemberList property.
     * 
     * @return
     *     possible object is
     *     {@link PositionMemberList }
     *     
     */
    public PositionMemberList getPositionMemberList() {
        return positionMemberList;
    }

    /**
     * Sets the value of the positionMemberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionMemberList }
     *     
     */
    public void setPositionMemberList(PositionMemberList value) {
        this.positionMemberList = value;
    }

    /**
     * Gets the value of the attributeList property.
     * 
     * @return
     *     possible object is
     *     {@link PositionAttributeList }
     *     
     */
    public PositionAttributeList getAttributeList() {
        return attributeList;
    }

    /**
     * Sets the value of the attributeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionAttributeList }
     *     
     */
    public void setAttributeList(PositionAttributeList value) {
        this.attributeList = value;
    }

    /**
     * Gets the value of the authorisationLimitList property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationLimitList }
     *     
     */
    public AuthorisationLimitList getAuthorisationLimitList() {
        return authorisationLimitList;
    }

    /**
     * Sets the value of the authorisationLimitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationLimitList }
     *     
     */
    public void setAuthorisationLimitList(AuthorisationLimitList value) {
        this.authorisationLimitList = value;
    }

    /**
     * Gets the value of the referenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferenceCount() {
        return referenceCount;
    }

    /**
     * Sets the value of the referenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferenceCount(Integer value) {
        this.referenceCount = value;
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

}