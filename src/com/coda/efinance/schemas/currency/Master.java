//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:12 AM EST 
//


package com.coda.efinance.schemas.currency;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.coda.efinance.schemas.common.TypeCtAfterBefore;
import com.coda.efinance.schemas.common.TypeCtCurLinkType;
import com.coda.efinance.schemas.common.TypeCtCurRateControl;


/**
 * <p>Java class for Master complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Master"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CmpCode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="Code" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="Name" type="{http://www.coda.com/efinance/schemas/common}typeName"/&gt;
 *         &lt;element name="ShortName" type="{http://www.coda.com/efinance/schemas/common}typeShortNameB"/&gt;
 *         &lt;element name="SingularUnits" type="{http://www.coda.com/efinance/schemas/common}typeCurrName"/&gt;
 *         &lt;element name="SingularDecimals" type="{http://www.coda.com/efinance/schemas/common}typeCurrNameB"/&gt;
 *         &lt;element name="PluralUnits" type="{http://www.coda.com/efinance/schemas/common}typeCurrName"/&gt;
 *         &lt;element name="PluralDecimals" type="{http://www.coda.com/efinance/schemas/common}typeCurrNameB"/&gt;
 *         &lt;element name="AbbreviatedUnits" type="{http://www.coda.com/efinance/schemas/common}typeCurrSymbol"/&gt;
 *         &lt;element name="AbbreviatedDecimals" type="{http://www.coda.com/efinance/schemas/common}typeCurrSymbolB"/&gt;
 *         &lt;element name="SymbolPos" type="{http://www.coda.com/efinance/schemas/common}typeCtAfterBefore"/&gt;
 *         &lt;element name="CurRateControl" type="{http://www.coda.com/efinance/schemas/common}typeCtCurRateControl"/&gt;
 *         &lt;element name="SelfBalancing" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NumberOfDecimals" type="{http://www.coda.com/efinance/schemas/common}typeDecPlace"/&gt;
 *         &lt;element name="Postings" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LinkType" type="{http://www.coda.com/efinance/schemas/common}typeCtCurLinkType"/&gt;
 *         &lt;element name="LinkDate" type="{http://www.coda.com/efinance/schemas/common}typeDateB" minOccurs="0"/&gt;
 *         &lt;element name="Shared" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CreateDate" type="{http://www.coda.com/efinance/schemas/common}typeDateB" minOccurs="0"/&gt;
 *         &lt;element name="ModifyDate" type="{http://www.coda.com/efinance/schemas/common}typeDateB" minOccurs="0"/&gt;
 *         &lt;element name="User" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Master", propOrder = {
    "timeStamp",
    "cmpCode",
    "code",
    "name",
    "shortName",
    "singularUnits",
    "singularDecimals",
    "pluralUnits",
    "pluralDecimals",
    "abbreviatedUnits",
    "abbreviatedDecimals",
    "symbolPos",
    "curRateControl",
    "selfBalancing",
    "numberOfDecimals",
    "postings",
    "linkType",
    "linkDate",
    "shared",
    "createDate",
    "modifyDate",
    "user"
})
@XmlSeeAlso({
    Currency.class
})
public abstract class Master
    implements Serializable
{

    @XmlElement(name = "TimeStamp")
    protected short timeStamp;
    @XmlElement(name = "CmpCode", required = true)
    protected String cmpCode;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ShortName", required = true)
    protected String shortName;
    @XmlElement(name = "SingularUnits", required = true)
    protected String singularUnits;
    @XmlElement(name = "SingularDecimals", required = true)
    protected String singularDecimals;
    @XmlElement(name = "PluralUnits", required = true)
    protected String pluralUnits;
    @XmlElement(name = "PluralDecimals", required = true)
    protected String pluralDecimals;
    @XmlElement(name = "AbbreviatedUnits", required = true)
    protected String abbreviatedUnits;
    @XmlElement(name = "AbbreviatedDecimals", required = true)
    protected String abbreviatedDecimals;
    @XmlElement(name = "SymbolPos", required = true)
    @XmlSchemaType(name = "string")
    protected TypeCtAfterBefore symbolPos;
    @XmlElement(name = "CurRateControl", required = true)
    @XmlSchemaType(name = "string")
    protected TypeCtCurRateControl curRateControl;
    @XmlElement(name = "SelfBalancing")
    protected boolean selfBalancing;
    @XmlElement(name = "NumberOfDecimals")
    protected short numberOfDecimals;
    @XmlElement(name = "Postings")
    protected boolean postings;
    @XmlElement(name = "LinkType", required = true)
    @XmlSchemaType(name = "string")
    protected TypeCtCurLinkType linkType;
    @XmlElement(name = "LinkDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar linkDate;
    @XmlElement(name = "Shared")
    protected boolean shared;
    @XmlElement(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "ModifyDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyDate;
    @XmlElement(name = "User")
    protected String user;

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
     * Gets the value of the singularUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingularUnits() {
        return singularUnits;
    }

    /**
     * Sets the value of the singularUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingularUnits(String value) {
        this.singularUnits = value;
    }

    /**
     * Gets the value of the singularDecimals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingularDecimals() {
        return singularDecimals;
    }

    /**
     * Sets the value of the singularDecimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingularDecimals(String value) {
        this.singularDecimals = value;
    }

    /**
     * Gets the value of the pluralUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluralUnits() {
        return pluralUnits;
    }

    /**
     * Sets the value of the pluralUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluralUnits(String value) {
        this.pluralUnits = value;
    }

    /**
     * Gets the value of the pluralDecimals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluralDecimals() {
        return pluralDecimals;
    }

    /**
     * Sets the value of the pluralDecimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluralDecimals(String value) {
        this.pluralDecimals = value;
    }

    /**
     * Gets the value of the abbreviatedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviatedUnits() {
        return abbreviatedUnits;
    }

    /**
     * Sets the value of the abbreviatedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviatedUnits(String value) {
        this.abbreviatedUnits = value;
    }

    /**
     * Gets the value of the abbreviatedDecimals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviatedDecimals() {
        return abbreviatedDecimals;
    }

    /**
     * Sets the value of the abbreviatedDecimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviatedDecimals(String value) {
        this.abbreviatedDecimals = value;
    }

    /**
     * Gets the value of the symbolPos property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCtAfterBefore }
     *     
     */
    public TypeCtAfterBefore getSymbolPos() {
        return symbolPos;
    }

    /**
     * Sets the value of the symbolPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCtAfterBefore }
     *     
     */
    public void setSymbolPos(TypeCtAfterBefore value) {
        this.symbolPos = value;
    }

    /**
     * Gets the value of the curRateControl property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCtCurRateControl }
     *     
     */
    public TypeCtCurRateControl getCurRateControl() {
        return curRateControl;
    }

    /**
     * Sets the value of the curRateControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCtCurRateControl }
     *     
     */
    public void setCurRateControl(TypeCtCurRateControl value) {
        this.curRateControl = value;
    }

    /**
     * Gets the value of the selfBalancing property.
     * 
     */
    public boolean isSelfBalancing() {
        return selfBalancing;
    }

    /**
     * Sets the value of the selfBalancing property.
     * 
     */
    public void setSelfBalancing(boolean value) {
        this.selfBalancing = value;
    }

    /**
     * Gets the value of the numberOfDecimals property.
     * 
     */
    public short getNumberOfDecimals() {
        return numberOfDecimals;
    }

    /**
     * Sets the value of the numberOfDecimals property.
     * 
     */
    public void setNumberOfDecimals(short value) {
        this.numberOfDecimals = value;
    }

    /**
     * Gets the value of the postings property.
     * 
     */
    public boolean isPostings() {
        return postings;
    }

    /**
     * Sets the value of the postings property.
     * 
     */
    public void setPostings(boolean value) {
        this.postings = value;
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
     * Gets the value of the linkDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLinkDate() {
        return linkDate;
    }

    /**
     * Sets the value of the linkDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLinkDate(XMLGregorianCalendar value) {
        this.linkDate = value;
    }

    /**
     * Gets the value of the shared property.
     * 
     */
    public boolean isShared() {
        return shared;
    }

    /**
     * Sets the value of the shared property.
     * 
     */
    public void setShared(boolean value) {
        this.shared = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the value of the modifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifyDate(XMLGregorianCalendar value) {
        this.modifyDate = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}