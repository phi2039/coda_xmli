//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:06 AM EST 
//


package com.coda.efinance.schemas.company;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.GlobalKey;
import com.coda.efinance.schemas.common.Request;


/**
 * <p>Java class for DeleteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://www.coda.com/efinance/schemas/common}GlobalKey"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteRequest", propOrder = {
    "key"
})
public class DeleteRequest
    extends Request
    implements Serializable
{

    @XmlElement(name = "Key", required = true)
    protected GlobalKey key;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalKey }
     *     
     */
    public GlobalKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalKey }
     *     
     */
    public void setKey(GlobalKey value) {
        this.key = value;
    }

}
