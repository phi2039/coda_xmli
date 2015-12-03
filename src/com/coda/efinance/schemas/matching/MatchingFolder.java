//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.efinance.schemas.matching;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.selector.SelectionRow;


/**
 * This element contains details of the document lines included in the selected matching folder.
 * 
 * <p>Java class for MatchingFolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchingFolder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Header" type="{http://www.coda.com/efinance/schemas/selector}SelectionRow"/&gt;
 *         &lt;element name="Items" type="{http://www.coda.com/efinance/schemas/matching}SelectedItems"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingFolder", propOrder = {
    "number",
    "header",
    "items"
})
public class MatchingFolder
    implements Serializable
{

    @XmlElement(name = "Number")
    protected short number;
    @XmlElement(name = "Header", required = true)
    protected SelectionRow header;
    @XmlElement(name = "Items", required = true)
    protected SelectedItems items;

    /**
     * Gets the value of the number property.
     * 
     */
    public short getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(short value) {
        this.number = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionRow }
     *     
     */
    public SelectionRow getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionRow }
     *     
     */
    public void setHeader(SelectionRow value) {
        this.header = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedItems }
     *     
     */
    public SelectedItems getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedItems }
     *     
     */
    public void setItems(SelectedItems value) {
        this.items = value;
    }

}