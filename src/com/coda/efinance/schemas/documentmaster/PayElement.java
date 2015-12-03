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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankCodeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AddressRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayElement", propOrder = {
    "bankCodeRequired",
    "addressRequired"
})
public class PayElement
    implements Serializable
{

    @XmlElement(name = "BankCodeRequired")
    protected boolean bankCodeRequired;
    @XmlElement(name = "AddressRequired")
    protected boolean addressRequired;

    /**
     * Gets the value of the bankCodeRequired property.
     * 
     */
    public boolean isBankCodeRequired() {
        return bankCodeRequired;
    }

    /**
     * Sets the value of the bankCodeRequired property.
     * 
     */
    public void setBankCodeRequired(boolean value) {
        this.bankCodeRequired = value;
    }

    /**
     * Gets the value of the addressRequired property.
     * 
     */
    public boolean isAddressRequired() {
        return addressRequired;
    }

    /**
     * Sets the value of the addressRequired property.
     * 
     */
    public void setAddressRequired(boolean value) {
        this.addressRequired = value;
    }

}
