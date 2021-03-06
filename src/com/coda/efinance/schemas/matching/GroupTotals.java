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


/**
 * This element contains the match totals for all the matching groups in this matching session.
 * 
 * <p>Java class for GroupTotals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupTotals"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupNum" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="MatchCurr" type="{http://www.coda.com/efinance/schemas/matching}CurTotals"/&gt;
 *         &lt;element name="HomeCurr" type="{http://www.coda.com/efinance/schemas/matching}CurTotals"/&gt;
 *         &lt;element name="DualCurr" type="{http://www.coda.com/efinance/schemas/matching}CurTotals" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupTotals", propOrder = {
    "groupNum",
    "matchCurr",
    "homeCurr",
    "dualCurr"
})
public class GroupTotals
    implements Serializable
{

    @XmlElement(name = "GroupNum")
    protected short groupNum;
    @XmlElement(name = "MatchCurr", required = true)
    protected CurTotals matchCurr;
    @XmlElement(name = "HomeCurr", required = true)
    protected CurTotals homeCurr;
    @XmlElement(name = "DualCurr")
    protected CurTotals dualCurr;

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
     * Gets the value of the matchCurr property.
     * 
     * @return
     *     possible object is
     *     {@link CurTotals }
     *     
     */
    public CurTotals getMatchCurr() {
        return matchCurr;
    }

    /**
     * Sets the value of the matchCurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurTotals }
     *     
     */
    public void setMatchCurr(CurTotals value) {
        this.matchCurr = value;
    }

    /**
     * Gets the value of the homeCurr property.
     * 
     * @return
     *     possible object is
     *     {@link CurTotals }
     *     
     */
    public CurTotals getHomeCurr() {
        return homeCurr;
    }

    /**
     * Sets the value of the homeCurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurTotals }
     *     
     */
    public void setHomeCurr(CurTotals value) {
        this.homeCurr = value;
    }

    /**
     * Gets the value of the dualCurr property.
     * 
     * @return
     *     possible object is
     *     {@link CurTotals }
     *     
     */
    public CurTotals getDualCurr() {
        return dualCurr;
    }

    /**
     * Sets the value of the dualCurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurTotals }
     *     
     */
    public void setDualCurr(CurTotals value) {
        this.dualCurr = value;
    }

}
