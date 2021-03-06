//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:38 AM EST 
//


package com.coda.common.schemas.users;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.coda.common.schemas.alerts.UnsentAlertsKey;
import com.coda.common.schemas.domcapability.CapabilityKey;
import com.coda.common.schemas.scheduler.ScheduledTaskKey;
import com.coda.efinance.schemas.common.TypeComOutOfOfficeStatus;
import com.coda.efinance.schemas.common.TypeComUserAlertInterval;
import com.coda.efinance.schemas.common.TypeComUserAlertUnits;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.coda.com/efinance/schemas/common}typeCode"/&gt;
 *         &lt;element name="FrameworkCode" type="{http://www.coda.com/efinance/schemas/common}typeUserCode"/&gt;
 *         &lt;element name="Name" type="{http://www.coda.com/efinance/schemas/common}typeName"/&gt;
 *         &lt;element name="ShortName" type="{http://www.coda.com/efinance/schemas/common}typeShortName"/&gt;
 *         &lt;element name="Password" type="{http://www.coda.com/efinance/schemas/common}typeText"/&gt;
 *         &lt;element name="CapabilityCode" type="{http://www.coda.com/efinance/schemas/common}typeCode"/&gt;
 *         &lt;element name="Language" type="{http://www.coda.com/efinance/schemas/common}typeLanguageb"/&gt;
 *         &lt;element name="EMail" type="{http://www.coda.com/efinance/schemas/common}typeEmailAddress"/&gt;
 *         &lt;element name="MobilePhoneNumber" type="{http://www.coda.com/efinance/schemas/common}typeTelephone"/&gt;
 *         &lt;element name="EnableAlerts" type="{http://www.coda.com/efinance/schemas/common}typeBoolean"/&gt;
 *         &lt;element name="AlertWindowFrom" type="{http://www.coda.com/efinance/schemas/common}typeTime" minOccurs="0"/&gt;
 *         &lt;element name="AlertWindowTo" type="{http://www.coda.com/efinance/schemas/common}typeTime" minOccurs="0"/&gt;
 *         &lt;element name="AlertDays" type="{http://www.coda.com/efinance/schemas/common}typeWord" minOccurs="0"/&gt;
 *         &lt;element name="AlertInterval" type="{http://www.coda.com/efinance/schemas/common}typeComUserAlertInterval" minOccurs="0"/&gt;
 *         &lt;element name="AlertIntervalPeriod" type="{http://www.coda.com/efinance/schemas/common}typeWord" minOccurs="0"/&gt;
 *         &lt;element name="AlertIntervalUnits" type="{http://www.coda.com/efinance/schemas/common}typeComUserAlertUnits" minOccurs="0"/&gt;
 *         &lt;element name="AlertTriggerVolume" type="{http://www.coda.com/efinance/schemas/common}typeWord" minOccurs="0"/&gt;
 *         &lt;element name="Timezone" type="{http://www.coda.com/efinance/schemas/common}typeTimezone" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.coda.com/efinance/schemas/common}typeIsoCountryCode" minOccurs="0"/&gt;
 *         &lt;element name="BrowseWorkListPresenter" type="{http://www.coda.com/efinance/schemas/common}typeCode" minOccurs="0"/&gt;
 *         &lt;element name="OutOfOfficeStatus" type="{http://www.coda.com/efinance/schemas/common}typeComOutOfOfficeStatus" minOccurs="0"/&gt;
 *         &lt;element name="OutOfOfficeFrom" type="{http://www.coda.com/efinance/schemas/common}typeHard" minOccurs="0"/&gt;
 *         &lt;element name="OutOfOfficeTo" type="{http://www.coda.com/efinance/schemas/common}typeHard" minOccurs="0"/&gt;
 *         &lt;element name="StoreAlerts" type="{http://www.coda.com/efinance/schemas/common}typeBoolean" minOccurs="0"/&gt;
 *         &lt;element name="DelegateTo" type="{http://www.coda.com/efinance/schemas/common}typeCode" minOccurs="0"/&gt;
 *         &lt;element name="UserTransportList" type="{http://www.coda.com/common/schemas/users}UserTransportList"/&gt;
 *         &lt;element name="AlertScheduledTask" type="{http://www.coda.com/common/schemas/scheduler}ScheduledTaskKey" minOccurs="0"/&gt;
 *         &lt;element name="UnsentAlerts" type="{http://www.coda.com/common/schemas/alerts}UnsentAlertsKey"/&gt;
 *         &lt;element name="Capability" type="{http://www.coda.com/common/schemas/domcapability}CapabilityKey"/&gt;
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
@XmlType(name = "User", propOrder = {
    "code",
    "frameworkCode",
    "name",
    "shortName",
    "password",
    "capabilityCode",
    "language",
    "eMail",
    "mobilePhoneNumber",
    "enableAlerts",
    "alertWindowFrom",
    "alertWindowTo",
    "alertDays",
    "alertInterval",
    "alertIntervalPeriod",
    "alertIntervalUnits",
    "alertTriggerVolume",
    "timezone",
    "country",
    "browseWorkListPresenter",
    "outOfOfficeStatus",
    "outOfOfficeFrom",
    "outOfOfficeTo",
    "storeAlerts",
    "delegateTo",
    "userTransportList",
    "alertScheduledTask",
    "unsentAlerts",
    "capability",
    "timeStamp"
})
public class User
    implements Serializable
{

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "FrameworkCode", required = true)
    protected String frameworkCode;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ShortName", required = true)
    protected String shortName;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "CapabilityCode", required = true)
    protected String capabilityCode;
    @XmlElement(name = "Language", required = true)
    protected String language;
    @XmlElement(name = "EMail", required = true)
    protected String eMail;
    @XmlElement(name = "MobilePhoneNumber", required = true)
    protected String mobilePhoneNumber;
    @XmlElement(name = "EnableAlerts")
    protected boolean enableAlerts;
    @XmlElement(name = "AlertWindowFrom")
    protected String alertWindowFrom;
    @XmlElement(name = "AlertWindowTo")
    protected String alertWindowTo;
    @XmlElement(name = "AlertDays")
    protected Short alertDays;
    @XmlElement(name = "AlertInterval")
    @XmlSchemaType(name = "string")
    protected TypeComUserAlertInterval alertInterval;
    @XmlElement(name = "AlertIntervalPeriod")
    protected Short alertIntervalPeriod;
    @XmlElement(name = "AlertIntervalUnits")
    @XmlSchemaType(name = "string")
    protected TypeComUserAlertUnits alertIntervalUnits;
    @XmlElement(name = "AlertTriggerVolume")
    protected Short alertTriggerVolume;
    @XmlElement(name = "Timezone")
    protected String timezone;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "BrowseWorkListPresenter")
    protected String browseWorkListPresenter;
    @XmlElement(name = "OutOfOfficeStatus")
    @XmlSchemaType(name = "string")
    protected TypeComOutOfOfficeStatus outOfOfficeStatus;
    @XmlElement(name = "OutOfOfficeFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOfOfficeFrom;
    @XmlElement(name = "OutOfOfficeTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outOfOfficeTo;
    @XmlElement(name = "StoreAlerts")
    protected Boolean storeAlerts;
    @XmlElement(name = "DelegateTo")
    protected String delegateTo;
    @XmlElement(name = "UserTransportList", required = true)
    protected UserTransportList userTransportList;
    @XmlElement(name = "AlertScheduledTask")
    protected ScheduledTaskKey alertScheduledTask;
    @XmlElement(name = "UnsentAlerts", required = true)
    protected UnsentAlertsKey unsentAlerts;
    @XmlElement(name = "Capability", required = true)
    protected CapabilityKey capability;
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
     * Gets the value of the frameworkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrameworkCode() {
        return frameworkCode;
    }

    /**
     * Sets the value of the frameworkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrameworkCode(String value) {
        this.frameworkCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the capabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityCode() {
        return capabilityCode;
    }

    /**
     * Sets the value of the capabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityCode(String value) {
        this.capabilityCode = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the mobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Sets the value of the mobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNumber(String value) {
        this.mobilePhoneNumber = value;
    }

    /**
     * Gets the value of the enableAlerts property.
     * 
     */
    public boolean isEnableAlerts() {
        return enableAlerts;
    }

    /**
     * Sets the value of the enableAlerts property.
     * 
     */
    public void setEnableAlerts(boolean value) {
        this.enableAlerts = value;
    }

    /**
     * Gets the value of the alertWindowFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertWindowFrom() {
        return alertWindowFrom;
    }

    /**
     * Sets the value of the alertWindowFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertWindowFrom(String value) {
        this.alertWindowFrom = value;
    }

    /**
     * Gets the value of the alertWindowTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertWindowTo() {
        return alertWindowTo;
    }

    /**
     * Sets the value of the alertWindowTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertWindowTo(String value) {
        this.alertWindowTo = value;
    }

    /**
     * Gets the value of the alertDays property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAlertDays() {
        return alertDays;
    }

    /**
     * Sets the value of the alertDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAlertDays(Short value) {
        this.alertDays = value;
    }

    /**
     * Gets the value of the alertInterval property.
     * 
     * @return
     *     possible object is
     *     {@link TypeComUserAlertInterval }
     *     
     */
    public TypeComUserAlertInterval getAlertInterval() {
        return alertInterval;
    }

    /**
     * Sets the value of the alertInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeComUserAlertInterval }
     *     
     */
    public void setAlertInterval(TypeComUserAlertInterval value) {
        this.alertInterval = value;
    }

    /**
     * Gets the value of the alertIntervalPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAlertIntervalPeriod() {
        return alertIntervalPeriod;
    }

    /**
     * Sets the value of the alertIntervalPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAlertIntervalPeriod(Short value) {
        this.alertIntervalPeriod = value;
    }

    /**
     * Gets the value of the alertIntervalUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TypeComUserAlertUnits }
     *     
     */
    public TypeComUserAlertUnits getAlertIntervalUnits() {
        return alertIntervalUnits;
    }

    /**
     * Sets the value of the alertIntervalUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeComUserAlertUnits }
     *     
     */
    public void setAlertIntervalUnits(TypeComUserAlertUnits value) {
        this.alertIntervalUnits = value;
    }

    /**
     * Gets the value of the alertTriggerVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAlertTriggerVolume() {
        return alertTriggerVolume;
    }

    /**
     * Sets the value of the alertTriggerVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAlertTriggerVolume(Short value) {
        this.alertTriggerVolume = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the browseWorkListPresenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowseWorkListPresenter() {
        return browseWorkListPresenter;
    }

    /**
     * Sets the value of the browseWorkListPresenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowseWorkListPresenter(String value) {
        this.browseWorkListPresenter = value;
    }

    /**
     * Gets the value of the outOfOfficeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TypeComOutOfOfficeStatus }
     *     
     */
    public TypeComOutOfOfficeStatus getOutOfOfficeStatus() {
        return outOfOfficeStatus;
    }

    /**
     * Sets the value of the outOfOfficeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeComOutOfOfficeStatus }
     *     
     */
    public void setOutOfOfficeStatus(TypeComOutOfOfficeStatus value) {
        this.outOfOfficeStatus = value;
    }

    /**
     * Gets the value of the outOfOfficeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOfOfficeFrom() {
        return outOfOfficeFrom;
    }

    /**
     * Sets the value of the outOfOfficeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOfOfficeFrom(XMLGregorianCalendar value) {
        this.outOfOfficeFrom = value;
    }

    /**
     * Gets the value of the outOfOfficeTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutOfOfficeTo() {
        return outOfOfficeTo;
    }

    /**
     * Sets the value of the outOfOfficeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutOfOfficeTo(XMLGregorianCalendar value) {
        this.outOfOfficeTo = value;
    }

    /**
     * Gets the value of the storeAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStoreAlerts() {
        return storeAlerts;
    }

    /**
     * Sets the value of the storeAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStoreAlerts(Boolean value) {
        this.storeAlerts = value;
    }

    /**
     * Gets the value of the delegateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegateTo() {
        return delegateTo;
    }

    /**
     * Sets the value of the delegateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegateTo(String value) {
        this.delegateTo = value;
    }

    /**
     * Gets the value of the userTransportList property.
     * 
     * @return
     *     possible object is
     *     {@link UserTransportList }
     *     
     */
    public UserTransportList getUserTransportList() {
        return userTransportList;
    }

    /**
     * Sets the value of the userTransportList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTransportList }
     *     
     */
    public void setUserTransportList(UserTransportList value) {
        this.userTransportList = value;
    }

    /**
     * Gets the value of the alertScheduledTask property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledTaskKey }
     *     
     */
    public ScheduledTaskKey getAlertScheduledTask() {
        return alertScheduledTask;
    }

    /**
     * Sets the value of the alertScheduledTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledTaskKey }
     *     
     */
    public void setAlertScheduledTask(ScheduledTaskKey value) {
        this.alertScheduledTask = value;
    }

    /**
     * Gets the value of the unsentAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link UnsentAlertsKey }
     *     
     */
    public UnsentAlertsKey getUnsentAlerts() {
        return unsentAlerts;
    }

    /**
     * Sets the value of the unsentAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsentAlertsKey }
     *     
     */
    public void setUnsentAlerts(UnsentAlertsKey value) {
        this.unsentAlerts = value;
    }

    /**
     * Gets the value of the capability property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityKey }
     *     
     */
    public CapabilityKey getCapability() {
        return capability;
    }

    /**
     * Sets the value of the capability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityKey }
     *     
     */
    public void setCapability(CapabilityKey value) {
        this.capability = value;
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
