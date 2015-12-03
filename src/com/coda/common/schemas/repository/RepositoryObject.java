//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.common.schemas.repository;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepositoryObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepositoryObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.coda.com/efinance/schemas/common}typeDbGuid"/&gt;
 *         &lt;element name="Parent" type="{http://www.coda.com/common/schemas/repository}RepositoryObjectKey" minOccurs="0"/&gt;
 *         &lt;element name="MetadataList" type="{http://www.coda.com/common/schemas/repository}MetadataItemList"/&gt;
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
@XmlType(name = "RepositoryObject", propOrder = {
    "id",
    "parent",
    "metadataList",
    "timeStamp"
})
public class RepositoryObject
    implements Serializable
{

    @XmlElement(name = "Id", required = true)
    protected BigDecimal id;
    @XmlElement(name = "Parent")
    protected RepositoryObjectKey parent;
    @XmlElement(name = "MetadataList", required = true)
    protected MetadataItemList metadataList;
    @XmlElement(name = "TimeStamp")
    protected short timeStamp;

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
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryObjectKey }
     *     
     */
    public RepositoryObjectKey getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryObjectKey }
     *     
     */
    public void setParent(RepositoryObjectKey value) {
        this.parent = value;
    }

    /**
     * Gets the value of the metadataList property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataItemList }
     *     
     */
    public MetadataItemList getMetadataList() {
        return metadataList;
    }

    /**
     * Sets the value of the metadataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataItemList }
     *     
     */
    public void setMetadataList(MetadataItemList value) {
        this.metadataList = value;
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
