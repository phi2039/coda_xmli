//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 01:44:53 AM EST 
//


package com.coda.common.schemas.usermaster;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.coda.common.schemas.messagetransport.MessageTransportKeyList;
import com.coda.common.schemas.securityvariables.SecurityVariables;
import com.coda.efinance.schemas.common.TypeComUserAlertInterval;
import com.coda.efinance.schemas.common.TypeComUserAlertUnits;


/**
 * This element holds a user master.
 * 
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode"/&gt;
 *         &lt;element name="FrameworkCode" type="{http://www.coda.com/efinance/schemas/common}typeUserCode"/&gt;
 *         &lt;element name="Name" type="{http://www.coda.com/efinance/schemas/common}typeName"/&gt;
 *         &lt;element name="ShortName" type="{http://www.coda.com/efinance/schemas/common}typeShortNameB" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.coda.com/efinance/schemas/common}typePassword" minOccurs="0"/&gt;
 *         &lt;element name="EncryptedPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CapabilityCode" type="{http://www.coda.com/efinance/schemas/common}typeGeneralCode" minOccurs="0"/&gt;
 *         &lt;element name="EMail" type="{http://www.coda.com/efinance/schemas/common}typeEMailAddrB"/&gt;
 *         &lt;element name="Scheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.coda.com/efinance/schemas/common}typeLanguage" minOccurs="0"/&gt;
 *         &lt;element name="Applications" type="{http://www.coda.com/common/schemas/usermaster}UserApplications" minOccurs="0"/&gt;
 *         &lt;element name="Finance" type="{http://www.coda.com/common/schemas/usermaster}Finance" minOccurs="0"/&gt;
 *         &lt;element name="Procurement" type="{http://www.coda.com/common/schemas/usermaster}Procurement" minOccurs="0"/&gt;
 *         &lt;element name="HomePage" type="{http://www.coda.com/common/schemas/usermaster}HomePage" minOccurs="0"/&gt;
 *         &lt;element name="Preferences" type="{http://www.coda.com/efinance/schemas/common}typeUserCode" minOccurs="0"/&gt;
 *         &lt;element name="MobilePhoneNumber" type="{http://www.coda.com/efinance/schemas/common}typeTel" minOccurs="0"/&gt;
 *         &lt;element name="DisablePasswordExpiry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NTUserLogon" type="{http://www.coda.com/common/schemas/usermaster}NTUserLogon" minOccurs="0"/&gt;
 *         &lt;element name="Timezone" type="{http://www.coda.com/efinance/schemas/common}typeText" minOccurs="0"/&gt;
 *         &lt;element name="EnableAlerts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AlertWindowFrom" type="{http://www.coda.com/efinance/schemas/common}typeDateTimeb" minOccurs="0"/&gt;
 *         &lt;element name="AlertWindowTo" type="{http://www.coda.com/efinance/schemas/common}typeDateTimeb" minOccurs="0"/&gt;
 *         &lt;element name="AlertDays" type="{http://www.coda.com/efinance/schemas/common}typeWord" minOccurs="0"/&gt;
 *         &lt;element name="AlertInterval" type="{http://www.coda.com/efinance/schemas/common}typeComUserAlertInterval" minOccurs="0"/&gt;
 *         &lt;element name="AlertIntervalPeriod" type="{http://www.coda.com/efinance/schemas/common}typeWord" minOccurs="0"/&gt;
 *         &lt;element name="AlertIntervalUnits" type="{http://www.coda.com/efinance/schemas/common}typeComUserAlertUnits" minOccurs="0"/&gt;
 *         &lt;element name="AlertTriggerVolume" type="{http://www.coda.com/efinance/schemas/common}typeWord" minOccurs="0"/&gt;
 *         &lt;element name="AlertScheduledTaskId" type="{http://www.coda.com/efinance/schemas/common}typeDbGuid" minOccurs="0"/&gt;
 *         &lt;element name="AlertCatchUpTaskId" type="{http://www.coda.com/efinance/schemas/common}typeDbGuid" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.coda.com/efinance/schemas/common}typeIsoCountryCode" minOccurs="0"/&gt;
 *         &lt;element name="BrowseWorkListSettingList" type="{http://www.coda.com/common/schemas/usermaster}BrowseWorkListSettingList" minOccurs="0"/&gt;
 *         &lt;element name="OutOfOfficeStatus" type="{http://www.coda.com/efinance/schemas/common}typeBaseEnum" minOccurs="0"/&gt;
 *         &lt;element name="OutOfOfficeFrom" type="{http://www.coda.com/efinance/schemas/common}typeDate" minOccurs="0"/&gt;
 *         &lt;element name="OutOfOfficeTo" type="{http://www.coda.com/efinance/schemas/common}typeDate" minOccurs="0"/&gt;
 *         &lt;element name="StoreAlerts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DelegateTo" type="{http://www.coda.com/efinance/schemas/common}typeUserCode" minOccurs="0"/&gt;
 *         &lt;element name="SecurityVariables" type="{http://www.coda.com/common/schemas/securityvariables}SecurityVariables" minOccurs="0"/&gt;
 *         &lt;element name="Roles" type="{http://www.coda.com/common/schemas/usermaster}UserRoleList" minOccurs="0"/&gt;
 *         &lt;element name="MessageTransports" type="{http://www.coda.com/common/schemas/messagetransport}MessageTransportKeyList" minOccurs="0"/&gt;
 *         &lt;element name="DomainUserMappings" type="{http://www.coda.com/common/schemas/usermaster}DomainUserMappingList" minOccurs="0"/&gt;
 *         &lt;element name="ApplyMyPreferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MyPreferences" type="{http://www.coda.com/common/schemas/usermaster}MyPreferences" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.coda.com/efinance/schemas/common}typeTel" minOccurs="0"/&gt;
 *         &lt;element name="Fax" type="{http://www.coda.com/efinance/schemas/common}typeTel" minOccurs="0"/&gt;
 *         &lt;element name="OutputDevice" type="{http://www.coda.com/efinance/schemas/common}typeCode" minOccurs="0"/&gt;
 *         &lt;element name="ElementResponsibilities" type="{http://www.coda.com/common/schemas/usermaster}ElementResponsibilities" minOccurs="0"/&gt;
 *         &lt;element name="BatchSlot" type="{http://www.coda.com/efinance/schemas/common}typeULong"/&gt;
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
    "timeStamp",
    "code",
    "frameworkCode",
    "name",
    "shortName",
    "password",
    "encryptedPassword",
    "capabilityCode",
    "eMail",
    "scheme",
    "language",
    "applications",
    "finance",
    "procurement",
    "homePage",
    "preferences",
    "mobilePhoneNumber",
    "disablePasswordExpiry",
    "ntUserLogon",
    "timezone",
    "enableAlerts",
    "alertWindowFrom",
    "alertWindowTo",
    "alertDays",
    "alertInterval",
    "alertIntervalPeriod",
    "alertIntervalUnits",
    "alertTriggerVolume",
    "alertScheduledTaskId",
    "alertCatchUpTaskId",
    "country",
    "browseWorkListSettingList",
    "outOfOfficeStatus",
    "outOfOfficeFrom",
    "outOfOfficeTo",
    "storeAlerts",
    "delegateTo",
    "securityVariables",
    "roles",
    "messageTransports",
    "domainUserMappings",
    "applyMyPreferences",
    "myPreferences",
    "phoneNumber",
    "fax",
    "outputDevice",
    "elementResponsibilities",
    "batchSlot"
})
public class User
    implements Serializable
{

    @XmlElement(name = "TimeStamp")
    protected Short timeStamp;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "FrameworkCode", required = true)
    protected String frameworkCode;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ShortName")
    protected String shortName;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "EncryptedPassword")
    protected String encryptedPassword;
    @XmlElement(name = "CapabilityCode")
    protected String capabilityCode;
    @XmlElement(name = "EMail", required = true)
    protected String eMail;
    @XmlElement(name = "Scheme")
    protected String scheme;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "Applications")
    protected UserApplications applications;
    @XmlElement(name = "Finance")
    protected Finance finance;
    @XmlElement(name = "Procurement")
    protected Procurement procurement;
    @XmlElement(name = "HomePage")
    protected HomePage homePage;
    @XmlElement(name = "Preferences")
    protected String preferences;
    @XmlElement(name = "MobilePhoneNumber")
    protected String mobilePhoneNumber;
    @XmlElement(name = "DisablePasswordExpiry")
    protected Boolean disablePasswordExpiry;
    @XmlElement(name = "NTUserLogon")
    protected NTUserLogon ntUserLogon;
    @XmlElement(name = "Timezone")
    protected String timezone;
    @XmlElement(name = "EnableAlerts")
    protected Boolean enableAlerts;
    @XmlElement(name = "AlertWindowFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alertWindowFrom;
    @XmlElement(name = "AlertWindowTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar alertWindowTo;
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
    @XmlElement(name = "AlertScheduledTaskId")
    protected BigDecimal alertScheduledTaskId;
    @XmlElement(name = "AlertCatchUpTaskId")
    protected BigDecimal alertCatchUpTaskId;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "BrowseWorkListSettingList")
    protected BrowseWorkListSettingList browseWorkListSettingList;
    @XmlElement(name = "OutOfOfficeStatus")
    protected String outOfOfficeStatus;
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
    @XmlElement(name = "SecurityVariables")
    protected SecurityVariables securityVariables;
    @XmlElement(name = "Roles")
    protected UserRoleList roles;
    @XmlElement(name = "MessageTransports")
    protected MessageTransportKeyList messageTransports;
    @XmlElement(name = "DomainUserMappings")
    protected DomainUserMappingList domainUserMappings;
    @XmlElement(name = "ApplyMyPreferences")
    protected Boolean applyMyPreferences;
    @XmlElement(name = "MyPreferences")
    protected MyPreferences myPreferences;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "OutputDevice")
    protected String outputDevice;
    @XmlElement(name = "ElementResponsibilities")
    protected ElementResponsibilities elementResponsibilities;
    @XmlElement(name = "BatchSlot")
    protected int batchSlot;

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTimeStamp(Short value) {
        this.timeStamp = value;
    }

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
     * Gets the value of the encryptedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    /**
     * Sets the value of the encryptedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedPassword(String value) {
        this.encryptedPassword = value;
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
     * Gets the value of the scheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * Sets the value of the scheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheme(String value) {
        this.scheme = value;
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
     * Gets the value of the applications property.
     * 
     * @return
     *     possible object is
     *     {@link UserApplications }
     *     
     */
    public UserApplications getApplications() {
        return applications;
    }

    /**
     * Sets the value of the applications property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserApplications }
     *     
     */
    public void setApplications(UserApplications value) {
        this.applications = value;
    }

    /**
     * Gets the value of the finance property.
     * 
     * @return
     *     possible object is
     *     {@link Finance }
     *     
     */
    public Finance getFinance() {
        return finance;
    }

    /**
     * Sets the value of the finance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Finance }
     *     
     */
    public void setFinance(Finance value) {
        this.finance = value;
    }

    /**
     * Gets the value of the procurement property.
     * 
     * @return
     *     possible object is
     *     {@link Procurement }
     *     
     */
    public Procurement getProcurement() {
        return procurement;
    }

    /**
     * Sets the value of the procurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Procurement }
     *     
     */
    public void setProcurement(Procurement value) {
        this.procurement = value;
    }

    /**
     * Gets the value of the homePage property.
     * 
     * @return
     *     possible object is
     *     {@link HomePage }
     *     
     */
    public HomePage getHomePage() {
        return homePage;
    }

    /**
     * Sets the value of the homePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomePage }
     *     
     */
    public void setHomePage(HomePage value) {
        this.homePage = value;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferences(String value) {
        this.preferences = value;
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
     * Gets the value of the disablePasswordExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisablePasswordExpiry() {
        return disablePasswordExpiry;
    }

    /**
     * Sets the value of the disablePasswordExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisablePasswordExpiry(Boolean value) {
        this.disablePasswordExpiry = value;
    }

    /**
     * Gets the value of the ntUserLogon property.
     * 
     * @return
     *     possible object is
     *     {@link NTUserLogon }
     *     
     */
    public NTUserLogon getNTUserLogon() {
        return ntUserLogon;
    }

    /**
     * Sets the value of the ntUserLogon property.
     * 
     * @param value
     *     allowed object is
     *     {@link NTUserLogon }
     *     
     */
    public void setNTUserLogon(NTUserLogon value) {
        this.ntUserLogon = value;
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
     * Gets the value of the enableAlerts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAlerts() {
        return enableAlerts;
    }

    /**
     * Sets the value of the enableAlerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAlerts(Boolean value) {
        this.enableAlerts = value;
    }

    /**
     * Gets the value of the alertWindowFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlertWindowFrom() {
        return alertWindowFrom;
    }

    /**
     * Sets the value of the alertWindowFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlertWindowFrom(XMLGregorianCalendar value) {
        this.alertWindowFrom = value;
    }

    /**
     * Gets the value of the alertWindowTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAlertWindowTo() {
        return alertWindowTo;
    }

    /**
     * Sets the value of the alertWindowTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAlertWindowTo(XMLGregorianCalendar value) {
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
     * Gets the value of the alertScheduledTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAlertScheduledTaskId() {
        return alertScheduledTaskId;
    }

    /**
     * Sets the value of the alertScheduledTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAlertScheduledTaskId(BigDecimal value) {
        this.alertScheduledTaskId = value;
    }

    /**
     * Gets the value of the alertCatchUpTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAlertCatchUpTaskId() {
        return alertCatchUpTaskId;
    }

    /**
     * Sets the value of the alertCatchUpTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAlertCatchUpTaskId(BigDecimal value) {
        this.alertCatchUpTaskId = value;
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
     * Gets the value of the browseWorkListSettingList property.
     * 
     * @return
     *     possible object is
     *     {@link BrowseWorkListSettingList }
     *     
     */
    public BrowseWorkListSettingList getBrowseWorkListSettingList() {
        return browseWorkListSettingList;
    }

    /**
     * Sets the value of the browseWorkListSettingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowseWorkListSettingList }
     *     
     */
    public void setBrowseWorkListSettingList(BrowseWorkListSettingList value) {
        this.browseWorkListSettingList = value;
    }

    /**
     * Gets the value of the outOfOfficeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfOfficeStatus() {
        return outOfOfficeStatus;
    }

    /**
     * Sets the value of the outOfOfficeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfOfficeStatus(String value) {
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
     * Gets the value of the securityVariables property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityVariables }
     *     
     */
    public SecurityVariables getSecurityVariables() {
        return securityVariables;
    }

    /**
     * Sets the value of the securityVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityVariables }
     *     
     */
    public void setSecurityVariables(SecurityVariables value) {
        this.securityVariables = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link UserRoleList }
     *     
     */
    public UserRoleList getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRoleList }
     *     
     */
    public void setRoles(UserRoleList value) {
        this.roles = value;
    }

    /**
     * Gets the value of the messageTransports property.
     * 
     * @return
     *     possible object is
     *     {@link MessageTransportKeyList }
     *     
     */
    public MessageTransportKeyList getMessageTransports() {
        return messageTransports;
    }

    /**
     * Sets the value of the messageTransports property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageTransportKeyList }
     *     
     */
    public void setMessageTransports(MessageTransportKeyList value) {
        this.messageTransports = value;
    }

    /**
     * Gets the value of the domainUserMappings property.
     * 
     * @return
     *     possible object is
     *     {@link DomainUserMappingList }
     *     
     */
    public DomainUserMappingList getDomainUserMappings() {
        return domainUserMappings;
    }

    /**
     * Sets the value of the domainUserMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainUserMappingList }
     *     
     */
    public void setDomainUserMappings(DomainUserMappingList value) {
        this.domainUserMappings = value;
    }

    /**
     * Gets the value of the applyMyPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyMyPreferences() {
        return applyMyPreferences;
    }

    /**
     * Sets the value of the applyMyPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyMyPreferences(Boolean value) {
        this.applyMyPreferences = value;
    }

    /**
     * Gets the value of the myPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link MyPreferences }
     *     
     */
    public MyPreferences getMyPreferences() {
        return myPreferences;
    }

    /**
     * Sets the value of the myPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyPreferences }
     *     
     */
    public void setMyPreferences(MyPreferences value) {
        this.myPreferences = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the outputDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputDevice() {
        return outputDevice;
    }

    /**
     * Sets the value of the outputDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputDevice(String value) {
        this.outputDevice = value;
    }

    /**
     * Gets the value of the elementResponsibilities property.
     * 
     * @return
     *     possible object is
     *     {@link ElementResponsibilities }
     *     
     */
    public ElementResponsibilities getElementResponsibilities() {
        return elementResponsibilities;
    }

    /**
     * Sets the value of the elementResponsibilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementResponsibilities }
     *     
     */
    public void setElementResponsibilities(ElementResponsibilities value) {
        this.elementResponsibilities = value;
    }

    /**
     * Gets the value of the batchSlot property.
     * 
     */
    public int getBatchSlot() {
        return batchSlot;
    }

    /**
     * Sets the value of the batchSlot property.
     * 
     */
    public void setBatchSlot(int value) {
        this.batchSlot = value;
    }

}
