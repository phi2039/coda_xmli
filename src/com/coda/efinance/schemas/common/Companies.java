//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:45:22 AM EST 
//


package com.coda.efinance.schemas.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element holds a list of the companies in which you want to maintain masters using multi-company functionality.
 * 
 * <p>Java class for Companies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Companies"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Company" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="aborted" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Companies", propOrder = {
    "company"
})
public class Companies
    implements Serializable
{

    @XmlElement(name = "Company")
    protected List<String> company;
    @XmlAttribute(name = "aborted")
    protected String aborted;

    /**
     * Gets the value of the company property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the company property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCompany() {
        if (company == null) {
            company = new ArrayList<String>();
        }
        return this.company;
    }

    /**
     * Gets the value of the aborted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAborted() {
        return aborted;
    }

    /**
     * Sets the value of the aborted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAborted(String value) {
        this.aborted = value;
    }

}
