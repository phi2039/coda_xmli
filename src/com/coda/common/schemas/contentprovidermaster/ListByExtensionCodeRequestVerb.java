//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:45:08 AM EST 
//


package com.coda.common.schemas.contentprovidermaster;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.RequestVerb;


/**
 * Lists the content provider masters using the specified extension master.
 * 
 * <p>Java class for ListByExtensionCodeRequestVerb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListByExtensionCodeRequestVerb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}RequestVerb"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request" type="{http://www.coda.com/common/schemas/contentprovidermaster}ListByExtensionCodeRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListByExtensionCodeRequestVerb", propOrder = {
    "request"
})
public class ListByExtensionCodeRequestVerb
    extends RequestVerb
    implements Serializable
{

    @XmlElement(name = "Request")
    protected List<ListByExtensionCodeRequest> request;

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
     * {@link ListByExtensionCodeRequest }
     * 
     * 
     */
    public List<ListByExtensionCodeRequest> getRequest() {
        if (request == null) {
            request = new ArrayList<ListByExtensionCodeRequest>();
        }
        return this.request;
    }

}
