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
import com.coda.efinance.schemas.common.ResponseVerb;


/**
 * Contains the responses to your requests with this verb.
 * 
 * <p>Java class for UpdateSystemParametersResponseVerb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSystemParametersResponseVerb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}ResponseVerb"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Response" type="{http://www.coda.com/common/schemas/contentprovidermaster}UpdateSystemParametersResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSystemParametersResponseVerb", propOrder = {
    "response"
})
public class UpdateSystemParametersResponseVerb
    extends ResponseVerb
    implements Serializable
{

    @XmlElement(name = "Response")
    protected List<UpdateSystemParametersResponse> response;

    /**
     * Gets the value of the response property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateSystemParametersResponse }
     * 
     * 
     */
    public List<UpdateSystemParametersResponse> getResponse() {
        if (response == null) {
            response = new ArrayList<UpdateSystemParametersResponse>();
        }
        return this.response;
    }

}
