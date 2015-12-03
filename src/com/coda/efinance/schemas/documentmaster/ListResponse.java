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
import com.coda.efinance.schemas.common.KeyData;
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
 *         &lt;element name="Filter" type="{http://www.coda.com/efinance/schemas/documentmaster}PrintDocSelectKey"/&gt;
 *         &lt;element name="Keys" type="{http://www.coda.com/efinance/schemas/common}KeyData" minOccurs="0"/&gt;
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
    protected PrintDocSelectKey filter;
    @XmlElement(name = "Keys")
    protected KeyData keys;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link PrintDocSelectKey }
     *     
     */
    public PrintDocSelectKey getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintDocSelectKey }
     *     
     */
    public void setFilter(PrintDocSelectKey value) {
        this.filter = value;
    }

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link KeyData }
     *     
     */
    public KeyData getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyData }
     *     
     */
    public void setKeys(KeyData value) {
        this.keys = value;
    }

}
