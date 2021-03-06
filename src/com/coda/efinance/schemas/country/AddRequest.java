//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:45:22 AM EST 
//


package com.coda.efinance.schemas.country;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.Request;


/**
 * <p>Java class for AddRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryMaster" type="{http://www.coda.com/efinance/schemas/country}CountryMaster"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRequest", propOrder = {
    "countryMaster"
})
public class AddRequest
    extends Request
    implements Serializable
{

    @XmlElement(name = "CountryMaster", required = true)
    protected CountryMaster countryMaster;

    /**
     * Gets the value of the countryMaster property.
     * 
     * @return
     *     possible object is
     *     {@link CountryMaster }
     *     
     */
    public CountryMaster getCountryMaster() {
        return countryMaster;
    }

    /**
     * Sets the value of the countryMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryMaster }
     *     
     */
    public void setCountryMaster(CountryMaster value) {
        this.countryMaster = value;
    }

}
