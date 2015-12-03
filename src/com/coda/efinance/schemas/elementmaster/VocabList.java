//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:25 AM EST 
//


package com.coda.efinance.schemas.elementmaster;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.TypeCtElmVocabEnum;


/**
 * Contains the vocabulary items that you want to retrieve for the specified element.
 * 
 * <p>Java class for VocabList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VocabList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VocabID" type="{http://www.coda.com/efinance/schemas/common}typeCtElmVocabEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VocabList", propOrder = {
    "vocabID"
})
public class VocabList
    implements Serializable
{

    @XmlElement(name = "VocabID")
    @XmlSchemaType(name = "string")
    protected List<TypeCtElmVocabEnum> vocabID;

    /**
     * Gets the value of the vocabID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vocabID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVocabID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeCtElmVocabEnum }
     * 
     * 
     */
    public List<TypeCtElmVocabEnum> getVocabID() {
        if (vocabID == null) {
            vocabID = new ArrayList<TypeCtElmVocabEnum>();
        }
        return this.vocabID;
    }

}