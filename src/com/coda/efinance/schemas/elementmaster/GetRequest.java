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
import com.coda.efinance.schemas.common.Request;


/**
 * <p>Java class for GetRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://www.coda.com/efinance/schemas/elementmaster}elmFullKey"/&gt;
 *         &lt;element name="UseMnemonic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeLastTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CheckForPostings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRequest", propOrder = {
    "key",
    "useMnemonic",
    "includeLastTransaction",
    "checkForPostings"
})
public class GetRequest
    extends Request
    implements Serializable
{

    @XmlElement(name = "Key", required = true)
    protected ElmFullKey key;
    @XmlElement(name = "UseMnemonic")
    protected Boolean useMnemonic;
    @XmlElement(name = "IncludeLastTransaction")
    protected Boolean includeLastTransaction;
    @XmlElement(name = "CheckForPostings")
    protected Boolean checkForPostings;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ElmFullKey }
     *     
     */
    public ElmFullKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElmFullKey }
     *     
     */
    public void setKey(ElmFullKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the useMnemonic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseMnemonic() {
        return useMnemonic;
    }

    /**
     * Sets the value of the useMnemonic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseMnemonic(Boolean value) {
        this.useMnemonic = value;
    }

    /**
     * Gets the value of the includeLastTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeLastTransaction() {
        return includeLastTransaction;
    }

    /**
     * Sets the value of the includeLastTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeLastTransaction(Boolean value) {
        this.includeLastTransaction = value;
    }

    /**
     * Gets the value of the checkForPostings property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckForPostings() {
        return checkForPostings;
    }

    /**
     * Sets the value of the checkForPostings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckForPostings(Boolean value) {
        this.checkForPostings = value;
    }

}
