//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.efinance.schemas.matchingmaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.association.AssistantScript;
import com.coda.efinance.schemas.common.TypeCtMatchingCurr;


/**
 * This element holds a matching master.
 * 
 * <p>Java class for MatchingMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchingMaster"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="CmpCode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="Code" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="Name" type="{http://www.coda.com/efinance/schemas/common}typeName"/&gt;
 *         &lt;element name="ShortName" type="{http://www.coda.com/efinance/schemas/common}typeShortNameB"/&gt;
 *         &lt;element name="CurrRule" type="{http://www.coda.com/efinance/schemas/common}typeCtMatchingCurr"/&gt;
 *         &lt;element name="CurrCode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode" minOccurs="0"/&gt;
 *         &lt;element name="ElmLevel" type="{http://www.coda.com/efinance/schemas/common}typeElmLevel"/&gt;
 *         &lt;element name="ElmCode" type="{http://www.coda.com/efinance/schemas/common}typeElmCodeWild" minOccurs="0"/&gt;
 *         &lt;element name="TraderCode" type="{http://www.coda.com/efinance/schemas/common}typeTraderCodeWild" minOccurs="0"/&gt;
 *         &lt;element name="DiscDate" type="{http://www.coda.com/efinance/schemas/common}typeHSDate" minOccurs="0"/&gt;
 *         &lt;element name="MatchingOptions" type="{http://www.coda.com/efinance/schemas/matchingmaster}MatchingOptions"/&gt;
 *         &lt;element name="PostingParams" type="{http://www.coda.com/efinance/schemas/matchingmaster}PostingParams"/&gt;
 *         &lt;element name="InputAndMatching" type="{http://www.coda.com/efinance/schemas/matchingmaster}InputAndMatchingOptions"/&gt;
 *         &lt;element name="Folders" type="{http://www.coda.com/efinance/schemas/matchingmaster}Folders"/&gt;
 *         &lt;element name="Assistant" type="{http://www.coda.com/efinance/schemas/association}AssistantScript"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingMaster", propOrder = {
    "timeStamp",
    "cmpCode",
    "code",
    "name",
    "shortName",
    "currRule",
    "currCode",
    "elmLevel",
    "elmCode",
    "traderCode",
    "discDate",
    "matchingOptions",
    "postingParams",
    "inputAndMatching",
    "folders",
    "assistant"
})
public class MatchingMaster
    implements Serializable
{

    @XmlElement(name = "TimeStamp")
    protected short timeStamp;
    @XmlElement(name = "CmpCode", required = true)
    protected String cmpCode;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ShortName", required = true)
    protected String shortName;
    @XmlElement(name = "CurrRule", required = true)
    @XmlSchemaType(name = "string")
    protected TypeCtMatchingCurr currRule;
    @XmlElement(name = "CurrCode")
    protected String currCode;
    @XmlElement(name = "ElmLevel")
    protected short elmLevel;
    @XmlElement(name = "ElmCode")
    protected String elmCode;
    @XmlElement(name = "TraderCode")
    protected String traderCode;
    @XmlElement(name = "DiscDate")
    protected String discDate;
    @XmlElement(name = "MatchingOptions", required = true)
    protected MatchingOptions matchingOptions;
    @XmlElement(name = "PostingParams", required = true)
    protected PostingParams postingParams;
    @XmlElement(name = "InputAndMatching", required = true)
    protected InputAndMatchingOptions inputAndMatching;
    @XmlElement(name = "Folders", required = true)
    protected Folders folders;
    @XmlElement(name = "Assistant", required = true)
    protected AssistantScript assistant;

    /**
     * Gets the value of the timeStamp property.
     * 
     */
    public short getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     */
    public void setTimeStamp(short value) {
        this.timeStamp = value;
    }

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the currRule property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCtMatchingCurr }
     *     
     */
    public TypeCtMatchingCurr getCurrRule() {
        return currRule;
    }

    /**
     * Sets the value of the currRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCtMatchingCurr }
     *     
     */
    public void setCurrRule(TypeCtMatchingCurr value) {
        this.currRule = value;
    }

    /**
     * Gets the value of the currCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrCode() {
        return currCode;
    }

    /**
     * Sets the value of the currCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrCode(String value) {
        this.currCode = value;
    }

    /**
     * Gets the value of the elmLevel property.
     * 
     */
    public short getElmLevel() {
        return elmLevel;
    }

    /**
     * Sets the value of the elmLevel property.
     * 
     */
    public void setElmLevel(short value) {
        this.elmLevel = value;
    }

    /**
     * Gets the value of the elmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElmCode() {
        return elmCode;
    }

    /**
     * Sets the value of the elmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElmCode(String value) {
        this.elmCode = value;
    }

    /**
     * Gets the value of the traderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraderCode() {
        return traderCode;
    }

    /**
     * Sets the value of the traderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraderCode(String value) {
        this.traderCode = value;
    }

    /**
     * Gets the value of the discDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscDate() {
        return discDate;
    }

    /**
     * Sets the value of the discDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscDate(String value) {
        this.discDate = value;
    }

    /**
     * Gets the value of the matchingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingOptions }
     *     
     */
    public MatchingOptions getMatchingOptions() {
        return matchingOptions;
    }

    /**
     * Sets the value of the matchingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingOptions }
     *     
     */
    public void setMatchingOptions(MatchingOptions value) {
        this.matchingOptions = value;
    }

    /**
     * Gets the value of the postingParams property.
     * 
     * @return
     *     possible object is
     *     {@link PostingParams }
     *     
     */
    public PostingParams getPostingParams() {
        return postingParams;
    }

    /**
     * Sets the value of the postingParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingParams }
     *     
     */
    public void setPostingParams(PostingParams value) {
        this.postingParams = value;
    }

    /**
     * Gets the value of the inputAndMatching property.
     * 
     * @return
     *     possible object is
     *     {@link InputAndMatchingOptions }
     *     
     */
    public InputAndMatchingOptions getInputAndMatching() {
        return inputAndMatching;
    }

    /**
     * Sets the value of the inputAndMatching property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputAndMatchingOptions }
     *     
     */
    public void setInputAndMatching(InputAndMatchingOptions value) {
        this.inputAndMatching = value;
    }

    /**
     * Gets the value of the folders property.
     * 
     * @return
     *     possible object is
     *     {@link Folders }
     *     
     */
    public Folders getFolders() {
        return folders;
    }

    /**
     * Sets the value of the folders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Folders }
     *     
     */
    public void setFolders(Folders value) {
        this.folders = value;
    }

    /**
     * Gets the value of the assistant property.
     * 
     * @return
     *     possible object is
     *     {@link AssistantScript }
     *     
     */
    public AssistantScript getAssistant() {
        return assistant;
    }

    /**
     * Sets the value of the assistant property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistantScript }
     *     
     */
    public void setAssistant(AssistantScript value) {
        this.assistant = value;
    }

}
