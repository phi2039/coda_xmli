//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:06 AM EST 
//


package com.coda.efinance.schemas.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.RequestVerb;


/**
 * Updates company masters in the database using the company information you provide.
 * 
 * <p>Java class for UpdateRequestVerb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateRequestVerb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}RequestVerb"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request" type="{http://www.coda.com/efinance/schemas/company}UpdateRequest" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="candeleteretailinfo" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="candeletesalesinvoiceinfo" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRequestVerb", propOrder = {
    "request"
})
public class UpdateRequestVerb
    extends RequestVerb
    implements Serializable
{

    @XmlElement(name = "Request", required = true)
    protected List<UpdateRequest> request;
    @XmlAttribute(name = "candeleteretailinfo")
    protected Boolean candeleteretailinfo;
    @XmlAttribute(name = "candeletesalesinvoiceinfo")
    protected Boolean candeletesalesinvoiceinfo;

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
     * {@link UpdateRequest }
     * 
     * 
     */
    public List<UpdateRequest> getRequest() {
        if (request == null) {
            request = new ArrayList<UpdateRequest>();
        }
        return this.request;
    }

    /**
     * Gets the value of the candeleteretailinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCandeleteretailinfo() {
        return candeleteretailinfo;
    }

    /**
     * Sets the value of the candeleteretailinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCandeleteretailinfo(Boolean value) {
        this.candeleteretailinfo = value;
    }

    /**
     * Gets the value of the candeletesalesinvoiceinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCandeletesalesinvoiceinfo() {
        return candeletesalesinvoiceinfo;
    }

    /**
     * Sets the value of the candeletesalesinvoiceinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCandeletesalesinvoiceinfo(Boolean value) {
        this.candeletesalesinvoiceinfo = value;
    }

}
