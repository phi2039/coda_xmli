//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:38 AM EST 
//


package com.coda.common.schemas.alerts;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.coda.common.schemas.users.UserKey;


/**
 * <p>Java class for UnsentAlerts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnsentAlerts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="User" type="{http://www.coda.com/common/schemas/users}UserKey"/&gt;
 *         &lt;element name="NormalList" type="{http://www.coda.com/common/schemas/alerts}TranslatedAlertList"/&gt;
 *         &lt;element name="ImmediateList" type="{http://www.coda.com/common/schemas/alerts}TranslatedAlertList"/&gt;
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
@XmlType(name = "UnsentAlerts", propOrder = {
    "user",
    "normalList",
    "immediateList",
    "timeStamp"
})
public class UnsentAlerts
    implements Serializable
{

    @XmlElement(name = "User", required = true)
    protected UserKey user;
    @XmlElement(name = "NormalList", required = true)
    protected TranslatedAlertList normalList;
    @XmlElement(name = "ImmediateList", required = true)
    protected TranslatedAlertList immediateList;
    @XmlElement(name = "TimeStamp")
    protected short timeStamp;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserKey }
     *     
     */
    public UserKey getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserKey }
     *     
     */
    public void setUser(UserKey value) {
        this.user = value;
    }

    /**
     * Gets the value of the normalList property.
     * 
     * @return
     *     possible object is
     *     {@link TranslatedAlertList }
     *     
     */
    public TranslatedAlertList getNormalList() {
        return normalList;
    }

    /**
     * Sets the value of the normalList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslatedAlertList }
     *     
     */
    public void setNormalList(TranslatedAlertList value) {
        this.normalList = value;
    }

    /**
     * Gets the value of the immediateList property.
     * 
     * @return
     *     possible object is
     *     {@link TranslatedAlertList }
     *     
     */
    public TranslatedAlertList getImmediateList() {
        return immediateList;
    }

    /**
     * Sets the value of the immediateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslatedAlertList }
     *     
     */
    public void setImmediateList(TranslatedAlertList value) {
        this.immediateList = value;
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
