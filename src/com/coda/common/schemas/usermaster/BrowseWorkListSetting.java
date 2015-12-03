//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:53 AM EST 
//


package com.coda.common.schemas.usermaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element contains the details of the browse workflow masters specified for a user's worklist.
 * 
 * <p>Java class for BrowseWorkListSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrowseWorkListSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.coda.com/efinance/schemas/common}typeDescription"/&gt;
 *         &lt;element name="BrowseWorkflowMasterCode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrowseWorkListSetting", propOrder = {
    "displayName",
    "browseWorkflowMasterCode"
})
public class BrowseWorkListSetting
    implements Serializable
{

    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "BrowseWorkflowMasterCode", required = true)
    protected String browseWorkflowMasterCode;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the browseWorkflowMasterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowseWorkflowMasterCode() {
        return browseWorkflowMasterCode;
    }

    /**
     * Sets the value of the browseWorkflowMasterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowseWorkflowMasterCode(String value) {
        this.browseWorkflowMasterCode = value;
    }

}
