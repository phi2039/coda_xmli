//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:38 AM EST 
//


package com.coda.common.schemas.positions;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.common.schemas.udfmaster.UDFMasterKey;


/**
 * This element contains the definition of a position attribute.
 * 
 * <p>Java class for PositionAttributeDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionAttributeDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldCode" type="{http://www.coda.com/efinance/schemas/common}typeCode"/&gt;
 *         &lt;element name="Label" type="{http://www.coda.com/efinance/schemas/common}typeShortName"/&gt;
 *         &lt;element name="Sequence" type="{http://www.coda.com/efinance/schemas/common}typeWord"/&gt;
 *         &lt;element name="UDFMaster" type="{http://www.coda.com/common/schemas/udfmaster}UDFMasterKey" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceCount" type="{http://www.coda.com/efinance/schemas/common}typeULongB" minOccurs="0"/&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionAttributeDefinition", propOrder = {
    "fieldCode",
    "label",
    "sequence",
    "udfMaster",
    "referenceCount",
    "timeStamp"
})
public class PositionAttributeDefinition
    implements Serializable
{

    @XmlElement(name = "FieldCode", required = true)
    protected String fieldCode;
    @XmlElement(name = "Label", required = true)
    protected String label;
    @XmlElement(name = "Sequence")
    protected short sequence;
    @XmlElement(name = "UDFMaster")
    protected UDFMasterKey udfMaster;
    @XmlElement(name = "ReferenceCount")
    protected Integer referenceCount;
    @XmlElement(name = "TimeStamp")
    protected short timeStamp;

    /**
     * Gets the value of the fieldCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldCode() {
        return fieldCode;
    }

    /**
     * Sets the value of the fieldCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldCode(String value) {
        this.fieldCode = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     */
    public short getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(short value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the udfMaster property.
     * 
     * @return
     *     possible object is
     *     {@link UDFMasterKey }
     *     
     */
    public UDFMasterKey getUDFMaster() {
        return udfMaster;
    }

    /**
     * Sets the value of the udfMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link UDFMasterKey }
     *     
     */
    public void setUDFMaster(UDFMasterKey value) {
        this.udfMaster = value;
    }

    /**
     * Gets the value of the referenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferenceCount() {
        return referenceCount;
    }

    /**
     * Sets the value of the referenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferenceCount(Integer value) {
        this.referenceCount = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     */
    public short getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     */
    public void setTimeStamp(short value) {
        this.timeStamp = value;
    }

}
