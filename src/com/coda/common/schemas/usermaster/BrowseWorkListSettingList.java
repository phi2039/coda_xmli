//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:53 AM EST 
//


package com.coda.common.schemas.usermaster;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element contains a list of browse work list settings.
 * 
 * <p>Java class for BrowseWorkListSettingList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrowseWorkListSettingList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tab" type="{http://www.coda.com/common/schemas/usermaster}BrowseWorkListSetting" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrowseWorkListSettingList", propOrder = {
    "tab"
})
public class BrowseWorkListSettingList
    implements Serializable
{

    @XmlElement(name = "Tab")
    protected List<BrowseWorkListSetting> tab;

    /**
     * Gets the value of the tab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTab().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrowseWorkListSetting }
     * 
     * 
     */
    public List<BrowseWorkListSetting> getTab() {
        if (tab == null) {
            tab = new ArrayList<BrowseWorkListSetting>();
        }
        return this.tab;
    }

}