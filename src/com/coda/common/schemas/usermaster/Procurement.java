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
 * Not used in this version.
 * 
 * <p>Java class for Procurement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Procurement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Companies" type="{http://www.coda.com/common/schemas/usermaster}ProcurementCompanies" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Procurement", propOrder = {
    "companies"
})
public class Procurement
    implements Serializable
{

    @XmlElement(name = "Companies")
    protected ProcurementCompanies companies;

    /**
     * Gets the value of the companies property.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementCompanies }
     *     
     */
    public ProcurementCompanies getCompanies() {
        return companies;
    }

    /**
     * Sets the value of the companies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementCompanies }
     *     
     */
    public void setCompanies(ProcurementCompanies value) {
        this.companies = value;
    }

}
