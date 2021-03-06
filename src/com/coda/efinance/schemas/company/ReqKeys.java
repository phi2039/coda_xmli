//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:06 AM EST 
//


package com.coda.efinance.schemas.company;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.GlobalKey;


/**
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
 *         &lt;element name="WildKey" type="{http://www.coda.com/efinance/schemas/common}GlobalKey"/&gt;
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
    "wildKey"
})
@XmlSeeAlso({
    PrintListKeys.class
})
public class ReqKeys
    implements Serializable
{

    @XmlElement(name = "MaxKeys")
    protected int maxKeys;
    @XmlElement(name = "WildKey", required = true)
    protected GlobalKey wildKey;

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
     *     {@link GlobalKey }
     *     
     */
    public GlobalKey getWildKey() {
        return wildKey;
    }

    /**
     * Sets the value of the wildKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalKey }
     *     
     */
    public void setWildKey(GlobalKey value) {
        this.wildKey = value;
    }

}
