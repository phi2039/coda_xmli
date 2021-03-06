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
 * The root node of the position hierarchy.
 * 
 * <p>Java class for HierarchyNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HierarchyNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position" type="{http://www.coda.com/common/schemas/positions}PositionKey"/&gt;
 *         &lt;element name="Parent" type="{http://www.coda.com/common/schemas/positions}HierarchyNodeKey" minOccurs="0"/&gt;
 *         &lt;element name="ChildList" type="{http://www.coda.com/common/schemas/positions}HierarchyNodeList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HierarchyNode", propOrder = {
    "position",
    "parent",
    "childList"
})
public class HierarchyNode
    implements Serializable
{

    @XmlElement(name = "Position", required = true)
    protected PositionKey position;
    @XmlElement(name = "Parent")
    protected HierarchyNodeKey parent;
    @XmlElement(name = "ChildList", required = true)
    protected HierarchyNodeList childList;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link PositionKey }
     *     
     */
    public PositionKey getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionKey }
     *     
     */
    public void setPosition(PositionKey value) {
        this.position = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyNodeKey }
     *     
     */
    public HierarchyNodeKey getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyNodeKey }
     *     
     */
    public void setParent(HierarchyNodeKey value) {
        this.parent = value;
    }

    /**
     * Gets the value of the childList property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchyNodeList }
     *     
     */
    public HierarchyNodeList getChildList() {
        return childList;
    }

    /**
     * Sets the value of the childList property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchyNodeList }
     *     
     */
    public void setChildList(HierarchyNodeList value) {
        this.childList = value;
    }

}
