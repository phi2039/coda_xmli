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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.ResponseVerb;


/**
 * Contains the responses to your requests with this verb.
 * 
 * <p>Java class for PostToXResponseVerb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostToXResponseVerb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}ResponseVerb"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Response" type="{http://www.coda.com/efinance/schemas/input}PostToXResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostToXResponseVerb", propOrder = {
    "response"
})
public class PostToXResponseVerb
    extends ResponseVerb
    implements Serializable
{

    @XmlElement(name = "Response")
    protected List<PostToXResponse> response;

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
     * {@link PostToXResponse }
     * 
     * 
     */
    public List<PostToXResponse> getResponse() {
        if (response == null) {
            response = new ArrayList<PostToXResponse>();
        }
        return this.response;
    }

}
