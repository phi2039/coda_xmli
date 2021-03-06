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


/**
 * <p>Java class for WriteOffResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WriteOffResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MatchingParams" type="{http://www.coda.com/efinance/schemas/matching}MatchingParams"/&gt;
 *         &lt;element name="Details" type="{http://www.coda.com/efinance/schemas/matching}MatchDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WriteOffResponse", propOrder = {
    "matchingParams",
    "details"
})
public class WriteOffResponse
    extends Response
    implements Serializable
{

    @XmlElement(name = "MatchingParams", required = true)
    protected MatchingParams matchingParams;
    @XmlElement(name = "Details", required = true)
    protected MatchDetails details;

    /**
     * Gets the value of the matchingParams property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingParams }
     *     
     */
    public MatchingParams getMatchingParams() {
        return matchingParams;
    }

    /**
     * Sets the value of the matchingParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingParams }
     *     
     */
    public void setMatchingParams(MatchingParams value) {
        this.matchingParams = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link MatchDetails }
     *     
     */
    public MatchDetails getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchDetails }
     *     
     */
    public void setDetails(MatchDetails value) {
        this.details = value;
    }

}
