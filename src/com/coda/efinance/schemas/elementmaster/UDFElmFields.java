//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:25 AM EST 
//


package com.coda.efinance.schemas.elementmaster;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element contains user-defined element fields.
 * 
 * <p>Java class for UDFElmFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UDFElmFields"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UDFElm" type="{http://www.coda.com/efinance/schemas/elementmaster}UDFElmField" maxOccurs="12" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UDFElmFields", propOrder = {
    "udfElm"
})
public class UDFElmFields
    implements Serializable
{

    @XmlElement(name = "UDFElm")
    protected List<UDFElmField> udfElm;

    /**
     * Gets the value of the udfElm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udfElm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFElm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFElmField }
     * 
     * 
     */
    public List<UDFElmField> getUDFElm() {
        if (udfElm == null) {
            udfElm = new ArrayList<UDFElmField>();
        }
        return this.udfElm;
    }

}
