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
import javax.xml.bind.annotation.XmlType;


/**
 * This is an element key used when requesting a list of elements, as it incorporates a value for the maximum number of items to return. It also incorporates the company within which the element exists.
 * 
 * <p>Java class for elmReqFullKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elmReqFullKeys"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxKeys" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FullWildKey" type="{http://www.coda.com/efinance/schemas/elementmaster}elmFullKey"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elmReqFullKeys", propOrder = {
    "maxKeys",
    "fullWildKey"
})
public class ElmReqFullKeys
    implements Serializable
{

    @XmlElement(name = "MaxKeys")
    protected int maxKeys;
    @XmlElement(name = "FullWildKey", required = true)
    protected ElmFullKey fullWildKey;

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

}
