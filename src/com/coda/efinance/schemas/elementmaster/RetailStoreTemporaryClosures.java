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
 * This element contains details of store closure periods.
 * 
 * <p>Java class for RetailStoreTemporaryClosures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailStoreTemporaryClosures"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Closure" type="{http://www.coda.com/efinance/schemas/elementmaster}RetailStoreTemporaryClosure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailStoreTemporaryClosures", propOrder = {
    "closure"
})
public class RetailStoreTemporaryClosures
    implements Serializable
{

    @XmlElement(name = "Closure")
    protected List<RetailStoreTemporaryClosure> closure;

    /**
     * Gets the value of the closure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the closure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClosure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailStoreTemporaryClosure }
     * 
     * 
     */
    public List<RetailStoreTemporaryClosure> getClosure() {
        if (closure == null) {
            closure = new ArrayList<RetailStoreTemporaryClosure>();
        }
        return this.closure;
    }

}
