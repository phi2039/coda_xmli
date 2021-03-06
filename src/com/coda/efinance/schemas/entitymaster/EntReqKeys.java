//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:57 AM EST 
//


package com.coda.efinance.schemas.entitymaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains key information for requesting a number of entity masters from the database.
 * 
 * <p>Java class for entReqKeys complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entReqKeys"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxKeys" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WildKey" type="{http://www.coda.com/efinance/schemas/entitymaster}entSelKey"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entReqKeys", propOrder = {
    "maxKeys",
    "wildKey"
})
public class EntReqKeys
    implements Serializable
{

    @XmlElement(name = "MaxKeys")
    protected int maxKeys;
    @XmlElement(name = "WildKey", required = true)
    protected EntSelKey wildKey;

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
     * Gets the value of the wildKey property.
     * 
     * @return
     *     possible object is
     *     {@link EntSelKey }
     *     
     */
    public EntSelKey getWildKey() {
        return wildKey;
    }

    /**
     * Sets the value of the wildKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntSelKey }
     *     
     */
    public void setWildKey(EntSelKey value) {
        this.wildKey = value;
    }

}
