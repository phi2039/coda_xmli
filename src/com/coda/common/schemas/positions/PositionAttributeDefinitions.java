//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:38 AM EST 
//


package com.coda.common.schemas.positions;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element contains lists of position attribute definitions.
 * 
 * <p>Java class for PositionAttributeDefinitions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionAttributeDefinitions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefinitionList" type="{http://www.coda.com/common/schemas/positions}PositionAttributeDefinitionList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionAttributeDefinitions", propOrder = {
    "definitionList"
})
public class PositionAttributeDefinitions
    implements Serializable
{

    @XmlElement(name = "DefinitionList", required = true)
    protected PositionAttributeDefinitionList definitionList;

    /**
     * Gets the value of the definitionList property.
     * 
     * @return
     *     possible object is
     *     {@link PositionAttributeDefinitionList }
     *     
     */
    public PositionAttributeDefinitionList getDefinitionList() {
        return definitionList;
    }

    /**
     * Sets the value of the definitionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionAttributeDefinitionList }
     *     
     */
    public void setDefinitionList(PositionAttributeDefinitionList value) {
        this.definitionList = value;
    }

}
