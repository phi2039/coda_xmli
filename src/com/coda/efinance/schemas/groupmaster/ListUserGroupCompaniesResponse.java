//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:04 AM EST 
//


package com.coda.efinance.schemas.groupmaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.Response;


/**
 * <p>Java class for ListUserGroupCompaniesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListUserGroupCompaniesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Key" type="{http://www.coda.com/efinance/schemas/groupmaster}grpUserCompanyKey"/&gt;
 *         &lt;element name="CompanyGroups" type="{http://www.coda.com/efinance/schemas/groupmaster}UserCompanyList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListUserGroupCompaniesResponse", propOrder = {
    "key",
    "companyGroups"
})
public class ListUserGroupCompaniesResponse
    extends Response
    implements Serializable
{

    @XmlElement(name = "Key", required = true)
    protected GrpUserCompanyKey key;
    @XmlElement(name = "CompanyGroups")
    protected UserCompanyList companyGroups;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link GrpUserCompanyKey }
     *     
     */
    public GrpUserCompanyKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpUserCompanyKey }
     *     
     */
    public void setKey(GrpUserCompanyKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the companyGroups property.
     * 
     * @return
     *     possible object is
     *     {@link UserCompanyList }
     *     
     */
    public UserCompanyList getCompanyGroups() {
        return companyGroups;
    }

    /**
     * Sets the value of the companyGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserCompanyList }
     *     
     */
    public void setCompanyGroups(UserCompanyList value) {
        this.companyGroups = value;
    }

}