//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:45:22 AM EST 
//


package com.coda.efinance.schemas.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiCompanyResponseVerb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiCompanyResponseVerb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}ResponseVerb"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Companies" type="{http://www.coda.com/efinance/schemas/common}Companies" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiCompanyResponseVerb", propOrder = {
    "companies"
})
public class MultiCompanyResponseVerb
    extends ResponseVerb
    implements Serializable
{

    @XmlElement(name = "Companies")
    protected Companies companies;

    /**
     * Gets the value of the companies property.
     * 
     * @return
     *     possible object is
     *     {@link Companies }
     *     
     */
    public Companies getCompanies() {
        return companies;
    }

    /**
     * Sets the value of the companies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Companies }
     *     
     */
    public void setCompanies(Companies value) {
        this.companies = value;
    }

}
