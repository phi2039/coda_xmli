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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.coda.efinance.schemas.common.TypeComAlertPriority;


/**
 * <p>Java class for TranslatedAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranslatedAlert"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alert" type="{http://www.coda.com/common/schemas/alerts}AlertKey"/&gt;
 *         &lt;element name="Summary" type="{http://www.coda.com/efinance/schemas/common}typeText"/&gt;
 *         &lt;element name="Detail" type="{http://www.coda.com/efinance/schemas/common}typeText"/&gt;
 *         &lt;element name="Priority" type="{http://www.coda.com/efinance/schemas/common}typeComAlertPriority"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranslatedAlert", propOrder = {
    "alert",
    "summary",
    "detail",
    "priority"
})
public class TranslatedAlert
    implements Serializable
{

    @XmlElement(name = "Alert", required = true)
    protected AlertKey alert;
    @XmlElement(name = "Summary", required = true)
    protected String summary;
    @XmlElement(name = "Detail", required = true)
    protected String detail;
    @XmlElement(name = "Priority", required = true)
    @XmlSchemaType(name = "string")
    protected TypeComAlertPriority priority;

    /**
     * Gets the value of the alert property.
     * 
     * @return
     *     possible object is
     *     {@link AlertKey }
     *     
     */
    public AlertKey getAlert() {
        return alert;
    }

    /**
     * Sets the value of the alert property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertKey }
     *     
     */
    public void setAlert(AlertKey value) {
        this.alert = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetail(String value) {
        this.detail = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link TypeComAlertPriority }
     *     
     */
    public TypeComAlertPriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeComAlertPriority }
     *     
     */
    public void setPriority(TypeComAlertPriority value) {
        this.priority = value;
    }

}
