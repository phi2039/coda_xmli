//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:50 AM EST 
//


package com.coda.efinance.schemas.matching;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.RequestVerb;


/**
 * Retrieves the document lines in the selected matching group(s) where a driving line must be specified. One document line can be set as the driving line in its matching group.
 * 
 * <p>Java class for GetDrivingLineInfoRequestVerb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDrivingLineInfoRequestVerb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}RequestVerb"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Request" type="{http://www.coda.com/efinance/schemas/matching}GetDrivingLineInfoRequest" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDrivingLineInfoRequestVerb", propOrder = {
    "request"
})
public class GetDrivingLineInfoRequestVerb
    extends RequestVerb
    implements Serializable
{

    @XmlElement(name = "Request", required = true)
    protected List<GetDrivingLineInfoRequest> request;

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
     * {@link GetDrivingLineInfoRequest }
     * 
     * 
     */
    public List<GetDrivingLineInfoRequest> getRequest() {
        if (request == null) {
            request = new ArrayList<GetDrivingLineInfoRequest>();
        }
        return this.request;
    }

}
