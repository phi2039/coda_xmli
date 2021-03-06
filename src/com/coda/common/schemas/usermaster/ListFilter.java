//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:53 AM EST 
//


package com.coda.common.schemas.usermaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A filter that selects the user masters to be listed.
 * 
 * <p>Java class for ListFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}ListFilter"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FrameworkCode" type="{http://www.coda.com/efinance/schemas/common}typeUserCode" minOccurs="0"/&gt;
 *         &lt;element name="MinPasswdExpdate" type="{http://www.coda.com/efinance/schemas/common}typeDate" minOccurs="0"/&gt;
 *         &lt;element name="MaxPasswdExpdate" type="{http://www.coda.com/efinance/schemas/common}typeDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListFilter", propOrder = {
    "frameworkCode",
    "minPasswdExpdate",
    "maxPasswdExpdate"
})
public class ListFilter
    extends com.coda.efinance.schemas.common.ListFilter
    implements Serializable
{

    @XmlElement(name = "FrameworkCode")
    protected String frameworkCode;
    @XmlElement(name = "MinPasswdExpdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar minPasswdExpdate;
    @XmlElement(name = "MaxPasswdExpdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar maxPasswdExpdate;

    /**
     * Gets the value of the frameworkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameworkCode() {
        return frameworkCode;
    }

    /**
     * Sets the value of the frameworkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameworkCode(String value) {
        this.frameworkCode = value;
    }

    /**
     * Gets the value of the minPasswdExpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinPasswdExpdate() {
        return minPasswdExpdate;
    }

    /**
     * Sets the value of the minPasswdExpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinPasswdExpdate(XMLGregorianCalendar value) {
        this.minPasswdExpdate = value;
    }

    /**
     * Gets the value of the maxPasswdExpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaxPasswdExpdate() {
        return maxPasswdExpdate;
    }

    /**
     * Sets the value of the maxPasswdExpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaxPasswdExpdate(XMLGregorianCalendar value) {
        this.maxPasswdExpdate = value;
    }

}
