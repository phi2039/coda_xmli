//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:45:01 AM EST 
//


package com.coda.common.schemas.homepagetemplatemaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.common.schemas.homepage.ContentProviderList;
import com.coda.efinance.schemas.common.Response;


/**
 * <p>Java class for GetResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Response"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="HomePageTemplate" type="{http://www.coda.com/common/schemas/homepagetemplatemaster}HomePageTemplate" minOccurs="0"/&gt;
 *         &lt;element name="ContentProviders" type="{http://www.coda.com/common/schemas/homepage}ContentProviderList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetResponse", propOrder = {
    "code",
    "homePageTemplate",
    "contentProviders"
})
public class GetResponse
    extends Response
    implements Serializable
{

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "HomePageTemplate")
    protected HomePageTemplate homePageTemplate;
    @XmlElement(name = "ContentProviders")
    protected ContentProviderList contentProviders;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the homePageTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link HomePageTemplate }
     *     
     */
    public HomePageTemplate getHomePageTemplate() {
        return homePageTemplate;
    }

    /**
     * Sets the value of the homePageTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomePageTemplate }
     *     
     */
    public void setHomePageTemplate(HomePageTemplate value) {
        this.homePageTemplate = value;
    }

    /**
     * Gets the value of the contentProviders property.
     * 
     * @return
     *     possible object is
     *     {@link ContentProviderList }
     *     
     */
    public ContentProviderList getContentProviders() {
        return contentProviders;
    }

    /**
     * Sets the value of the contentProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentProviderList }
     *     
     */
    public void setContentProviders(ContentProviderList value) {
        this.contentProviders = value;
    }

}
