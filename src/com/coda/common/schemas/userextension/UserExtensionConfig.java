//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:53 AM EST 
//


package com.coda.common.schemas.userextension;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element holds configuration information for a user extension master.
 * 
 * <p>Java class for UserExtensionConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserExtensionConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.coda.com/efinance/schemas/common}typeCode"/&gt;
 *         &lt;element name="ConfigurationID" type="{http://www.coda.com/efinance/schemas/common}typeLong"/&gt;
 *         &lt;element name="ConfigItemList" type="{http://www.coda.com/common/schemas/userextension}UserExtensionConfigItemList"/&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserExtensionConfig", propOrder = {
    "code",
    "configurationID",
    "configItemList",
    "timeStamp"
})
public class UserExtensionConfig
    implements Serializable
{

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "ConfigurationID")
    protected int configurationID;
    @XmlElement(name = "ConfigItemList", required = true)
    protected UserExtensionConfigItemList configItemList;
    @XmlElement(name = "TimeStamp")
    protected short timeStamp;

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
     * Gets the value of the configurationID property.
     * 
     */
    public int getConfigurationID() {
        return configurationID;
    }

    /**
     * Sets the value of the configurationID property.
     * 
     */
    public void setConfigurationID(int value) {
        this.configurationID = value;
    }

    /**
     * Gets the value of the configItemList property.
     * 
     * @return
     *     possible object is
     *     {@link UserExtensionConfigItemList }
     *     
     */
    public UserExtensionConfigItemList getConfigItemList() {
        return configItemList;
    }

    /**
     * Sets the value of the configItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserExtensionConfigItemList }
     *     
     */
    public void setConfigItemList(UserExtensionConfigItemList value) {
        this.configItemList = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     */
    public short getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     */
    public void setTimeStamp(short value) {
        this.timeStamp = value;
    }

}
