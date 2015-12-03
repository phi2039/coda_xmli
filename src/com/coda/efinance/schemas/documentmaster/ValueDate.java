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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.TypeCtModValDate;


/**
 * <p>Java class for ValueDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rule" type="{http://www.coda.com/efinance/schemas/common}typeTermB" minOccurs="0"/&gt;
 *         &lt;element name="Modifiable" type="{http://www.coda.com/efinance/schemas/common}typeCtModValDate"/&gt;
 *         &lt;element name="DocumentWide" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueDate", propOrder = {
    "rule",
    "modifiable",
    "documentWide"
})
public class ValueDate
    implements Serializable
{

    @XmlElement(name = "Rule")
    protected String rule;
    @XmlElement(name = "Modifiable", required = true)
    @XmlSchemaType(name = "string")
    protected TypeCtModValDate modifiable;
    @XmlElement(name = "DocumentWide")
    protected boolean documentWide;

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRule(String value) {
        this.rule = value;
    }

    /**
     * Gets the value of the modifiable property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCtModValDate }
     *     
     */
    public TypeCtModValDate getModifiable() {
        return modifiable;
    }

    /**
     * Sets the value of the modifiable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCtModValDate }
     *     
     */
    public void setModifiable(TypeCtModValDate value) {
        this.modifiable = value;
    }

    /**
     * Gets the value of the documentWide property.
     * 
     */
    public boolean isDocumentWide() {
        return documentWide;
    }

    /**
     * Sets the value of the documentWide property.
     * 
     */
    public void setDocumentWide(boolean value) {
        this.documentWide = value;
    }

}
