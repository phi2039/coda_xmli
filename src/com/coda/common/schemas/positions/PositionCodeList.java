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
 * This element contains a list of position master codes.
 * 
 * <p>Java class for PositionCodeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionCodeList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodeList" type="{http://www.coda.com/common/schemas/positions}PositionCodeListCodeList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionCodeList", propOrder = {
    "codeList"
})
public class PositionCodeList
    implements Serializable
{

    @XmlElement(name = "CodeList", required = true)
    protected PositionCodeListCodeList codeList;

    /**
     * Gets the value of the codeList property.
     * 
     * @return
     *     possible object is
     *     {@link PositionCodeListCodeList }
     *     
     */
    public PositionCodeListCodeList getCodeList() {
        return codeList;
    }

    /**
     * Sets the value of the codeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionCodeListCodeList }
     *     
     */
    public void setCodeList(PositionCodeListCodeList value) {
        this.codeList = value;
    }

}