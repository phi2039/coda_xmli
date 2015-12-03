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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This element holds the base properties for a year within a company.
 * 
 * <p>Java class for Master complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Master"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CmpCode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="Year" type="{http://www.coda.com/efinance/schemas/common}typeYear"/&gt;
 *         &lt;element name="TimeStamp" type="{http://www.coda.com/efinance/schemas/common}typeWord"/&gt;
 *         &lt;element name="Name" type="{http://www.coda.com/efinance/schemas/common}typeName"/&gt;
 *         &lt;element name="ShortName" type="{http://www.coda.com/efinance/schemas/common}typeShortNameB"/&gt;
 *         &lt;element name="Interval" type="{http://www.coda.com/efinance/schemas/year}typeCtYearPeriodEndInterval"/&gt;
 *         &lt;element name="NumDays" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="FirstYearDate" type="{http://www.coda.com/efinance/schemas/common}typeDate"/&gt;
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
    "cmpCode",
    "year",
    "timeStamp",
    "name",
    "shortName",
    "interval",
    "numDays",
    "firstYearDate"
})
public class Master
    implements Serializable
{

    @XmlElement(name = "CmpCode", required = true)
    protected String cmpCode;
    @XmlElement(name = "Year", required = true)
    protected String year;
    @XmlElement(name = "TimeStamp")
    protected short timeStamp;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ShortName", required = true)
    protected String shortName;
    @XmlElement(name = "Interval", required = true)
    @XmlSchemaType(name = "string")
    protected TypeCtYearPeriodEndInterval interval;
    @XmlElement(name = "NumDays")
    protected short numDays;
    @XmlElement(name = "FirstYearDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstYearDate;

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
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
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
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCtYearPeriodEndInterval }
     *     
     */
    public TypeCtYearPeriodEndInterval getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCtYearPeriodEndInterval }
     *     
     */
    public void setInterval(TypeCtYearPeriodEndInterval value) {
        this.interval = value;
    }

    /**
     * Gets the value of the numDays property.
     * 
     */
    public short getNumDays() {
        return numDays;
    }

    /**
     * Sets the value of the numDays property.
     * 
     */
    public void setNumDays(short value) {
        this.numDays = value;
    }

    /**
     * Gets the value of the firstYearDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstYearDate() {
        return firstYearDate;
    }

    /**
     * Sets the value of the firstYearDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstYearDate(XMLGregorianCalendar value) {
        this.firstYearDate = value;
    }

}
