//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:37 AM EST 
//


package com.coda.efinance.schemas.documentmaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.TypeCtDocExtAcRule;
import com.coda.efinance.schemas.common.TypeCtDupXR;


/**
 * This element holds information about whether you want to check external references for duplicates and, if so, how.
 * 
 * <p>Java class for ExtRefChecking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtRefChecking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompareWith" type="{http://www.coda.com/efinance/schemas/documentmaster}ExtRefCompare"/&gt;
 *         &lt;element name="AccountRule" type="{http://www.coda.com/efinance/schemas/common}typeCtDocExtAcRule"/&gt;
 *         &lt;element name="AllDocumentTypes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExcludeCurrent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SummaryLinesOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ActionOnDuplicate" type="{http://www.coda.com/efinance/schemas/common}typeCtDupXR"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtRefChecking", propOrder = {
    "compareWith",
    "accountRule",
    "allDocumentTypes",
    "excludeCurrent",
    "summaryLinesOnly",
    "actionOnDuplicate"
})
public class ExtRefChecking
    implements Serializable
{

    @XmlElement(name = "CompareWith", required = true)
    protected ExtRefCompare compareWith;
    @XmlElement(name = "AccountRule", required = true)
    @XmlSchemaType(name = "string")
    protected TypeCtDocExtAcRule accountRule;
    @XmlElement(name = "AllDocumentTypes")
    protected boolean allDocumentTypes;
    @XmlElement(name = "ExcludeCurrent")
    protected boolean excludeCurrent;
    @XmlElement(name = "SummaryLinesOnly")
    protected boolean summaryLinesOnly;
    @XmlElement(name = "ActionOnDuplicate", required = true)
    @XmlSchemaType(name = "string")
    protected TypeCtDupXR actionOnDuplicate;

    /**
     * Gets the value of the compareWith property.
     * 
     * @return
     *     possible object is
     *     {@link ExtRefCompare }
     *     
     */
    public ExtRefCompare getCompareWith() {
        return compareWith;
    }

    /**
     * Sets the value of the compareWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtRefCompare }
     *     
     */
    public void setCompareWith(ExtRefCompare value) {
        this.compareWith = value;
    }

    /**
     * Gets the value of the accountRule property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCtDocExtAcRule }
     *     
     */
    public TypeCtDocExtAcRule getAccountRule() {
        return accountRule;
    }

    /**
     * Sets the value of the accountRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCtDocExtAcRule }
     *     
     */
    public void setAccountRule(TypeCtDocExtAcRule value) {
        this.accountRule = value;
    }

    /**
     * Gets the value of the allDocumentTypes property.
     * 
     */
    public boolean isAllDocumentTypes() {
        return allDocumentTypes;
    }

    /**
     * Sets the value of the allDocumentTypes property.
     * 
     */
    public void setAllDocumentTypes(boolean value) {
        this.allDocumentTypes = value;
    }

    /**
     * Gets the value of the excludeCurrent property.
     * 
     */
    public boolean isExcludeCurrent() {
        return excludeCurrent;
    }

    /**
     * Sets the value of the excludeCurrent property.
     * 
     */
    public void setExcludeCurrent(boolean value) {
        this.excludeCurrent = value;
    }

    /**
     * Gets the value of the summaryLinesOnly property.
     * 
     */
    public boolean isSummaryLinesOnly() {
        return summaryLinesOnly;
    }

    /**
     * Sets the value of the summaryLinesOnly property.
     * 
     */
    public void setSummaryLinesOnly(boolean value) {
        this.summaryLinesOnly = value;
    }

    /**
     * Gets the value of the actionOnDuplicate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCtDupXR }
     *     
     */
    public TypeCtDupXR getActionOnDuplicate() {
        return actionOnDuplicate;
    }

    /**
     * Sets the value of the actionOnDuplicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCtDupXR }
     *     
     */
    public void setActionOnDuplicate(TypeCtDupXR value) {
        this.actionOnDuplicate = value;
    }

}
