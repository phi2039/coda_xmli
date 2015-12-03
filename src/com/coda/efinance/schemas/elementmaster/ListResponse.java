//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:25 AM EST 
//


package com.coda.efinance.schemas.elementmaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.Response;


/**
 * <p>Java class for ListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Filter" type="{http://www.coda.com/efinance/schemas/elementmaster}elmReqFullKeys"/&gt;
 *         &lt;element name="Keys" type="{http://www.coda.com/efinance/schemas/elementmaster}elmKeyData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListResponse", propOrder = {
    "filter",
    "keys"
})
public class ListResponse
    extends Response
    implements Serializable
{

    @XmlElement(name = "Filter", required = true)
    protected ElmReqFullKeys filter;
    @XmlElement(name = "Keys")
    protected ElmKeyData keys;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link ElmReqFullKeys }
     *     
     */
    public ElmReqFullKeys getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElmReqFullKeys }
     *     
     */
    public void setFilter(ElmReqFullKeys value) {
        this.filter = value;
    }

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link ElmKeyData }
     *     
     */
    public ElmKeyData getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElmKeyData }
     *     
     */
    public void setKeys(ElmKeyData value) {
        this.keys = value;
    }

}
