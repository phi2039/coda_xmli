//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:46 AM EST 
//


package com.coda.common.schemas.usermaster;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.RequestVerb;


/**
 * Creates new CODA user masters in the database using the information you provide.
 * 
 * <p>Java class for AddRequestVerb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddRequestVerb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}RequestVerb"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request" type="{http://www.coda.com/common/schemas/usermaster}AddRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
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
    extends RequestVerb
    implements Serializable
{

    @XmlElement(name = "Request")
    protected List<AddRequest> request;

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

}
