//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:12 AM EST 
//


package com.coda.efinance.schemas.currency;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.AllKeysData;
import com.coda.efinance.schemas.common.ReqAllKeys;
import com.coda.efinance.schemas.common.Response;


/**
 * <p>Java class for ListAllResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListAllResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Filter" type="{http://www.coda.com/efinance/schemas/common}ReqAllKeys"/&gt;
 *         &lt;element name="Keys" type="{http://www.coda.com/efinance/schemas/common}AllKeysData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListAllResponse", propOrder = {
    "filter",
    "keys"
})
public class ListAllResponse
    extends Response
    implements Serializable
{

    @XmlElement(name = "Filter", required = true)
    protected ReqAllKeys filter;
    @XmlElement(name = "Keys")
    protected AllKeysData keys;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link ReqAllKeys }
     *     
     */
    public ReqAllKeys getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqAllKeys }
     *     
     */
    public void setFilter(ReqAllKeys value) {
        this.filter = value;
    }

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link AllKeysData }
     *     
     */
    public AllKeysData getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllKeysData }
     *     
     */
    public void setKeys(AllKeysData value) {
        this.keys = value;
    }

}
