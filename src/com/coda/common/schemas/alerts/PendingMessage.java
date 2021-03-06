//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:38 AM EST 
//


package com.coda.common.schemas.alerts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PendingMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImmediateList" type="{http://www.coda.com/common/schemas/alerts}PendingMessageImmediateList"/&gt;
 *         &lt;element name="NormalList" type="{http://www.coda.com/common/schemas/alerts}PendingMessageNormalList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingMessage", propOrder = {
    "immediateList",
    "normalList"
})
public class PendingMessage
    implements Serializable
{

    @XmlElement(name = "ImmediateList", required = true)
    protected PendingMessageImmediateList immediateList;
    @XmlElement(name = "NormalList", required = true)
    protected PendingMessageNormalList normalList;

    /**
     * Gets the value of the immediateList property.
     * 
     * @return
     *     possible object is
     *     {@link PendingMessageImmediateList }
     *     
     */
    public PendingMessageImmediateList getImmediateList() {
        return immediateList;
    }

    /**
     * Sets the value of the immediateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingMessageImmediateList }
     *     
     */
    public void setImmediateList(PendingMessageImmediateList value) {
        this.immediateList = value;
    }

    /**
     * Gets the value of the normalList property.
     * 
     * @return
     *     possible object is
     *     {@link PendingMessageNormalList }
     *     
     */
    public PendingMessageNormalList getNormalList() {
        return normalList;
    }

    /**
     * Sets the value of the normalList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingMessageNormalList }
     *     
     */
    public void setNormalList(PendingMessageNormalList value) {
        this.normalList = value;
    }

}
