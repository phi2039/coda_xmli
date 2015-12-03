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
import com.coda.efinance.schemas.common.ServiceResponse;


/**
 * This is the response that is returned when you maintain currency masters.
 * 
 * <p>Java class for CurrencyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}ServiceResponse"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Add" type="{http://www.coda.com/efinance/schemas/currency}AddResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="Update" type="{http://www.coda.com/efinance/schemas/currency}UpdateResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="Get" type="{http://www.coda.com/efinance/schemas/currency}GetResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="Delete" type="{http://www.coda.com/efinance/schemas/currency}DeleteResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="List" type="{http://www.coda.com/efinance/schemas/currency}ListResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="ListAll" type="{http://www.coda.com/efinance/schemas/currency}ListAllResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="ListChildren" type="{http://www.coda.com/efinance/schemas/currency}ListResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="ListParents" type="{http://www.coda.com/efinance/schemas/currency}ListResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetRates" type="{http://www.coda.com/efinance/schemas/currency}GetRateResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="AddRates" type="{http://www.coda.com/efinance/schemas/currency}AddRateResponseVerb" minOccurs="0"/&gt;
 *         &lt;element name="UpdateRates" type="{http://www.coda.com/efinance/schemas/currency}UpdateRateResponseVerb" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyResponse", propOrder = {
    "add",
    "update",
    "get",
    "delete",
    "list",
    "listAll",
    "listChildren",
    "listParents",
    "getRates",
    "addRates",
    "updateRates"
})
public class CurrencyResponse
    extends ServiceResponse
    implements Serializable
{

    @XmlElement(name = "Add")
    protected AddResponseVerb add;
    @XmlElement(name = "Update")
    protected UpdateResponseVerb update;
    @XmlElement(name = "Get")
    protected GetResponseVerb get;
    @XmlElement(name = "Delete")
    protected DeleteResponseVerb delete;
    @XmlElement(name = "List")
    protected ListResponseVerb list;
    @XmlElement(name = "ListAll")
    protected ListAllResponseVerb listAll;
    @XmlElement(name = "ListChildren")
    protected ListResponseVerb listChildren;
    @XmlElement(name = "ListParents")
    protected ListResponseVerb listParents;
    @XmlElement(name = "GetRates")
    protected GetRateResponseVerb getRates;
    @XmlElement(name = "AddRates")
    protected AddRateResponseVerb addRates;
    @XmlElement(name = "UpdateRates")
    protected UpdateRateResponseVerb updateRates;

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
     * Gets the value of the listAll property.
     * 
     * @return
     *     possible object is
     *     {@link ListAllResponseVerb }
     *     
     */
    public ListAllResponseVerb getListAll() {
        return listAll;
    }

    /**
     * Sets the value of the listAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAllResponseVerb }
     *     
     */
    public void setListAll(ListAllResponseVerb value) {
        this.listAll = value;
    }

    /**
     * Gets the value of the listChildren property.
     * 
     * @return
     *     possible object is
     *     {@link ListResponseVerb }
     *     
     */
    public ListResponseVerb getListChildren() {
        return listChildren;
    }

    /**
     * Sets the value of the listChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListResponseVerb }
     *     
     */
    public void setListChildren(ListResponseVerb value) {
        this.listChildren = value;
    }

    /**
     * Gets the value of the listParents property.
     * 
     * @return
     *     possible object is
     *     {@link ListResponseVerb }
     *     
     */
    public ListResponseVerb getListParents() {
        return listParents;
    }

    /**
     * Sets the value of the listParents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListResponseVerb }
     *     
     */
    public void setListParents(ListResponseVerb value) {
        this.listParents = value;
    }

    /**
     * Gets the value of the getRates property.
     * 
     * @return
     *     possible object is
     *     {@link GetRateResponseVerb }
     *     
     */
    public GetRateResponseVerb getGetRates() {
        return getRates;
    }

    /**
     * Sets the value of the getRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRateResponseVerb }
     *     
     */
    public void setGetRates(GetRateResponseVerb value) {
        this.getRates = value;
    }

    /**
     * Gets the value of the addRates property.
     * 
     * @return
     *     possible object is
     *     {@link AddRateResponseVerb }
     *     
     */
    public AddRateResponseVerb getAddRates() {
        return addRates;
    }

    /**
     * Sets the value of the addRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddRateResponseVerb }
     *     
     */
    public void setAddRates(AddRateResponseVerb value) {
        this.addRates = value;
    }

    /**
     * Gets the value of the updateRates property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRateResponseVerb }
     *     
     */
    public UpdateRateResponseVerb getUpdateRates() {
        return updateRates;
    }

    /**
     * Sets the value of the updateRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRateResponseVerb }
     *     
     */
    public void setUpdateRates(UpdateRateResponseVerb value) {
        this.updateRates = value;
    }

}
