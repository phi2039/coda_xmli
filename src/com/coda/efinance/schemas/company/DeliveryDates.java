//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:43:06 AM EST 
//


package com.coda.efinance.schemas.company;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The days to take into account when calculating delivery dates using a lead time.
 * 
 * <p>Java class for DeliveryDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryDates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Monday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Tuesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Wednesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Thursday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Friday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Saturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Sunday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryDates", propOrder = {
    "monday",
    "tuesday",
    "wednesday",
    "thursday",
    "friday",
    "saturday",
    "sunday"
})
public class DeliveryDates
    implements Serializable
{

    @XmlElement(name = "Monday")
    protected boolean monday;
    @XmlElement(name = "Tuesday")
    protected boolean tuesday;
    @XmlElement(name = "Wednesday")
    protected boolean wednesday;
    @XmlElement(name = "Thursday")
    protected boolean thursday;
    @XmlElement(name = "Friday")
    protected boolean friday;
    @XmlElement(name = "Saturday")
    protected boolean saturday;
    @XmlElement(name = "Sunday")
    protected boolean sunday;

    /**
     * Gets the value of the monday property.
     * 
     */
    public boolean isMonday() {
        return monday;
    }

    /**
     * Sets the value of the monday property.
     * 
     */
    public void setMonday(boolean value) {
        this.monday = value;
    }

    /**
     * Gets the value of the tuesday property.
     * 
     */
    public boolean isTuesday() {
        return tuesday;
    }

    /**
     * Sets the value of the tuesday property.
     * 
     */
    public void setTuesday(boolean value) {
        this.tuesday = value;
    }

    /**
     * Gets the value of the wednesday property.
     * 
     */
    public boolean isWednesday() {
        return wednesday;
    }

    /**
     * Sets the value of the wednesday property.
     * 
     */
    public void setWednesday(boolean value) {
        this.wednesday = value;
    }

    /**
     * Gets the value of the thursday property.
     * 
     */
    public boolean isThursday() {
        return thursday;
    }

    /**
     * Sets the value of the thursday property.
     * 
     */
    public void setThursday(boolean value) {
        this.thursday = value;
    }

    /**
     * Gets the value of the friday property.
     * 
     */
    public boolean isFriday() {
        return friday;
    }

    /**
     * Sets the value of the friday property.
     * 
     */
    public void setFriday(boolean value) {
        this.friday = value;
    }

    /**
     * Gets the value of the saturday property.
     * 
     */
    public boolean isSaturday() {
        return saturday;
    }

    /**
     * Sets the value of the saturday property.
     * 
     */
    public void setSaturday(boolean value) {
        this.saturday = value;
    }

    /**
     * Gets the value of the sunday property.
     * 
     */
    public boolean isSunday() {
        return sunday;
    }

    /**
     * Sets the value of the sunday property.
     * 
     */
    public void setSunday(boolean value) {
        this.sunday = value;
    }

}
