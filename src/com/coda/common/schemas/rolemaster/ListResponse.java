//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:24 AM EST 
//


package com.coda.common.schemas.rolemaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="RoleItemList" type="{http://www.coda.com/common/schemas/rolemaster}RoleItemList"/&gt;
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
    "roleItemList"
})
public class ListResponse
    extends Response
    implements Serializable
{

    @XmlElement(name = "RoleItemList", required = true)
    protected RoleItemList roleItemList;

    /**
     * Gets the value of the roleItemList property.
     * 
     * @return
     *     possible object is
     *     {@link RoleItemList }
     *     
     */
    public RoleItemList getRoleItemList() {
        return roleItemList;
    }

    /**
     * Sets the value of the roleItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleItemList }
     *     
     */
    public void setRoleItemList(RoleItemList value) {
        this.roleItemList = value;
    }

}
