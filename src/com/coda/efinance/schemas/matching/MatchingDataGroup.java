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
 * This element contains information about matching groups (in the current matching session) that require a driving line or a source for data propagation to be specified.
 * 
 * <p>Java class for MatchingDataGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchingDataGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupNum" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Header" type="{http://www.coda.com/efinance/schemas/selector}SelectionRow"/&gt;
 *         &lt;element name="Lines" type="{http://www.coda.com/efinance/schemas/matching}MatchingDataLines"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingDataGroup", propOrder = {
    "groupNum",
    "header",
    "lines"
})
public class MatchingDataGroup
    implements Serializable
{

    @XmlElement(name = "GroupNum")
    protected short groupNum;
    @XmlElement(name = "Header", required = true)
    protected SelectionRow header;
    @XmlElement(name = "Lines", required = true)
    protected MatchingDataLines lines;

    /**
     * Gets the value of the groupNum property.
     * 
     */
    public short getGroupNum() {
        return groupNum;
    }

    /**
     * Sets the value of the groupNum property.
     * 
     */
    public void setGroupNum(short value) {
        this.groupNum = value;
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
     * Gets the value of the lines property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingDataLines }
     *     
     */
    public MatchingDataLines getLines() {
        return lines;
    }

    /**
     * Sets the value of the lines property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingDataLines }
     *     
     */
    public void setLines(MatchingDataLines value) {
        this.lines = value;
    }

}
