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
import javax.xml.bind.annotation.XmlType;


/**
 * This element holds a selector master.
 * 
 * <p>Java class for SelectorMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectorMaster"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/selectormaster}Master"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VocabList" type="{http://www.coda.com/efinance/schemas/selectormaster}VocListData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectorMaster", propOrder = {
    "vocabList"
})
public class SelectorMaster
    extends Master
    implements Serializable
{

    @XmlElement(name = "VocabList", required = true)
    protected VocListData vocabList;

    /**
     * Gets the value of the vocabList property.
     * 
     * @return
     *     possible object is
     *     {@link VocListData }
     *     
     */
    public VocListData getVocabList() {
        return vocabList;
    }

    /**
     * Sets the value of the vocabList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VocListData }
     *     
     */
    public void setVocabList(VocListData value) {
        this.vocabList = value;
    }

}