//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.common.schemas.attachment;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This element holds details of attachments.
 * 
 * <p>Java class for Attachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attachment"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt;
 *       &lt;attribute name="id" type="{http://www.coda.com/efinance/schemas/common}typeDbGuid" /&gt;
 *       &lt;attribute name="repositoryobjectid" type="{http://www.coda.com/efinance/schemas/common}typeDbGuid" /&gt;
 *       &lt;attribute name="ref" type="{http://www.coda.com/efinance/schemas/common}typeText" /&gt;
 *       &lt;attribute name="path" type="{http://www.coda.com/efinance/schemas/common}typeText" /&gt;
 *       &lt;attribute name="externalreference" type="{http://www.coda.com/efinance/schemas/common}typeTextAnyDbQuotes" /&gt;
 *       &lt;attribute name="filelastmodified" type="{http://www.coda.com/efinance/schemas/common}typePosixTime" /&gt;
 *       &lt;attribute name="filename" type="{http://www.coda.com/efinance/schemas/common}typeText" /&gt;
 *       &lt;attribute name="user" type="{http://www.coda.com/efinance/schemas/common}typeTextAnyUnlimited" /&gt;
 *       &lt;attribute name="added" type="{http://www.coda.com/efinance/schemas/common}typeHardTime" /&gt;
 *       &lt;attribute name="mimetype" type="{http://www.coda.com/efinance/schemas/common}typeText" /&gt;
 *       &lt;attribute name="product" type="{http://www.coda.com/efinance/schemas/common}typeText" /&gt;
 *       &lt;attribute name="thumbnail" type="{http://www.coda.com/efinance/schemas/common}typeTextAnyUnlimited" /&gt;
 *       &lt;attribute name="codametadata" type="{http://www.coda.com/efinance/schemas/common}typeNameTextValues" /&gt;
 *       &lt;attribute name="missing" type="{http://www.coda.com/efinance/schemas/common}typeBoolean" /&gt;
 *       &lt;attribute name="timestamp" use="required" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attachment", propOrder = {
    "value"
})
public class Attachment
    implements Serializable
{

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "id")
    protected BigDecimal id;
    @XmlAttribute(name = "repositoryobjectid")
    protected BigDecimal repositoryobjectid;
    @XmlAttribute(name = "ref")
    protected String ref;
    @XmlAttribute(name = "path")
    protected String path;
    @XmlAttribute(name = "externalreference")
    protected String externalreference;
    @XmlAttribute(name = "filelastmodified")
    protected XMLGregorianCalendar filelastmodified;
    @XmlAttribute(name = "filename")
    protected String filename;
    @XmlAttribute(name = "user")
    protected String user;
    @XmlAttribute(name = "added")
    protected XMLGregorianCalendar added;
    @XmlAttribute(name = "mimetype")
    protected String mimetype;
    @XmlAttribute(name = "product")
    protected String product;
    @XmlAttribute(name = "thumbnail")
    protected String thumbnail;
    @XmlAttribute(name = "codametadata")
    protected String codametadata;
    @XmlAttribute(name = "missing")
    protected Boolean missing;
    @XmlAttribute(name = "timestamp", required = true)
    protected short timestamp;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the repositoryobjectid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepositoryobjectid() {
        return repositoryobjectid;
    }

    /**
     * Sets the value of the repositoryobjectid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepositoryobjectid(BigDecimal value) {
        this.repositoryobjectid = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the externalreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalreference() {
        return externalreference;
    }

    /**
     * Sets the value of the externalreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalreference(String value) {
        this.externalreference = value;
    }

    /**
     * Gets the value of the filelastmodified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilelastmodified() {
        return filelastmodified;
    }

    /**
     * Sets the value of the filelastmodified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilelastmodified(XMLGregorianCalendar value) {
        this.filelastmodified = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
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

    /**
     * Gets the value of the added property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdded() {
        return added;
    }

    /**
     * Sets the value of the added property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdded(XMLGregorianCalendar value) {
        this.added = value;
    }

    /**
     * Gets the value of the mimetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimetype() {
        return mimetype;
    }

    /**
     * Sets the value of the mimetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimetype(String value) {
        this.mimetype = value;
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
     * Gets the value of the thumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * Sets the value of the thumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnail(String value) {
        this.thumbnail = value;
    }

    /**
     * Gets the value of the codametadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodametadata() {
        return codametadata;
    }

    /**
     * Sets the value of the codametadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodametadata(String value) {
        this.codametadata = value;
    }

    /**
     * Gets the value of the missing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMissing() {
        return missing;
    }

    /**
     * Sets the value of the missing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMissing(Boolean value) {
        this.missing = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     */
    public short getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     */
    public void setTimestamp(short value) {
        this.timestamp = value;
    }

}
