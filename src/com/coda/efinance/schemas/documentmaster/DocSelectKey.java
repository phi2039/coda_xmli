//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:37 AM EST 
//


package com.coda.efinance.schemas.documentmaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.Key;


/**
 * This is a document key used when requesting a list of documents. It incorporates a value for the maximum number of items to return, the document's short name, and flags to specify whether the search is restricted to InterCompany and/or cancelling documents only.
 * 
 * <p>Java class for docSelectKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="docSelectKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxKeys" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Key" type="{http://www.coda.com/efinance/schemas/common}Key"/&gt;
 *         &lt;element name="ShortName" type="{http://www.coda.com/efinance/schemas/common}typeShortNameB" minOccurs="0"/&gt;
 *         &lt;element name="OnlyIntercompany" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OnlyCancelling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableMasterSecurityFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExcludeReservedDocs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OnlySalesInvoiceReservedDocs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "docSelectKey", propOrder = {
    "maxKeys",
    "key",
    "shortName",
    "onlyIntercompany",
    "onlyCancelling",
    "enableMasterSecurityFilter",
    "excludeReservedDocs",
    "onlySalesInvoiceReservedDocs"
})
@XmlSeeAlso({
    PrintDocSelectKey.class
})
public class DocSelectKey
    implements Serializable
{

    @XmlElement(name = "MaxKeys")
    protected int maxKeys;
    @XmlElement(name = "Key", required = true)
    protected Key key;
    @XmlElement(name = "ShortName")
    protected String shortName;
    @XmlElement(name = "OnlyIntercompany")
    protected Boolean onlyIntercompany;
    @XmlElement(name = "OnlyCancelling")
    protected Boolean onlyCancelling;
    @XmlElement(name = "EnableMasterSecurityFilter")
    protected Boolean enableMasterSecurityFilter;
    @XmlElement(name = "ExcludeReservedDocs")
    protected Boolean excludeReservedDocs;
    @XmlElement(name = "OnlySalesInvoiceReservedDocs")
    protected Boolean onlySalesInvoiceReservedDocs;

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
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link Key }
     *     
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link Key }
     *     
     */
    public void setKey(Key value) {
        this.key = value;
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
     * Gets the value of the onlyIntercompany property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyIntercompany() {
        return onlyIntercompany;
    }

    /**
     * Sets the value of the onlyIntercompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyIntercompany(Boolean value) {
        this.onlyIntercompany = value;
    }

    /**
     * Gets the value of the onlyCancelling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyCancelling() {
        return onlyCancelling;
    }

    /**
     * Sets the value of the onlyCancelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyCancelling(Boolean value) {
        this.onlyCancelling = value;
    }

    /**
     * Gets the value of the enableMasterSecurityFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableMasterSecurityFilter() {
        return enableMasterSecurityFilter;
    }

    /**
     * Sets the value of the enableMasterSecurityFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableMasterSecurityFilter(Boolean value) {
        this.enableMasterSecurityFilter = value;
    }

    /**
     * Gets the value of the excludeReservedDocs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeReservedDocs() {
        return excludeReservedDocs;
    }

    /**
     * Sets the value of the excludeReservedDocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeReservedDocs(Boolean value) {
        this.excludeReservedDocs = value;
    }

    /**
     * Gets the value of the onlySalesInvoiceReservedDocs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlySalesInvoiceReservedDocs() {
        return onlySalesInvoiceReservedDocs;
    }

    /**
     * Sets the value of the onlySalesInvoiceReservedDocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlySalesInvoiceReservedDocs(Boolean value) {
        this.onlySalesInvoiceReservedDocs = value;
    }

}