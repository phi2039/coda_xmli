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
import com.coda.efinance.schemas.common.ServiceRequest;


/**
 * This service allows you to maintain currency masters.
 * 
 * <p>Java class for CurrencyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}ServiceRequest"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Add" type="{http://www.coda.com/efinance/schemas/currency}AddRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Update" type="{http://www.coda.com/efinance/schemas/currency}UpdateRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Get" type="{http://www.coda.com/efinance/schemas/currency}GetRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Delete" type="{http://www.coda.com/efinance/schemas/currency}DeleteRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="List" type="{http://www.coda.com/efinance/schemas/currency}ListRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="ListAll" type="{http://www.coda.com/efinance/schemas/currency}ListAllRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="ListChildren" type="{http://www.coda.com/efinance/schemas/currency}ListRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="ListParents" type="{http://www.coda.com/efinance/schemas/currency}ListRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetRates" type="{http://www.coda.com/efinance/schemas/currency}GetRateRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="AddRates" type="{http://www.coda.com/efinance/schemas/currency}AddRateRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="UpdateRates" type="{http://www.coda.com/efinance/schemas/currency}UpdateRateRequestVerb" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyRequest", propOrder = {
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
public class CurrencyRequest
    extends ServiceRequest
    implements Serializable
{

    @XmlElement(name = "Add")
    protected AddRequestVerb add;
    @XmlElement(name = "Update")
    protected UpdateRequestVerb update;
    @XmlElement(name = "Get")
    protected GetRequestVerb get;
    @XmlElement(name = "Delete")
    protected DeleteRequestVerb delete;
    @XmlElement(name = "List")
    protected ListRequestVerb list;
    @XmlElement(name = "ListAll")
    protected ListAllRequestVerb listAll;
    @XmlElement(name = "ListChildren")
    protected ListRequestVerb listChildren;
    @XmlElement(name = "ListParents")
    protected ListRequestVerb listParents;
    @XmlElement(name = "GetRates")
    protected GetRateRequestVerb getRates;
    @XmlElement(name = "AddRates")
    protected AddRateRequestVerb addRates;
    @XmlElement(name = "UpdateRates")
    protected UpdateRateRequestVerb updateRates;

    /**
     * Gets the value of the add property.
     * 
     * @return
     *     possible object is
     *     {@link AddRequestVerb }
     *     
     */
    public AddRequestVerb getAdd() {
        return add;
    }

    /**
     * Sets the value of the add property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddRequestVerb }
     *     
     */
    public void setAdd(AddRequestVerb value) {
        this.add = value;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRequestVerb }
     *     
     */
    public UpdateRequestVerb getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRequestVerb }
     *     
     */
    public void setUpdate(UpdateRequestVerb value) {
        this.update = value;
    }

    /**
     * Gets the value of the get property.
     * 
     * @return
     *     possible object is
     *     {@link GetRequestVerb }
     *     
     */
    public GetRequestVerb getGet() {
        return get;
    }

    /**
     * Sets the value of the get property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRequestVerb }
     *     
     */
    public void setGet(GetRequestVerb value) {
        this.get = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteRequestVerb }
     *     
     */
    public DeleteRequestVerb getDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteRequestVerb }
     *     
     */
    public void setDelete(DeleteRequestVerb value) {
        this.delete = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link ListRequestVerb }
     *     
     */
    public ListRequestVerb getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListRequestVerb }
     *     
     */
    public void setList(ListRequestVerb value) {
        this.list = value;
    }

    /**
     * Gets the value of the listAll property.
     * 
     * @return
     *     possible object is
     *     {@link ListAllRequestVerb }
     *     
     */
    public ListAllRequestVerb getListAll() {
        return listAll;
    }

    /**
     * Sets the value of the listAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAllRequestVerb }
     *     
     */
    public void setListAll(ListAllRequestVerb value) {
        this.listAll = value;
    }

    /**
     * Gets the value of the listChildren property.
     * 
     * @return
     *     possible object is
     *     {@link ListRequestVerb }
     *     
     */
    public ListRequestVerb getListChildren() {
        return listChildren;
    }

    /**
     * Sets the value of the listChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListRequestVerb }
     *     
     */
    public void setListChildren(ListRequestVerb value) {
        this.listChildren = value;
    }

    /**
     * Gets the value of the listParents property.
     * 
     * @return
     *     possible object is
     *     {@link ListRequestVerb }
     *     
     */
    public ListRequestVerb getListParents() {
        return listParents;
    }

    /**
     * Sets the value of the listParents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListRequestVerb }
     *     
     */
    public void setListParents(ListRequestVerb value) {
        this.listParents = value;
    }

    /**
     * Gets the value of the getRates property.
     * 
     * @return
     *     possible object is
     *     {@link GetRateRequestVerb }
     *     
     */
    public GetRateRequestVerb getGetRates() {
        return getRates;
    }

    /**
     * Sets the value of the getRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRateRequestVerb }
     *     
     */
    public void setGetRates(GetRateRequestVerb value) {
        this.getRates = value;
    }

    /**
     * Gets the value of the addRates property.
     * 
     * @return
     *     possible object is
     *     {@link AddRateRequestVerb }
     *     
     */
    public AddRateRequestVerb getAddRates() {
        return addRates;
    }

    /**
     * Sets the value of the addRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddRateRequestVerb }
     *     
     */
    public void setAddRates(AddRateRequestVerb value) {
        this.addRates = value;
    }

    /**
     * Gets the value of the updateRates property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateRateRequestVerb }
     *     
     */
    public UpdateRateRequestVerb getUpdateRates() {
        return updateRates;
    }

    /**
     * Sets the value of the updateRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateRateRequestVerb }
     *     
     */
    public void setUpdateRates(UpdateRateRequestVerb value) {
        this.updateRates = value;
    }

}
