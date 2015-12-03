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
import com.coda.efinance.schemas.common.Key;


/**
 * <p>Java class for SelectorVocListData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectorVocListData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://www.coda.com/efinance/schemas/common}Key"/&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="VocabList" type="{http://www.coda.com/efinance/schemas/selectormaster}VocListData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectorVocListData", propOrder = {
    "key",
    "timeStamp",
    "vocabList"
})
public class SelectorVocListData
    implements Serializable
{

    @XmlElement(name = "Key", required = true)
    protected Key key;
    @XmlElement(name = "TimeStamp")
    protected Short timeStamp;
    @XmlElement(name = "VocabList")
    protected VocListData vocabList;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link Key }
     *     
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link Key }
     *     
     */
    public void setKey(Key value) {
        this.key = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTimeStamp(Short value) {
        this.timeStamp = value;
    }

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
