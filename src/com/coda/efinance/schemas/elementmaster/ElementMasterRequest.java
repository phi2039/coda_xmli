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
import com.coda.efinance.schemas.common.ServiceRequest;


/**
 * This service allows you to maintain element masters.
 * 
 * <p>Java class for ElementMasterRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementMasterRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}ServiceRequest"&gt;
 *       &lt;all&gt;
 *         &lt;element name="List" type="{http://www.coda.com/efinance/schemas/elementmaster}ListRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Add" type="{http://www.coda.com/efinance/schemas/elementmaster}AddRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Get" type="{http://www.coda.com/efinance/schemas/elementmaster}GetRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Update" type="{http://www.coda.com/efinance/schemas/elementmaster}UpdateRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Set" type="{http://www.coda.com/efinance/schemas/elementmaster}SetRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Delete" type="{http://www.coda.com/efinance/schemas/elementmaster}DeleteRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetBanks" type="{http://www.coda.com/efinance/schemas/elementmaster}GetBanksRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetAddresses" type="{http://www.coda.com/efinance/schemas/elementmaster}GetAddressesRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Fetch" type="{http://www.coda.com/efinance/schemas/elementmaster}FetchRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="ListPunchoutItemCodes" type="{http://www.coda.com/efinance/schemas/elementmaster}ListPunchoutItemCodesRequestVerb" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementMasterRequest", propOrder = {
    "list",
    "add",
    "get",
    "update",
    "set",
    "delete",
    "getBanks",
    "getAddresses",
    "fetch",
    "listPunchoutItemCodes"
})
public class ElementMasterRequest
    extends ServiceRequest
    implements Serializable
{

    @XmlElement(name = "List")
    protected ListRequestVerb list;
    @XmlElement(name = "Add")
    protected AddRequestVerb add;
    @XmlElement(name = "Get")
    protected GetRequestVerb get;
    @XmlElement(name = "Update")
    protected UpdateRequestVerb update;
    @XmlElement(name = "Set")
    protected SetRequestVerb set;
    @XmlElement(name = "Delete")
    protected DeleteRequestVerb delete;
    @XmlElement(name = "GetBanks")
    protected GetBanksRequestVerb getBanks;
    @XmlElement(name = "GetAddresses")
    protected GetAddressesRequestVerb getAddresses;
    @XmlElement(name = "Fetch")
    protected FetchRequestVerb fetch;
    @XmlElement(name = "ListPunchoutItemCodes")
    protected ListPunchoutItemCodesRequestVerb listPunchoutItemCodes;

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
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link SetRequestVerb }
     *     
     */
    public SetRequestVerb getSet() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetRequestVerb }
     *     
     */
    public void setSet(SetRequestVerb value) {
        this.set = value;
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
     * Gets the value of the getBanks property.
     * 
     * @return
     *     possible object is
     *     {@link GetBanksRequestVerb }
     *     
     */
    public GetBanksRequestVerb getGetBanks() {
        return getBanks;
    }

    /**
     * Sets the value of the getBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBanksRequestVerb }
     *     
     */
    public void setGetBanks(GetBanksRequestVerb value) {
        this.getBanks = value;
    }

    /**
     * Gets the value of the getAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link GetAddressesRequestVerb }
     *     
     */
    public GetAddressesRequestVerb getGetAddresses() {
        return getAddresses;
    }

    /**
     * Sets the value of the getAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAddressesRequestVerb }
     *     
     */
    public void setGetAddresses(GetAddressesRequestVerb value) {
        this.getAddresses = value;
    }

    /**
     * Gets the value of the fetch property.
     * 
     * @return
     *     possible object is
     *     {@link FetchRequestVerb }
     *     
     */
    public FetchRequestVerb getFetch() {
        return fetch;
    }

    /**
     * Sets the value of the fetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link FetchRequestVerb }
     *     
     */
    public void setFetch(FetchRequestVerb value) {
        this.fetch = value;
    }

    /**
     * Gets the value of the listPunchoutItemCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ListPunchoutItemCodesRequestVerb }
     *     
     */
    public ListPunchoutItemCodesRequestVerb getListPunchoutItemCodes() {
        return listPunchoutItemCodes;
    }

    /**
     * Sets the value of the listPunchoutItemCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListPunchoutItemCodesRequestVerb }
     *     
     */
    public void setListPunchoutItemCodes(ListPunchoutItemCodesRequestVerb value) {
        this.listPunchoutItemCodes = value;
    }

}