//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:45:22 AM EST 
//


package com.coda.efinance.schemas.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This element is a generic key for requesting a series of data items from the server. It consists of a company code, a code and the maximum number of items to be returned.
 * 
 * <p>Java class for ReqKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReqKeys"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxKeys" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Key" type="{http://www.coda.com/efinance/schemas/common}Key"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReqKeys", propOrder = {
    "maxKeys",
    "key"
})
@XmlSeeAlso({
    ReqKeysWithShortName.class
})
public class ReqKeys
    implements Serializable
{

    @XmlElement(name = "MaxKeys")
    protected int maxKeys;
    @XmlElement(name = "Key", required = true)
    protected Key key;

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

}
