//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:45:08 AM EST 
//


package com.coda.common.schemas.contentprovidermaster;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.Request;


/**
 * <p>Java class for UpdateSystemParametersRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSystemParametersRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.coda.com/efinance/schemas/common}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="OldParams" type="{http://www.coda.com/common/schemas/contentprovidermaster}ProviderConfiguration"/&gt;
 *         &lt;element name="NewParams" type="{http://www.coda.com/common/schemas/contentprovidermaster}ProviderConfiguration"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSystemParametersRequest", propOrder = {
    "code",
    "oldParams",
    "newParams"
})
public class UpdateSystemParametersRequest
    extends Request
    implements Serializable
{

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "OldParams", required = true)
    protected ProviderConfiguration oldParams;
    @XmlElement(name = "NewParams", required = true)
    protected ProviderConfiguration newParams;

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
     * Gets the value of the oldParams property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderConfiguration }
     *     
     */
    public ProviderConfiguration getOldParams() {
        return oldParams;
    }

    /**
     * Sets the value of the oldParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderConfiguration }
     *     
     */
    public void setOldParams(ProviderConfiguration value) {
        this.oldParams = value;
    }

    /**
     * Gets the value of the newParams property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderConfiguration }
     *     
     */
    public ProviderConfiguration getNewParams() {
        return newParams;
    }

    /**
     * Sets the value of the newParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderConfiguration }
     *     
     */
    public void setNewParams(ProviderConfiguration value) {
        this.newParams = value;
    }

}