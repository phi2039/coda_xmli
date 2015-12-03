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
 * This element holds a list of external references.
 * 
 * <p>Java class for PDLExtRefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDLExtRefs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtReference1" type="{http://www.coda.com/efinance/schemas/common}typeExtRefB"/&gt;
 *         &lt;element name="ExtReference2" type="{http://www.coda.com/efinance/schemas/common}typeExtRefB"/&gt;
 *         &lt;element name="ExtReference3" type="{http://www.coda.com/efinance/schemas/common}typeExtRefB"/&gt;
 *         &lt;element name="ExtReference4" type="{http://www.coda.com/efinance/schemas/common}typeExtRefB"/&gt;
 *         &lt;element name="ExtReference5" type="{http://www.coda.com/efinance/schemas/common}typeExtRefB"/&gt;
 *         &lt;element name="ExtReference6" type="{http://www.coda.com/efinance/schemas/common}typeExtRefB"/&gt;
 *         &lt;element name="ProtectExtRef1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ProtectExtRef2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ProtectExtRef3" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ProtectExtRef4" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ProtectExtRef5" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ProtectExtRef6" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDLExtRefs", propOrder = {
    "extReference1",
    "extReference2",
    "extReference3",
    "extReference4",
    "extReference5",
    "extReference6",
    "protectExtRef1",
    "protectExtRef2",
    "protectExtRef3",
    "protectExtRef4",
    "protectExtRef5",
    "protectExtRef6"
})
public class PDLExtRefs
    implements Serializable
{

    @XmlElement(name = "ExtReference1", required = true)
    protected String extReference1;
    @XmlElement(name = "ExtReference2", required = true)
    protected String extReference2;
    @XmlElement(name = "ExtReference3", required = true)
    protected String extReference3;
    @XmlElement(name = "ExtReference4", required = true)
    protected String extReference4;
    @XmlElement(name = "ExtReference5", required = true)
    protected String extReference5;
    @XmlElement(name = "ExtReference6", required = true)
    protected String extReference6;
    @XmlElement(name = "ProtectExtRef1")
    protected boolean protectExtRef1;
    @XmlElement(name = "ProtectExtRef2")
    protected boolean protectExtRef2;
    @XmlElement(name = "ProtectExtRef3")
    protected boolean protectExtRef3;
    @XmlElement(name = "ProtectExtRef4")
    protected boolean protectExtRef4;
    @XmlElement(name = "ProtectExtRef5")
    protected boolean protectExtRef5;
    @XmlElement(name = "ProtectExtRef6")
    protected boolean protectExtRef6;

    /**
     * Gets the value of the extReference1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtReference1() {
        return extReference1;
    }

    /**
     * Sets the value of the extReference1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtReference1(String value) {
        this.extReference1 = value;
    }

    /**
     * Gets the value of the extReference2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtReference2() {
        return extReference2;
    }

    /**
     * Sets the value of the extReference2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtReference2(String value) {
        this.extReference2 = value;
    }

    /**
     * Gets the value of the extReference3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtReference3() {
        return extReference3;
    }

    /**
     * Sets the value of the extReference3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtReference3(String value) {
        this.extReference3 = value;
    }

    /**
     * Gets the value of the extReference4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtReference4() {
        return extReference4;
    }

    /**
     * Sets the value of the extReference4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtReference4(String value) {
        this.extReference4 = value;
    }

    /**
     * Gets the value of the extReference5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtReference5() {
        return extReference5;
    }

    /**
     * Sets the value of the extReference5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtReference5(String value) {
        this.extReference5 = value;
    }

    /**
     * Gets the value of the extReference6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtReference6() {
        return extReference6;
    }

    /**
     * Sets the value of the extReference6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtReference6(String value) {
        this.extReference6 = value;
    }

    /**
     * Gets the value of the protectExtRef1 property.
     * 
     */
    public boolean isProtectExtRef1() {
        return protectExtRef1;
    }

    /**
     * Sets the value of the protectExtRef1 property.
     * 
     */
    public void setProtectExtRef1(boolean value) {
        this.protectExtRef1 = value;
    }

    /**
     * Gets the value of the protectExtRef2 property.
     * 
     */
    public boolean isProtectExtRef2() {
        return protectExtRef2;
    }

    /**
     * Sets the value of the protectExtRef2 property.
     * 
     */
    public void setProtectExtRef2(boolean value) {
        this.protectExtRef2 = value;
    }

    /**
     * Gets the value of the protectExtRef3 property.
     * 
     */
    public boolean isProtectExtRef3() {
        return protectExtRef3;
    }

    /**
     * Sets the value of the protectExtRef3 property.
     * 
     */
    public void setProtectExtRef3(boolean value) {
        this.protectExtRef3 = value;
    }

    /**
     * Gets the value of the protectExtRef4 property.
     * 
     */
    public boolean isProtectExtRef4() {
        return protectExtRef4;
    }

    /**
     * Sets the value of the protectExtRef4 property.
     * 
     */
    public void setProtectExtRef4(boolean value) {
        this.protectExtRef4 = value;
    }

    /**
     * Gets the value of the protectExtRef5 property.
     * 
     */
    public boolean isProtectExtRef5() {
        return protectExtRef5;
    }

    /**
     * Sets the value of the protectExtRef5 property.
     * 
     */
    public void setProtectExtRef5(boolean value) {
        this.protectExtRef5 = value;
    }

    /**
     * Gets the value of the protectExtRef6 property.
     * 
     */
    public boolean isProtectExtRef6() {
        return protectExtRef6;
    }

    /**
     * Sets the value of the protectExtRef6 property.
     * 
     */
    public void setProtectExtRef6(boolean value) {
        this.protectExtRef6 = value;
    }

}