//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.common.schemas.attachment;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AttachmentOwnership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentOwnership"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessObjectKey" type="{http://www.coda.com/efinance/schemas/common}typeBusinessObjectKey"/&gt;
 *         &lt;element name="Site" type="{http://www.coda.com/efinance/schemas/common}typeName"/&gt;
 *         &lt;element name="Product" type="{http://www.coda.com/efinance/schemas/common}typeApplicationName"/&gt;
 *         &lt;element name="CodaUser" type="{http://www.coda.com/efinance/schemas/common}typeCode"/&gt;
 *         &lt;element name="AddedDate" type="{http://www.coda.com/efinance/schemas/common}typeHard"/&gt;
 *         &lt;element name="AddedTime" type="{http://www.coda.com/efinance/schemas/common}typeDbTimeOfDay"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentOwnership", propOrder = {
    "businessObjectKey",
    "site",
    "product",
    "codaUser",
    "addedDate",
    "addedTime"
})
public class AttachmentOwnership
    implements Serializable
{

    @XmlElement(name = "BusinessObjectKey", required = true)
    protected String businessObjectKey;
    @XmlElement(name = "Site", required = true)
    protected String site;
    @XmlElement(name = "Product", required = true)
    protected String product;
    @XmlElement(name = "CodaUser", required = true)
    protected String codaUser;
    @XmlElement(name = "AddedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar addedDate;
    @XmlElement(name = "AddedTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar addedTime;

    /**
     * Gets the value of the businessObjectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessObjectKey() {
        return businessObjectKey;
    }

    /**
     * Sets the value of the businessObjectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessObjectKey(String value) {
        this.businessObjectKey = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the codaUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodaUser() {
        return codaUser;
    }

    /**
     * Sets the value of the codaUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodaUser(String value) {
        this.codaUser = value;
    }

    /**
     * Gets the value of the addedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAddedDate() {
        return addedDate;
    }

    /**
     * Sets the value of the addedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAddedDate(XMLGregorianCalendar value) {
        this.addedDate = value;
    }

    /**
     * Gets the value of the addedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAddedTime() {
        return addedTime;
    }

    /**
     * Sets the value of the addedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAddedTime(XMLGregorianCalendar value) {
        this.addedTime = value;
    }

}
