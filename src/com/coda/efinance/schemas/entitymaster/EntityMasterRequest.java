//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:57 AM EST 
//


package com.coda.efinance.schemas.entitymaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.ServiceRequest;


/**
 * This service allows you to maintain the entities within a company.
 * 
 * <p>Java class for EntityMasterRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityMasterRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}ServiceRequest"&gt;
 *       &lt;all&gt;
 *         &lt;element name="List" type="{http://www.coda.com/efinance/schemas/entitymaster}ListRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Add" type="{http://www.coda.com/efinance/schemas/entitymaster}AddRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Get" type="{http://www.coda.com/efinance/schemas/entitymaster}GetRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Update" type="{http://www.coda.com/efinance/schemas/entitymaster}UpdateRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="Delete" type="{http://www.coda.com/efinance/schemas/entitymaster}DeleteRequestVerb" minOccurs="0"/&gt;
 *         &lt;element name="GetCmpEntities" type="{http://www.coda.com/efinance/schemas/entitymaster}GetCmpEntitiesRequestVerb" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityMasterRequest", propOrder = {
    "list",
    "add",
    "get",
    "update",
    "delete",
    "getCmpEntities"
})
public class EntityMasterRequest
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
    @XmlElement(name = "Delete")
    protected DeleteRequestVerb delete;
    @XmlElement(name = "GetCmpEntities")
    protected GetCmpEntitiesRequestVerb getCmpEntities;

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
     * Gets the value of the getCmpEntities property.
     * 
     * @return
     *     possible object is
     *     {@link GetCmpEntitiesRequestVerb }
     *     
     */
    public GetCmpEntitiesRequestVerb getGetCmpEntities() {
        return getCmpEntities;
    }

    /**
     * Sets the value of the getCmpEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCmpEntitiesRequestVerb }
     *     
     */
    public void setGetCmpEntities(GetCmpEntitiesRequestVerb value) {
        this.getCmpEntities = value;
    }

}
