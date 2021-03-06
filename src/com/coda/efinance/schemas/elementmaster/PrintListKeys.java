//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:25 AM EST 
//


package com.coda.efinance.schemas.elementmaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PrintListKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrintListKeys"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxKeys" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FullWildKey" type="{http://www.coda.com/efinance/schemas/elementmaster}elmFullKey"/&gt;
 *         &lt;element name="LastModifiedFrom" type="{http://www.coda.com/efinance/schemas/common}typeDateB" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedTo" type="{http://www.coda.com/efinance/schemas/common}typeDateB" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintListKeys", propOrder = {
    "maxKeys",
    "fullWildKey",
    "lastModifiedFrom",
    "lastModifiedTo"
})
public class PrintListKeys
    implements Serializable
{

    @XmlElement(name = "MaxKeys")
    protected int maxKeys;
    @XmlElement(name = "FullWildKey", required = true)
    protected ElmFullKey fullWildKey;
    @XmlElement(name = "LastModifiedFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedFrom;
    @XmlElement(name = "LastModifiedTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedTo;

    /**
     * Gets the value of the maxKeys property.
     * 
     */
    public int getMaxKeys() {
        return maxKeys;
    }

    /**
     * Sets the value of the maxKeys property.
     * 
     */
    public void setMaxKeys(int value) {
        this.maxKeys = value;
    }

    /**
     * Gets the value of the fullWildKey property.
     * 
     * @return
     *     possible object is
     *     {@link ElmFullKey }
     *     
     */
    public ElmFullKey getFullWildKey() {
        return fullWildKey;
    }

    /**
     * Sets the value of the fullWildKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElmFullKey }
     *     
     */
    public void setFullWildKey(ElmFullKey value) {
        this.fullWildKey = value;
    }

    /**
     * Gets the value of the lastModifiedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedFrom() {
        return lastModifiedFrom;
    }

    /**
     * Sets the value of the lastModifiedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedFrom(XMLGregorianCalendar value) {
        this.lastModifiedFrom = value;
    }

    /**
     * Gets the value of the lastModifiedTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedTo() {
        return lastModifiedTo;
    }

    /**
     * Sets the value of the lastModifiedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedTo(XMLGregorianCalendar value) {
        this.lastModifiedTo = value;
    }

}
