//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:25 AM EST 
//


package com.coda.efinance.schemas.elementmaster;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.MultiCompanyRequestVerb;


/**
 * Creates new element masters in the database using the element information you provide.
 * 
 * <p>Java class for AddRequestVerb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRequestVerb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}MultiCompanyRequestVerb"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request" type="{http://www.coda.com/efinance/schemas/elementmaster}AddRequest" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="templatecmpcode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode" /&gt;
 *       &lt;attribute name="templatecode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode" /&gt;
 *       &lt;attribute name="inhibitinitialisationfromtemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="autogeneratefromtemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddRequestVerb", propOrder = {
    "request"
})
public class AddRequestVerb
    extends MultiCompanyRequestVerb
    implements Serializable
{

    @XmlElement(name = "Request", required = true)
    protected List<AddRequest> request;
    @XmlAttribute(name = "templatecmpcode")
    protected String templatecmpcode;
    @XmlAttribute(name = "templatecode")
    protected String templatecode;
    @XmlAttribute(name = "inhibitinitialisationfromtemplate")
    protected Boolean inhibitinitialisationfromtemplate;
    @XmlAttribute(name = "autogeneratefromtemplate")
    protected Boolean autogeneratefromtemplate;

    /**
     * Gets the value of the request property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the request property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddRequest }
     * 
     * 
     */
    public List<AddRequest> getRequest() {
        if (request == null) {
            request = new ArrayList<AddRequest>();
        }
        return this.request;
    }

    /**
     * Gets the value of the templatecmpcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplatecmpcode() {
        return templatecmpcode;
    }

    /**
     * Sets the value of the templatecmpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplatecmpcode(String value) {
        this.templatecmpcode = value;
    }

    /**
     * Gets the value of the templatecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplatecode() {
        return templatecode;
    }

    /**
     * Sets the value of the templatecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplatecode(String value) {
        this.templatecode = value;
    }

    /**
     * Gets the value of the inhibitinitialisationfromtemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInhibitinitialisationfromtemplate() {
        return inhibitinitialisationfromtemplate;
    }

    /**
     * Sets the value of the inhibitinitialisationfromtemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInhibitinitialisationfromtemplate(Boolean value) {
        this.inhibitinitialisationfromtemplate = value;
    }

    /**
     * Gets the value of the autogeneratefromtemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutogeneratefromtemplate() {
        return autogeneratefromtemplate;
    }

    /**
     * Sets the value of the autogeneratefromtemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutogeneratefromtemplate(Boolean value) {
        this.autogeneratefromtemplate = value;
    }

}