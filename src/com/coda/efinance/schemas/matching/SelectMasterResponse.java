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
import com.coda.efinance.schemas.common.Response;
import com.coda.efinance.schemas.matchingmaster.MatchingMaster;


/**
 * <p>Java class for SelectMasterResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectMasterResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CmpCode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="Code" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="MatchingMaster" type="{http://www.coda.com/efinance/schemas/matchingmaster}MatchingMaster"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectMasterResponse", propOrder = {
    "cmpCode",
    "code",
    "matchingMaster"
})
public class SelectMasterResponse
    extends Response
    implements Serializable
{

    @XmlElement(name = "CmpCode", required = true)
    protected String cmpCode;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "MatchingMaster", required = true)
    protected MatchingMaster matchingMaster;

    /**
     * Gets the value of the cmpCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpCode() {
        return cmpCode;
    }

    /**
     * Sets the value of the cmpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpCode(String value) {
        this.cmpCode = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the matchingMaster property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingMaster }
     *     
     */
    public MatchingMaster getMatchingMaster() {
        return matchingMaster;
    }

    /**
     * Sets the value of the matchingMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingMaster }
     *     
     */
    public void setMatchingMaster(MatchingMaster value) {
        this.matchingMaster = value;
    }

}