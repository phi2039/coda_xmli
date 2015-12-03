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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.TypeCtTaxMethod;


/**
 * This element holds tax settings.
 * 
 * <p>Java class for DocTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocTax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Method" type="{http://www.coda.com/efinance/schemas/common}typeCtTaxMethod"/&gt;
 *         &lt;element name="ESL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Intrastat" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Ten99" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NumberOfTaxCodes" type="{http://www.coda.com/efinance/schemas/common}typeUWord"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocTax", propOrder = {
    "method",
    "esl",
    "intrastat",
    "ten99",
    "numberOfTaxCodes"
})
public class DocTax
    implements Serializable
{

    @XmlElement(name = "Method", required = true)
    @XmlSchemaType(name = "string")
    protected TypeCtTaxMethod method;
    @XmlElement(name = "ESL")
    protected boolean esl;
    @XmlElement(name = "Intrastat")
    protected boolean intrastat;
    @XmlElement(name = "Ten99")
    protected boolean ten99;
    @XmlElement(name = "NumberOfTaxCodes")
    protected short numberOfTaxCodes;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCtTaxMethod }
     *     
     */
    public TypeCtTaxMethod getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCtTaxMethod }
     *     
     */
    public void setMethod(TypeCtTaxMethod value) {
        this.method = value;
    }

    /**
     * Gets the value of the esl property.
     * 
     */
    public boolean isESL() {
        return esl;
    }

    /**
     * Sets the value of the esl property.
     * 
     */
    public void setESL(boolean value) {
        this.esl = value;
    }

    /**
     * Gets the value of the intrastat property.
     * 
     */
    public boolean isIntrastat() {
        return intrastat;
    }

    /**
     * Sets the value of the intrastat property.
     * 
     */
    public void setIntrastat(boolean value) {
        this.intrastat = value;
    }

    /**
     * Gets the value of the ten99 property.
     * 
     */
    public boolean isTen99() {
        return ten99;
    }

    /**
     * Sets the value of the ten99 property.
     * 
     */
    public void setTen99(boolean value) {
        this.ten99 = value;
    }

    /**
     * Gets the value of the numberOfTaxCodes property.
     * 
     */
    public short getNumberOfTaxCodes() {
        return numberOfTaxCodes;
    }

    /**
     * Sets the value of the numberOfTaxCodes property.
     * 
     */
    public void setNumberOfTaxCodes(short value) {
        this.numberOfTaxCodes = value;
    }

}
