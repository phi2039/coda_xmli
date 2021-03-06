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
 * This element holds the contents of a summary parameter.
 * 
 * <p>Java class for AlertParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodaType" type="{http://www.coda.com/efinance/schemas/common}typeText"/&gt;
 *         &lt;element name="Value" type="{http://www.coda.com/efinance/schemas/common}typeParamValueText"/&gt;
 *         &lt;element name="Aggregate" type="{http://www.coda.com/efinance/schemas/common}typeBoolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertParameter", propOrder = {
    "codaType",
    "value",
    "aggregate"
})
public class AlertParameter
    implements Serializable
{

    @XmlElement(name = "CodaType", required = true)
    protected String codaType;
    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "Aggregate")
    protected boolean aggregate;

    /**
     * Gets the value of the codaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodaType() {
        return codaType;
    }

    /**
     * Sets the value of the codaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodaType(String value) {
        this.codaType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the aggregate property.
     * 
     */
    public boolean isAggregate() {
        return aggregate;
    }

    /**
     * Sets the value of the aggregate property.
     * 
     */
    public void setAggregate(boolean value) {
        this.aggregate = value;
    }

}
