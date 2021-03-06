//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.efinance.schemas.selectormaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.TypeCtVocabOp;
import com.coda.efinance.schemas.common.TypeLeftBrackets;
import com.coda.efinance.schemas.common.TypeLogicalOperator;
import com.coda.efinance.schemas.common.TypeRightBrackets;


/**
 * A data element on the vocabulary list.
 * 
 * <p>Java class for VocListDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VocListDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Logical" type="{http://www.coda.com/efinance/schemas/common}typeLogicalOperator" minOccurs="0"/&gt;
 *         &lt;element name="OpenBracket" type="{http://www.coda.com/efinance/schemas/common}typeLeftBrackets" minOccurs="0"/&gt;
 *         &lt;element name="VocabID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OperatorID" type="{http://www.coda.com/efinance/schemas/common}typeCtVocabOp"/&gt;
 *         &lt;element name="From" type="{http://www.coda.com/efinance/schemas/common}typeGSLValue" minOccurs="0"/&gt;
 *         &lt;element name="To" type="{http://www.coda.com/efinance/schemas/common}typeGSLValue" minOccurs="0"/&gt;
 *         &lt;element name="Modify" type="{http://www.coda.com/efinance/schemas/common}typeCtOneOfN" minOccurs="0"/&gt;
 *         &lt;element name="Prompt" type="{http://www.coda.com/efinance/schemas/common}typeTextB" minOccurs="0"/&gt;
 *         &lt;element name="CloseBracket" type="{http://www.coda.com/efinance/schemas/common}typeRightBrackets" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VocListDataElement", propOrder = {
    "logical",
    "openBracket",
    "vocabID",
    "operatorID",
    "from",
    "to",
    "modify",
    "prompt",
    "closeBracket"
})
public class VocListDataElement
    implements Serializable
{

    @XmlElement(name = "Logical")
    @XmlSchemaType(name = "string")
    protected TypeLogicalOperator logical;
    @XmlElement(name = "OpenBracket")
    @XmlSchemaType(name = "string")
    protected TypeLeftBrackets openBracket;
    @XmlElement(name = "VocabID", required = true)
    protected String vocabID;
    @XmlElement(name = "OperatorID", required = true)
    @XmlSchemaType(name = "string")
    protected TypeCtVocabOp operatorID;
    @XmlElement(name = "From")
    protected String from;
    @XmlElement(name = "To")
    protected String to;
    @XmlElement(name = "Modify")
    protected String modify;
    @XmlElement(name = "Prompt")
    protected String prompt;
    @XmlElement(name = "CloseBracket")
    @XmlSchemaType(name = "string")
    protected TypeRightBrackets closeBracket;

    /**
     * Gets the value of the logical property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLogicalOperator }
     *     
     */
    public TypeLogicalOperator getLogical() {
        return logical;
    }

    /**
     * Sets the value of the logical property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLogicalOperator }
     *     
     */
    public void setLogical(TypeLogicalOperator value) {
        this.logical = value;
    }

    /**
     * Gets the value of the openBracket property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLeftBrackets }
     *     
     */
    public TypeLeftBrackets getOpenBracket() {
        return openBracket;
    }

    /**
     * Sets the value of the openBracket property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLeftBrackets }
     *     
     */
    public void setOpenBracket(TypeLeftBrackets value) {
        this.openBracket = value;
    }

    /**
     * Gets the value of the vocabID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVocabID() {
        return vocabID;
    }

    /**
     * Sets the value of the vocabID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVocabID(String value) {
        this.vocabID = value;
    }

    /**
     * Gets the value of the operatorID property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCtVocabOp }
     *     
     */
    public TypeCtVocabOp getOperatorID() {
        return operatorID;
    }

    /**
     * Sets the value of the operatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCtVocabOp }
     *     
     */
    public void setOperatorID(TypeCtVocabOp value) {
        this.operatorID = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the modify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModify() {
        return modify;
    }

    /**
     * Sets the value of the modify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModify(String value) {
        this.modify = value;
    }

    /**
     * Gets the value of the prompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Sets the value of the prompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrompt(String value) {
        this.prompt = value;
    }

    /**
     * Gets the value of the closeBracket property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRightBrackets }
     *     
     */
    public TypeRightBrackets getCloseBracket() {
        return closeBracket;
    }

    /**
     * Sets the value of the closeBracket property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRightBrackets }
     *     
     */
    public void setCloseBracket(TypeRightBrackets value) {
        this.closeBracket = value;
    }

}
