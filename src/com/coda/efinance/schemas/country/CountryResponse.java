//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:45:22 AM EST 
//


package com.coda.efinance.schemas.country;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.ServiceResponse;


/**
 * This is the response that is returned when you maintain country masters.
 * 
 * <p>Java class for CountryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}ServiceResponse"&gt;
 *       &lt;all&gt;
 *         &lt;element name="List" type="{http://www.coda.com/efinance/schemas/country}ListResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="Add" type="{http://www.coda.com/efinance/schemas/country}AddResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="Get" type="{http://www.coda.com/efinance/schemas/country}GetResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="Update" type="{http://www.coda.com/efinance/schemas/country}UpdateResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="Delete" type="{http://www.coda.com/efinance/schemas/country}DeleteResponseVerb" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryResponse", propOrder = {
    "list",
    "add",
    "get",
    "update",
    "delete"
})
public class CountryResponse
    extends ServiceResponse
    implements Serializable
{

    @XmlElement(name = "List")
    protected ListResponseVerb list;
    @XmlElement(name = "Add")
    protected AddResponseVerb add;
    @XmlElement(name = "Get")
    protected GetResponseVerb get;
    @XmlElement(name = "Update")
    protected UpdateResponseVerb update;
    @XmlElement(name = "Delete")
    protected DeleteResponseVerb delete;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link ListResponseVerb }
     *     
     */
    public ListResponseVerb getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListResponseVerb }
     *     
     */
    public void setList(ListResponseVerb value) {
        this.list = value;
    }

    /**
     * Gets the value of the add property.
     * 
     * @return
     *     possible object is
     *     {@link AddResponseVerb }
     *     
     */
    public AddResponseVerb getAdd() {
        return add;
    }

    /**
     * Sets the value of the add property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddResponseVerb }
     *     
     */
    public void setAdd(AddResponseVerb value) {
        this.add = value;
    }

    /**
     * Gets the value of the get property.
     * 
     * @return
     *     possible object is
     *     {@link GetResponseVerb }
     *     
     */
    public GetResponseVerb getGet() {
        return get;
    }

    /**
     * Sets the value of the get property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetResponseVerb }
     *     
     */
    public void setGet(GetResponseVerb value) {
        this.get = value;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateResponseVerb }
     *     
     */
    public UpdateResponseVerb getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateResponseVerb }
     *     
     */
    public void setUpdate(UpdateResponseVerb value) {
        this.update = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteResponseVerb }
     *     
     */
    public DeleteResponseVerb getDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteResponseVerb }
     *     
     */
    public void setDelete(DeleteResponseVerb value) {
        this.delete = value;
    }

}
