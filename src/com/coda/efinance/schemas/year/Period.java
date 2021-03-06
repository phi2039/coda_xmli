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
 * This element holds the information for a period within a year.
 * 
 * <p>Java class for Period complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Period"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PeriodNum" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="Sec1" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="Sec2" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="Sec3" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period", propOrder = {
    "periodNum",
    "summary",
    "sec1",
    "sec2",
    "sec3",
    "endDate"
})
public class Period
    implements Serializable
{

    @XmlElement(name = "PeriodNum")
    protected short periodNum;
    @XmlElement(name = "Summary")
    protected byte summary;
    @XmlElement(name = "Sec1")
    protected byte sec1;
    @XmlElement(name = "Sec2")
    protected byte sec2;
    @XmlElement(name = "Sec3")
    protected byte sec3;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the periodNum property.
     * 
     */
    public short getPeriodNum() {
        return periodNum;
    }

    /**
     * Sets the value of the periodNum property.
     * 
     */
    public void setPeriodNum(short value) {
        this.periodNum = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     */
    public byte getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     */
    public void setSummary(byte value) {
        this.summary = value;
    }

    /**
     * Gets the value of the sec1 property.
     * 
     */
    public byte getSec1() {
        return sec1;
    }

    /**
     * Sets the value of the sec1 property.
     * 
     */
    public void setSec1(byte value) {
        this.sec1 = value;
    }

    /**
     * Gets the value of the sec2 property.
     * 
     */
    public byte getSec2() {
        return sec2;
    }

    /**
     * Sets the value of the sec2 property.
     * 
     */
    public void setSec2(byte value) {
        this.sec2 = value;
    }

    /**
     * Gets the value of the sec3 property.
     * 
     */
    public byte getSec3() {
        return sec3;
    }

    /**
     * Sets the value of the sec3 property.
     * 
     */
    public void setSec3(byte value) {
        this.sec3 = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

}
