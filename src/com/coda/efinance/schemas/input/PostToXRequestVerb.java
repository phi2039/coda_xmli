//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:19 AM EST 
//


package com.coda.efinance.schemas.input;

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
 * Posts a document to the books.
 * 
 * <p>Java class for PostToXRequestVerb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostToXRequestVerb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}RequestVerb"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request" type="{http://www.coda.com/efinance/schemas/input}PostRequest" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="relaxtriangulation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="warningsareerrors" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="stoponerror" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="logerrorsonly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="reportallerrors" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostToXRequestVerb", propOrder = {
    "request"
})
public class PostToXRequestVerb
    extends RequestVerb
    implements Serializable
{

    @XmlElement(name = "Request", required = true)
    protected List<PostRequest> request;
    @XmlAttribute(name = "relaxtriangulation")
    protected Boolean relaxtriangulation;
    @XmlAttribute(name = "warningsareerrors")
    protected Boolean warningsareerrors;
    @XmlAttribute(name = "stoponerror")
    protected Boolean stoponerror;
    @XmlAttribute(name = "logerrorsonly")
    protected Boolean logerrorsonly;
    @XmlAttribute(name = "reportallerrors")
    protected Boolean reportallerrors;

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
     * {@link PostRequest }
     * 
     * 
     */
    public List<PostRequest> getRequest() {
        if (request == null) {
            request = new ArrayList<PostRequest>();
        }
        return this.request;
    }

    /**
     * Gets the value of the relaxtriangulation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRelaxtriangulation() {
        return relaxtriangulation;
    }

    /**
     * Sets the value of the relaxtriangulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelaxtriangulation(Boolean value) {
        this.relaxtriangulation = value;
    }

    /**
     * Gets the value of the warningsareerrors property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarningsareerrors() {
        return warningsareerrors;
    }

    /**
     * Sets the value of the warningsareerrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarningsareerrors(Boolean value) {
        this.warningsareerrors = value;
    }

    /**
     * Gets the value of the stoponerror property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoponerror() {
        return stoponerror;
    }

    /**
     * Sets the value of the stoponerror property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoponerror(Boolean value) {
        this.stoponerror = value;
    }

    /**
     * Gets the value of the logerrorsonly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogerrorsonly() {
        return logerrorsonly;
    }

    /**
     * Sets the value of the logerrorsonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogerrorsonly(Boolean value) {
        this.logerrorsonly = value;
    }

    /**
     * Gets the value of the reportallerrors property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportallerrors() {
        return reportallerrors;
    }

    /**
     * Sets the value of the reportallerrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportallerrors(Boolean value) {
        this.reportallerrors = value;
    }

}
