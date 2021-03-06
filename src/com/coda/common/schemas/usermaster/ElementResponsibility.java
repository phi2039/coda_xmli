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
import javax.xml.bind.annotation.XmlType;


/**
 * This element contains details of an element responsibility.
 * 
 * <p>Java class for ElementResponsibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementResponsibility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Description" type="{http://www.coda.com/efinance/schemas/common}typeDescription"/&gt;
 *         &lt;element name="ResponsibilityList" type="{http://www.coda.com/common/schemas/usermaster}ResponsibilityList" minOccurs="0"/&gt;
 *         &lt;element name="Tolerance" type="{http://www.coda.com/efinance/schemas/common}typeCodeB" minOccurs="0"/&gt;
 *         &lt;element name="ReasonCode" type="{http://www.coda.com/efinance/schemas/common}typeCodeB" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.coda.com/efinance/schemas/common}typeMoney" minOccurs="0"/&gt;
 *         &lt;element name="UseGeneral" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UseFinancials" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UseInvoiceMatching" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UseProcurementEntry" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UseProcurementAuthorisation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UseProcurementReceiving" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Reserved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementResponsibility", propOrder = {
    "index",
    "description",
    "responsibilityList",
    "tolerance",
    "reasonCode",
    "value",
    "useGeneral",
    "useFinancials",
    "useInvoiceMatching",
    "useProcurementEntry",
    "useProcurementAuthorisation",
    "useProcurementReceiving",
    "reserved"
})
public class ElementResponsibility
    implements Serializable
{

    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "ResponsibilityList")
    protected ResponsibilityList responsibilityList;
    @XmlElement(name = "Tolerance")
    protected String tolerance;
    @XmlElement(name = "ReasonCode")
    protected String reasonCode;
    @XmlElement(name = "Value")
    protected BigDecimal value;
    @XmlElement(name = "UseGeneral")
    protected boolean useGeneral;
    @XmlElement(name = "UseFinancials")
    protected boolean useFinancials;
    @XmlElement(name = "UseInvoiceMatching")
    protected boolean useInvoiceMatching;
    @XmlElement(name = "UseProcurementEntry")
    protected boolean useProcurementEntry;
    @XmlElement(name = "UseProcurementAuthorisation")
    protected boolean useProcurementAuthorisation;
    @XmlElement(name = "UseProcurementReceiving")
    protected boolean useProcurementReceiving;
    @XmlElement(name = "Reserved")
    protected String reserved;

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the responsibilityList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilityList }
     *     
     */
    public ResponsibilityList getResponsibilityList() {
        return responsibilityList;
    }

    /**
     * Sets the value of the responsibilityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilityList }
     *     
     */
    public void setResponsibilityList(ResponsibilityList value) {
        this.responsibilityList = value;
    }

    /**
     * Gets the value of the tolerance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTolerance() {
        return tolerance;
    }

    /**
     * Sets the value of the tolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTolerance(String value) {
        this.tolerance = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the useGeneral property.
     * 
     */
    public boolean isUseGeneral() {
        return useGeneral;
    }

    /**
     * Sets the value of the useGeneral property.
     * 
     */
    public void setUseGeneral(boolean value) {
        this.useGeneral = value;
    }

    /**
     * Gets the value of the useFinancials property.
     * 
     */
    public boolean isUseFinancials() {
        return useFinancials;
    }

    /**
     * Sets the value of the useFinancials property.
     * 
     */
    public void setUseFinancials(boolean value) {
        this.useFinancials = value;
    }

    /**
     * Gets the value of the useInvoiceMatching property.
     * 
     */
    public boolean isUseInvoiceMatching() {
        return useInvoiceMatching;
    }

    /**
     * Sets the value of the useInvoiceMatching property.
     * 
     */
    public void setUseInvoiceMatching(boolean value) {
        this.useInvoiceMatching = value;
    }

    /**
     * Gets the value of the useProcurementEntry property.
     * 
     */
    public boolean isUseProcurementEntry() {
        return useProcurementEntry;
    }

    /**
     * Sets the value of the useProcurementEntry property.
     * 
     */
    public void setUseProcurementEntry(boolean value) {
        this.useProcurementEntry = value;
    }

    /**
     * Gets the value of the useProcurementAuthorisation property.
     * 
     */
    public boolean isUseProcurementAuthorisation() {
        return useProcurementAuthorisation;
    }

    /**
     * Sets the value of the useProcurementAuthorisation property.
     * 
     */
    public void setUseProcurementAuthorisation(boolean value) {
        this.useProcurementAuthorisation = value;
    }

    /**
     * Gets the value of the useProcurementReceiving property.
     * 
     */
    public boolean isUseProcurementReceiving() {
        return useProcurementReceiving;
    }

    /**
     * Sets the value of the useProcurementReceiving property.
     * 
     */
    public void setUseProcurementReceiving(boolean value) {
        this.useProcurementReceiving = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserved(String value) {
        this.reserved = value;
    }

}
