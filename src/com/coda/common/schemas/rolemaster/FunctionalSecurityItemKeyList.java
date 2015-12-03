//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:24 AM EST 
//


package com.coda.common.schemas.rolemaster;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionalSecurityItemKeyList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionalSecurityItemKeyList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FunctionalSecurityItem" type="{http://www.coda.com/common/schemas/rolemaster}FunctionalSecurityItemKey" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionalSecurityItemKeyList", propOrder = {
    "functionalSecurityItem"
})
public class FunctionalSecurityItemKeyList
    implements Serializable
{

    @XmlElement(name = "FunctionalSecurityItem")
    protected List<FunctionalSecurityItemKey> functionalSecurityItem;

    /**
     * Gets the value of the functionalSecurityItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionalSecurityItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionalSecurityItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionalSecurityItemKey }
     * 
     * 
     */
    public List<FunctionalSecurityItemKey> getFunctionalSecurityItem() {
        if (functionalSecurityItem == null) {
            functionalSecurityItem = new ArrayList<FunctionalSecurityItemKey>();
        }
        return this.functionalSecurityItem;
    }

}