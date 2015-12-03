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
 * <p>Java class for GetAddressesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAddressesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://www.coda.com/efinance/schemas/elementmaster}elmFullKeyWithTemporaryElmFilter"/&gt;
 *         &lt;element name="Addresses" type="{http://www.coda.com/efinance/schemas/elementmaster}AddressData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAddressesResponse", propOrder = {
    "key",
    "addresses"
})
public class GetAddressesResponse
    extends Response
    implements Serializable
{

    @XmlElement(name = "Key", required = true)
    protected ElmFullKeyWithTemporaryElmFilter key;
    @XmlElement(name = "Addresses")
    protected AddressData addresses;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link ElmFullKeyWithTemporaryElmFilter }
     *     
     */
    public ElmFullKeyWithTemporaryElmFilter getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElmFullKeyWithTemporaryElmFilter }
     *     
     */
    public void setKey(ElmFullKeyWithTemporaryElmFilter value) {
        this.key = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link AddressData }
     *     
     */
    public AddressData getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressData }
     *     
     */
    public void setAddresses(AddressData value) {
        this.addresses = value;
    }

}
