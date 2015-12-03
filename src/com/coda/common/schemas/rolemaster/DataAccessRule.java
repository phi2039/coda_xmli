//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:24 AM EST 
//


package com.coda.common.schemas.rolemaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.TypeDataAccess;


/**
 * Reserved for future use.
 * 
 * <p>Java class for DataAccessRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataAccessRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RuleType" type="{http://www.coda.com/efinance/schemas/common}typeApplicationName"/&gt;
 *         &lt;element name="AccessAllowed" type="{http://www.coda.com/efinance/schemas/common}typeDataAccess"/&gt;
 *         &lt;element name="DataType" type="{http://www.coda.com/efinance/schemas/common}typeOneofnIdentifier"/&gt;
 *         &lt;element name="Rule" type="{http://www.coda.com/efinance/schemas/common}typeText"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataAccessRule", propOrder = {
    "ruleType",
    "accessAllowed",
    "dataType",
    "rule"
})
public class DataAccessRule
    implements Serializable
{

    @XmlElement(name = "RuleType", required = true)
    protected String ruleType;
    @XmlElement(name = "AccessAllowed", required = true)
    @XmlSchemaType(name = "string")
    protected TypeDataAccess accessAllowed;
    @XmlElement(name = "DataType", required = true)
    protected String dataType;
    @XmlElement(name = "Rule", required = true)
    protected String rule;

    /**
     * Gets the value of the ruleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * Sets the value of the ruleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleType(String value) {
        this.ruleType = value;
    }

    /**
     * Gets the value of the accessAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDataAccess }
     *     
     */
    public TypeDataAccess getAccessAllowed() {
        return accessAllowed;
    }

    /**
     * Sets the value of the accessAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDataAccess }
     *     
     */
    public void setAccessAllowed(TypeDataAccess value) {
        this.accessAllowed = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

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

}