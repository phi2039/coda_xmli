//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:17 AM EST 
//


package com.coda.common.schemas.capabilitymaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.Response;


/**
 * <p>Java class for ExportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FullCapabilityList" type="{http://www.coda.com/common/schemas/capabilitymaster}FullCapabilityList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportResponse", propOrder = {
    "fullCapabilityList"
})
public class ExportResponse
    extends Response
    implements Serializable
{

    @XmlElement(name = "FullCapabilityList")
    protected FullCapabilityList fullCapabilityList;

    /**
     * Gets the value of the fullCapabilityList property.
     * 
     * @return
     *     possible object is
     *     {@link FullCapabilityList }
     *     
     */
    public FullCapabilityList getFullCapabilityList() {
        return fullCapabilityList;
    }

    /**
     * Sets the value of the fullCapabilityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullCapabilityList }
     *     
     */
    public void setFullCapabilityList(FullCapabilityList value) {
        this.fullCapabilityList = value;
    }

}
