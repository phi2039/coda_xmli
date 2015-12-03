//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.efinance.schemas.selectormaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This element contains requirements for the selector masters to be printed.
 * 
 * <p>Java class for PrintReqKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrintReqKeys"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/selectormaster}ReqKeys"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastModifiedFrom" type="{http://www.coda.com/efinance/schemas/common}typeDateB" minOccurs="0"/&gt;
 *         &lt;element name="LastModifiedTo" type="{http://www.coda.com/efinance/schemas/common}typeDateB" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrintReqKeys", propOrder = {
    "lastModifiedFrom",
    "lastModifiedTo"
})
public class PrintReqKeys
    extends ReqKeys
    implements Serializable
{

    @XmlElement(name = "LastModifiedFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedFrom;
    @XmlElement(name = "LastModifiedTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedTo;

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
